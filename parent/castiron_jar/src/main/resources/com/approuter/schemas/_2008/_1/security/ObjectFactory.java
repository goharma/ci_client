
package com.approuter.schemas._2008._1.security;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.approuter.schemas._2008._1.security package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RevokePrivilegeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokePrivilegeResponse");
    private final static QName _GetRolesInRoleGroup_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRolesInRoleGroup");
    private final static QName _EnableUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "enableUserResponse");
    private final static QName _GetScopeByIdResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScopeByIdResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "deleteUserResponse");
    private final static QName _IsUserEnabled_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "isUserEnabled");
    private final static QName _GetImpliedRolesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getImpliedRolesResponse");
    private final static QName _GetRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRole");
    private final static QName _GetKerberosRealm_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getKerberosRealm");
    private final static QName _GetScopesByParentIdResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScopesByParentIdResponse");
    private final static QName _ListRolesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listRolesResponse");
    private final static QName _SetKerberosConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setKerberosConfigurationResponse");
    private final static QName _GetUsersResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUsersResponse");
    private final static QName _FilterNewUsersResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "filterNewUsersResponse");
    private final static QName _GetRoleUsersResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleUsersResponse");
    private final static QName _GetKerberosServerNameResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getKerberosServerNameResponse");
    private final static QName _CreateRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "createRoleResponse");
    private final static QName _ListGrantableRolesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listGrantableRolesResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "updateUserResponse");
    private final static QName _Logout_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "logout");
    private final static QName _GetImpliedRoles_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getImpliedRoles");
    private final static QName _GetUserById_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUserById");
    private final static QName _GetRoleGroups_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleGroups");
    private final static QName _DeleteRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "deleteRole");
    private final static QName _GetUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUser");
    private final static QName _LoginResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "loginResponse");
    private final static QName _EnableUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "enableUser");
    private final static QName _ListAvailableActionsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listAvailableActionsResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUserResponse");
    private final static QName _GetKerberosRealmResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getKerberosRealmResponse");
    private final static QName _FilterUsersResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "filterUsersResponse");
    private final static QName _FilterNewUsers_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "filterNewUsers");
    private final static QName _UserExists_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "userExists");
    private final static QName _RevokePrivilegesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokePrivilegesResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "createUserResponse");
    private final static QName _GrantRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantRoleResponse");
    private final static QName _SetCurrentScopeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setCurrentScopeResponse");
    private final static QName _ListPrivileges_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listPrivileges");
    private final static QName _AddRoleToRoleGroupResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "addRoleToRoleGroupResponse");
    private final static QName _AddRoleToRoleGroup_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "addRoleToRoleGroup");
    private final static QName _RoleExists_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "roleExists");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "changePasswordResponse");
    private final static QName _GetKerberosServerName_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getKerberosServerName");
    private final static QName _ChangePassword_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "changePassword");
    private final static QName _HasPrivilege_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "hasPrivilege");
    private final static QName _GrantPrivilegeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantPrivilegeResponse");
    private final static QName _UpdateRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "updateRoleResponse");
    private final static QName _GetRolesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRolesResponse");
    private final static QName _GrantPrivileges_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantPrivileges");
    private final static QName _GrantPrivilege_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantPrivilege");
    private final static QName _ListAvailableActions_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listAvailableActions");
    private final static QName _ClearPrivilegesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "clearPrivilegesResponse");
    private final static QName _GetRoles_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoles");
    private final static QName _SetLdapConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setLdapConfiguration");
    private final static QName _GetLdapConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getLdapConfigurationResponse");
    private final static QName _UserExistsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "userExistsResponse");
    private final static QName _GetUserByIdResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUserByIdResponse");
    private final static QName _GrantPrivilegesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantPrivilegesResponse");
    private final static QName _SetCurrentScopeById_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setCurrentScopeById");
    private final static QName _GetRoleUsers_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleUsers");
    private final static QName _CurrentScope_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "currentScope");
    private final static QName _IsRealmUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "isRealmUserResponse");
    private final static QName _CreateRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "createRole");
    private final static QName _GetScopeById_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScopeById");
    private final static QName _GetRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleResponse");
    private final static QName _RemoveKerberosConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "removeKerberosConfigurationResponse");
    private final static QName _RemoveRoleFromRoleGroup_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "removeRoleFromRoleGroup");
    private final static QName _RemoveRoleFromRoleGroupResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "removeRoleFromRoleGroupResponse");
    private final static QName _GetScopeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScopeResponse");
    private final static QName _SetCurrentScope_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setCurrentScope");
    private final static QName _GetUsers_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getUsers");
    private final static QName _HasPrivilegeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "hasPrivilegeResponse");
    private final static QName _FilterUsers_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "filterUsers");
    private final static QName _RevokeRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokeRole");
    private final static QName _SetLdapConfigurationResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setLdapConfigurationResponse");
    private final static QName _RoleExistsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "roleExistsResponse");
    private final static QName _ListUsers_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listUsers");
    private final static QName _ListPrivilegesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listPrivilegesResponse");
    private final static QName _GetRoleGroupsResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleGroupsResponse");
    private final static QName _ListUsersResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listUsersResponse");
    private final static QName _GetGrantedRoles_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getGrantedRoles");
    private final static QName _RevokePrivilege_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokePrivilege");
    private final static QName _GetGrantedRolesResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getGrantedRolesResponse");
    private final static QName _DisableUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "disableUser");
    private final static QName _GetRoleByIdResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleByIdResponse");
    private final static QName _GetRoleById_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRoleById");
    private final static QName _ClearPrivileges_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "clearPrivileges");
    private final static QName _GetScopesByParentId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScopesByParentId");
    private final static QName _Login_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "login");
    private final static QName _GetLdapConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getLdapConfiguration");
    private final static QName _LogoutResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "logoutResponse");
    private final static QName _IsUserEnabledResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "isUserEnabledResponse");
    private final static QName _IsRealmUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "isRealmUser");
    private final static QName _DeleteUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "deleteUser");
    private final static QName _GetScope_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getScope");
    private final static QName _UpdateUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "updateUser");
    private final static QName _ListGrantableRoles_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listGrantableRoles");
    private final static QName _CreateUser_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "createUser");
    private final static QName _SessionId_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "sessionId");
    private final static QName _SetKerberosConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setKerberosConfiguration");
    private final static QName _SetCurrentScopeByIdResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "setCurrentScopeByIdResponse");
    private final static QName _GetRolesInRoleGroupResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "getRolesInRoleGroupResponse");
    private final static QName _DisableUserResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "disableUserResponse");
    private final static QName _UpdateRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "updateRole");
    private final static QName _GrantRole_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "grantRole");
    private final static QName _ListRoles_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "listRoles");
    private final static QName _CurrentScopeResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "currentScopeResponse");
    private final static QName _RemoveKerberosConfiguration_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "removeKerberosConfiguration");
    private final static QName _DeleteRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "deleteRoleResponse");
    private final static QName _RevokeRoleResponse_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokeRoleResponse");
    private final static QName _RevokePrivileges_QNAME = new QName("http://www.approuter.com/schemas/2008/1/security", "revokePrivileges");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.approuter.schemas._2008._1.security
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RoleExists }
     * 
     */
    public RoleExists createRoleExists() {
        return new RoleExists();
    }

    /**
     * Create an instance of {@link GrantRoleResponse }
     * 
     */
    public GrantRoleResponse createGrantRoleResponse() {
        return new GrantRoleResponse();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link ListPrivileges }
     * 
     */
    public ListPrivileges createListPrivileges() {
        return new ListPrivileges();
    }

    /**
     * Create an instance of {@link SetCurrentScopeResponse }
     * 
     */
    public SetCurrentScopeResponse createSetCurrentScopeResponse() {
        return new SetCurrentScopeResponse();
    }

    /**
     * Create an instance of {@link AddRoleToRoleGroup }
     * 
     */
    public AddRoleToRoleGroup createAddRoleToRoleGroup() {
        return new AddRoleToRoleGroup();
    }

    /**
     * Create an instance of {@link AddRoleToRoleGroupResponse }
     * 
     */
    public AddRoleToRoleGroupResponse createAddRoleToRoleGroupResponse() {
        return new AddRoleToRoleGroupResponse();
    }

    /**
     * Create an instance of {@link FilterNewUsers }
     * 
     */
    public FilterNewUsers createFilterNewUsers() {
        return new FilterNewUsers();
    }

    /**
     * Create an instance of {@link UserExists }
     * 
     */
    public UserExists createUserExists() {
        return new UserExists();
    }

    /**
     * Create an instance of {@link RevokePrivilegesResponse }
     * 
     */
    public RevokePrivilegesResponse createRevokePrivilegesResponse() {
        return new RevokePrivilegesResponse();
    }

    /**
     * Create an instance of {@link GetKerberosRealmResponse }
     * 
     */
    public GetKerberosRealmResponse createGetKerberosRealmResponse() {
        return new GetKerberosRealmResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link ListAvailableActionsResponse }
     * 
     */
    public ListAvailableActionsResponse createListAvailableActionsResponse() {
        return new ListAvailableActionsResponse();
    }

    /**
     * Create an instance of {@link FilterUsersResponse }
     * 
     */
    public FilterUsersResponse createFilterUsersResponse() {
        return new FilterUsersResponse();
    }

    /**
     * Create an instance of {@link GrantPrivilegesResponse }
     * 
     */
    public GrantPrivilegesResponse createGrantPrivilegesResponse() {
        return new GrantPrivilegesResponse();
    }

    /**
     * Create an instance of {@link UserExistsResponse }
     * 
     */
    public UserExistsResponse createUserExistsResponse() {
        return new UserExistsResponse();
    }

    /**
     * Create an instance of {@link GetUserByIdResponse }
     * 
     */
    public GetUserByIdResponse createGetUserByIdResponse() {
        return new GetUserByIdResponse();
    }

    /**
     * Create an instance of {@link GrantPrivilege }
     * 
     */
    public GrantPrivilege createGrantPrivilege() {
        return new GrantPrivilege();
    }

    /**
     * Create an instance of {@link ClearPrivilegesResponse }
     * 
     */
    public ClearPrivilegesResponse createClearPrivilegesResponse() {
        return new ClearPrivilegesResponse();
    }

    /**
     * Create an instance of {@link ListAvailableActions }
     * 
     */
    public ListAvailableActions createListAvailableActions() {
        return new ListAvailableActions();
    }

    /**
     * Create an instance of {@link SetLdapConfiguration }
     * 
     */
    public SetLdapConfiguration createSetLdapConfiguration() {
        return new SetLdapConfiguration();
    }

    /**
     * Create an instance of {@link GetLdapConfigurationResponse }
     * 
     */
    public GetLdapConfigurationResponse createGetLdapConfigurationResponse() {
        return new GetLdapConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GrantPrivileges }
     * 
     */
    public GrantPrivileges createGrantPrivileges() {
        return new GrantPrivileges();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link GetKerberosServerName }
     * 
     */
    public GetKerberosServerName createGetKerberosServerName() {
        return new GetKerberosServerName();
    }

    /**
     * Create an instance of {@link ChangePasswordResponse }
     * 
     */
    public ChangePasswordResponse createChangePasswordResponse() {
        return new ChangePasswordResponse();
    }

    /**
     * Create an instance of {@link ChangePassword }
     * 
     */
    public ChangePassword createChangePassword() {
        return new ChangePassword();
    }

    /**
     * Create an instance of {@link UpdateRoleResponse }
     * 
     */
    public UpdateRoleResponse createUpdateRoleResponse() {
        return new UpdateRoleResponse();
    }

    /**
     * Create an instance of {@link GrantPrivilegeResponse }
     * 
     */
    public GrantPrivilegeResponse createGrantPrivilegeResponse() {
        return new GrantPrivilegeResponse();
    }

    /**
     * Create an instance of {@link HasPrivilege }
     * 
     */
    public HasPrivilege createHasPrivilege() {
        return new HasPrivilege();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link FilterNewUsersResponse }
     * 
     */
    public FilterNewUsersResponse createFilterNewUsersResponse() {
        return new FilterNewUsersResponse();
    }

    /**
     * Create an instance of {@link ListRolesResponse }
     * 
     */
    public ListRolesResponse createListRolesResponse() {
        return new ListRolesResponse();
    }

    /**
     * Create an instance of {@link GetScopesByParentIdResponse }
     * 
     */
    public GetScopesByParentIdResponse createGetScopesByParentIdResponse() {
        return new GetScopesByParentIdResponse();
    }

    /**
     * Create an instance of {@link SetKerberosConfigurationResponse }
     * 
     */
    public SetKerberosConfigurationResponse createSetKerberosConfigurationResponse() {
        return new SetKerberosConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetScopeByIdResponse }
     * 
     */
    public GetScopeByIdResponse createGetScopeByIdResponse() {
        return new GetScopeByIdResponse();
    }

    /**
     * Create an instance of {@link IsUserEnabled }
     * 
     */
    public IsUserEnabled createIsUserEnabled() {
        return new IsUserEnabled();
    }

    /**
     * Create an instance of {@link GetRole }
     * 
     */
    public GetRole createGetRole() {
        return new GetRole();
    }

    /**
     * Create an instance of {@link GetImpliedRolesResponse }
     * 
     */
    public GetImpliedRolesResponse createGetImpliedRolesResponse() {
        return new GetImpliedRolesResponse();
    }

    /**
     * Create an instance of {@link GetKerberosRealm }
     * 
     */
    public GetKerberosRealm createGetKerberosRealm() {
        return new GetKerberosRealm();
    }

    /**
     * Create an instance of {@link RevokePrivilegeResponse }
     * 
     */
    public RevokePrivilegeResponse createRevokePrivilegeResponse() {
        return new RevokePrivilegeResponse();
    }

    /**
     * Create an instance of {@link GetRolesInRoleGroup }
     * 
     */
    public GetRolesInRoleGroup createGetRolesInRoleGroup() {
        return new GetRolesInRoleGroup();
    }

    /**
     * Create an instance of {@link EnableUserResponse }
     * 
     */
    public EnableUserResponse createEnableUserResponse() {
        return new EnableUserResponse();
    }

    /**
     * Create an instance of {@link DeleteRole }
     * 
     */
    public DeleteRole createDeleteRole() {
        return new DeleteRole();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link EnableUser }
     * 
     */
    public EnableUser createEnableUser() {
        return new EnableUser();
    }

    /**
     * Create an instance of {@link GetUserById }
     * 
     */
    public GetUserById createGetUserById() {
        return new GetUserById();
    }

    /**
     * Create an instance of {@link GetRoleGroups }
     * 
     */
    public GetRoleGroups createGetRoleGroups() {
        return new GetRoleGroups();
    }

    /**
     * Create an instance of {@link UpdateUserResponse }
     * 
     */
    public UpdateUserResponse createUpdateUserResponse() {
        return new UpdateUserResponse();
    }

    /**
     * Create an instance of {@link ListGrantableRolesResponse }
     * 
     */
    public ListGrantableRolesResponse createListGrantableRolesResponse() {
        return new ListGrantableRolesResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetImpliedRoles }
     * 
     */
    public GetImpliedRoles createGetImpliedRoles() {
        return new GetImpliedRoles();
    }

    /**
     * Create an instance of {@link GetRoleUsersResponse }
     * 
     */
    public GetRoleUsersResponse createGetRoleUsersResponse() {
        return new GetRoleUsersResponse();
    }

    /**
     * Create an instance of {@link GetKerberosServerNameResponse }
     * 
     */
    public GetKerberosServerNameResponse createGetKerberosServerNameResponse() {
        return new GetKerberosServerNameResponse();
    }

    /**
     * Create an instance of {@link CreateRoleResponse }
     * 
     */
    public CreateRoleResponse createCreateRoleResponse() {
        return new CreateRoleResponse();
    }

    /**
     * Create an instance of {@link IsUserEnabledResponse }
     * 
     */
    public IsUserEnabledResponse createIsUserEnabledResponse() {
        return new IsUserEnabledResponse();
    }

    /**
     * Create an instance of {@link IsRealmUser }
     * 
     */
    public IsRealmUser createIsRealmUser() {
        return new IsRealmUser();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link GetRoleById }
     * 
     */
    public GetRoleById createGetRoleById() {
        return new GetRoleById();
    }

    /**
     * Create an instance of {@link ClearPrivileges }
     * 
     */
    public ClearPrivileges createClearPrivileges() {
        return new ClearPrivileges();
    }

    /**
     * Create an instance of {@link GetScopesByParentId }
     * 
     */
    public GetScopesByParentId createGetScopesByParentId() {
        return new GetScopesByParentId();
    }

    /**
     * Create an instance of {@link GetLdapConfiguration }
     * 
     */
    public GetLdapConfiguration createGetLdapConfiguration() {
        return new GetLdapConfiguration();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link ListRoles }
     * 
     */
    public ListRoles createListRoles() {
        return new ListRoles();
    }

    /**
     * Create an instance of {@link RemoveKerberosConfiguration }
     * 
     */
    public RemoveKerberosConfiguration createRemoveKerberosConfiguration() {
        return new RemoveKerberosConfiguration();
    }

    /**
     * Create an instance of {@link CurrentScopeResponse }
     * 
     */
    public CurrentScopeResponse createCurrentScopeResponse() {
        return new CurrentScopeResponse();
    }

    /**
     * Create an instance of {@link DeleteRoleResponse }
     * 
     */
    public DeleteRoleResponse createDeleteRoleResponse() {
        return new DeleteRoleResponse();
    }

    /**
     * Create an instance of {@link RevokeRoleResponse }
     * 
     */
    public RevokeRoleResponse createRevokeRoleResponse() {
        return new RevokeRoleResponse();
    }

    /**
     * Create an instance of {@link RevokePrivileges }
     * 
     */
    public RevokePrivileges createRevokePrivileges() {
        return new RevokePrivileges();
    }

    /**
     * Create an instance of {@link SetKerberosConfiguration }
     * 
     */
    public SetKerberosConfiguration createSetKerberosConfiguration() {
        return new SetKerberosConfiguration();
    }

    /**
     * Create an instance of {@link SetCurrentScopeByIdResponse }
     * 
     */
    public SetCurrentScopeByIdResponse createSetCurrentScopeByIdResponse() {
        return new SetCurrentScopeByIdResponse();
    }

    /**
     * Create an instance of {@link GetRolesInRoleGroupResponse }
     * 
     */
    public GetRolesInRoleGroupResponse createGetRolesInRoleGroupResponse() {
        return new GetRolesInRoleGroupResponse();
    }

    /**
     * Create an instance of {@link DisableUserResponse }
     * 
     */
    public DisableUserResponse createDisableUserResponse() {
        return new DisableUserResponse();
    }

    /**
     * Create an instance of {@link UpdateRole }
     * 
     */
    public UpdateRole createUpdateRole() {
        return new UpdateRole();
    }

    /**
     * Create an instance of {@link GrantRole }
     * 
     */
    public GrantRole createGrantRole() {
        return new GrantRole();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link GetScope }
     * 
     */
    public GetScope createGetScope() {
        return new GetScope();
    }

    /**
     * Create an instance of {@link UpdateUser }
     * 
     */
    public UpdateUser createUpdateUser() {
        return new UpdateUser();
    }

    /**
     * Create an instance of {@link ListGrantableRoles }
     * 
     */
    public ListGrantableRoles createListGrantableRoles() {
        return new ListGrantableRoles();
    }

    /**
     * Create an instance of {@link SetCurrentScope }
     * 
     */
    public SetCurrentScope createSetCurrentScope() {
        return new SetCurrentScope();
    }

    /**
     * Create an instance of {@link GetScopeResponse }
     * 
     */
    public GetScopeResponse createGetScopeResponse() {
        return new GetScopeResponse();
    }

    /**
     * Create an instance of {@link RemoveKerberosConfigurationResponse }
     * 
     */
    public RemoveKerberosConfigurationResponse createRemoveKerberosConfigurationResponse() {
        return new RemoveKerberosConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetRoleResponse }
     * 
     */
    public GetRoleResponse createGetRoleResponse() {
        return new GetRoleResponse();
    }

    /**
     * Create an instance of {@link RemoveRoleFromRoleGroup }
     * 
     */
    public RemoveRoleFromRoleGroup createRemoveRoleFromRoleGroup() {
        return new RemoveRoleFromRoleGroup();
    }

    /**
     * Create an instance of {@link RemoveRoleFromRoleGroupResponse }
     * 
     */
    public RemoveRoleFromRoleGroupResponse createRemoveRoleFromRoleGroupResponse() {
        return new RemoveRoleFromRoleGroupResponse();
    }

    /**
     * Create an instance of {@link CurrentScope }
     * 
     */
    public CurrentScope createCurrentScope() {
        return new CurrentScope();
    }

    /**
     * Create an instance of {@link IsRealmUserResponse }
     * 
     */
    public IsRealmUserResponse createIsRealmUserResponse() {
        return new IsRealmUserResponse();
    }

    /**
     * Create an instance of {@link CreateRole }
     * 
     */
    public CreateRole createCreateRole() {
        return new CreateRole();
    }

    /**
     * Create an instance of {@link GetScopeById }
     * 
     */
    public GetScopeById createGetScopeById() {
        return new GetScopeById();
    }

    /**
     * Create an instance of {@link GetRoleUsers }
     * 
     */
    public GetRoleUsers createGetRoleUsers() {
        return new GetRoleUsers();
    }

    /**
     * Create an instance of {@link SetCurrentScopeById }
     * 
     */
    public SetCurrentScopeById createSetCurrentScopeById() {
        return new SetCurrentScopeById();
    }

    /**
     * Create an instance of {@link DisableUser }
     * 
     */
    public DisableUser createDisableUser() {
        return new DisableUser();
    }

    /**
     * Create an instance of {@link GetGrantedRolesResponse }
     * 
     */
    public GetGrantedRolesResponse createGetGrantedRolesResponse() {
        return new GetGrantedRolesResponse();
    }

    /**
     * Create an instance of {@link GetRoleByIdResponse }
     * 
     */
    public GetRoleByIdResponse createGetRoleByIdResponse() {
        return new GetRoleByIdResponse();
    }

    /**
     * Create an instance of {@link GetRoleGroupsResponse }
     * 
     */
    public GetRoleGroupsResponse createGetRoleGroupsResponse() {
        return new GetRoleGroupsResponse();
    }

    /**
     * Create an instance of {@link GetGrantedRoles }
     * 
     */
    public GetGrantedRoles createGetGrantedRoles() {
        return new GetGrantedRoles();
    }

    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }

    /**
     * Create an instance of {@link RevokePrivilege }
     * 
     */
    public RevokePrivilege createRevokePrivilege() {
        return new RevokePrivilege();
    }

    /**
     * Create an instance of {@link FilterUsers }
     * 
     */
    public FilterUsers createFilterUsers() {
        return new FilterUsers();
    }

    /**
     * Create an instance of {@link HasPrivilegeResponse }
     * 
     */
    public HasPrivilegeResponse createHasPrivilegeResponse() {
        return new HasPrivilegeResponse();
    }

    /**
     * Create an instance of {@link SetLdapConfigurationResponse }
     * 
     */
    public SetLdapConfigurationResponse createSetLdapConfigurationResponse() {
        return new SetLdapConfigurationResponse();
    }

    /**
     * Create an instance of {@link RevokeRole }
     * 
     */
    public RevokeRole createRevokeRole() {
        return new RevokeRole();
    }

    /**
     * Create an instance of {@link ListUsers }
     * 
     */
    public ListUsers createListUsers() {
        return new ListUsers();
    }

    /**
     * Create an instance of {@link RoleExistsResponse }
     * 
     */
    public RoleExistsResponse createRoleExistsResponse() {
        return new RoleExistsResponse();
    }

    /**
     * Create an instance of {@link ListPrivilegesResponse }
     * 
     */
    public ListPrivilegesResponse createListPrivilegesResponse() {
        return new ListPrivilegesResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link LdapConfig }
     * 
     */
    public LdapConfig createLdapConfig() {
        return new LdapConfig();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokePrivilegeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokePrivilegeResponse")
    public JAXBElement<RevokePrivilegeResponse> createRevokePrivilegeResponse(RevokePrivilegeResponse value) {
        return new JAXBElement<RevokePrivilegeResponse>(_RevokePrivilegeResponse_QNAME, RevokePrivilegeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesInRoleGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRolesInRoleGroup")
    public JAXBElement<GetRolesInRoleGroup> createGetRolesInRoleGroup(GetRolesInRoleGroup value) {
        return new JAXBElement<GetRolesInRoleGroup>(_GetRolesInRoleGroup_QNAME, GetRolesInRoleGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "enableUserResponse")
    public JAXBElement<EnableUserResponse> createEnableUserResponse(EnableUserResponse value) {
        return new JAXBElement<EnableUserResponse>(_EnableUserResponse_QNAME, EnableUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScopeByIdResponse")
    public JAXBElement<GetScopeByIdResponse> createGetScopeByIdResponse(GetScopeByIdResponse value) {
        return new JAXBElement<GetScopeByIdResponse>(_GetScopeByIdResponse_QNAME, GetScopeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsUserEnabled }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "isUserEnabled")
    public JAXBElement<IsUserEnabled> createIsUserEnabled(IsUserEnabled value) {
        return new JAXBElement<IsUserEnabled>(_IsUserEnabled_QNAME, IsUserEnabled.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImpliedRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getImpliedRolesResponse")
    public JAXBElement<GetImpliedRolesResponse> createGetImpliedRolesResponse(GetImpliedRolesResponse value) {
        return new JAXBElement<GetImpliedRolesResponse>(_GetImpliedRolesResponse_QNAME, GetImpliedRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRole")
    public JAXBElement<GetRole> createGetRole(GetRole value) {
        return new JAXBElement<GetRole>(_GetRole_QNAME, GetRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKerberosRealm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getKerberosRealm")
    public JAXBElement<GetKerberosRealm> createGetKerberosRealm(GetKerberosRealm value) {
        return new JAXBElement<GetKerberosRealm>(_GetKerberosRealm_QNAME, GetKerberosRealm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopesByParentIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScopesByParentIdResponse")
    public JAXBElement<GetScopesByParentIdResponse> createGetScopesByParentIdResponse(GetScopesByParentIdResponse value) {
        return new JAXBElement<GetScopesByParentIdResponse>(_GetScopesByParentIdResponse_QNAME, GetScopesByParentIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listRolesResponse")
    public JAXBElement<ListRolesResponse> createListRolesResponse(ListRolesResponse value) {
        return new JAXBElement<ListRolesResponse>(_ListRolesResponse_QNAME, ListRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKerberosConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setKerberosConfigurationResponse")
    public JAXBElement<SetKerberosConfigurationResponse> createSetKerberosConfigurationResponse(SetKerberosConfigurationResponse value) {
        return new JAXBElement<SetKerberosConfigurationResponse>(_SetKerberosConfigurationResponse_QNAME, SetKerberosConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<GetUsersResponse>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterNewUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "filterNewUsersResponse")
    public JAXBElement<FilterNewUsersResponse> createFilterNewUsersResponse(FilterNewUsersResponse value) {
        return new JAXBElement<FilterNewUsersResponse>(_FilterNewUsersResponse_QNAME, FilterNewUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleUsersResponse")
    public JAXBElement<GetRoleUsersResponse> createGetRoleUsersResponse(GetRoleUsersResponse value) {
        return new JAXBElement<GetRoleUsersResponse>(_GetRoleUsersResponse_QNAME, GetRoleUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKerberosServerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getKerberosServerNameResponse")
    public JAXBElement<GetKerberosServerNameResponse> createGetKerberosServerNameResponse(GetKerberosServerNameResponse value) {
        return new JAXBElement<GetKerberosServerNameResponse>(_GetKerberosServerNameResponse_QNAME, GetKerberosServerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "createRoleResponse")
    public JAXBElement<CreateRoleResponse> createCreateRoleResponse(CreateRoleResponse value) {
        return new JAXBElement<CreateRoleResponse>(_CreateRoleResponse_QNAME, CreateRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGrantableRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listGrantableRolesResponse")
    public JAXBElement<ListGrantableRolesResponse> createListGrantableRolesResponse(ListGrantableRolesResponse value) {
        return new JAXBElement<ListGrantableRolesResponse>(_ListGrantableRolesResponse_QNAME, ListGrantableRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "updateUserResponse")
    public JAXBElement<UpdateUserResponse> createUpdateUserResponse(UpdateUserResponse value) {
        return new JAXBElement<UpdateUserResponse>(_UpdateUserResponse_QNAME, UpdateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImpliedRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getImpliedRoles")
    public JAXBElement<GetImpliedRoles> createGetImpliedRoles(GetImpliedRoles value) {
        return new JAXBElement<GetImpliedRoles>(_GetImpliedRoles_QNAME, GetImpliedRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUserById")
    public JAXBElement<GetUserById> createGetUserById(GetUserById value) {
        return new JAXBElement<GetUserById>(_GetUserById_QNAME, GetUserById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleGroups")
    public JAXBElement<GetRoleGroups> createGetRoleGroups(GetRoleGroups value) {
        return new JAXBElement<GetRoleGroups>(_GetRoleGroups_QNAME, GetRoleGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "deleteRole")
    public JAXBElement<DeleteRole> createDeleteRole(DeleteRole value) {
        return new JAXBElement<DeleteRole>(_DeleteRole_QNAME, DeleteRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnableUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "enableUser")
    public JAXBElement<EnableUser> createEnableUser(EnableUser value) {
        return new JAXBElement<EnableUser>(_EnableUser_QNAME, EnableUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailableActionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listAvailableActionsResponse")
    public JAXBElement<ListAvailableActionsResponse> createListAvailableActionsResponse(ListAvailableActionsResponse value) {
        return new JAXBElement<ListAvailableActionsResponse>(_ListAvailableActionsResponse_QNAME, ListAvailableActionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKerberosRealmResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getKerberosRealmResponse")
    public JAXBElement<GetKerberosRealmResponse> createGetKerberosRealmResponse(GetKerberosRealmResponse value) {
        return new JAXBElement<GetKerberosRealmResponse>(_GetKerberosRealmResponse_QNAME, GetKerberosRealmResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "filterUsersResponse")
    public JAXBElement<FilterUsersResponse> createFilterUsersResponse(FilterUsersResponse value) {
        return new JAXBElement<FilterUsersResponse>(_FilterUsersResponse_QNAME, FilterUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterNewUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "filterNewUsers")
    public JAXBElement<FilterNewUsers> createFilterNewUsers(FilterNewUsers value) {
        return new JAXBElement<FilterNewUsers>(_FilterNewUsers_QNAME, FilterNewUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "userExists")
    public JAXBElement<UserExists> createUserExists(UserExists value) {
        return new JAXBElement<UserExists>(_UserExists_QNAME, UserExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokePrivilegesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokePrivilegesResponse")
    public JAXBElement<RevokePrivilegesResponse> createRevokePrivilegesResponse(RevokePrivilegesResponse value) {
        return new JAXBElement<RevokePrivilegesResponse>(_RevokePrivilegesResponse_QNAME, RevokePrivilegesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantRoleResponse")
    public JAXBElement<GrantRoleResponse> createGrantRoleResponse(GrantRoleResponse value) {
        return new JAXBElement<GrantRoleResponse>(_GrantRoleResponse_QNAME, GrantRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentScopeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setCurrentScopeResponse")
    public JAXBElement<SetCurrentScopeResponse> createSetCurrentScopeResponse(SetCurrentScopeResponse value) {
        return new JAXBElement<SetCurrentScopeResponse>(_SetCurrentScopeResponse_QNAME, SetCurrentScopeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPrivileges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listPrivileges")
    public JAXBElement<ListPrivileges> createListPrivileges(ListPrivileges value) {
        return new JAXBElement<ListPrivileges>(_ListPrivileges_QNAME, ListPrivileges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoleToRoleGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "addRoleToRoleGroupResponse")
    public JAXBElement<AddRoleToRoleGroupResponse> createAddRoleToRoleGroupResponse(AddRoleToRoleGroupResponse value) {
        return new JAXBElement<AddRoleToRoleGroupResponse>(_AddRoleToRoleGroupResponse_QNAME, AddRoleToRoleGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoleToRoleGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "addRoleToRoleGroup")
    public JAXBElement<AddRoleToRoleGroup> createAddRoleToRoleGroup(AddRoleToRoleGroup value) {
        return new JAXBElement<AddRoleToRoleGroup>(_AddRoleToRoleGroup_QNAME, AddRoleToRoleGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleExists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "roleExists")
    public JAXBElement<RoleExists> createRoleExists(RoleExists value) {
        return new JAXBElement<RoleExists>(_RoleExists_QNAME, RoleExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "changePasswordResponse")
    public JAXBElement<ChangePasswordResponse> createChangePasswordResponse(ChangePasswordResponse value) {
        return new JAXBElement<ChangePasswordResponse>(_ChangePasswordResponse_QNAME, ChangePasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetKerberosServerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getKerberosServerName")
    public JAXBElement<GetKerberosServerName> createGetKerberosServerName(GetKerberosServerName value) {
        return new JAXBElement<GetKerberosServerName>(_GetKerberosServerName_QNAME, GetKerberosServerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangePassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "changePassword")
    public JAXBElement<ChangePassword> createChangePassword(ChangePassword value) {
        return new JAXBElement<ChangePassword>(_ChangePassword_QNAME, ChangePassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasPrivilege }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "hasPrivilege")
    public JAXBElement<HasPrivilege> createHasPrivilege(HasPrivilege value) {
        return new JAXBElement<HasPrivilege>(_HasPrivilege_QNAME, HasPrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantPrivilegeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantPrivilegeResponse")
    public JAXBElement<GrantPrivilegeResponse> createGrantPrivilegeResponse(GrantPrivilegeResponse value) {
        return new JAXBElement<GrantPrivilegeResponse>(_GrantPrivilegeResponse_QNAME, GrantPrivilegeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "updateRoleResponse")
    public JAXBElement<UpdateRoleResponse> createUpdateRoleResponse(UpdateRoleResponse value) {
        return new JAXBElement<UpdateRoleResponse>(_UpdateRoleResponse_QNAME, UpdateRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<GetRolesResponse>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantPrivileges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantPrivileges")
    public JAXBElement<GrantPrivileges> createGrantPrivileges(GrantPrivileges value) {
        return new JAXBElement<GrantPrivileges>(_GrantPrivileges_QNAME, GrantPrivileges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantPrivilege }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantPrivilege")
    public JAXBElement<GrantPrivilege> createGrantPrivilege(GrantPrivilege value) {
        return new JAXBElement<GrantPrivilege>(_GrantPrivilege_QNAME, GrantPrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAvailableActions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listAvailableActions")
    public JAXBElement<ListAvailableActions> createListAvailableActions(ListAvailableActions value) {
        return new JAXBElement<ListAvailableActions>(_ListAvailableActions_QNAME, ListAvailableActions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearPrivilegesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "clearPrivilegesResponse")
    public JAXBElement<ClearPrivilegesResponse> createClearPrivilegesResponse(ClearPrivilegesResponse value) {
        return new JAXBElement<ClearPrivilegesResponse>(_ClearPrivilegesResponse_QNAME, ClearPrivilegesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<GetRoles>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLdapConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setLdapConfiguration")
    public JAXBElement<SetLdapConfiguration> createSetLdapConfiguration(SetLdapConfiguration value) {
        return new JAXBElement<SetLdapConfiguration>(_SetLdapConfiguration_QNAME, SetLdapConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLdapConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getLdapConfigurationResponse")
    public JAXBElement<GetLdapConfigurationResponse> createGetLdapConfigurationResponse(GetLdapConfigurationResponse value) {
        return new JAXBElement<GetLdapConfigurationResponse>(_GetLdapConfigurationResponse_QNAME, GetLdapConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "userExistsResponse")
    public JAXBElement<UserExistsResponse> createUserExistsResponse(UserExistsResponse value) {
        return new JAXBElement<UserExistsResponse>(_UserExistsResponse_QNAME, UserExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUserByIdResponse")
    public JAXBElement<GetUserByIdResponse> createGetUserByIdResponse(GetUserByIdResponse value) {
        return new JAXBElement<GetUserByIdResponse>(_GetUserByIdResponse_QNAME, GetUserByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantPrivilegesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantPrivilegesResponse")
    public JAXBElement<GrantPrivilegesResponse> createGrantPrivilegesResponse(GrantPrivilegesResponse value) {
        return new JAXBElement<GrantPrivilegesResponse>(_GrantPrivilegesResponse_QNAME, GrantPrivilegesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentScopeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setCurrentScopeById")
    public JAXBElement<SetCurrentScopeById> createSetCurrentScopeById(SetCurrentScopeById value) {
        return new JAXBElement<SetCurrentScopeById>(_SetCurrentScopeById_QNAME, SetCurrentScopeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleUsers")
    public JAXBElement<GetRoleUsers> createGetRoleUsers(GetRoleUsers value) {
        return new JAXBElement<GetRoleUsers>(_GetRoleUsers_QNAME, GetRoleUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "currentScope")
    public JAXBElement<CurrentScope> createCurrentScope(CurrentScope value) {
        return new JAXBElement<CurrentScope>(_CurrentScope_QNAME, CurrentScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRealmUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "isRealmUserResponse")
    public JAXBElement<IsRealmUserResponse> createIsRealmUserResponse(IsRealmUserResponse value) {
        return new JAXBElement<IsRealmUserResponse>(_IsRealmUserResponse_QNAME, IsRealmUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "createRole")
    public JAXBElement<CreateRole> createCreateRole(CreateRole value) {
        return new JAXBElement<CreateRole>(_CreateRole_QNAME, CreateRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScopeById")
    public JAXBElement<GetScopeById> createGetScopeById(GetScopeById value) {
        return new JAXBElement<GetScopeById>(_GetScopeById_QNAME, GetScopeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleResponse")
    public JAXBElement<GetRoleResponse> createGetRoleResponse(GetRoleResponse value) {
        return new JAXBElement<GetRoleResponse>(_GetRoleResponse_QNAME, GetRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveKerberosConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "removeKerberosConfigurationResponse")
    public JAXBElement<RemoveKerberosConfigurationResponse> createRemoveKerberosConfigurationResponse(RemoveKerberosConfigurationResponse value) {
        return new JAXBElement<RemoveKerberosConfigurationResponse>(_RemoveKerberosConfigurationResponse_QNAME, RemoveKerberosConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoleFromRoleGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "removeRoleFromRoleGroup")
    public JAXBElement<RemoveRoleFromRoleGroup> createRemoveRoleFromRoleGroup(RemoveRoleFromRoleGroup value) {
        return new JAXBElement<RemoveRoleFromRoleGroup>(_RemoveRoleFromRoleGroup_QNAME, RemoveRoleFromRoleGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoleFromRoleGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "removeRoleFromRoleGroupResponse")
    public JAXBElement<RemoveRoleFromRoleGroupResponse> createRemoveRoleFromRoleGroupResponse(RemoveRoleFromRoleGroupResponse value) {
        return new JAXBElement<RemoveRoleFromRoleGroupResponse>(_RemoveRoleFromRoleGroupResponse_QNAME, RemoveRoleFromRoleGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScopeResponse")
    public JAXBElement<GetScopeResponse> createGetScopeResponse(GetScopeResponse value) {
        return new JAXBElement<GetScopeResponse>(_GetScopeResponse_QNAME, GetScopeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setCurrentScope")
    public JAXBElement<SetCurrentScope> createSetCurrentScope(SetCurrentScope value) {
        return new JAXBElement<SetCurrentScope>(_SetCurrentScope_QNAME, SetCurrentScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<GetUsers>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasPrivilegeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "hasPrivilegeResponse")
    public JAXBElement<HasPrivilegeResponse> createHasPrivilegeResponse(HasPrivilegeResponse value) {
        return new JAXBElement<HasPrivilegeResponse>(_HasPrivilegeResponse_QNAME, HasPrivilegeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "filterUsers")
    public JAXBElement<FilterUsers> createFilterUsers(FilterUsers value) {
        return new JAXBElement<FilterUsers>(_FilterUsers_QNAME, FilterUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokeRole")
    public JAXBElement<RevokeRole> createRevokeRole(RevokeRole value) {
        return new JAXBElement<RevokeRole>(_RevokeRole_QNAME, RevokeRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLdapConfigurationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setLdapConfigurationResponse")
    public JAXBElement<SetLdapConfigurationResponse> createSetLdapConfigurationResponse(SetLdapConfigurationResponse value) {
        return new JAXBElement<SetLdapConfigurationResponse>(_SetLdapConfigurationResponse_QNAME, SetLdapConfigurationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleExistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "roleExistsResponse")
    public JAXBElement<RoleExistsResponse> createRoleExistsResponse(RoleExistsResponse value) {
        return new JAXBElement<RoleExistsResponse>(_RoleExistsResponse_QNAME, RoleExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listUsers")
    public JAXBElement<ListUsers> createListUsers(ListUsers value) {
        return new JAXBElement<ListUsers>(_ListUsers_QNAME, ListUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListPrivilegesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listPrivilegesResponse")
    public JAXBElement<ListPrivilegesResponse> createListPrivilegesResponse(ListPrivilegesResponse value) {
        return new JAXBElement<ListPrivilegesResponse>(_ListPrivilegesResponse_QNAME, ListPrivilegesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleGroupsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleGroupsResponse")
    public JAXBElement<GetRoleGroupsResponse> createGetRoleGroupsResponse(GetRoleGroupsResponse value) {
        return new JAXBElement<GetRoleGroupsResponse>(_GetRoleGroupsResponse_QNAME, GetRoleGroupsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getGrantedRoles")
    public JAXBElement<GetGrantedRoles> createGetGrantedRoles(GetGrantedRoles value) {
        return new JAXBElement<GetGrantedRoles>(_GetGrantedRoles_QNAME, GetGrantedRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokePrivilege }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokePrivilege")
    public JAXBElement<RevokePrivilege> createRevokePrivilege(RevokePrivilege value) {
        return new JAXBElement<RevokePrivilege>(_RevokePrivilege_QNAME, RevokePrivilege.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRolesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getGrantedRolesResponse")
    public JAXBElement<GetGrantedRolesResponse> createGetGrantedRolesResponse(GetGrantedRolesResponse value) {
        return new JAXBElement<GetGrantedRolesResponse>(_GetGrantedRolesResponse_QNAME, GetGrantedRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "disableUser")
    public JAXBElement<DisableUser> createDisableUser(DisableUser value) {
        return new JAXBElement<DisableUser>(_DisableUser_QNAME, DisableUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleByIdResponse")
    public JAXBElement<GetRoleByIdResponse> createGetRoleByIdResponse(GetRoleByIdResponse value) {
        return new JAXBElement<GetRoleByIdResponse>(_GetRoleByIdResponse_QNAME, GetRoleByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoleById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRoleById")
    public JAXBElement<GetRoleById> createGetRoleById(GetRoleById value) {
        return new JAXBElement<GetRoleById>(_GetRoleById_QNAME, GetRoleById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearPrivileges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "clearPrivileges")
    public JAXBElement<ClearPrivileges> createClearPrivileges(ClearPrivileges value) {
        return new JAXBElement<ClearPrivileges>(_ClearPrivileges_QNAME, ClearPrivileges.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScopesByParentId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScopesByParentId")
    public JAXBElement<GetScopesByParentId> createGetScopesByParentId(GetScopesByParentId value) {
        return new JAXBElement<GetScopesByParentId>(_GetScopesByParentId_QNAME, GetScopesByParentId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLdapConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getLdapConfiguration")
    public JAXBElement<GetLdapConfiguration> createGetLdapConfiguration(GetLdapConfiguration value) {
        return new JAXBElement<GetLdapConfiguration>(_GetLdapConfiguration_QNAME, GetLdapConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsUserEnabledResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "isUserEnabledResponse")
    public JAXBElement<IsUserEnabledResponse> createIsUserEnabledResponse(IsUserEnabledResponse value) {
        return new JAXBElement<IsUserEnabledResponse>(_IsUserEnabledResponse_QNAME, IsUserEnabledResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsRealmUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "isRealmUser")
    public JAXBElement<IsRealmUser> createIsRealmUser(IsRealmUser value) {
        return new JAXBElement<IsRealmUser>(_IsRealmUser_QNAME, IsRealmUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetScope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getScope")
    public JAXBElement<GetScope> createGetScope(GetScope value) {
        return new JAXBElement<GetScope>(_GetScope_QNAME, GetScope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "updateUser")
    public JAXBElement<UpdateUser> createUpdateUser(UpdateUser value) {
        return new JAXBElement<UpdateUser>(_UpdateUser_QNAME, UpdateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGrantableRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listGrantableRoles")
    public JAXBElement<ListGrantableRoles> createListGrantableRoles(ListGrantableRoles value) {
        return new JAXBElement<ListGrantableRoles>(_ListGrantableRoles_QNAME, ListGrantableRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "sessionId")
    public JAXBElement<String> createSessionId(String value) {
        return new JAXBElement<String>(_SessionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetKerberosConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setKerberosConfiguration")
    public JAXBElement<SetKerberosConfiguration> createSetKerberosConfiguration(SetKerberosConfiguration value) {
        return new JAXBElement<SetKerberosConfiguration>(_SetKerberosConfiguration_QNAME, SetKerberosConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCurrentScopeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "setCurrentScopeByIdResponse")
    public JAXBElement<SetCurrentScopeByIdResponse> createSetCurrentScopeByIdResponse(SetCurrentScopeByIdResponse value) {
        return new JAXBElement<SetCurrentScopeByIdResponse>(_SetCurrentScopeByIdResponse_QNAME, SetCurrentScopeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesInRoleGroupResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "getRolesInRoleGroupResponse")
    public JAXBElement<GetRolesInRoleGroupResponse> createGetRolesInRoleGroupResponse(GetRolesInRoleGroupResponse value) {
        return new JAXBElement<GetRolesInRoleGroupResponse>(_GetRolesInRoleGroupResponse_QNAME, GetRolesInRoleGroupResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "disableUserResponse")
    public JAXBElement<DisableUserResponse> createDisableUserResponse(DisableUserResponse value) {
        return new JAXBElement<DisableUserResponse>(_DisableUserResponse_QNAME, DisableUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "updateRole")
    public JAXBElement<UpdateRole> createUpdateRole(UpdateRole value) {
        return new JAXBElement<UpdateRole>(_UpdateRole_QNAME, UpdateRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "grantRole")
    public JAXBElement<GrantRole> createGrantRole(GrantRole value) {
        return new JAXBElement<GrantRole>(_GrantRole_QNAME, GrantRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListRoles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "listRoles")
    public JAXBElement<ListRoles> createListRoles(ListRoles value) {
        return new JAXBElement<ListRoles>(_ListRoles_QNAME, ListRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrentScopeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "currentScopeResponse")
    public JAXBElement<CurrentScopeResponse> createCurrentScopeResponse(CurrentScopeResponse value) {
        return new JAXBElement<CurrentScopeResponse>(_CurrentScopeResponse_QNAME, CurrentScopeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveKerberosConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "removeKerberosConfiguration")
    public JAXBElement<RemoveKerberosConfiguration> createRemoveKerberosConfiguration(RemoveKerberosConfiguration value) {
        return new JAXBElement<RemoveKerberosConfiguration>(_RemoveKerberosConfiguration_QNAME, RemoveKerberosConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "deleteRoleResponse")
    public JAXBElement<DeleteRoleResponse> createDeleteRoleResponse(DeleteRoleResponse value) {
        return new JAXBElement<DeleteRoleResponse>(_DeleteRoleResponse_QNAME, DeleteRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRoleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokeRoleResponse")
    public JAXBElement<RevokeRoleResponse> createRevokeRoleResponse(RevokeRoleResponse value) {
        return new JAXBElement<RevokeRoleResponse>(_RevokeRoleResponse_QNAME, RevokeRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokePrivileges }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.approuter.com/schemas/2008/1/security", name = "revokePrivileges")
    public JAXBElement<RevokePrivileges> createRevokePrivileges(RevokePrivileges value) {
        return new JAXBElement<RevokePrivileges>(_RevokePrivileges_QNAME, RevokePrivileges.class, null, value);
    }

}
