def pro(ticket_Price: Int, atten: Int) : Int = ticket_Price*atten;


    def atten_Change(ticket_Price: Int) : Int = {
        if(ticket_Price > 15)
            return ((ticket_Price - 15) / 5) * (-20);
        else if(15 > ticket_Price) 
            return ((15 - ticket_Price) / 5) * 20;
        else
            return 0;
    }

    def net_Pro(ticket_Price: Int, atten: Int) : Int = {
        return pro(ticket_Price, atten + atten_Change(ticket_Price)) - (500 + 3*(atten + atten_Change(ticket_Price)));
    }

    print("Input ticket price:");
    var ticket_Price = readInt();
    print("Pro : " + net_Pro(ticket_Price, 120));