import java.io.*;
import java.util.*;
class Cognegic_Fun_World
{
public static void main(String args[])throws IOException
{
System.out.println("===========================================================================================================================================================================================");
System.out.println("###########################################################################################################################################################################################");
System.out.println("===========================================================================================================================================================================================");
System.out.println("***********************************************************************Welcome to the Cognegic Fun world***********************************************************************************");
System.out.println("----------------------------------------------------------------This is the best place to satisfy all your WWWs  :D------------------------------------------------------------------------");
System.out.println("----------------------------------------------------------------------WWW is nothing but World Wide Wishes!--------------------------------------------------------------------------------");
System.out.println("===========================================================================================================================================================================================");
System.out.println("###########################################################################################################################################################################################");
System.out.println("===========================================================================================================================================================================================");
int ex;
do{
Scanner gg=new Scanner(System.in);
System.out.println("*****Main Menu*****");
System.out.println("1.Restaurant");
System.out.println("2.Job Hunter");
System.out.println("3.Railway reservation for Hogwarts express");
System.out.println("4.Number guess game");
System.out.println("5.Exit");
int faq=gg.nextInt();
if(faq==1)
{
int n=1;
while(n==1)
{
Scanner in=new Scanner(System.in);
String choice="Y";
String ans=" ";
int vstr,tvstr=0,nvstr,tnvstr=0,amt=0,tvfd=0,vfd,nvfd,tnvfd=0,fd,tfd=0,totalamt=0,d,totald=0,damt=0,f;
int tamt=0;
double gst=0;
System.out.println("************************************** Welcome to the Multi Cuisine Restaurant ****************************************************************************");
System.out.println("1.Starters");
System.out.println("2.Main course");
System.out.println("3.Deserts");
System.out.println();
System.out.println("You can choose only from one section");
System.out.println("Enter your choice");
int ch=in.nextInt();
switch(ch)
{
case 1:
{
System.out.println("Welcome to Starter Menu!!!!");
System.out.println("Enter 'VS' for Veg Starter and 'NVS' for Non-veg Starter");
String str=in.next();
if(str.equalsIgnoreCase("VS"))
{
System.out.println("Starters -------------------------- Price in Rs.");
System.out.println("1.Paneer Tikka -------------------- 110");
System.out.println("2.Veg Seekha Kebab ---------------- 110");
System.out.println("3.Hara Bhara Kebab ---------------- 110");
System.out.println("4.Shanghai burger roll ------------ 150");
System.out.println("5.American Corn Ball -------------- 150");
System.out.println("6.Crisy American Corn ------------- 140");
System.out.println("7.Crispy Baby Corn ---------------- 140");
System.out.println("8.Crispy Mushroom ----------------- 120");
System.out.println("9.Crispy Chilly potato ------------ 120");
System.out.println("10.French fries ------------------- 150");
System.out.println();
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your starter from the above list by entering the number");
vstr=in.nextInt();
System.out.println("Enter the total number of starters you want");
tvstr=in.nextInt();
if(vstr>=1&&vstr<=3)
amt=tvstr*110;
if(vstr==4||vstr==5)
amt=tvstr*150;
if(vstr==6||vstr==7)
amt=tvstr*140;
if(vstr==8||vstr==9)
amt=tvstr*120;
if(vstr==10)
amt=tvstr*150;
 tamt=tamt+amt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();

}
}
if(str.equalsIgnoreCase("NVS"))
{
System.out.println("Non-Vegetarian Starter");
System.out.println();
System.out.println("Non veg starters          Price in Rs.");
System.out.println("1.Chicken Tikka -----------170");
System.out.println("2.Murg Reshmi Kebab--------170");
System.out.println("3.Murg Chilli Kebab--------160");
System.out.println("4.Chicken Seekh Kebab------180");
System.out.println("5.Tangdi Kebab-------------180");
System.out.println("6.Murg Tandoori------------190");
System.out.println("7.Fish Ajwani Tikka--------190");
System.out.println("8.Chilly chicken-----------160");
System.out.println("9.Devil Chicken------------180");
System.out.println("10.Crispy Chicken----------180");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Chooose your starter from the above given list by entering number");
nvstr=in.nextInt();
System.out.println("Enter the total number of starters you want");
tnvstr=in.nextInt();
if(nvstr==1||nvstr==2)
amt=tnvstr*170;
if(nvstr==3||nvstr==8)
amt=tnvstr*160;
if(nvstr==4||nvstr==5||nvstr==9||nvstr==10)
amt=tnvstr*180;
if(nvstr==6||nvstr==7)
amt=tnvstr*190;
tamt=tamt+amt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
System.out.println("****************************************** Multi Cuisine Restaurant *******************************************************");
System.out.println("                                            Bill                                                                  ");
System.out.println("Total cost= Rs."+tamt);
gst=Math.round((12*tamt)/100);
System.out.println("GST = 12%");
System.out.println("Total GST = Rs."+gst);
System.out.println("Amount to be paid = Rs."+(tamt+gst));
System.out.println();
break;
}

case 2:
System.out.println("Main Course: Indian and Chinese Dishes!");
System.out.println("Enter V for Indian Veg dishes, NV for Indian Non-veg dishes and C for Chinese dishes");
String str=in.next();
if(str.equalsIgnoreCase("V"))
{
System.out.println("Welcome to Indian Veg Dishes");
System.out.println("Indian Veg Dishes               Price in Rs.");
System.out.println("1.Shahi Paneer-------------------180");
System.out.println("2.Navratan Korma-----------------180");
System.out.println("3.Kadahi Paneer------------------150");
System.out.println("4.Malai Kofta--------------------140");
System.out.println("5.Kadai Vegetables---------------140");
System.out.println("6.Vegetable Pakeeza--------------140");
System.out.println("7.Shabnam Curry------------------150");
System.out.println("8.Palak Paneer-------------------150");
System.out.println("9.Veg Pulao----------------------100");
System.out.println("10.Pav Bhaji---------------------100");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Main Veg Course from the list by entering the number");
vfd=in.nextInt();
System.out.println("How many plates do you want to place from the above list?");
tvfd=in.nextInt();
if(vfd==1||vfd==2)
amt=tvfd*180;
if(vfd==3||vfd==7||vfd==8)
amt=tvfd*150;
if(vfd==4||vfd==5||vfd==6)
amt=tvfd*140;
if(vfd==9||vfd==10)
amt=tvfd*100;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("NV"))
{
System.out.println("Welcome to Indian Non-Veg Dishes");
System.out.println("Indian Non-Veg Dishes          Price in Rs.");
System.out.println("1.Chicken Tikka Masala---------180");
System.out.println("2.Chicken Tikka Labadar--------180");
System.out.println("3.Chicken Bharta---------------150");
System.out.println("4.Kadahi Chicken---------------160");
System.out.println("5.Mughlai Chicken--------------160");
System.out.println("6.Murg Navratan Korma----------160");
System.out.println("7.Prawn Malai Curry------------200");
System.out.println("8.Fish Dhaniawala--------------180");
System.out.println("9.Murg Masallam----------------160");
System.out.println("10.Chicken Urwal---------------160");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your Main Non-Veg Course from the list entering the number");
vfd=in.nextInt();
System.out.println("How many plates do you want to place from the above list?");
tvfd=in.nextInt();
if(vfd==1||vfd==2||vfd==8)
amt=tvfd*180;
if(vfd==3)
amt=tvfd*150;
if(vfd==4||vfd==5||vfd==6||vfd==9||vfd==10)
amt=tvfd*160;
if(vfd==7)
amt=tvfd*200;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
if(str.equalsIgnoreCase("C"))
{
System.out.println("Welcome to Chinese dishes");
System.out.println("Chinese Dishes                   Price in Rs.");
System.out.println("1.Schezwan Fried Rice------------240");
System.out.println("2.Schezwan Chicken---------------280");
System.out.println("3.Chilly Chicken-----------------280");
System.out.println("4.Chicken Noodle-----------------210");
System.out.println("5.Veg. Hakka Noodle--------------210");
System.out.println("6.Chicken Manchurian-------------190");
System.out.println("7.Paneer Manchurian--------------190");
System.out.println("8.Kimchi Rice Veg.---------------210");
System.out.println("9.Veg.Fried Rice-----------------210");
System.out.println("10.Shanghai Fried Rice--------------210");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your main Course from the above by entering number");
fd=in.nextInt();
System.out.println("How many plates do you want to order from the above list?");
tfd=in.nextInt();
if(fd==1)
amt=tfd*240;
if(fd==2||fd==3)
amt=tfd*280;
if(fd==4||fd==5||fd==8||fd==9||fd==10)
amt=tfd*210;
if(fd==6||fd==7)
amt=tfd*190;
totalamt=totalamt+amt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
}
System.out.println();
System.out.println("****************************************** Multi Cuisine Restaurant *******************************************************");
System.out.println("                                            Bill                                                                  ");
System.out.println("Total cost= Rs."+totalamt);
gst=Math.round((12*totalamt)/100);
System.out.println("GST = 12%");
System.out.println("Total GST = Rs."+gst);
System.out.println("Amount to be paid = Rs."+(totalamt+gst));
System.out.println();
break;
case 3:
System.out.println("Cool with deserts");
System.out.println("Deserts                           Price in Rs.");
System.out.println();
System.out.println("1.Softy Pineapple------------------110");
System.out.println("2.Softy Crunchy Chocolate----------110");
System.out.println("3.Chocolate Walnut Brownie---------90");
System.out.println("4.Chocolate Doughnut---------------90");
System.out.println("5.Marble Cake----------------------90");
System.out.println("6.Mocha Magic----------------------90");
System.out.println("7.Black Forest Gateaux-------------90");
System.out.println("8.Mango Shake----------------------80");
System.out.println("9.Pineapple Shake------------------80");
System.out.println("10.Tiramisu------------------------150");
while(choice.equalsIgnoreCase("Y"))
{
System.out.println("Choose your desert by entering your number!!");
d=in.nextInt();
System.out.println("Enter the total number of items you want to buy!!");
totald=in.nextInt();
if(d==1||d==2)
damt=totald*110;
if(d>=3&&d<=7)
damt=totald*90;
if(d==8||d==9)
damt=totald*80;
if(d==10)
damt=totald*150;
totalamt=totalamt+damt;
System.out.println("Do you want to place more order? Enter Y/N");
choice=in.next();
}
System.out.println();
System.out.println("****************************************** Multi Cuisine Restaurant *******************************************************");
System.out.println("                                            Bill                                                                  ");
System.out.println("Total cost= Rs."+totalamt);
gst=Math.round((12*totalamt)/100);
System.out.println("GST = 12%");
System.out.println("Total GST = Rs."+gst);
System.out.println("Amount to be paid = Rs."+(totalamt+gst));
System.out.println();
break;
default:
System.out.println("You have entered wrong choice");
System.out.println("You can enter in the Multi Cuisine Restaurant by executing the program again with the correct choice!!");
System.out.println("Now, Quit the program");
}
System.out.println("To exit Multi Cuisine Restaurant World, enter 0. To continue press 1");
n=in.nextInt();
if(n==0)
{
System.out.println();
System.out.println();
System.out.println("Thanks for coming to Multi Cuisine Restaurant!!");
System.out.println("Your pleasure Our comfort");
System.out.println("Visit Again");
System.out.println();
}
}
}
else if(faq==2)
{
int haa=1;
while(haa==1)
{
int num=1;
String s="Welcome";
int n=s.length();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j)+" ");
}
System.out.println();
}

System.out.println("\n");
System.out.println("We heartily welcome you to the Annual Job fair for our talented Engineers");
System.out.println("We hope through this you could pursue your dream job\n");
{
Scanner obj=new Scanner(System.in);
System.out.println();
System.out.println("Please from the given options choose your major by entering the number:\n");
System.out.println("  1.Computer Engineering");
System.out.println("  2.Chemical Engineering");
System.out.println("  3.Electrical Engineering");
System.out.println("  4.Civil Engineering");
System.out.println("  5.Mechanical Engineering\n");
int op=obj.nextInt();
if(op==1)
{
System.out.println();
System.out.println("********************* Welcome to the world of Computers ********************\n");
System.out.println("You have chosen your major as Computer Engineering");
System.out.println("Do you have an experience of five years or are you a fresher??");
System.out.println("If you are a fresher enter [0] or else enter [1]");
int exp= obj.nextInt();
if(exp== 0)
{
System.out.println("Please Enter your points scored in you final examination  from 1 to 10");
double  pt=obj.nextDouble();
if(pt<=6)
{
System.out.println("You are not eligible for the Job Drive");
System.out.println("We are extremely sorry!!!");
}
else if(pt>6&&pt<=7)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for Wipro..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.00 am on Monday and if cleared -");
System.out.println("Your basic salary will be about Rs.20,000");
System.out.println("The salary will be increased based on your performance and further details of the job would be mentioned in the contract..");
}
else if(pt>7&&pt<=8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for IBM..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.30am on Saturday and if cleared -");
System.out.println("Your basic salary will be about Rs.25,000");
System.out.println("The salary will be increased after two months of service.");
System.out.println("The further details of the job would be mentioned in the contract.");
}
else if(pt>8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for Infosys..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.00am on Monday and if cleared -");
System.out.println("Your basic salary will be about Rs.20,000");
System.out.println("The salary will be increased based on your performance and further details would be mentioned in the contract.");
}
}
else
{
while(num>0)
{
System.out.println();
System.out.println("Please from the following companies select the one you like");
System.out.println("1. Microsoft");
System.out.println("2. Amazon.com");
System.out.println("3. Hewlett-Packard");
int op1=obj.nextInt();
if(op1==1)
{
System.out.println();
System.out.println("You have chosen Microsoft!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 60k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
if(op1==2)
{
System.out.println();
System.out.println("You have chosen  Amazon.com!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be five rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 55k to 60k based on your performance in these interviews..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
if(op1==3)
{
System.out.println();
System.out.println("You have chosen Hewlett-Packard!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 70k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("The company will look after your Housing and your transportation");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
}
}}



else if (op==2)
{
System.out.println();
System.out.println("********************* The Galaxy of chemicals awaits you!!! ********************\n");
System.out.println("You have chosen your major as Chemical Engineering");
System.out.println("Do you have an experience of three years or are you a fresher??");
System.out.println("If you are a fresher enter [0] or else enter [1]");
int exp1= obj.nextInt();
if(exp1== 0)
{
System.out.println("Please Enter your points scored in you final examination  from 1 to 10");
double  pt=obj.nextDouble();
if(pt<=6)
{
System.out.println("You are not eligible for the Job Drive");
System.out.println("We are extremely sorry!!!");
}
else if(pt>6&&pt<=7)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for Vertex Pharmaceuticals, Inc...");
System.out.println("It's an American based company and will offer you a variety of opportunities for a better career.");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 11.00am on Monday in Bangalore, addressed will be sent via mail and if cleared -");
System.out.println("Your basic salary will be about Rs.35,000");
System.out.println("The salary will be increased based on your performance and further details of the job would be mentioned in the contract..");
}
else if(pt>7&&pt<=8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for Eastman Chemical Company..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 9.00am on Friday and if cleared -");
System.out.println("Your basic salary will be about Rs.38,000");
System.out.println("The salary will be increased after three months of service.");
System.out.println("The further details of the job would be mentioned in the contract.");
}
else if(pt>8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for Chevron..");
System.out.println("The company is based in China and has a branch in Mumbai, so you may have to move to Mumbai..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.00am on Thursday and if cleared -");
System.out.println("Your basic salary will be about Rs.40,000");
System.out.println("The salary will be increased based on your performance and further details would be mentioned in the contract.");
}
}
else
{
while(num>0)
{
System.out.println();
System.out.println("Please from the following companies select the one you like");
System.out.println("1. Calgon Corporation");
System.out.println("2. BASF");
System.out.println("3. Amoco");
int op11=obj.nextInt();
if(op11==1)
{
System.out.println();
System.out.println("You have chosen Calgon Corporation!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be two rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 60k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("If you are interesting in joining our company that you would have to move to Germany. Housing and transportation would be provided");
System.out.println("For further information please visit our website\n");

System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op11==2)
{
System.out.println();
System.out.println("You have chosen BASF!!");
System.out.println("We are a Irish based company and our website BASF.com");
System.out.println("The initial salary  provided will be 55k to 60k based on your performance in the interviews conducted..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op11==3)
{
System.out.println();
System.out.println("You have chosen Amoco!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 70k based on your performance in the interviews..");
System.out.println("The company will look after your Housing and your transportation\n");

System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
}
}}



else if(op==3)
{
System.out.println();
System.out.println("********************* Everything is light, everything is warmth, everything is electricity! ********************\n");
System.out.println("You have chosen your major as Electrical Engineering");
System.out.println("Do you have an experience of five years or are you a fresher??");
System.out.println("If you are a fresher enter [0] or else enter [1]");
int exp2= obj.nextInt();
if(exp2== 0)
{
System.out.println("Please Enter your points scored in you final examination  from 1 to 10");
double  pt=obj.nextDouble();
if(pt<=7)
{
System.out.println("You are not eligible for the Job Drive");
System.out.println("We are extremely sorry!!!");
}
else if(pt>7&&pt<=8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for The Boeing Company.");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.30am on Saturday and if cleared -");
System.out.println("Your basic salary will be about Rs.30,000");
System.out.println("The further details of the job would be mentioned in the contract.");
}
else if(pt>8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for BMW Group..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.00am on Monday and if cleared -");
System.out.println("Your basic salary will be about Rs.20,000");
System.out.println("The salary will be increased based on your performance and further details would be mentioned in the contract.");
}
}
else
{
while(num>0)
{
System.out.println();
System.out.println("Please from the following companies select the one you like");
System.out.println("1. Google");
System.out.println("2. Apple");
System.out.println("3. Lockheed Martin Corporation");
int op122=obj.nextInt();
if(op122==1)
{
System.out.println();
System.out.println("You have chosen Google!!!!");
System.out.println("There will be interviews conducted in Bangalore and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 58k to 67k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op122==2)
{
System.out.println();
System.out.println("You have chosen Apple!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be five rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be informed to you during  in these interviews..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op122==3)
{
System.out.println();
System.out.println("You have chosen Lockheed Martin Corporation!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 70k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("The company will look after your Housing and your transportation");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
}
}
}
else if(op==4)
{
System.out.println();
System.out.println("********************* The Domain of civilians awaits you!!! ********************\n");
System.out.println("You have chosen your major as Civil Engineering");
while(num>0)
{
System.out.println();
System.out.println("Please from the following companies select the one you like");
System.out.println("1. Hindustan Construction Company");
System.out.println("2. L & T");
System.out.println("3. Gammon India");
System.out.println("4. MARG Limited");

int op14=obj.nextInt();
if(op14==1)
{
System.out.println();
System.out.println("You have chosen Hindustan Construction Company!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be two rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 60k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("If you are interesting in joining our company that you would have to move to Germany. Housing and transportation would be provided");
System.out.println("For further information please visit our website\n");

System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op14==2)
{
System.out.println();
System.out.println("You have chosen L & T!!");
System.out.println("We are a Irish based company and our website BASF.com");
System.out.println("The initial salary  provided will be 55k to 60k based on your performance in the interviews conducted..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op14==3)
{
System.out.println();
System.out.println("You have chosen Gammon India!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 70k based on your performance in the interviews..");
System.out.println("The company will look after your Housing and your transportation\n");

System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else
{
System.out.println();
System.out.println("You have chosen  MARG Limited!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be five rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 55k to 60k based on your performance in these interviews..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
}
}
else
{
System.out.println();
System.out.println("*********************Mechanic slaves with greasy aprons, rules, and hammers.! ********************\n");
System.out.println("You have chosen your major as Mechanical Engineering");
System.out.println("Do you have an experience of five years or are you a fresher??");
System.out.println("If you are a fresher enter [0] or else enter [1]");
int exp12= obj.nextInt();
if(exp12== 0)
{
System.out.println("Please Enter your points scored in you final examination  from 1 to 10");
double  pt=obj.nextDouble();
if(pt<=7)
{
System.out.println("You are not eligible for the Job Drive");
System.out.println("We are extremely sorry!!!");
}
else if(pt>7&&pt<=8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for FORD MOTORS");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.30am on Saturday and if cleared -");
System.out.println("Your basic salary will be about Rs.30,000");
System.out.println("The further details of the job would be mentioned in the contract.");
}
else if(pt>8)
{
System.out.println();
System.out.println("Hurray!!You are an eligible candidate for GE AVIATION..");
System.out.println("The details are as follows:\n");
System.out.println("Interview at 10.00am on Monday and if cleared -");
System.out.println("Your basic salary will be about Rs.20,000");
System.out.println("The salary will be increased based on your performance and further details would be mentioned in the contract.");
}
}
else
{
while(num>0)
{
System.out.println();
System.out.println("Please from the following companies select the one you like");
System.out.println("1. NASA");
System.out.println("2. Illumina");
System.out.println("3. SpaceX");
int op17=obj.nextInt();
if(op17==1)
{
System.out.println();
System.out.println("You have chosen NASA!!!!");
System.out.println("There will be interviews conducted in Bangalore and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 58k to 67k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op17==2)
{
System.out.println();
System.out.println("You have chosen Illumina!!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be five rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be informed to you during  in these interviews..");
System.out.println("We will also give you a bonus every 3 months as per the feedback given by our customers");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
else if(op17==3)
{
System.out.println();
System.out.println("You have chosen SpaceX!!!");
System.out.println("We are glad you picked us..");
System.out.println("There will be three rounds of interviewing and if you successfull clear them all you have the job!!! :) ");
System.out.println("The initial salary will be 50k to 70k based on your performance in the interviews..");
System.out.println("We will contact you and inform you as to when  the interviews will be conducted.");
System.out.println("The company will look after your Housing and your transportation");
System.out.println("Thank you again for choosing us\n");
System.out.println("Are you satisfied with this company??");
System.out.println("If yes enter [0] or else enter [1]\n");
num=obj.nextInt();
}
}
}

}
System.out.println();
System.out.println();
System.out.println("I hope you enjoyed our Job Hunter Application!!");
System.out.println("We would like to know your feedback so we could improve ourselves and provide you with your Dream Job");
System.out.println("Please rate us on a scale of 0 to 5");
double rt=obj.nextDouble();
System.out.println("Do you want to search for other jobs? Press 1 to do so. To cancel press 0");
haa=obj.nextInt();
}
}
}
else if(faq==3)
{
Scanner br=new Scanner(System.in);
  int pno[]=new int[275];
  String name[]=new String[275];
  String phno[]=new String[275];
  int age[]=new int[275];
  int cl[]=new int[275];
  int pcount=0;
  int pnum=1;
  int max1=75;
  int max2=125;
  int max3=175;
  int cho=0;
  int exit=0;
   while(exit==0)
   {
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("#########################################################");
    System.out.println("****** Railway Reservation For Hogwarts Express *******");
    System.out.println("#########################################################");
    System.out.println("This fabulous train makes a run between King's Cross Station-London (Platform 9-3/4) and Hogsmeade Station");
    System.out.println("The next journey to Hogwarts begins on Easter at 11:00am sharp");
    System.out.println();
    System.out.println("1.Book ticket");
    System.out.println("2.Cancel ticket");
    System.out.println("3.Search passenger");
    System.out.println("4.Reservation chart");
    System.out.println("5.Display unbooked tickets");
    System.out.println("6.Exit");
    System.out.println("Please enter your choice");
    cho=br.nextInt();
    System.out.println();
    if(cho==1)
    {
    System.out.println("Please enter the class of ticket");
    System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
    int c=br.nextInt();
    System.out.println("Please enter no. of tickets");
    int t=br.nextInt();
    int ticketAvailable=0;
    if(ticketAvailable==0)
    {
        if(c==1)
        System.out.println("Only "+max1+" seats are available");
        else if(c==2)
        System.out.println("Only "+max2+" seats are available");
        else
        System.out.println("Only "+max3+" seats are available");
    }
    if(c==1 && max1>=t)
    {
      ticketAvailable=1;
    }
    if(c==2 && max2>=t)
    {
      ticketAvailable=1;
    }
    if(c==3 && max3>=t)
    {
      ticketAvailable=1;
}
if(ticketAvailable==1)
{
for(int i=0;i<t;i++)
{
pno[pcount]=pnum;
System.out.println("Your passenger number is:"+pnum);
System.out.println("Please enter your name");
name[pcount]=br.next();
System.out.println("Please enter your age");
age[pcount]=br.nextInt();
cl[pcount]=c;
System.out.println("Please enter your phno");
phno[pcount]=br.next();
pcount++;
pnum++;
System.out.println("Ticket successfully booked");
}//for
if(c==1)
{
max1-=t;
System.out.println("Please pay Rs."+t*1500);
}
if(c==2)
{
max2-=t;
System.out.println("Please pay Rs."+t*1200);
}
if(c==3)
{
max3-=t;
System.out.println("Please pay Rs."+t*1000);
}
}
exit=0;
}
else if(cho==2)
{
int t_pno[]=new int[275];
String t_name[]=new String[275];
String t_phno[]=new String[275];
int t_age[]=new int[275];
int t_cl[]=new int[275];
int t_pcount=0;
int passengerFound=0;
System.out.println("Please enter your passenger no.");
int p=br.nextInt();
for(int i=0;i<pcount;i++)
{
if(pno[i]!=p)
{//transfer
t_pno[t_pcount]=pno[i];
t_name[t_pcount]=name[i];
t_phno[t_pcount]=phno[i];
t_age[t_pcount]=age[i];
t_cl[t_pcount]=cl[i];
t_pcount++;
}
else
{
passengerFound=1;
if(cl[i]==1)
{
max1++;
System.out.println("Please collect refund of Rs."+1500);
}
if(cl[i]==2)
{
max2++;
System.out.println("Please collect refund of Rs."+1200);
}
if(cl[i]==3)
{
max3++;
System.out.println("Please collect refund of Rs."+1000);
}//else
}//if
}
if(passengerFound==1)
{
pno=t_pno;
name=t_name;
age=t_age;
cl=t_cl;
phno=t_phno;
pcount=t_pcount;
System.out.println("ticket successfully cancelled");
}
else
{
System.out.println("No such passenger");
}
exit=0;
}
else if(cho==4)
{

System.out.println("Passenger list in AC class");
System.out.println("pno \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==1)
{
System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
System.out.println("Passenger list in First class");
System.out.println("pno \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==2)
{
System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
System.out.println("Passenger list in Sleeper class");
System.out.println("pno \t name \t\t age \t phno");
for(int i=0;i<pcount;i++)
{
if(cl[i]==3)
{
System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
}
}
exit=0;
}
else if(cho==3)
{
int passengerFound=0;
System.out.println("Please enter passenger no. to search");
int p=br.nextInt();
for(int i=0;i<pcount;i++)
{
if(pno[i]==p)
{
System.out.println("Detail found");
passengerFound=1;
System.out.println("passenger no.="+pno[i]); 
System.out.println("name="+name[i]);
System.out.println("class="+cl[i]); 
System.out.println("phno="+phno[i]);
System.out.println("age="+age[i]);
}
}//for
if(passengerFound==0)
System.out.println("No such passenger");
exit=0;
}
else if(cho==5)
{
System.out.println("No. of unbooked tickets status");
System.out.println("AC class - "+max1);
System.out.println("First class - "+max2);
System.out.println("Sleeper class - "+max3);
exit=0;
}
else if(cho==6)
{
System.out.println("Thank you!");
exit=1;
}
else
System.out.println("Wrong choice");
}
}

else if(faq==4)

{
 int b=0; // to add the first numbers of each list of numbers in which the player's number is present, so as to arrive at the original number that the user entered in the beginning;
        int infinity=1; // used to keep the game running forever unless the player decides to end it;
        String checker=""; // to check if the user wants to keep playing this game or wants to exit;
        String a=""; // accepting the first input from the player (Yes or No);
        String c=""; // accepting the second input from the player (Yes or No);
        String d=""; // accepting the third input from the player (Yes or No);
        String e=""; // accepting the fourth input from the player (Yes or No);
        String f=""; // accepting the fifth input from the player (Yes or No);
        String g=""; // accepting the sixth input from the player (Yes or No);
        String h=""; // accepting the seventh input from the player (Yes or No);

        
        

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        while(infinity>0)
        {
            b=0;
            // This variable has been given its default value once again to avoid any issues;
            System.out.println("Yo!!!");
            System.out.println("Here's a Cool Number Trick which tells you which number you have selected out of a hundred numbers!!!");
            System.out.println("");
            System.out.println("####################");
            System.out.println("");
            System.out.println("INSTRUCTIONS:");
            System.out.println("You will be Asked 7 'Yes-No' Questions.");
            System.out.println("If your Answer is Yes, type 1 or Yes.");
            System.out.println("And If your Answer is No, type 0 or No.");
            System.out.println("Please do not enter any other input or else it might cause some unexpected errors.");
            System.out.println("");
            System.out.println("####################");
            System.out.println("");
            System.out.println("Choose a Number Between 1 and 99 and keep it in your mind.");
            System.out.println("");
            System.out.println("Below is a list of numbers. Is your number here?");
            System.out.println("2,   3,   6,   7,   10,");
            System.out.println("11,  14,  15,  18,  19,");
            System.out.println("22,  23,  26,  27,  30,");
            System.out.println("31,  34,  35,  38,  39,");
            System.out.println("42,  43,  46,  47,  50,");
            System.out.println("51,  54,  55,  58,  59,");
            System.out.println("62,  63,  66,  67,  70,");
            System.out.println("71,  74,  75,  78,  79,");
            System.out.println("82,  83,  86,  87,  90,");
            System.out.println("91,  94,  95,  98,  99,");
            System.out.println("Type Your Answer");
            System.out.println("");
            a=br.readLine();
            if(a.equalsIgnoreCase("Yes")||a.equalsIgnoreCase("Yes.")||a.equals("1")||a.equals("1.")||a.equalsIgnoreCase(" Yes")||a.equalsIgnoreCase(" Yes.")||a.equalsIgnoreCase("Yes ")||a.equalsIgnoreCase("Yes. ")||a.equals(" 1")||a.equals(" 1.")||a.equals("1 ")||a.equals("1. "))
            {
                b=b+2;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Is your number here?");
            System.out.println("4,  5,  6,  7,  12,  13,  14,");
            System.out.println("15,  20,  21,  22,  23,  28,  29,");
            System.out.println("30,  31,  36,  37,  38,  39,  44,");
            System.out.println("45,  46,  47,  52,  53,  54,  55,");
            System.out.println("60,  61,  62,  63,  68,  69,  70,");
            System.out.println("71,  76, 77,  78,  79,  84,  85,");
            System.out.println("86,  87,  92,  93,  94,  95,");
            System.out.println("Type Your Answer");
            System.out.println("");
            c=br.readLine();
            if(c.equalsIgnoreCase("Yes")||c.equalsIgnoreCase("Yes.")||c.equals("1")||c.equals("1.")||c.equalsIgnoreCase(" Yes")||c.equalsIgnoreCase(" Yes.")||c.equalsIgnoreCase("Yes ")||c.equalsIgnoreCase("Yes. ")||c.equals(" 1")||c.equals(" 1.")||c.equals("1 ")||c.equals("1. "))
            {
                b=b+4;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Is Your Number Here?");
            System.out.println("1,  3,  5,  7,  9,");
            System.out.println("11,  13,  15,  17,  19,");
            System.out.println("21,  23,  25,  27,  29,");
            System.out.println("31,  33,  35,  37,  39,");
            System.out.println("41,  43,  45,  47,  49,");
            System.out.println("51,  53,  55,  57,  59,");
            System.out.println("61,  63,  65,  67,  69,");
            System.out.println("71,  73,  75,  77,  79,");
            System.out.println("81,  83,  85,  87,  89,");
            System.out.println("91,  93,  95,  97,  99,");
            System.out.println("Type Your Answer");
            System.out.println("");
            d=br.readLine();
            if(d.equalsIgnoreCase("Yes")||d.equalsIgnoreCase("Yes.")||d.equals("1")||d.equals("1.")||d.equalsIgnoreCase(" Yes")||d.equalsIgnoreCase(" Yes.")||d.equalsIgnoreCase("Yes ")||d.equalsIgnoreCase("Yes. ")||d.equals(" 1")||d.equals(" 1.")||d.equals("1 ")||d.equals("1. "))
            {
                b=b+1;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Is Your Number Here?");
            System.out.println("16,  17,  18,  19,");
            System.out.println("20,  21,  22,  23,");
            System.out.println("24,  25,  26,  27,");
            System.out.println("28,  29,  30,  31,");
            System.out.println("48,  49,  50,  51,");
            System.out.println("52,  53,  54,  55,");
            System.out.println("56,  57,  58,  59,");
            System.out.println("60,  61,  62,  63,");
            System.out.println("80,  81,  82,  83,");
            System.out.println("84,  85,  86,  87,");
            System.out.println("88,  89,  90,  91,");
            System.out.println("92,  93,  94,  95,");
            System.out.println("Type Your Answer");
            System.out.println("");
            e=br.readLine();
            if(e.equalsIgnoreCase("Yes")||e.equalsIgnoreCase("Yes.")||e.equals("1")||e.equals("1.")||e.equalsIgnoreCase(" Yes")||e.equalsIgnoreCase(" Yes.")||e.equalsIgnoreCase("Yes ")||e.equalsIgnoreCase("Yes. ")||e.equals(" 1")||e.equals(" 1.")||e.equals("1 ")||e.equals("1. "))
            {
                b=b+16;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Is Your Number Here?");
            System.out.println("8,  9,  10,  11,");
            System.out.println("12,  13,  14,  15,");
            System.out.println("24,  25,  26,  27,");
            System.out.println("28,  29,  30,  31,");
            System.out.println("40,  41,  42,  43,");
            System.out.println("44,  45,  46,  47,");
            System.out.println("56,  57,  58,  59,");
            System.out.println("60,  61,  62,  63,");
            System.out.println("72,  73,  74,  75,");
            System.out.println("76,  77,  78,  79,");
            System.out.println("88,  89,  90,  91,");
            System.out.println("92,  93,  94,  95,");
            System.out.println("Type Your Answer");
            System.out.println("");
            f=br.readLine();
            if(f.equalsIgnoreCase("Yes")||f.equalsIgnoreCase("Yes.")||f.equals("1")||f.equals("1.")||f.equalsIgnoreCase(" Yes")||f.equalsIgnoreCase(" Yes.")||f.equalsIgnoreCase("Yes ")||f.equalsIgnoreCase("Yes. ")||f.equals(" 1")||f.equals(" 1.")||f.equals("1 ")||f.equals("1. "))
            {
                b=b+8;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Is Your Number Here?");
            System.out.println("32,  33,  34,  35,  36,  37,");
            System.out.println("38,  39,  40,  41,  42,  43,");
            System.out.println("44,  45,  46,  47,  48,  49,");
            System.out.println("50,  51,  52,  53,  54,  55,");
            System.out.println("56,  57,  58,  59,  60,  61,");
            System.out.println("62,  63,  96,  97,  98,  99,");
            System.out.println("Type Your Answer");
            System.out.println("");
            g=br.readLine();
            if(g.equalsIgnoreCase("Yes")||g.equalsIgnoreCase("Yes.")||g.equals("1")||g.equals("1.")||g.equalsIgnoreCase(" Yes")||g.equalsIgnoreCase(" Yes.")||g.equalsIgnoreCase("Yes ")||g.equalsIgnoreCase("Yes. ")||g.equals(" 1")||g.equals(" 1.")||g.equals("1 ")||g.equals("1. "))
            {
                b=b+32;
            }
            else
            {
                b=b;
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Is Your Number Here?");
            System.out.println("64,  65,  66,  67,  68,  69,");
            System.out.println("70,  71,  72,  73,  74,  75,");
            System.out.println("76,  77,  78,  79,  80,  81,");
            System.out.println("82,  83,  84,  85,  86,  87,");
            System.out.println("88,  89,  90,  91,  92,  93,");
            System.out.println("94,  95,  96,  97,  98,  99,");
            System.out.println("Type Your Answer");
            System.out.println("");
            h=br.readLine();
            if(h.equalsIgnoreCase("Yes")||h.equalsIgnoreCase("Yes.")||h.equals("1")||h.equals("1.")||h.equalsIgnoreCase(" Yes")||h.equalsIgnoreCase(" Yes.")||h.equalsIgnoreCase("Yes ")||h.equalsIgnoreCase("Yes. ")||h.equals(" 1")||h.equals(" 1.")||h.equals("1 ")||h.equals("1. "))
            {
                b=b+64;
            }
            else
            {
                b=b;
            }
            if(b<100)
            {
                System.out.println("");
                System.out.println("******************");
                System.out.println("******************");
                System.out.println("Your number is "+b);
                System.out.println("******************");
                System.out.println("******************");
                System.out.println("");
                System.out.println("If you wish to end this game, type 'exit' and hit enter, else, press any other key and hit enter...");
                checker=br.readLine();
                if(checker.equalsIgnoreCase("Exit")||checker.equalsIgnoreCase(" Exit")||checker.equalsIgnoreCase("Exit ")||checker.equalsIgnoreCase("Exit.")||checker.equalsIgnoreCase(" Exit.")||checker.equalsIgnoreCase("Exit. "))
                {
                    infinity=1;
                    System.out.print('\f');
                    System.out.println("Good Bye!");
                    break;
                }
                else
                {
                    System.out.print('\f');
                }

            }
            else
            {
                System.out.println("");
                System.out.println("You did not follow the instructions properly. :P");
                System.out.println("You tried to be oversmart. :P");
                System.out.println("");
                System.out.println("If you wish to end this game, type 'exit' and hit enter, else, press any other key and hit enter...");
                checker=br.readLine();
                if(checker.equalsIgnoreCase("Exit")||checker.equalsIgnoreCase(" Exit")||checker.equalsIgnoreCase("Exit ")||checker.equalsIgnoreCase("Exit.")||checker.equalsIgnoreCase(" Exit.")||checker.equalsIgnoreCase("Exit. "))
                {
                    infinity=1;
                    System.out.print('\f');
                    System.out.println("Good Bye!");
                    break;
                }
                else
                {
                    System.out.print('\f');
                }

            }
        }
 }
 else if(faq==5)
 {System.out.println('\f');
     String str="Thank you";
   int n=str.length();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(str.charAt(j)+ " ");
}
System.out.println();
}
    System.out.println();
     System.out.println("Good Bye!!");
     System.exit(0);
    }
     
 System.out.println();
 System.out.println("Do you want to go to the main menu?    1.Yes      2.No");
 ex=gg.nextInt();
 System.out.println('\f');
 

 if(ex==2)
 { 
     System.out.println('\f');
     String str="Thank you";
   int n=str.length();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(str.charAt(j)+ " ");
}
System.out.println();
}
    System.out.println();
     System.out.println("Good Bye!!");
 }

} while(ex==1);
}
}
