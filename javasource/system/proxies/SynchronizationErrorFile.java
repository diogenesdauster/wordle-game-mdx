// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

public class SynchronizationErrorFile extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "System.SynchronizationErrorFile";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		SynchronizationErrorFile_SynchronizationError("System.SynchronizationErrorFile_SynchronizationError");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public SynchronizationErrorFile(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "System.SynchronizationErrorFile"));
	}

	protected SynchronizationErrorFile(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject synchronizationErrorFileMendixObject)
	{
		super(context, synchronizationErrorFileMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("System.SynchronizationErrorFile", synchronizationErrorFileMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a System.SynchronizationErrorFile");
	}

	/**
	 * @deprecated Use 'SynchronizationErrorFile.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static system.proxies.SynchronizationErrorFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return system.proxies.SynchronizationErrorFile.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static system.proxies.SynchronizationErrorFile initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new system.proxies.SynchronizationErrorFile(context, mendixObject);
	}

	public static system.proxies.SynchronizationErrorFile load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return system.proxies.SynchronizationErrorFile.initialize(context, mendixObject);
	}

	public static java.util.List<system.proxies.SynchronizationErrorFile> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<system.proxies.SynchronizationErrorFile> result = new java.util.ArrayList<system.proxies.SynchronizationErrorFile>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//System.SynchronizationErrorFile" + xpathConstraint))
			result.add(system.proxies.SynchronizationErrorFile.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of SynchronizationErrorFile_SynchronizationError
	 */
	public final system.proxies.SynchronizationError getSynchronizationErrorFile_SynchronizationError() throws com.mendix.core.CoreException
	{
		return getSynchronizationErrorFile_SynchronizationError(getContext());
	}

	/**
	 * @param context
	 * @return value of SynchronizationErrorFile_SynchronizationError
	 */
	public final system.proxies.SynchronizationError getSynchronizationErrorFile_SynchronizationError(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.SynchronizationError result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.SynchronizationErrorFile_SynchronizationError.toString());
		if (identifier != null)
			result = system.proxies.SynchronizationError.load(context, identifier);
		return result;
	}

	/**
	 * Set value of SynchronizationErrorFile_SynchronizationError
	 * @param synchronizationerrorfile_synchronizationerror
	 */
	public final void setSynchronizationErrorFile_SynchronizationError(system.proxies.SynchronizationError synchronizationerrorfile_synchronizationerror)
	{
		setSynchronizationErrorFile_SynchronizationError(getContext(), synchronizationerrorfile_synchronizationerror);
	}

	/**
	 * Set value of SynchronizationErrorFile_SynchronizationError
	 * @param context
	 * @param synchronizationerrorfile_synchronizationerror
	 */
	public final void setSynchronizationErrorFile_SynchronizationError(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.SynchronizationError synchronizationerrorfile_synchronizationerror)
	{
		if (synchronizationerrorfile_synchronizationerror == null)
			getMendixObject().setValue(context, MemberNames.SynchronizationErrorFile_SynchronizationError.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.SynchronizationErrorFile_SynchronizationError.toString(), synchronizationerrorfile_synchronizationerror.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final system.proxies.SynchronizationErrorFile that = (system.proxies.SynchronizationErrorFile) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "System.SynchronizationErrorFile";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
