package io.elevenlabs.readerapp.ui.screens.authenticated.agent;

import ho.p;
import i3.t;
import io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.ExploreFilterTopBarKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsScreenKt;
import sn.z;
import u2.m;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ho.a f15056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f15057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f15059f;

    public /* synthetic */ c(boolean z6, ho.a aVar, t tVar, int i10, int i11, int i12) {
        this.f15054a = i12;
        this.f15055b = z6;
        this.f15056c = aVar;
        this.f15057d = tVar;
        this.f15058e = i10;
        this.f15059f = i11;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        z ScrollToBottomFab$lambda$1;
        z FilterButton$lambda$2;
        z ReadLaterToggleButton$lambda$0;
        switch (this.f15054a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ScrollToBottomFab$lambda$1 = AskAgentScreenKt.ScrollToBottomFab$lambda$1(this.f15055b, this.f15056c, this.f15057d, this.f15058e, this.f15059f, (m) obj, intValue);
                return ScrollToBottomFab$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                FilterButton$lambda$2 = ExploreFilterTopBarKt.FilterButton$lambda$2(this.f15055b, this.f15056c, this.f15057d, this.f15058e, this.f15059f, (m) obj, intValue2);
                return FilterButton$lambda$2;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                ReadLaterToggleButton$lambda$0 = ReadDetailsScreenKt.ReadLaterToggleButton$lambda$0(this.f15055b, this.f15056c, this.f15057d, this.f15058e, this.f15059f, (m) obj, intValue3);
                return ReadLaterToggleButton$lambda$0;
        }
    }
}
