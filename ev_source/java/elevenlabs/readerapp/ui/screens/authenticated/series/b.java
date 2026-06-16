package io.elevenlabs.readerapp.ui.screens.authenticated.series;

import ho.q;
import ho.r;
import io.elevenlabs.domain.model.ExploreCollectionDetails;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1;
import java.util.List;
import r1.y;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17049a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f17050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17053e;

    public /* synthetic */ b(float f10, long j4, r rVar, BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1 bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1) {
        this.f17050b = f10;
        this.f17051c = j4;
        this.f17052d = rVar;
        this.f17053e = bottomSheetScaffoldKt$BottomSheetScaffold$control$1$1;
    }

    @Override // ho.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z SeriesContent_lQd7feU$lambda$4$0$0$0$0$0;
        z BottomSheetScaffold_jb_40ds$lambda$7;
        switch (this.f17049a) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                SeriesContent_lQd7feU$lambda$4$0$0$0$0$0 = ExploreSeriesScreenKt.SeriesContent_lQd7feU$lambda$4$0$0$0$0$0((ExploreCollectionDetails) this.f17052d, this.f17051c, this.f17050b, (List) this.f17053e, (t1.b) obj, (m) obj2, intValue);
                return SeriesContent_lQd7feU$lambda$4$0$0$0$0$0;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                BottomSheetScaffold_jb_40ds$lambda$7 = BottomSheetScaffoldKt.BottomSheetScaffold_jb_40ds$lambda$7(this.f17050b, this.f17051c, (r) this.f17052d, (BottomSheetScaffoldKt$BottomSheetScaffold$control$1$1) this.f17053e, (y) obj, (m) obj2, intValue2);
                return BottomSheetScaffold_jb_40ds$lambda$7;
        }
    }

    public /* synthetic */ b(ExploreCollectionDetails exploreCollectionDetails, long j4, float f10, List list) {
        this.f17052d = exploreCollectionDetails;
        this.f17051c = j4;
        this.f17050b = f10;
        this.f17053e = list;
    }
}
