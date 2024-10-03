public class OperatorsApp {
            public static void main(String[] args){
                System.out.println("ARITHMETIC OPERATORS");
                String model="Dodge Challenger";
                int price=15000;
                int moneyInTheBank=100000;
                boolean isDamaged=false;
                System.out.println("price of a "+model+"$"+price);
                int increasedPrice=price+1000;
                System.out.println("increased price of a "+model+"$"+increasedPrice);
                int decreasedPrice=price-1000;
                System.out.println("decreased price of a "+model+"$"+decreasedPrice);
                int twoCarsPrice=price*2;
                System.out.println("two cars price "+twoCarsPrice);
                int dodgesCanBuy=moneyInTheBank/price;
                System.out.println("dodge can buy "+dodgesCanBuy+" Cars");
                int moneyRemainedInTheBank=moneyInTheBank - (dodgesCanBuy * price);
                System.out.println("Remaining money in the bank "+moneyRemainedInTheBank);
                System.out.println(isDamaged);
                System.out.println("UNARY OPERATORS");
                int priceNegative=-1495;
                System.out.println("priceNegative: "+priceNegative);
                int priceNegativeWithPLusSign= +priceNegative;
                System.out.println("priceNegativeWithPLusSign: "+priceNegativeWithPLusSign);
                int priceWithMinusSign= -priceNegative;
                System.out.println("priceWithMinusSign: "+priceWithMinusSign);
                System.out.println(++price);
                System.out.println(price++);
                System.out.println(--price);
                System.out.println(price--);
                System.out.println(!isDamaged);

            }
            
        }
        
    

