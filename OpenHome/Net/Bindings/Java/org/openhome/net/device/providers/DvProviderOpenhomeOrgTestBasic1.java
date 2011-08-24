package org.openhome.net.device.providers;

import java.util.LinkedList;
import java.util.List;

import org.openhome.net.core.*;
import org.openhome.net.device.*;

interface IDvProviderOpenhomeOrgTestBasic1
{

    /**
     * Set the value of the VarUint property
     *
     * @param aValue	new value for the property.
     * @return 		<tt>true</tt> if the value has been updated; <tt>false</tt> if <tt>aValue</tt> was the same as the previous value.
     *
     */
    public boolean setPropertyVarUint(long aValue);

    /**
     * Get a copy of the value of the VarUint property
     *
     * @return value of the VarUint property.
     */
    public long getPropertyVarUint();

    /**
     * Set the value of the VarInt property
     *
     * @param aValue	new value for the property.
     * @return 		<tt>true</tt> if the value has been updated; <tt>false</tt> if <tt>aValue</tt> was the same as the previous value.
     *
     */
    public boolean setPropertyVarInt(int aValue);

    /**
     * Get a copy of the value of the VarInt property
     *
     * @return value of the VarInt property.
     */
    public int getPropertyVarInt();

    /**
     * Set the value of the VarBool property
     *
     * @param aValue	new value for the property.
     * @return 		<tt>true</tt> if the value has been updated; <tt>false</tt> if <tt>aValue</tt> was the same as the previous value.
     *
     */
    public boolean setPropertyVarBool(boolean aValue);

    /**
     * Get a copy of the value of the VarBool property
     *
     * @return value of the VarBool property.
     */
    public boolean getPropertyVarBool();

    /**
     * Set the value of the VarStr property
     *
     * @param aValue	new value for the property.
     * @return 		<tt>true</tt> if the value has been updated; <tt>false</tt> if <tt>aValue</tt> was the same as the previous value.
     *
     */
    public boolean setPropertyVarStr(String aValue);

    /**
     * Get a copy of the value of the VarStr property
     *
     * @return value of the VarStr property.
     */
    public String getPropertyVarStr();

    /**
     * Set the value of the VarBin property
     *
     * @param aValue	new value for the property.
     * @return 		<tt>true</tt> if the value has been updated; <tt>false</tt> if <tt>aValue</tt> was the same as the previous value.
     *
     */
    public boolean setPropertyVarBin(byte[] aValue);

    /**
     * Get a copy of the value of the VarBin property
     *
     * @return value of the VarBin property.
     */
    public byte[] getPropertyVarBin();
        
}

/**
 * Provider for the openhome.org:TestBasic:1 UPnP service.
 */
public class DvProviderOpenhomeOrgTestBasic1 extends DvProvider implements IDvProviderOpenhomeOrgTestBasic1
{

    private IDvInvocationListener iDelegateIncrement;
    private IDvInvocationListener iDelegateDecrement;
    private IDvInvocationListener iDelegateToggle;
    private IDvInvocationListener iDelegateEchoString;
    private IDvInvocationListener iDelegateEchoBinary;
    private IDvInvocationListener iDelegateSetUint;
    private IDvInvocationListener iDelegateGetUint;
    private IDvInvocationListener iDelegateSetInt;
    private IDvInvocationListener iDelegateGetInt;
    private IDvInvocationListener iDelegateSetBool;
    private IDvInvocationListener iDelegateGetBool;
    private IDvInvocationListener iDelegateSetMultiple;
    private IDvInvocationListener iDelegateSetString;
    private IDvInvocationListener iDelegateGetString;
    private IDvInvocationListener iDelegateSetBinary;
    private IDvInvocationListener iDelegateGetBinary;
    private IDvInvocationListener iDelegateToggleBool;
    private IDvInvocationListener iDelegateWriteFile;
    private IDvInvocationListener iDelegateShutdown;
    private PropertyUint iPropertyVarUint;
    private PropertyInt iPropertyVarInt;
    private PropertyBool iPropertyVarBool;
    private PropertyString iPropertyVarStr;
    private PropertyBinary iPropertyVarBin;

