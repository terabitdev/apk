package io.elevenlabs.domain.services;

import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.OneTimeProductsPage;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import wn.c;
import zn.a;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\nJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/services/ProductsService;", "", "", "context", "Lio/elevenlabs/domain/model/AsyncCallResult;", "Lio/elevenlabs/domain/model/OneTimeProductsPage;", "getOneTimeCreditsProductsPage", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "getLowHoursPage", "(Lwn/c;)Ljava/lang/Object;", "PaywallSource", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface ProductsService {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lio/elevenlabs/domain/services/ProductsService$PaywallSource;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "OFFLINE", "GEN_FM", "LISTENING_LIMIT", "VOICE_DESIGN", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class PaywallSource {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PaywallSource[] $VALUES;
        public static final PaywallSource DEFAULT = new PaywallSource("DEFAULT", 0);
        public static final PaywallSource OFFLINE = new PaywallSource("OFFLINE", 1);
        public static final PaywallSource GEN_FM = new PaywallSource("GEN_FM", 2);
        public static final PaywallSource LISTENING_LIMIT = new PaywallSource("LISTENING_LIMIT", 3);
        public static final PaywallSource VOICE_DESIGN = new PaywallSource("VOICE_DESIGN", 4);

        private static final /* synthetic */ PaywallSource[] $values() {
            return new PaywallSource[]{DEFAULT, OFFLINE, GEN_FM, LISTENING_LIMIT, VOICE_DESIGN};
        }

        static {
            PaywallSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c1.q($values);
        }

        private PaywallSource(String str, int i10) {
        }

        public static a getEntries() {
            return $ENTRIES;
        }

        public static PaywallSource valueOf(String str) {
            return (PaywallSource) Enum.valueOf(PaywallSource.class, str);
        }

        public static PaywallSource[] values() {
            return (PaywallSource[]) $VALUES.clone();
        }
    }

    static /* synthetic */ Object getOneTimeCreditsProductsPage$default(ProductsService productsService, String str, c cVar, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return productsService.getOneTimeCreditsProductsPage(str, cVar);
        }
        a9.a.y("Super calls with default arguments not supported in this target, function: getOneTimeCreditsProductsPage");
        return null;
    }

    Object getLowHoursPage(c<? super AsyncCallResult<OneTimeProductsPage>> cVar);

    Object getOneTimeCreditsProductsPage(String str, c<? super AsyncCallResult<OneTimeProductsPage>> cVar);
}
