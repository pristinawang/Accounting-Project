/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pristy
 */
import java.io.*;
	
	public class Spending implements Spendinginter {
		private int startdatey;
		private String startdatem;
		private String startdated;
		private String item;
		private String money;
		
		public Spending() {
		}
		public int calculateTotalSpending() {
			int totalspending=0;
			FileReader fr = null;
			try {
				fr=new FileReader("/Users/pristy/Desktop/text.txt");
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
			//read file
			BufferedReader b = new BufferedReader(fr);
			//data processing : importing data
			String input="";
			String moneyog="";
			int actualmoney;
			//input != null &&
			loop:{
			do{
				int testzero=0;
				int n=0;
				try {
					input = b.readLine();
				}catch(IOException e) {
					System.out.println("file reading error");
					System.exit(-2);
				}
				if(input == null || input.equals(null))
					break loop;
				moneyog=input.substring(9,16);
				
				while(testzero==0 && n<7) {
					if(n==6) {
						testzero=Integer.parseInt(moneyog.substring(n));
					}
					else
						testzero=Integer.parseInt(moneyog.substring(n,n+1));
					n=n+1;
				}
				actualmoney=Integer.parseInt(moneyog.substring(n-1));
				
				totalspending=totalspending+actualmoney;
				
			}while( input != null && !input.equals("")) ;
			}
			return totalspending;
		}
		public void setSpending(int y, int m, int d, int mon, String item) {
			setStartDatey(y);
			setStartDatem(m);
			setStartDated(d);
			setItem(item);
			setMoney(mon);
			// file open
			FileReader fr = null;
			try {
				fr=new FileReader("/Users/pristy/Desktop/text.txt");
			}catch (IOException e) {
				System.out.println("file open error");
				System.exit(-1);
			}
			//read file
			BufferedReader b = new BufferedReader(fr);
			
			//data processing : import data
			String input="";
			try {
					input = b.readLine();
			}catch(IOException e) {
				System.out.println("file reading error");
				System.exit(-2);
			}
			if(input==null) {
				
				//close file
				try {
					b.close();
				} catch (IOException e) {
					System.out.println("file close error");
				}
				FileWriter fw = null;
				try {
					fw=new FileWriter("/Users/pristy/Desktop/text.txt",true);
				}catch (IOException e) {
					System.out.println("file open error");
					System.exit(-1);
				}
				//Read file
				PrintWriter p = new PrintWriter(fw);
						
				//data processing : exporting data
				p.print(getStartDatey());
				p.print(getStartDatem());
				p.print(getStartDated());
				p.print(" ");
				p.print(getMoney());
				p.print(" ");
				p.print(getItem());
						
				//close file
				p.close();
			}
			else {
			
					//close file
					try {
						b.close();
					} catch (IOException e) {
						System.out.println("file close error");
					}
					FileWriter fw = null;
					try {
						fw=new FileWriter("/Users/pristy/Desktop/text.txt",true);
					}catch (IOException e) {
						System.out.println("file open error");
						System.exit(-1);
					}
					//Read file
					PrintWriter p = new PrintWriter(fw);
							
					//data processing : exporting data
					
					p.print("\n"+getStartDatey());
					p.print(getStartDatem());
					p.print(getStartDated());
					p.print(" ");
					p.print(getMoney());
					p.print(" ");
					p.print(getItem());
							
					//close file
					p.close();
			}
		}
		public void setStartDatey(int y) {
			startdatey=y;
		}
		public void setStartDatem(int m) {
			if(m<=9) {
				startdatem="0"+Integer.toString(m);
			}
			else {
				startdatem=Integer.toString(m);
			}
			
		}
		public void setStartDated(int d) {
			if(d<=9) {
				startdated="0"+Integer.toString(d);
			}
			else {
				startdated=Integer.toString(d);
			}
		}
		public int getStartDatey() {
			return startdatey;
		}
		public String getStartDatem() {
			return startdatem;
		}
		public String getStartDated() {
			return startdated;
		}
		public void setItem(String i) {
			item=i;
		}
		public String getItem() {
			return item;
		}
		public void setMoney(int m) {
			if(m>999999) {
				money=Integer.toString(m);
			}
			else {
				if(m>99999) {
					money="0"+Integer.toString(m);
				}
				else {
					if(m>9999) {
						money="00"+Integer.toString(m);
					}
					else {
						if(m>999) {
							money="000"+Integer.toString(m);
						}
						else {
							if(m>99) {
								money="0000"+Integer.toString(m);
							}
							else {
								if(m>9) {
									money="00000"+Integer.toString(m);
								}
								else {
									money="000000"+Integer.toString(m);
								}	
							}
						}
					}
				}
				
			}
		}
		public String getMoney() {
			return money;
		}
               
	}