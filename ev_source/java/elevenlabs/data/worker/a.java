package io.elevenlabs.data.worker;

import gh.j0;
import gh.l0;
import ja.j1;
import ja.q;
import ja.t0;
import ja.x0;
import java.util.List;
import kotlin.jvm.internal.b0;
import w7.f;
import w7.r0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f14134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14136d;

    public /* synthetic */ a(x0 x0Var, List list, int i10, long j4) {
        this.f14135c = x0Var;
        this.f14136d = list;
        this.f14133a = i10;
        this.f14134b = j4;
    }

    @Override // ja.t0
    public void b(q qVar, int i10) {
        x0 x0Var = (x0) this.f14135c;
        List list = (List) this.f14136d;
        j1 j1Var = x0Var.f19278c;
        j0 k4 = l0.k();
        for (int i11 = 0; i11 < list.size(); i11++) {
            k4.c(((r0) list.get(i11)).c(x0Var.q(), true));
        }
        qVar.J0(j1Var, i10, new f(k4.g()), this.f14133a, this.f14134b);
    }

    public /* synthetic */ a(b0 b0Var, OfflineMediaDownloader offlineMediaDownloader, long j4, int i10) {
        this.f14135c = b0Var;
        this.f14136d = offlineMediaDownloader;
        this.f14134b = j4;
        this.f14133a = i10;
    }
}
