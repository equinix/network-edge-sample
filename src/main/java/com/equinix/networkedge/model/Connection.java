/*
 * The Apache License
 *
 * Copyright 2017 Equinix Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.equinix.networkedge.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aanchala 7/13/2018
 **/
public @Data class Connection {

    private String id = null;
    private String name = null;
    private String connection_type = null;
    private String buyer_port_name = null;
    private String seller_service_name = null;
    private String service_key = null;
    private String aws_account = null;
    private String digital_authorization_key = null;
    private String buyer_vlan_id = null;
    private String speed = null;
    private String state = null;
    private String status = null;
    private String created_date = null;
    private String created_by = null;
    private List<String> notification_contacts = new ArrayList();
    private String seller_port_name = null;
    private String seller_vlan_id = null;
    private String metro_code = null;
    private String metro_name = null;
    private String ibx_name = null;
    private String redundant_id = null;
    private String instance_id = null;
    private String instance_speed = null;
    private String billing_tier = null;
    private String equinix_bgp_asn = null;
    private String equinix_peer_ip = null;
    private String buyer_bgp_asn = null;
    private String buyer_peer_ip = null;
    private String bgp_authentication_key = null;
    private String named_tag = null;
    private List<Metadata> metadata = new ArrayList();
    private String purchase_order_no = null;
    private String buyer_public_prefixes = null;
}
