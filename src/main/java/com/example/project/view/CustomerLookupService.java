package com.example.project.view;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

/** Main interface for classes that you retrieve bank
 *  customers by ID. This interface provides no way to
 *  modify the set of customers, so you don't have to
 *  worry about race conditions with shared data.
 */

public interface CustomerLookupService {
  public Customer findCustomer(String id);
}
