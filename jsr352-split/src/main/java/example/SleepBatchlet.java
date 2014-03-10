package example;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.context.StepContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SleepBatchlet extends AbstractBatchlet {

    @Inject
    StepContext stepContext;

    @Override
    public String process() throws Exception {
        System.out.println("stepName: " + stepContext.getStepName() + " start sleeping");
        Thread.sleep(400 * 1000);
        System.out.println("stepName: " + stepContext.getStepName() + " done sleeping");
        return null;
    }
}