    /**
     * Constructor
     *
     * @param aDevice	device which owns this provider.
     */
    protected DvProviderOpenhomeOrgTestBasic1(DvDevice aDevice)
    {
	    super(aDevice, "openhome.org", "TestBasic", 1);
        List<String> allowedValues = new LinkedList<String>();
        iPropertyVarUint = new PropertyUint(new ParameterUint("VarUint"));
        addProperty(iPropertyVarUint);
        iPropertyVarInt = new PropertyInt(new ParameterInt("VarInt"));
        addProperty(iPropertyVarInt);
        iPropertyVarBool = new PropertyBool(new ParameterBool("VarBool"));
        addProperty(iPropertyVarBool);
        iPropertyVarStr = new PropertyString(new ParameterString("VarStr", allowedValues));
        addProperty(iPropertyVarStr);
        iPropertyVarBin = new PropertyBinary(new ParameterBinary("VarBin"));
        addProperty(iPropertyVarBin);
    }

    /**
     * Set the value of the VarUint property
     *
     * @param aValue	new value for the property.
     * @return <tt>true</tt> if the value has been updated; <tt>false</tt>
     * if <tt>aValue</tt> was the same as the previous value.
     */
    public boolean setPropertyVarUint(long aValue)
    {
        return setPropertyUint(iPropertyVarUint, aValue);
    }

    /**
     * Get a copy of the value of the VarUint property
     *
     * @return	value of the VarUint property.
     */
    public long getPropertyVarUint()
    {
        return iPropertyVarUint.getValue();
    }

    /**
     * Set the value of the VarInt property
     *
     * @param aValue	new value for the property.
     * @return <tt>true</tt> if the value has been updated; <tt>false</tt>
     * if <tt>aValue</tt> was the same as the previous value.
     */
    public boolean setPropertyVarInt(int aValue)
    {
        return setPropertyInt(iPropertyVarInt, aValue);
    }

    /**
     * Get a copy of the value of the VarInt property
     *
     * @return	value of the VarInt property.
     */
    public int getPropertyVarInt()
    {
        return iPropertyVarInt.getValue();
    }

    /**
     * Set the value of the VarBool property
     *
     * @param aValue	new value for the property.
     * @return <tt>true</tt> if the value has been updated; <tt>false</tt>
     * if <tt>aValue</tt> was the same as the previous value.
     */
    public boolean setPropertyVarBool(boolean aValue)
    {
        return setPropertyBool(iPropertyVarBool, aValue);
    }

    /**
     * Get a copy of the value of the VarBool property
     *
     * @return	value of the VarBool property.
     */
    public boolean getPropertyVarBool()
    {
        return iPropertyVarBool.getValue();
    }

    /**
     * Set the value of the VarStr property
     *
     * @param aValue	new value for the property.
     * @return <tt>true</tt> if the value has been updated; <tt>false</tt>
     * if <tt>aValue</tt> was the same as the previous value.
     */
    public boolean setPropertyVarStr(String aValue)
    {
        return setPropertyString(iPropertyVarStr, aValue);
    }

    /**
     * Get a copy of the value of the VarStr property
     *
     * @return	value of the VarStr property.
     */
    public String getPropertyVarStr()
    {
        return iPropertyVarStr.getValue();
    }

    /**
     * Set the value of the VarBin property
     *
     * @param aValue	new value for the property.
     * @return <tt>true</tt> if the value has been updated; <tt>false</tt>
     * if <tt>aValue</tt> was the same as the previous value.
     */
    public boolean setPropertyVarBin(byte[] aValue)
    {
        return setPropertyBinary(iPropertyVarBin, aValue);
    }

    /**
     * Get a copy of the value of the VarBin property
     *
     * @return	value of the VarBin property.
     */
    public byte[] getPropertyVarBin()
    {
        return iPropertyVarBin.getValue();
    }

