package io.elevenlabs.readerapp.ui.components.explore;

import a2.a3;
import a2.y1;
import androidx.lifecycle.b0;
import fr.d0;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.ui.screens.authenticated.agent.components.AgentChatComposerKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileState;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileViewModel;
import java.util.List;
import oo.u;
import p4.y;
import q2.k6;
import sn.z;
import t1.t;
import u2.z0;
import w1.e0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements ho.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f14604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14605c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14606d;

    public /* synthetic */ j(AuthorProfileViewModel authorProfileViewModel, AsyncCallResult asyncCallResult, boolean z6) {
        this.f14603a = 2;
        this.f14606d = asyncCallResult;
        this.f14604b = z6;
        this.f14605c = authorProfileViewModel;
    }

    @Override // ho.l
    public final Object invoke(Object obj) {
        z ExploreHeroCarousel$lambda$2$0$0;
        z AgentChatComposer$lambda$3$0$0;
        AuthorProfileState handleFollowResult$lambda$0;
        int i10 = this.f14603a;
        z zVar = z.f31622a;
        final int i11 = 0;
        Object obj2 = this.f14605c;
        Object obj3 = this.f14606d;
        final boolean z6 = this.f14604b;
        switch (i10) {
            case 0:
                ExploreHeroCarousel$lambda$2$0$0 = ExploreHeroCarouselKt.ExploreHeroCarousel$lambda$2$0$0((List) obj3, (ho.l) obj2, z6, (t) obj);
                return ExploreHeroCarousel$lambda$2$0$0;
            case 1:
                AgentChatComposer$lambda$3$0$0 = AgentChatComposerKt.AgentChatComposer$lambda$3$0$0(z6, (ho.l) obj2, (z0) obj3, (y1) obj);
                return AgentChatComposer$lambda$3$0$0;
            case 2:
                handleFollowResult$lambda$0 = AuthorProfileViewModel.handleFollowResult$lambda$0((AsyncCallResult) obj3, z6, (AuthorProfileViewModel) obj2, (AuthorProfileState) obj);
                return handleFollowResult$lambda$0;
            case 3:
                final na.j jVar = (na.j) obj2;
                final List list = (List) obj3;
                androidx.lifecycle.z zVar2 = new androidx.lifecycle.z() { // from class: oa.k
                    @Override // androidx.lifecycle.z
                    public final void h(b0 b0Var, androidx.lifecycle.t tVar) {
                        boolean z10 = z6;
                        List list2 = list;
                        na.j jVar2 = jVar;
                        if (z10 && !list2.contains(jVar2)) {
                            list2.add(jVar2);
                        }
                        if (tVar == androidx.lifecycle.t.ON_START && !list2.contains(jVar2)) {
                            list2.add(jVar2);
                        }
                        if (tVar == androidx.lifecycle.t.ON_STOP) {
                            list2.remove(jVar2);
                        }
                    }
                };
                jVar.Z.f28153j.addObserver(zVar2);
                return new a3(jVar, zVar2, 11);
            case 4:
                String str = (String) obj3;
                k6 k6Var = (k6) obj2;
                p4.b0 b0Var = (p4.b0) obj;
                if (z6) {
                    y.f(b0Var, 0);
                }
                io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g gVar = new io.elevenlabs.readerapp.ui.screens.authenticated.player.voicepicker.root.g(k6Var, 29);
                u[] uVarArr = y.f26563a;
                b0Var.b(p4.n.f26511v, new p4.a(null, gVar));
                y.g(str, b0Var);
                return zVar;
            default:
                final e0 e0Var = (e0) obj3;
                final d0 d0Var = (d0) obj2;
                p4.b0 b0Var2 = (p4.b0) obj;
                if (z6) {
                    ho.a aVar = new ho.a() { // from class: w1.q
                        @Override // ho.a
                        public final Object invoke() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            switch (i11) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    if (e0Var2.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var2, null, 0), 3);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                case 1:
                                    e0 e0Var3 = e0Var;
                                    if (e0Var3.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var3, null, 1), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case 2:
                                    e0 e0Var4 = e0Var;
                                    if (e0Var4.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var4, null, 0), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                default:
                                    e0 e0Var5 = e0Var;
                                    if (e0Var5.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var5, null, 1), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                            }
                        }
                    };
                    u[] uVarArr2 = y.f26563a;
                    b0Var2.b(p4.n.f26514y, new p4.a(null, aVar));
                    final int i12 = 1;
                    b0Var2.b(p4.n.A, new p4.a(null, new ho.a() { // from class: w1.q
                        @Override // ho.a
                        public final Object invoke() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            switch (i12) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    if (e0Var2.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var2, null, 0), 3);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                case 1:
                                    e0 e0Var3 = e0Var;
                                    if (e0Var3.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var3, null, 1), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case 2:
                                    e0 e0Var4 = e0Var;
                                    if (e0Var4.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var4, null, 0), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                default:
                                    e0 e0Var5 = e0Var;
                                    if (e0Var5.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var5, null, 1), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                            }
                        }
                    }));
                } else {
                    final int i13 = 2;
                    ho.a aVar2 = new ho.a() { // from class: w1.q
                        @Override // ho.a
                        public final Object invoke() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            switch (i13) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    if (e0Var2.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var2, null, 0), 3);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                case 1:
                                    e0 e0Var3 = e0Var;
                                    if (e0Var3.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var3, null, 1), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case 2:
                                    e0 e0Var4 = e0Var;
                                    if (e0Var4.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var4, null, 0), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                default:
                                    e0 e0Var5 = e0Var;
                                    if (e0Var5.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var5, null, 1), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                            }
                        }
                    };
                    u[] uVarArr3 = y.f26563a;
                    b0Var2.b(p4.n.f26515z, new p4.a(null, aVar2));
                    final int i14 = 3;
                    b0Var2.b(p4.n.B, new p4.a(null, new ho.a() { // from class: w1.q
                        @Override // ho.a
                        public final Object invoke() {
                            boolean z10;
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            switch (i14) {
                                case 0:
                                    e0 e0Var2 = e0Var;
                                    if (e0Var2.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var2, null, 0), 3);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    return Boolean.valueOf(z10);
                                case 1:
                                    e0 e0Var3 = e0Var;
                                    if (e0Var3.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var3, null, 1), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case 2:
                                    e0 e0Var4 = e0Var;
                                    if (e0Var4.c()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var4, null, 0), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                default:
                                    e0 e0Var5 = e0Var;
                                    if (e0Var5.d()) {
                                        fr.g0.D(d0Var, null, null, new r(e0Var5, null, 1), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                            }
                        }
                    }));
                }
                return zVar;
        }
    }

    public /* synthetic */ j(int i10, Object obj, Object obj2, boolean z6) {
        this.f14603a = i10;
        this.f14604b = z6;
        this.f14606d = obj;
        this.f14605c = obj2;
    }

    public /* synthetic */ j(List list, ho.l lVar, boolean z6) {
        this.f14603a = 0;
        this.f14606d = list;
        this.f14605c = lVar;
        this.f14604b = z6;
    }

    public /* synthetic */ j(List list, na.j jVar, boolean z6) {
        this.f14603a = 3;
        this.f14605c = jVar;
        this.f14604b = z6;
        this.f14606d = list;
    }

    public /* synthetic */ j(boolean z6, ho.l lVar, z0 z0Var) {
        this.f14603a = 1;
        this.f14604b = z6;
        this.f14605c = lVar;
        this.f14606d = z0Var;
    }
}
