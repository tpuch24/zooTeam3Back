/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



import java.awt.List;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * A simple REST service which is able to say hello to someone using HelloService Please take a look at the web.xml where JAX-RS
 * is enabled
 *
 * @author gbrey@redhat.com
 *
 */

@Path("/")
//@XmlRootElement
public class TicketZooServer{

    HelloService helloService = new HelloService();
    TicketManager ticketManager = null;

    public TicketZooServer(){
    	ticketManager = TicketManager.getInstance();
    }
    @GET
    @Path("/json")
    @Produces({ "application/json" })
    public String getHelloWorldJSON() {
        return "{\"result\":\"" + helloService.createHelloMessage("World") + "\"}";
    }

    @GET
    @Path("/xml")
    @Produces({ "application/xml" })
    public String getHelloWorldXML() {
        return "<xml><result>"+ helloService.createHelloMessage("World")+ "</result></xml>";
    }

    @GET
    @Path("/getTicketList")
    @Produces({ "application/json" })
    public ArrayList<Ticket> getTicketList() {
        return ticketManager.getList();
    }

    @GET
    @Path("/getTicket/{id}")
    @Produces({ "application/json" })
    public Ticket getTicket(@PathParam("id") String id ) {
        return ticketManager.getOneById(Integer.parseInt(id));
    }

    @POST
    @Path("/updateTicket")
    @Consumes("application/json")
    public void updateTicket(Ticket ticket)
    {
    	//ticketManager.update(id,ticket);
    	//System.out.println(ticket);

    	System.out.println(ticket.category);
    	//System.out.println(tck.toString());
    	ticketManager.update(ticket);
    	
    	//return "Error: setTicketList: Wrong parameters";
    }
    @PUT
    @Path("/addTicket")
    @Consumes("application/json")
    public void addTicket(Ticket ticket)
    {
    	ticketManager.add(ticket);
    	//System.out.println(ticket);

    	System.out.println(ticket.category);
    	//System.out.println(tck.toString());
    	//ticketManager.add(new Ticket(income,category,date,numbersold));
    	
    	//return "Error: setTicketList: Wrong parameters";
    }
    @DELETE
    @Path("/deleteTicket/{id}")
    @Consumes("application/json")
    public void deleteTicket(@PathParam("id") int id)
    {
    	ticketManager.delete(id);
    	//System.out.println(ticket);

    	System.out.println("Delete ticket "+id);
    	//System.out.println(tck.toString());
    	//ticketManager.add(new Ticket(income,category,date,numbersold));
    	
    	//return "Error: setTicketList: Wrong parameters";
    }
}
