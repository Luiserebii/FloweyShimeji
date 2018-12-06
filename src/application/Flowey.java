package application;

import java.io.File;
import java.net.MalformedURLException;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;

public class Flowey {

	private Image talking_0;
	private Image currImage;

	private GUIController gc;

	public Flowey(GUIController inGC) { //perhaps this "Flowey" class is the main flowey, and the rest just hold image; Handler while the others are Animations?

		try {
			gc = inGC;
			talking_0 = new Image(new File("img/Flowey/0.png").toURI().toURL().toString(),42,30,false,false);
			currImage = talking_0;
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		FloweyAppears fa = new FloweyAppears();
		fa.start();

//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		FloweyDisappears fd = new FloweyDisappears();
//		fd.start();

	}

	public Image getCurrImage(){
		return currImage;
	}

	public void setImage(Image img){
		gc.setImage(img);
	}

	public void setCurrImage(Image img){
		currImage = img;
	}


	public class FloweyAppears extends AnimationTimer {

		private Image a1;
		private Image a2;
		private Image a3;
		private Image a4;
		private Image a5;
		private Image a6;
		private Image a7;
		private Image a8;

		private long startTime;
		private long interval;

		public FloweyAppears(){
			try{
				a1 = new Image(new File("img/Flowey/26.png").toURI().toURL().toString(),42,30,false,false);
				a2 = new Image(new File("img/Flowey/27.png").toURI().toURL().toString(),90,36,false,false);
				a3 = new Image(new File("img/Flowey/28.png").toURI().toURL().toString(),216,45,false,false);
				a4 = new Image(new File("img/Flowey/29.png").toURI().toURL().toString(),246,96,false,false);
				a5 = new Image(new File("img/Flowey/30.png").toURI().toURL().toString(),246,150,false,false);
				a6 = new Image(new File("img/Flowey/31.png").toURI().toURL().toString(),246,204,false,false);
				a7 = new Image(new File("img/Flowey/32.png").toURI().toURL().toString(),246,294,false,false);
				a8 = new Image(new File("img/Flowey/33.png").toURI().toURL().toString(),246,270,false,false);
			} catch(MalformedURLException e){

			}
			startTime = System.nanoTime();
			interval = 100000000;
		}

		@Override
		public void handle(long now) {
			// TODO Auto-generated method stub

			if(!getCurrImage().equals(a8)){

				long diff = now - startTime;
				//System.out.println(diff);

	        	if(diff < interval){
	        		setCurrImage(a1);
	        		setImage(a1);
	        	}
	        	if(diff > interval && diff < interval * 2){
	        		setCurrImage(a2);
	        		setImage(a2);
	        	}
	        	if(diff > interval * 2 && diff < interval * 3){
	        		setCurrImage(a3);
	        		setImage(a3);
	        	}
	        	if(diff > interval * 3 && diff < interval * 4){
	        		setCurrImage(a4);
	        		setImage(a4);
	        	}
	        	if(diff > interval * 4 && diff < interval * 5){
	        		setCurrImage(a5);
	        		setImage(a5);
	        	}
	        	if(diff > interval * 5 && diff < interval * 6){
	        		setCurrImage(a6);
	        		setImage(a6);
	        	}
	        	if(diff > interval * 6 && diff < interval * 7){
	        		setCurrImage(a7);
	        		setImage(a7);
	        	}
	        	if(diff > interval * 7){
	        		setCurrImage(a8);
	        		setImage(a8);
	        		stop(); //ahhh... put stop code within animation?
	        	}


			}

		}


	}

	public class FloweyTalking extends AnimationTimer {

		@Override
		public void handle(long now) {
			// TODO Auto-generated method stub



		}


	}

	public class FloweyDisappears extends AnimationTimer {

		private Image a1;
		private Image a2;
		private Image a3;
		private Image a4;
		private Image a5;
		private Image a6;
		private Image a7;
		private Image a8;

		private long startTime;
		private long interval;

		public FloweyDisappears(){
			try{
				a1 = new Image(new File("img/Flowey/26.png").toURI().toURL().toString(),42,30,false,false);
				a2 = new Image(new File("img/Flowey/27.png").toURI().toURL().toString(),90,36,false,false);
				a3 = new Image(new File("img/Flowey/28.png").toURI().toURL().toString(),216,45,false,false);
				a4 = new Image(new File("img/Flowey/29.png").toURI().toURL().toString(),246,96,false,false);
				a5 = new Image(new File("img/Flowey/30.png").toURI().toURL().toString(),246,150,false,false);
				a6 = new Image(new File("img/Flowey/31.png").toURI().toURL().toString(),246,204,false,false);
				a7 = new Image(new File("img/Flowey/32.png").toURI().toURL().toString(),246,294,false,false);
				a8 = new Image(new File("img/Flowey/33.png").toURI().toURL().toString(),246,270,false,false);
			} catch(MalformedURLException e){

			}
			startTime = System.nanoTime();
			interval = 100000000;
		}

		@Override
		public void handle(long now) {
			// TODO Auto-generated method stub

			if(!getCurrImage().equals(a8)){

				long diff = now - startTime;
				//System.out.println(diff);

	        	if(diff < interval){
	        		setCurrImage(a8);
	        		setImage(a8);
	        	}
	        	if(diff > interval && diff < interval * 2){
	        		setCurrImage(a7);
	        		setImage(a7);
	        	}
	        	if(diff > interval * 2 && diff < interval * 3){
	        		setCurrImage(a6);
	        		setImage(a6);
	        	}
	        	if(diff > interval * 3 && diff < interval * 4){
	        		setCurrImage(a5);
	        		setImage(a5);
	        	}
	        	if(diff > interval * 4 && diff < interval * 5){
	        		setCurrImage(a4);
	        		setImage(a4);
	        	}
	        	if(diff > interval * 5 && diff < interval * 6){
	        		setCurrImage(a3);
	        		setImage(a3);
	        	}
	        	if(diff > interval * 6 && diff < interval * 7){
	        		setCurrImage(a2);
	        		setImage(a2);
	        	}
	        	if(diff > interval * 7){
	        		setCurrImage(a1);
	        		setImage(a1);
	        		stop(); //ahhh... put stop code within animation?
	        	}


			}

		}


	}


}
