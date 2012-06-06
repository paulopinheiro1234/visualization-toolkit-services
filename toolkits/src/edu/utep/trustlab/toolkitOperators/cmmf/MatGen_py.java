package edu.utep.trustlab.toolkitOperators.cmmf;
import edu.utep.trustlab.toolkitOperators.ToolkitOperator;
import edu.utep.trustlab.toolkitOperators.util.CommandRunner;


public class MatGen_py extends ToolkitOperator
{
	/* Is the data this operator processes encoded in ASCII?
	 * If you specify true, then (String stringData) variable will be populated.
	 * Otherwise, (byte[] binaryData) variable will be populated.
	 */
	private static final boolean isInputDataTextual = false;
	
	// Should the input dataset be persisted in a buffer?
	private static final boolean shouldPersistInMemory = false;
	
	// the output name for the dataset generated by this operator
	private static final String outputFileName = "Materials";
	
	public MatGen_py(String datasetURL) {
		super(datasetURL, isInputDataTextual, shouldPersistInMemory, outputFileName);
	}

	/*
	 * This method accesses the functionality of the wrapped executable. In this example, the exectuable takes
	 * three params (param1, param2, and param3). You can extend this to take as many parameters as necessary. This
	 * examples assume that the executable takes an input file path and an output file path, where the result will be written.
	 */
	/*
	    fgID � first grain ID (int, from CFGfile)
		#grains � number of grains (int, same as GenGeo)
		Model � material model name (string, user specified)
		Int_model � interface material model (string, optional, user specified)
		Ext � output filename (string, optional)

	 */
	public String transform(
			String fgID,
			String ngrains,
			String model,
			String int_model,
			String ext)
	{
		//The command string that will be passed to the shell
		// python MatGen.py �f fgID �g #grains �g model �I int_model �E ext
		String cmd = 
			"python MatGen.py " +
			" -f " + fgID +   
			" -g " + ngrains +
			" -m " + model +
			" -I " + int_model + 
			" -E " + ext;
		
		CommandRunner.run(cmd);

		/* 
		    Materials.Ext � file containing material parameters for each grain and 
		    interface (I use the extension to indicate that models used)
		 */
		// we may need to inspect the output folder to build the output file xml
		
		return outputURL;
	}
}
