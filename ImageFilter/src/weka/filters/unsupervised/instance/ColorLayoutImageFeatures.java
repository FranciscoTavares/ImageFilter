package weka.filters.unsupervised.instance;

import java.awt.image.BufferedImage;

import net.semanticmetadata.lire.imageanalysis.ColorLayout;


public class ColorLayoutImageFeatures extends AbstractImageFeatures {

	private static final long serialVersionUID = 3969180123053302460L;

	public String globalInfo() {
		return "A batch filter for extracting MPEG7 color layout features from images.";
	}
	
	protected int getNumFeatures(){
		return 120;
	}
	
	protected String getFeatureNamePrefix(){
		return "CL";
	}
	
	protected double[] getFeatures(BufferedImage img){
		ColorLayout features=new ColorLayout();
		features.extract(img);
		return features.getDoubleHistogram();
	}
	
	public static void main(String[] args) {
		runFilter(new ColorLayoutImageFeatures(), args);
	}
	
}
