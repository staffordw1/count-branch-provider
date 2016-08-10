import org.jboss.windup.config.AbstractRuleProvider;
import org.jboss.windup.config.metadata.MetadataBuilder;
import org.jboss.windup.graph.GraphContext;
import org.jboss.windup.reporting.config.Hint;
import org.jboss.windup.reporting.config.Link;
import org.jboss.windup.reporting.config.classification.Classification;
import org.jboss.windup.rules.apps.xml.condition.XmlFile;
import org.jboss.windup.rules.apps.xml.model.XmlFileModel;
import org.jboss.windup.rules.files.FileMapping;
import org.ocpsoft.rewrite.config.Configuration;
import org.ocpsoft.rewrite.config.ConfigurationBuilder;

public class RuleFlowRuleProvider extends AbstractRuleProvider{
	
	
	public RuleFlowRuleProvider() {
		super(MetadataBuilder.forProvider(RuleFlowRuleProvider.class));
	}
	
	@Override
	public Configuration getConfiguration(GraphContext context)
	{
		return ConfigurationBuilder.begin()
	    .addRule().when(FileMapping.from(".*\\.rfl$").to(XmlFileModel.class)).perform(FileMapping.from(".*\\.rfl$").to(XmlFileModel.class)).withId("FileMapping_.*\\.rfl$_1");
	    
	    /* return builder.addRule().when(XmlFile.matchesXpath("//rf:Transition").namespace("rf", "http://schemas.ilog.com/Rules/7.0/Ruleflow")).perform(Classification.as("Proprietary @ProprietaryServlet")
	               .with(Link.to("Java EE 6 @WebServlet", "https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Application_Platform/index.html"))
	               .withEffort(0)
	               .and(Hint.withText("Migrate to Java EE 6 @WebServlet.").withEffort(8))
	        ); */
	    /* .addRule().when(XmlFile.matchesXpath("//rfModel")).perform(Classification.as("Proprietary @ProprietaryServlet")
	               .with(Link.to("Java EE 6 @WebServlet", "https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Application_Platform/index.html"))
	               .withEffort(0)
	               .and(Hint.withText("Migrate to Java EE 6 @WebServlet.").withEffort(8))
	        ).withId("RuleFlowProvider_1"); */
	}
}
