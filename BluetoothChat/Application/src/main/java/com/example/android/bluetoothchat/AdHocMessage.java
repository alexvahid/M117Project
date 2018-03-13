package com.example.android.bluetoothchat;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 3/1/18.
 *
 * What to demo:
 * Connection between two nodes
 * Two nodes then an addition of a third
 * Three nodes with no knowledge of network
 * Far message sending
 * Network adjustments on the fly
 *
 * Node in the middle cant spy on the secret key
 */

public class AdHocMessage implements Serializable {

    //what type of message "packet" is this
    enum Type {
            ROUTE_REQUEST,
            ROUTE_REPLY,
            ADHOC_MESSAGE,
            PROMPT
    }

    //adhoc message specific
    String message = null;
    String uuid = null;

    //shared
    Type type;
    String sourceAddress = null;
    String destinationAddress = null;


    //route request specific
    Integer requestID = null;
    Integer sourceSequenceNumber = null;
    Integer destinationSequenceNumber = null;
    Integer hopCount = null;

    //meta
    List<String> passingAddresses = new ArrayList();


}