    /**
     * Signal that the action Increment is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * Increment must be overridden if this is called.
     */		 
    protected void enableActionIncrement()
    {
        Action action = new Action("Increment");
        action.addInputParameter(new ParameterUint("Value"));
        action.addOutputParameter(new ParameterUint("Result"));
        iDelegateIncrement = new DoIncrement();
        enableAction(action, iDelegateIncrement);
    }

    /**
     * Signal that the action Decrement is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * Decrement must be overridden if this is called.
     */		 
    protected void enableActionDecrement()
    {
        Action action = new Action("Decrement");
        action.addInputParameter(new ParameterInt("Value"));
        action.addOutputParameter(new ParameterInt("Result"));
        iDelegateDecrement = new DoDecrement();
        enableAction(action, iDelegateDecrement);
    }

    /**
     * Signal that the action Toggle is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * Toggle must be overridden if this is called.
     */		 
    protected void enableActionToggle()
    {
        Action action = new Action("Toggle");
        action.addInputParameter(new ParameterBool("Value"));
        action.addOutputParameter(new ParameterBool("Result"));
        iDelegateToggle = new DoToggle();
        enableAction(action, iDelegateToggle);
    }

    /**
     * Signal that the action EchoString is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * EchoString must be overridden if this is called.
     */		 
    protected void enableActionEchoString()
    {
        Action action = new Action("EchoString");        List<String> allowedValues = new LinkedList<String>();
        action.addInputParameter(new ParameterString("Value", allowedValues));
        action.addOutputParameter(new ParameterString("Result", allowedValues));
        iDelegateEchoString = new DoEchoString();
        enableAction(action, iDelegateEchoString);
    }

    /**
     * Signal that the action EchoBinary is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * EchoBinary must be overridden if this is called.
     */		 
    protected void enableActionEchoBinary()
    {
        Action action = new Action("EchoBinary");
        action.addInputParameter(new ParameterBinary("Value"));
        action.addOutputParameter(new ParameterBinary("Result"));
        iDelegateEchoBinary = new DoEchoBinary();
        enableAction(action, iDelegateEchoBinary);
    }

    /**
     * Signal that the action SetUint is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetUint must be overridden if this is called.
     */		 
    protected void enableActionSetUint()
    {
        Action action = new Action("SetUint");
        action.addInputParameter(new ParameterRelated("ValueUint", iPropertyVarUint));
        iDelegateSetUint = new DoSetUint();
        enableAction(action, iDelegateSetUint);
    }

    /**
     * Signal that the action GetUint is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * GetUint must be overridden if this is called.
     */		 
    protected void enableActionGetUint()
    {
        Action action = new Action("GetUint");
        action.addOutputParameter(new ParameterRelated("ValueUint", iPropertyVarUint));
        iDelegateGetUint = new DoGetUint();
        enableAction(action, iDelegateGetUint);
    }

    /**
     * Signal that the action SetInt is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetInt must be overridden if this is called.
     */		 
    protected void enableActionSetInt()
    {
        Action action = new Action("SetInt");
        action.addInputParameter(new ParameterRelated("ValueInt", iPropertyVarInt));
        iDelegateSetInt = new DoSetInt();
        enableAction(action, iDelegateSetInt);
    }

    /**
     * Signal that the action GetInt is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * GetInt must be overridden if this is called.
     */		 
    protected void enableActionGetInt()
    {
        Action action = new Action("GetInt");
        action.addOutputParameter(new ParameterRelated("ValueInt", iPropertyVarInt));
        iDelegateGetInt = new DoGetInt();
        enableAction(action, iDelegateGetInt);
    }

    /**
     * Signal that the action SetBool is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetBool must be overridden if this is called.
     */		 
    protected void enableActionSetBool()
    {
        Action action = new Action("SetBool");
        action.addInputParameter(new ParameterRelated("ValueBool", iPropertyVarBool));
        iDelegateSetBool = new DoSetBool();
        enableAction(action, iDelegateSetBool);
    }

