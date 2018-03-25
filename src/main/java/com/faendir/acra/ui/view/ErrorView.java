package com.faendir.acra.ui.view;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Lukas
 * @since 21.05.2017
 */
@SpringComponent
@UIScope
public class ErrorView extends Composite implements View {
    public ErrorView() {
        VerticalLayout layout = new VerticalLayout();
        Label label = new Label("This page does not exist or you do not have the permission to view it.");
        layout.addComponent(label);
        layout.setComponentAlignment(label, Alignment.MIDDLE_CENTER);
        layout.setSizeFull();
        setCompositionRoot(layout);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
