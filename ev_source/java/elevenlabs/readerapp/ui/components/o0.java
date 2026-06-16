package io.elevenlabs.readerapp.ui.components;

import io.elevenlabs.domain.model.ListeningProgress;
import io.elevenlabs.readerapp.ui.screens.authenticated.search.SearchScreenKt;
import java.util.List;
import q2.b7;
import q2.c7;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements ho.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14742a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f14744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14747f;

    public /* synthetic */ o0(ListeningProgress listeningProgress, List list, boolean z6, boolean z10, int i10) {
        this.f14746e = listeningProgress;
        this.f14747f = list;
        this.f14743b = z6;
        this.f14744c = z10;
        this.f14745d = i10;
    }

    @Override // ho.p
    public final Object invoke(Object obj, Object obj2) {
        sn.z ReadStatusRow$lambda$1;
        sn.z ReadPlayerQueueMenu$lambda$1;
        switch (this.f14742a) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ReadStatusRow$lambda$1 = ReadRowKt.ReadStatusRow$lambda$1((ListeningProgress) this.f14746e, (List) this.f14747f, this.f14743b, this.f14744c, this.f14745d, (u2.m) obj, intValue);
                return ReadStatusRow$lambda$1;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ReadPlayerQueueMenu$lambda$1 = SearchScreenKt.ReadPlayerQueueMenu$lambda$1(this.f14743b, this.f14744c, (ho.a) this.f14746e, (ho.a) this.f14747f, this.f14745d, (u2.m) obj, intValue2);
                return ReadPlayerQueueMenu$lambda$1;
            default:
                ((Integer) obj2).getClass();
                int M = u2.r.M(49);
                c7.a(this.f14743b, (i3.t) this.f14746e, this.f14744c, (b7) this.f14747f, (u2.m) obj, M, this.f14745d);
                return sn.z.f31622a;
        }
    }

    public /* synthetic */ o0(boolean z6, i3.t tVar, boolean z10, b7 b7Var, int i10, int i11) {
        this.f14743b = z6;
        this.f14746e = tVar;
        this.f14744c = z10;
        this.f14747f = b7Var;
        this.f14745d = i11;
    }

    public /* synthetic */ o0(boolean z6, boolean z10, ho.a aVar, ho.a aVar2, int i10) {
        this.f14743b = z6;
        this.f14744c = z10;
        this.f14746e = aVar;
        this.f14747f = aVar2;
        this.f14745d = i10;
    }
}
