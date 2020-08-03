package com.nt.service.impl;

import org.springframework.stereotype.Service;

import com.nt.sensen.ResponseDTO;
import com.nt.service.ResponseService;

/**
 *
 * @author Firoj Khan
 * @since 2020-08-03
 */

@Service
public class RespnseServiceImpl implements ResponseService{

	@Override
	public ResponseDTO saveResponseData(ResponseDTO rd) {
		System.out.println("start impl");
		ResponseDTO rst = new ResponseDTO();
		rst.setApplication(rd.getApplication());
		rst.setEventID(rd.getEventID());
		rst.setType(rd.getType());
		rst.setColorType(rd.getColorType());
		rst.setZoneID(rd.getZoneID());
		rst.setMatchBackgroundImagePath(rd.getMatchBackgroundImagePath());
		rst.setMatchScore(rd.getMatchScore());
		rst.setZoneSide(rd.getZoneSide());
		rst.setReferenceImageGPS(rd.getReferenceImageGPS());
		rst.setMatchResult(rd.getMatchResult());
		rst.setMatchBackgroundContextPaths(rd.getMatchBackgroundContextPaths());
		rst.setMatchZoneContextPaths(rd.getMatchZoneContextPaths());
		System.out.println("End");
		return rst;
	}

	

}
