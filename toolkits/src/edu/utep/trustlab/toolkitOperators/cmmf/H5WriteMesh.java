package edu.utep.trustlab.toolkitOperators.cmmf;
import edu.utep.trustlab.toolkitOperators.SimulationOperator;
import edu.utep.trustlab.toolkitOperators.util.CommandRunner;
import edu.utep.trustlab.toolkitOperators.util.FileUtils;


public class H5WriteMesh extends SimulationOperator
{
	
	// the output name for the dataset generated by this operator
	private static final String outputFileName = "OutputMesh.xmf";
	
	public H5WriteMesh(String contextURL) {
		super(contextURL, outputFileName);
	}

	/*
	 * This method accesses the functionality of the wrapped executable. In this example, the exectuable takes
	 * three params (param1, param2, and param3). You can extend this to take as many parameters as necessary. This
	 * examples assume that the executable takes an input file path and an output file path, where the result will be written.
	 */
	public String transform()
	{
		String FileNameRandomString = FileUtils.getRandomString();
		String h5FileName = "Mesh" + FileNameRandomString + ".h5";
		String xmfFileName = "Mesh" + FileNameRandomString + ".xmf";
		
		//The command string that will be passed to the shell
		String cmd = "/share/apps/cmmf/h5WriteMesh " + h5FileName;
		CommandRunner.run(cmd, FileUtils.getWorkspace());
		
		cmd = "/share/apps/cmmf/h5WriteXmfMesh " + h5FileName + " " + xmfFileName; 
		CommandRunner.run(cmd, FileUtils.getWorkspace());

		return FileUtils.getOutputURLPrefix() + xmfFileName;
	}
}
