package io.livekit.android.token;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.perf.FirebasePerformance;
import ho.p;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.u;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/livekit/android/token/TokenSource;", "", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public interface TokenSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\"\u0010\u000e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J5\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00042\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/livekit/android/token/TokenSource$Companion;", "", "<init>", "()V", "", "serverUrl", "participantToken", "Lio/livekit/android/token/FixedTokenSource;", "fromLiteral", "(Ljava/lang/String;Ljava/lang/String;)Lio/livekit/android/token/FixedTokenSource;", "Lkotlin/Function2;", "Lio/livekit/android/token/TokenRequestOptions;", "Lwn/c;", "Lio/livekit/android/token/TokenSourceResponse;", "block", "Lio/livekit/android/token/ConfigurableTokenSource;", "fromCustom", "(Lho/p;)Lio/livekit/android/token/ConfigurableTokenSource;", "Ljava/net/URL;", "url", FirebaseAnalytics.Param.METHOD, "", "headers", "fromEndpoint", "(Ljava/net/URL;Ljava/lang/String;Ljava/util/Map;)Lio/livekit/android/token/ConfigurableTokenSource;", "sandboxId", "Lio/livekit/android/token/SandboxTokenServerOptions;", "options", "fromSandboxTokenServer", "(Ljava/lang/String;Lio/livekit/android/token/SandboxTokenServerOptions;)Lio/livekit/android/token/ConfigurableTokenSource;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfigurableTokenSource fromEndpoint$default(Companion companion, URL url, String str, Map map, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = FirebasePerformance.HttpMethod.POST;
            }
            if ((i10 & 4) != 0) {
                map = u.f33548a;
            }
            return companion.fromEndpoint(url, str, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ConfigurableTokenSource fromSandboxTokenServer$default(Companion companion, String str, SandboxTokenServerOptions sandboxTokenServerOptions, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                sandboxTokenServerOptions = new SandboxTokenServerOptions(null, 1, 0 == true ? 1 : 0);
            }
            return companion.fromSandboxTokenServer(str, sandboxTokenServerOptions);
        }

        public final ConfigurableTokenSource fromCustom(p block) {
            block.getClass();
            return new CustomTokenSource(block);
        }

        public final ConfigurableTokenSource fromEndpoint(URL url, String method, Map<String, String> headers) {
            url.getClass();
            method.getClass();
            headers.getClass();
            return new EndpointTokenSourceImpl(url, method, headers);
        }

        public final FixedTokenSource fromLiteral(String serverUrl, String participantToken) {
            serverUrl.getClass();
            participantToken.getClass();
            return new LiteralTokenSource(serverUrl, participantToken);
        }

        public final ConfigurableTokenSource fromSandboxTokenServer(String sandboxId, SandboxTokenServerOptions options) {
            sandboxId.getClass();
            options.getClass();
            return new SandboxTokenSource(sandboxId, options);
        }
    }
}
