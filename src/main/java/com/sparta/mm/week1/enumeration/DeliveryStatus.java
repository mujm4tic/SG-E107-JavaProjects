package com.sparta.mm.week1.enumeration;

public enum DeliveryStatus {
        //Java needs these variables initialised
        DELIVERED ("Item(s) delivered"),
        DISPATCHED ("Item(s) dispatched"),
        ORDERRECEIVED ("Order received"),
        CANCELLED ("Item Cancelled"),
        UNDERREVIEW ("Order under review"),
        RETURNED ("Order"),
        EXCHANGED ("Item(s) exchanged"),
        SENTBACK ("Items en route back to warehouse");

        private String name;

        DeliveryStatus(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        public static void main(String[] args) {
            DeliveryStatus order1 = DeliveryStatus.DELIVERED;
            DeliveryStatus order2 = DeliveryStatus.SENTBACK;

            if (order1 == DeliveryStatus.DELIVERED || order1 == DeliveryStatus.SENTBACK || order1 == DeliveryStatus.EXCHANGED){
                System.out.println(DELIVERED.name);
            } else System.out.println("Your item(s) have not been delivered yet");
        }

    }
