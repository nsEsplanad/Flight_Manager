package com.lexicon;

import com.lexicon.dao.FoodDao;
import com.lexicon.dao.SeatDao;
import com.lexicon.dao.TicketDao;
import com.lexicon.domain.*;
import com.lexicon.service.TicketService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext=new ClassPathXmlApplicationContext("service-tier.xml", "dao-tier.xml");

        TicketDao ticketDao=appContext.getBean(TicketDao.class);
        SeatDao seatDao=appContext.getBean(SeatDao.class);
        FoodDao foodDao=appContext.getBean(FoodDao.class);


        TicketService ticketService=appContext.getBean(TicketService.class);

        Scanner scanner=new Scanner(System.in);

        System.out.println("Choose one option by inserting 1 or 2: ");
        System.out.println("Insert 1 for Business class and 2 for Economy class or 0 for exit: ");

        int choice=0;
        int i=1;
        choice=scanner.nextInt();
        switch (choice){
            case 1:
               if(i>=1 && i<6){
                    Seat seat=Seat.builder().withSeatNumber(i).withPrice(20000d)
                            .withTripClass(TripClass.BUSINESS_CLASS).build();
                    seatDao.createSeats(i, seat);
                   System.out.println(seatDao.allSeats(TripClass.BUSINESS_CLASS));
                   System.out.println("Insert the Food Number to Choose your Food from Food Menu!");

                   Food food = Food.builder().withId(1).withFoodName("Lax").withFoodPrice(45d).withTripClass(TripClass.BUSINESS_CLASS).build();

                   Food food2 = Food.builder().withId(2).withFoodName("MaiThai").withFoodPrice(20d).withTripClass(TripClass.BUSINESS_CLASS).build();
                   foodDao.createFood(i, food);
                   foodDao.createFood(i+1, food2);
                   System.out.println(foodDao.menu(TripClass.BUSINESS_CLASS));
                   int num=scanner.nextInt();

                   System.out.println("Enter your firstname: ");
                   String fname=scanner.nextLine();
                   System.out.println("Enter your lastname: ");
                   String lname=scanner.nextLine();
                   Passenger passenger1=Passenger.builder().withPassengerId(i).withFirstName(fname).withLastName(lname).build();

                   Ticket ticket=Ticket.builder().withTicketId("1d").withPassenger(passenger1).withSeat(seat)
                           .withFood(food).withTicketClass(TripClass.BUSINESS_CLASS)
                           .withCost(ticketDao.ticketTotalCost(i)).build();
                   System.out.println(ticketDao.ticketTotalCost(passenger1.getPassengerId()));


                    i++;
                }

               // ticketDao.listTickets();
                //System.out.println(seatDao.allSeats(TripClass.BUSINESS_CLASS));
                break;
            case 2:

                if(i>=6 && i<11){
                    Seat seat=Seat.builder().withSeatNumber(i).withPrice(5000d)
                            .withTripClass(TripClass.ECONOMY_CLASS).build();
                    seatDao.createSeats(i, seat);
                    i++;
                }

                break;
            default:

        }
    }
    //static List<Seat> economy(){
    //}
}


        /*
       Collection<Seat> economySeats=new LinkedList<>();

        Seat seat1=Seat.builder().withSeatNumber(1).withPrice(20000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();
        Seat seat2=Seat.builder().withSeatNumber(2).withPrice(200000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();
        Seat seat3=Seat.builder().withSeatNumber(3).withPrice(200000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();
        Seat seat4=Seat.builder().withSeatNumber(4).withPrice(200000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();
        Seat seat5=Seat.builder().withSeatNumber(5).withPrice(200000d)
                .withTripClass(TripClass.BUSINESS_CLASS).build();

        seatDao.createSeats(seat1.getSeatNumber(), seat1);
        seatDao.createSeats(seat2.getSeatNumber(), seat2);
        seatDao.createSeats(seat3.getSeatNumber(), seat3);
        seatDao.createSeats(seat4.getSeatNumber(), seat4);
        seatDao.createSeats(seat5.getSeatNumber(), seat5);


        seats.put(1,seat1);
        seats.put(2,seat2);
        seats.put(3,seat3);
        seats.put(4,seat4);
        seats.put(5,seat5);


        Seat seat6=Seat.builder().withSeatNumber(6).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        Seat seat7=Seat.builder().withSeatNumber(7).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        Seat seat8=Seat.builder().withSeatNumber(8).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        Seat seat9=Seat.builder().withSeatNumber(9).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();
        Seat seat10=Seat.builder().withSeatNumber(10).withPrice(5000d)
                .withTripClass(TripClass.ECONOMY_CLASS).build();

        seatDao.createSeats(seat6.getSeatNumber(), seat6);
        seatDao.createSeats(seat7.getSeatNumber(), seat7);
        seatDao.createSeats(seat8.getSeatNumber(), seat8);
        seatDao.createSeats(seat9.getSeatNumber(), seat9);
        seatDao.createSeats(seat10.getSeatNumber(), seat10);


        seats.put(6,seat6);
        seats.put(7,seat7);
        seats.put(8,seat8);
        seats.put(9,seat9);
        seats.put(10,seat10);

         */