    /**
     * Signal that the action GetBool is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * GetBool must be overridden if this is called.
     */		 
    protected void enableActionGetBool()
    {
        Action action = new Action("GetBool");
        action.addOutputParameter(new ParameterRelated("ValueBool", iPropertyVarBool));
        iDelegateGetBool = new DoGetBool();
        enableAction(action, iDelegateGetBool);
    }

    /**
     * Signal that the action SetMultiple is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetMultiple must be overridden if this is called.
     */		 
    protected void enableActionSetMultiple()
    {
        Action action = new Action("SetMultiple");
        action.addInputParameter(new ParameterRelated("ValueUint", iPropertyVarUint));
        action.addInputParameter(new ParameterRelated("ValueInt", iPropertyVarInt));
        action.addInputParameter(new ParameterRelated("ValueBool", iPropertyVarBool));
        iDelegateSetMultiple = new DoSetMultiple();
        enableAction(action, iDelegateSetMultiple);
    }

    /**
     * Signal that the action SetString is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetString must be overridden if this is called.
     */		 
    protected void enableActionSetString()
    {
        Action action = new Action("SetString");
        action.addInputParameter(new ParameterRelated("ValueStr", iPropertyVarStr));
        iDelegateSetString = new DoSetString();
        enableAction(action, iDelegateSetString);
    }

    /**
     * Signal that the action GetString is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * GetString must be overridden if this is called.
     */		 
    protected void enableActionGetString()
    {
        Action action = new Action("GetString");
        action.addOutputParameter(new ParameterRelated("ValueStr", iPropertyVarStr));
        iDelegateGetString = new DoGetString();
        enableAction(action, iDelegateGetString);
    }

    /**
     * Signal that the action SetBinary is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * SetBinary must be overridden if this is called.
     */		 
    protected void enableActionSetBinary()
    {
        Action action = new Action("SetBinary");
        action.addInputParameter(new ParameterRelated("ValueBin", iPropertyVarBin));
        iDelegateSetBinary = new DoSetBinary();
        enableAction(action, iDelegateSetBinary);
    }

    /**
     * Signal that the action GetBinary is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * GetBinary must be overridden if this is called.
     */		 
    protected void enableActionGetBinary()
    {
        Action action = new Action("GetBinary");
        action.addOutputParameter(new ParameterRelated("ValueBin", iPropertyVarBin));
        iDelegateGetBinary = new DoGetBinary();
        enableAction(action, iDelegateGetBinary);
    }

    /**
     * Signal that the action ToggleBool is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * ToggleBool must be overridden if this is called.
     */		 
    protected void enableActionToggleBool()
    {
        Action action = new Action("ToggleBool");
        iDelegateToggleBool = new DoToggleBool();
        enableAction(action, iDelegateToggleBool);
    }

    /**
     * Signal that the action WriteFile is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * WriteFile must be overridden if this is called.
     */		 
    protected void enableActionWriteFile()
    {
        Action action = new Action("WriteFile");        List<String> allowedValues = new LinkedList<String>();
        action.addInputParameter(new ParameterString("Data", allowedValues));
        action.addInputParameter(new ParameterString("FileFullName", allowedValues));
        iDelegateWriteFile = new DoWriteFile();
        enableAction(action, iDelegateWriteFile);
    }

    /**
     * Signal that the action Shutdown is supported.
     *
     * <p>The action's availability will be published in the device's service.xml.
     * Shutdown must be overridden if this is called.
     */		 
    protected void enableActionShutdown()
    {
        Action action = new Action("Shutdown");
        iDelegateShutdown = new DoShutdown();
        enableAction(action, iDelegateShutdown);
    }

    /**
     * Increment action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * Increment action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionIncrement} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValue
     */
    protected long increment(int aVersion, long aValue)
    {
        throw (new ActionDisabledError());
    }

    /**
     * Decrement action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * Decrement action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionDecrement} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValue
     */
    protected int decrement(int aVersion, int aValue)
    {
        throw (new ActionDisabledError());
    }

