package fr.sll.goodpoints.ui;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI
public class ApplicationUI extends UI {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2624268489988008305L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
        setContent(new Label("Hello! I'm the root UI!"));
    }
}