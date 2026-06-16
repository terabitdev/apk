package io.elevenlabs.readerapp.ui.delegates;

import io.elevenlabs.domain.model.ExploreRead;
import io.elevenlabs.domain.model.ReadMeta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import tn.o;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0001H\u0007¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"extractProductIds", "", "", "Lio/elevenlabs/domain/model/ExploreRead;", "Lio/elevenlabs/domain/model/ReadMeta;", "extractProductIdsFromReadMeta", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class PriceFetcherKt {
    public static final List<String> extractProductIds(List<ExploreRead> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String androidProductId = ((ExploreRead) it.next()).getAndroidProductId();
            if (androidProductId != null) {
                arrayList.add(androidProductId);
            }
        }
        return o.p0(arrayList);
    }

    public static final List<String> extractProductIdsFromReadMeta(List<ReadMeta> list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String androidProductId = ((ReadMeta) it.next()).getAndroidProductId();
            if (androidProductId != null) {
                arrayList.add(androidProductId);
            }
        }
        return o.p0(arrayList);
    }
}
