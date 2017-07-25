/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.alain.monetizacion.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the SubsConfiguration service. Represents a row in the &quot;MT_SubsConfiguration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.alain.monetizacion.model.impl.SubsConfigurationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.alain.monetizacion.model.impl.SubsConfigurationImpl}.
 * </p>
 *
 * @author Alain
 * @see SubsConfiguration
 * @see com.alain.monetizacion.model.impl.SubsConfigurationImpl
 * @see com.alain.monetizacion.model.impl.SubsConfigurationModelImpl
 * @generated
 */
public interface SubsConfigurationModel extends BaseModel<SubsConfiguration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a subs configuration model instance should use the {@link SubsConfiguration} interface instead.
	 */

	/**
	 * Returns the primary key of this subs configuration.
	 *
	 * @return the primary key of this subs configuration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this subs configuration.
	 *
	 * @param primaryKey the primary key of this subs configuration
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the configuration ID of this subs configuration.
	 *
	 * @return the configuration ID of this subs configuration
	 */
	public long getConfigurationId();

	/**
	 * Sets the configuration ID of this subs configuration.
	 *
	 * @param configurationId the configuration ID of this subs configuration
	 */
	public void setConfigurationId(long configurationId);

	/**
	 * Returns the group ID of this subs configuration.
	 *
	 * @return the group ID of this subs configuration
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this subs configuration.
	 *
	 * @param groupId the group ID of this subs configuration
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the description of this subs configuration.
	 *
	 * @return the description of this subs configuration
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this subs configuration.
	 *
	 * @param description the description of this subs configuration
	 */
	public void setDescription(String description);

	/**
	 * Returns the amount of this subs configuration.
	 *
	 * @return the amount of this subs configuration
	 */
	public double getAmount();

	/**
	 * Sets the amount of this subs configuration.
	 *
	 * @param amount the amount of this subs configuration
	 */
	public void setAmount(double amount);

	/**
	 * Returns the cycle of this subs configuration.
	 *
	 * @return the cycle of this subs configuration
	 */
	@AutoEscape
	public String getCycle();

	/**
	 * Sets the cycle of this subs configuration.
	 *
	 * @param cycle the cycle of this subs configuration
	 */
	public void setCycle(String cycle);

	/**
	 * Returns the time of this subs configuration.
	 *
	 * @return the time of this subs configuration
	 */
	public int getTime();

	/**
	 * Sets the time of this subs configuration.
	 *
	 * @param time the time of this subs configuration
	 */
	public void setTime(int time);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		com.alain.monetizacion.model.SubsConfiguration subsConfiguration);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.alain.monetizacion.model.SubsConfiguration> toCacheModel();

	@Override
	public com.alain.monetizacion.model.SubsConfiguration toEscapedModel();

	@Override
	public com.alain.monetizacion.model.SubsConfiguration toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}