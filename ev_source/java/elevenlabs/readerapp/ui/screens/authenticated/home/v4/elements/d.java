package io.elevenlabs.readerapp.ui.screens.authenticated.home.v4.elements;

import ho.l;
import ho.p;
import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerPreferencesScreenKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15716a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15717b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15718c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15719d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f15720e;

    public /* synthetic */ d(ListeningProgress listeningProgress, boolean z6, boolean z10, int i10) {
        this.f15720e = listeningProgress;
        this.f15717b = z6;
        this.f15718c = z10;
        this.f15719d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z RecentReadStatusRowV4$lambda$1;
        z TapToShowControlsRow$lambda$0;
        switch (this.f15716a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                RecentReadStatusRowV4$lambda$1 = HomeRecentReadsCarouselKt.RecentReadStatusRowV4$lambda$1((ListeningProgress) this.f15720e, this.f15717b, this.f15718c, this.f15719d, (m) obj, intValue);
                return RecentReadStatusRowV4$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TapToShowControlsRow$lambda$0 = PlayerPreferencesScreenKt.TapToShowControlsRow$lambda$0(this.f15717b, this.f15718c, (l) this.f15720e, this.f15719d, (m) obj, intValue2);
                return TapToShowControlsRow$lambda$0;
        }
    }

    public /* synthetic */ d(boolean z6, boolean z10, l lVar, int i10) {
        this.f15717b = z6;
        this.f15718c = z10;
        this.f15720e = lVar;
        this.f15719d = i10;
    }
}
