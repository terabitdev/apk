package io.elevenlabs.di;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/di/StaticHeaderInterceptor;", "Lokhttp3/Interceptor;", "", SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "value", "<init>", "(Ljava/lang/String;Lho/a;)V", "Lokhttp3/Interceptor$Chain;", ReferencesHeader.CHAIN, "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Lho/a;", "getValue", "()Lho/a;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class StaticHeaderInterceptor implements Interceptor {
    private final String key;
    private final ho.a value;

    public StaticHeaderInterceptor(String str, ho.a aVar) {
        str.getClass();
        aVar.getClass();
        this.key = str;
        this.value = aVar;
    }

    public final String getKey() {
        return this.key;
    }

    public final ho.a getValue() {
        return this.value;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder b10 = chain.request().b();
        b10.a(this.key, (String) this.value.invoke());
        return chain.a(new Request(b10));
    }
}
