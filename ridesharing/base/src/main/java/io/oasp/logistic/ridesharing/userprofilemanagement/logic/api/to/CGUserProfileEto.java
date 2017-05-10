package io.oasp.logistic.ridesharing.userprofilemanagement.logic.api.to;

import io.oasp.logistic.ridesharing.userprofilemanagement.common.api.CGUserProfile;
import io.oasp.module.basic.common.api.to.AbstractEto;

import java.util.Locale;

/**
 * The {@link AbstractEto ETO} for a {@link CGUserProfile}.
 */
public class CGUserProfileEto extends AbstractEto implements CGUserProfile {

    // UUID
    private static final long serialVersionUID = 1L;

    private String name;

    private String firstName;

    private String lastName;

//  private Role role;

    private Locale language;

    /**
     * The constructor.
     */
    public CGUserProfileEto() {

        super();
    }

    @Override
    public String getName() {

        return this.name;
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }

    @Override
    public String getFirstName() {

        return this.firstName;
    }

    @Override
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    @Override
    public String getLastName() {

        return this.lastName;
    }

    @Override
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

  /*
  @Override
  public Role getRole() {

    return this.role;
  }

  @Override
  public void setRole(Role role) {

    this.role = role;
  }
*/

    /**
     * @return language
     */
    public Locale getLanguage() {

        return this.language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(Locale language) {

        this.language = language;
    }
}
