package com.nt.sensen;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author Firoj Khan
 * @since 2020-08-03
 */

public class MatchResult {

   @SerializedName("cluster_id")
	String clusterID;
	@SerializedName("reference_image_pk")
	long referenceImagePk;
	@SerializedName("num_inliers")
	long numInliners;
	@SerializedName("reference_image_paths")
	List<String> refImagePaths;

	public String getClusterID() {
		return clusterID;
	}

	public void setClusterID(String clusterID) {
		this.clusterID = clusterID;
	}

	public long getReferenceImagePk() {
		return referenceImagePk;
	}

	public void setReferenceImagePk(long referenceImagePk) {
		this.referenceImagePk = referenceImagePk;
	}

	public long getNumInliners() {
		return numInliners;
	}

	public void setNumInliners(long numInliners) {
		this.numInliners = numInliners;
	}

	public List<String> getRefImagePaths() {
		return refImagePaths;
	}

	public void setRefImagePaths(List<String> refImagePaths) {
		this.refImagePaths = refImagePaths;
	}

}
