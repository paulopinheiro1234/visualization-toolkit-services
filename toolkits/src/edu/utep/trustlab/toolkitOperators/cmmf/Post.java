package edu.utep.trustlab.toolkitOperators.cmmf;
import edu.utep.trustlab.toolkitOperators.ToolkitOperator;
import edu.utep.trustlab.toolkitOperators.util.CommandRunner;


public class Post extends ToolkitOperator
{
	/* Is the data this operator processes encoded in ASCII?
	 * If you specify true, then (String stringData) variable will be populated.
	 * Otherwise, (byte[] binaryData) variable will be populated.
	 */
	private static final boolean isInputDataTextual = false;
	
	// Should the input dataset be persisted in a buffer?
	private static final boolean shouldPersistInMemory = true;
	
	// the output name for the dataset generated by this operator
	private static final String outputFileName = "outputdata.bin";
	
	public Post(String datasetURL) {
		super(datasetURL, isInputDataTextual, shouldPersistInMemory, outputFileName);
	}

	/*
	 * This method accesses the functionality of the wrapped executable. In this example, the exectuable takes
	 * three params (param1, param2, and param3). You can extend this to take as many parameters as necessary. This
	 * examples assume that the executable takes an input file path and an output file path, where the result will be written.
	 */
	public String transform(
			String param1,
			String param2,
			String param3)
	{
		//The command string that will be passed to the shell
		// sh post jobname dim dir
		String cmd = 
			"executable-name "
			+ inputPath + " "
			+ outputPath + " "
			+ param1 + " "
			+ param2 + " "
			+ param3 + " ";
		
		CommandRunner.run(cmd);
		return outputURL;
	}
}
