package com.learning.challenge;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    private List<UserModel> users = new ArrayList<>();
    private UserModel user;

   // private boolean bfn = false;
    private boolean bln = false;
    private boolean boc = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if ("user".equals(qName)) {
            user = new UserModel();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }
        switch (qName) {
            // case "name":
            //     bfn = true;
            //     break;

            case "firstname":
                bln = true;
                break;

            case "lastname":
                boc = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        // if (bfn) {
        //     user.setName(new String(ch, start, length));
        //     bfn = false;
        // }

        if (bln) {
            user.setFirstName(new String(ch, start, length));
            bln = false;
        }

        if (boc) {
            user.setLastName(new String(ch, start, length));
            boc = false;
        }
    }



    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException{
        if ("user".equals(qName)) {
            users.add(user);
        }
    }

    public List<UserModel> getUsers(){
        return users;
    }

}
