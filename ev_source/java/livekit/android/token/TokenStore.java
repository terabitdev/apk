package io.livekit.android.token;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\rJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\u0004¨\u0006\u000e"}, d2 = {"Lio/livekit/android/token/TokenStore;", "", "Lio/livekit/android/token/TokenStore$Item;", "retrieve", "(Lwn/c;)Ljava/lang/Object;", "Lio/livekit/android/token/TokenRequestOptions;", "options", "Lio/livekit/android/token/TokenSourceResponse;", "response", "Lsn/z;", ProductResponseJsonKeys.STORE, "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;Lwn/c;)Ljava/lang/Object;", SDPKeywords.CLEAR, "Item", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface TokenStore {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lio/livekit/android/token/TokenStore$Item;", "", "options", "Lio/livekit/android/token/TokenRequestOptions;", "response", "Lio/livekit/android/token/TokenSourceResponse;", "(Lio/livekit/android/token/TokenRequestOptions;Lio/livekit/android/token/TokenSourceResponse;)V", "getOptions", "()Lio/livekit/android/token/TokenRequestOptions;", "getResponse", "()Lio/livekit/android/token/TokenSourceResponse;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Item {
        private final TokenRequestOptions options;
        private final TokenSourceResponse response;

        public Item(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse) {
            tokenSourceResponse.getClass();
            this.options = tokenRequestOptions;
            this.response = tokenSourceResponse;
        }

        public static /* synthetic */ Item copy$default(Item item, TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                tokenRequestOptions = item.options;
            }
            if ((i10 & 2) != 0) {
                tokenSourceResponse = item.response;
            }
            return item.copy(tokenRequestOptions, tokenSourceResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final TokenRequestOptions getOptions() {
            return this.options;
        }

        /* renamed from: component2, reason: from getter */
        public final TokenSourceResponse getResponse() {
            return this.response;
        }

        public final Item copy(TokenRequestOptions options, TokenSourceResponse response) {
            response.getClass();
            return new Item(options, response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            if (m.c(this.options, item.options) && m.c(this.response, item.response)) {
                return true;
            }
            return false;
        }

        public final TokenRequestOptions getOptions() {
            return this.options;
        }

        public final TokenSourceResponse getResponse() {
            return this.response;
        }

        public int hashCode() {
            int hashCode;
            TokenRequestOptions tokenRequestOptions = this.options;
            if (tokenRequestOptions == null) {
                hashCode = 0;
            } else {
                hashCode = tokenRequestOptions.hashCode();
            }
            return this.response.hashCode() + (hashCode * 31);
        }

        public String toString() {
            return "Item(options=" + this.options + ", response=" + this.response + ')';
        }
    }

    Object clear(c<? super z> cVar);

    Object retrieve(c<? super Item> cVar);

    Object store(TokenRequestOptions tokenRequestOptions, TokenSourceResponse tokenSourceResponse, c<? super z> cVar);
}
