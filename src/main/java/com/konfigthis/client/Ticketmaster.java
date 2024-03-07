package com.konfigthis.client;

import com.konfigthis.client.api.V2Api;

public class Ticketmaster {
    private ApiClient apiClient;
    public final V2Api v2;

    public Ticketmaster() {
        this(null);
    }

    public Ticketmaster(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.v2 = new V2Api(this.apiClient);
    }

}
