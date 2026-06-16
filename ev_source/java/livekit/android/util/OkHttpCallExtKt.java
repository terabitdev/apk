package io.livekit.android.util;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import fr.l;
import fr.n;
import gg.b;
import java.io.IOException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Call;", "Lokhttp3/Response;", "executeAsync", "(Lokhttp3/Call;Lwn/c;)Ljava/lang/Object;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OkHttpCallExtKt {
    public static final Object executeAsync(Call call, c<? super Response> cVar) {
        final n nVar = new n(1, b.V(cVar));
        nVar.t();
        nVar.e(new OkHttpCallExtKt$executeAsync$2$1(call));
        FirebasePerfOkHttpClient.enqueue(call, new Callback() { // from class: io.livekit.android.util.OkHttpCallExtKt$executeAsync$2$2
            @Override // okhttp3.Callback
            public void onFailure(Call call2, IOException e10) {
                call2.getClass();
                e10.getClass();
                l.this.resumeWith(new sn.l(e10));
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call2, Response response) {
                call2.getClass();
                response.getClass();
                l.this.a(new OkHttpCallExtKt$executeAsync$2$2$onResponse$1(response), response);
            }
        });
        return nVar.s();
    }
}
