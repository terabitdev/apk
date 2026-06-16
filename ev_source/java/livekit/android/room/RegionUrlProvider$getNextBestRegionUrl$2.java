package io.livekit.android.room;

import android.os.SystemClock;
import com.google.protobuf.c6;
import et.d;
import fr.d0;
import ho.p;
import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import sn.a;
import sn.z;
import tn.o;
import wn.c;
import yn.e;
import yn.i;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@e(c = "io.livekit.android.room.RegionUrlProvider$getNextBestRegionUrl$2", f = "RegionUrlProvider.kt", l = {60}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "", "<anonymous>", "(Lfr/d0;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RegionUrlProvider$getNextBestRegionUrl$2 extends i implements p {
    int label;
    final /* synthetic */ RegionUrlProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegionUrlProvider$getNextBestRegionUrl$2(RegionUrlProvider regionUrlProvider, c<? super RegionUrlProvider$getNextBestRegionUrl$2> cVar) {
        super(2, cVar);
        this.this$0 = regionUrlProvider;
    }

    @Override // yn.a
    public final c<z> create(Object obj, c<?> cVar) {
        return new RegionUrlProvider$getNextBestRegionUrl$2(this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(d0 d0Var, c<? super String> cVar) {
        return ((RegionUrlProvider$getNextBestRegionUrl$2) create(d0Var, cVar)).invokeSuspend(z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        if (r3 > r9) goto L14;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RegionSettings regionSettings;
        long j4;
        int i10;
        RegionSettings regionSettings2;
        List<RegionInfo> regions;
        Set set;
        Set set2;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            a.g(obj);
            if (this.this$0.isLKCloud()) {
                regionSettings = this.this$0.regionSettings;
                if (regionSettings != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    j4 = this.this$0.lastUpdateAt;
                    long j10 = elapsedRealtime - j4;
                    i10 = this.this$0.settingsCacheTimeMs;
                }
                RegionUrlProvider regionUrlProvider = this.this$0;
                this.label = 1;
                Object fetchRegionSettings = regionUrlProvider.fetchRegionSettings(this);
                xn.a aVar = xn.a.f37986a;
                if (fetchRegionSettings == aVar) {
                    return aVar;
                }
            } else {
                c6.x("Region availability is only supported for LiveKit Cloud domains");
                return null;
            }
        }
        regionSettings2 = this.this$0.regionSettings;
        if (regionSettings2 != null && (regions = regionSettings2.getRegions()) != null) {
            RegionUrlProvider regionUrlProvider2 = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : regions) {
                RegionInfo regionInfo = (RegionInfo) obj2;
                set2 = regionUrlProvider2.attemptedRegions;
                Set set3 = set2;
                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                    Iterator it = set3.iterator();
                    while (it.hasNext()) {
                        if (m.c(((RegionInfo) it.next()).getUrl(), regionInfo.getUrl())) {
                            break;
                        }
                    }
                }
                arrayList.add(obj2);
            }
            if (!arrayList.isEmpty()) {
                RegionInfo regionInfo2 = (RegionInfo) o.w0(arrayList);
                set = this.this$0.attemptedRegions;
                set.add(regionInfo2);
                LKLog.Companion companion = LKLog.INSTANCE;
                if (LoggingLevel.DEBUG.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && d.d() > 0) {
                    d.a(null, "next region: " + regionInfo2, new Object[0]);
                }
                return regionInfo2.getUrl();
            }
        }
        return null;
    }
}
