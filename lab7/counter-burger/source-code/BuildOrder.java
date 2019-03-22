public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // Premoium Cheese +1.50
        Premium pc = new Premium ("Premium Cheese Options");
        String[] pco = { "Danish Blue Cheese" };
        pc.setOptions(pco);
        pc.wrapDecorator(c);
        // 1 sauce free, extra +.75
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = {  "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // Bun
        Bun bun = new Bun("Bun Options");
        String[] buno = { "Ciabatta (Vegan)" };
        bun.setOptions( buno );
        bun.wrapDecorator( p );
        // Side
        Side si = new Side("Side Options");
        String[] sio = { "Shoestring Fries" };
        si.setOptions(sio);
        si.wrapDecorator(bun);
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( si ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( si ) ;
        
        CustomBurger newCustomBurger = new CustomBurger( "Build Your Own Burger" ) ;
        Burger nb = new Burger( "Burger Options" ) ;
        String[] nbo = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" };
        nb.setOptions( nbo ) ;
        
        Cheese nc = new Cheese( "Cheese Options" ) ;
        String[] nco = { "Smoked Gouda", "Greek Feta" } ;
        nc.setOptions( nco ) ;
        nc.wrapDecorator( nb ) ;
        
        Premium npc = new Premium ("Premium Cheese Options");
        String[] npco = { "Fresh Mozzarella" };
        npc.setOptions(npco);
        npc.wrapDecorator(nc);
        Sauce ns = new Sauce( "Sauce Options" ) ;
        String[] nso = {  "Habanero Salsa" } ;
        ns.setOptions( nso ) ;
        ns.wrapDecorator( npc ) ;
        Toppings nt = new Toppings( "Toppings Options" ) ;
        String[] nto = { "Crushed Peanuts" } ;
        nt.setOptions( nto ) ;
        nt.wrapDecorator( ns ) ;
        Premium np = new Premium( "Premium Options" ) ;
        String[] npo = { "Sunny Side Up Egg*", "Marinated Tomatoes" } ;
        np.setOptions( npo ) ;
        np.wrapDecorator( nt ) ;
        Bun nbun = new Bun("Bun Options");
        String[] nbuno = { "Gluten-Free Bun" };
        nbun.setOptions( nbuno );
        nbun.wrapDecorator( np );
        Side nsi = new Side("Side Options");
        String[] nsio = { "Shoestring Fries" };
        nsi.setOptions( nsio );
        nsi.wrapDecorator(nbun);

        newCustomBurger.setDecorator( nsi ) ;
        newCustomBurger.addChild( nb ) ;
        newCustomBurger.addChild( nc ) ;
        newCustomBurger.addChild( npc ) ;
        newCustomBurger.addChild( ns ) ;
        newCustomBurger.addChild( nt ) ;
        newCustomBurger.addChild( np ) ;
        newCustomBurger.addChild( nbun ) ;
        newCustomBurger.addChild( nsi ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( newCustomBurger );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/