    /**
     * Toggle action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * Toggle action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionToggle} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValue
     */
    protected boolean toggle(int aVersion, boolean aValue)
    {
        throw (new ActionDisabledError());
    }

    /**
     * EchoString action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * EchoString action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionEchoString} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValue
     */
    protected String echoString(int aVersion, String aValue)
    {
        throw (new ActionDisabledError());
    }

    /**
     * EchoBinary action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * EchoBinary action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionEchoBinary} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValue
     */
    protected byte[] echoBinary(int aVersion, byte[] aValue)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetUint action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetUint action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetUint} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueUint
     */
    protected void setUint(int aVersion, long aValueUint)
    {
        throw (new ActionDisabledError());
    }

    /**
     * GetUint action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * GetUint action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionGetUint} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected long getUint(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetInt action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetInt action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetInt} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueInt
     */
    protected void setInt(int aVersion, int aValueInt)
    {
        throw (new ActionDisabledError());
    }

    /**
     * GetInt action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * GetInt action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionGetInt} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected int getInt(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetBool action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetBool action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetBool} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueBool
     */
    protected void setBool(int aVersion, boolean aValueBool)
    {
        throw (new ActionDisabledError());
    }

    /**
     * GetBool action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * GetBool action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionGetBool} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected boolean getBool(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetMultiple action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetMultiple action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetMultiple} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueUint
     * @param aValueInt
     * @param aValueBool
     */
    protected void setMultiple(int aVersion, long aValueUint, int aValueInt, boolean aValueBool)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetString action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetString action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetString} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueStr
     */
    protected void setString(int aVersion, String aValueStr)
    {
        throw (new ActionDisabledError());
    }

    /**
     * GetString action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * GetString action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionGetString} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected String getString(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * SetBinary action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * SetBinary action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionSetBinary} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aValueBin
     */
    protected void setBinary(int aVersion, byte[] aValueBin)
    {
        throw (new ActionDisabledError());
    }

    /**
     * GetBinary action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * GetBinary action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionGetBinary} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected byte[] getBinary(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * ToggleBool action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * ToggleBool action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionToggleBool} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected void toggleBool(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * WriteFile action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * WriteFile action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionWriteFile} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     * @param aData
     * @param aFileFullName
     */
    protected void writeFile(int aVersion, String aData, String aFileFullName)
    {
        throw (new ActionDisabledError());
    }

    /**
     * Shutdown action.
     *
     * <p>Will be called when the device stack receives an invocation of the
     * Shutdown action for the owning device.
     *
     * <p>Must be implemented iff {@link #enableActionShutdown} was called.</remarks>
     *
     * @param aVersion	version of the service being requested (will be <= the version advertised)</param>
     */
    protected void shutdown(int aVersion)
    {
        throw (new ActionDisabledError());
    }

    /**
     * Must be called for each class instance.  Must be called before Core.Library.Close().
     */
    public void dispose()
    {
        synchronized (this)
        {
            if (iHandle == 0)
            {
                return;
            }
            super.dispose();
            iHandle = 0;
        }
    }


    private class DoIncrement implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            long value;
            long result;
            try
            {
                invocation.readStart();
                value = invocation.readUint("Value");
                invocation.readEnd();
                 result = increment(aVersion, value);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeUint("Result", result);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoDecrement implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            int value;
            int result;
            try
            {
                invocation.readStart();
                value = invocation.readInt("Value");
                invocation.readEnd();
                 result = decrement(aVersion, value);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeInt("Result", result);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoToggle implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            boolean value;
            boolean result;
            try
            {
                invocation.readStart();
                value = invocation.readBool("Value");
                invocation.readEnd();
                 result = toggle(aVersion, value);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeBool("Result", result);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoEchoString implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            String value;
            String result;
            try
            {
                invocation.readStart();
                value = invocation.readString("Value");
                invocation.readEnd();
                 result = echoString(aVersion, value);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeString("Result", result);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoEchoBinary implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            byte[] value;
            byte[] result;
            try
            {
                invocation.readStart();
                value = invocation.readBinary("Value");
                invocation.readEnd();
                 result = echoBinary(aVersion, value);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeBinary("Result", result);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetUint implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            long valueUint;
            try
            {
                invocation.readStart();
                valueUint = invocation.readUint("ValueUint");
                invocation.readEnd();
                setUint(aVersion, valueUint);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoGetUint implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            long valueUint;
            try
            {
                invocation.readStart();
                invocation.readEnd();
                 valueUint = getUint(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeUint("ValueUint", valueUint);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetInt implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            int valueInt;
            try
            {
                invocation.readStart();
                valueInt = invocation.readInt("ValueInt");
                invocation.readEnd();
                setInt(aVersion, valueInt);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoGetInt implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            int valueInt;
            try
            {
                invocation.readStart();
                invocation.readEnd();
                 valueInt = getInt(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeInt("ValueInt", valueInt);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetBool implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            boolean valueBool;
            try
            {
                invocation.readStart();
                valueBool = invocation.readBool("ValueBool");
                invocation.readEnd();
                setBool(aVersion, valueBool);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoGetBool implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            boolean valueBool;
            try
            {
                invocation.readStart();
                invocation.readEnd();
                 valueBool = getBool(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeBool("ValueBool", valueBool);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetMultiple implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            long valueUint;
            int valueInt;
            boolean valueBool;
            try
            {
                invocation.readStart();
                valueUint = invocation.readUint("ValueUint");
                valueInt = invocation.readInt("ValueInt");
                valueBool = invocation.readBool("ValueBool");
                invocation.readEnd();
                setMultiple(aVersion, valueUint, valueInt, valueBool);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetString implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            String valueStr;
            try
            {
                invocation.readStart();
                valueStr = invocation.readString("ValueStr");
                invocation.readEnd();
                setString(aVersion, valueStr);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoGetString implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            String valueStr;
            try
            {
                invocation.readStart();
                invocation.readEnd();
                 valueStr = getString(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeString("ValueStr", valueStr);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoSetBinary implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            byte[] valueBin;
            try
            {
                invocation.readStart();
                valueBin = invocation.readBinary("ValueBin");
                invocation.readEnd();
                setBinary(aVersion, valueBin);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoGetBinary implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            byte[] valueBin;
            try
            {
                invocation.readStart();
                invocation.readEnd();
                 valueBin = getBinary(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeBinary("ValueBin", valueBin);
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoToggleBool implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            try
            {
                invocation.readStart();
                invocation.readEnd();
                toggleBool(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoWriteFile implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            String data;
            String fileFullName;
            try
            {
                invocation.readStart();
                data = invocation.readString("Data");
                fileFullName = invocation.readString("FileFullName");
                invocation.readEnd();
                writeFile(aVersion, data, fileFullName);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}

    private class DoShutdown implements IDvInvocationListener
    {
        public void actionInvoked(long aInvocation, int aVersion)
        {
            DvInvocation invocation = new DvInvocation(aInvocation);
            try
            {
                invocation.readStart();
                invocation.readEnd();
                shutdown(aVersion);
            }
            catch (ActionError ae)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (PropertyUpdateError pue)
            {
                invocation.reportError(501, "Invalid XML");
                return;
            }
            catch (Exception e)
            {
                System.out.println("WARNING: unexpected exception: " + e.getMessage());
                System.out.println("         Only ActionError or PropertyUpdateError can be thrown by actions");
                e.printStackTrace();
                return;
            }
            try
            {
                invocation.writeStart();
                invocation.writeEnd();
            }
            catch (ActionError ae)
            {
                return;
            }
            catch (Exception e)
            {
                System.out.println("ERROR: unexpected exception: " + e.getMessage());
                System.out.println("       Only ActionError can be thrown by action response writer");
                e.printStackTrace();
            }
        }
	}
}
