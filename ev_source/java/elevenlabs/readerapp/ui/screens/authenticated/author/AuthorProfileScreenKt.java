package io.elevenlabs.readerapp.ui.screens.authenticated.author;

import a2.t3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import f4.i0;
import i3.t;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.AuthorProfile;
import io.elevenlabs.domain.model.AuthorProfilePage;
import io.elevenlabs.domain.model.AuthorProfileSection;
import io.elevenlabs.highlighter.s;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.components.ReadSectionKt;
import io.elevenlabs.readerapp.ui.components.SeriesSectionKt;
import io.elevenlabs.readerapp.ui.components.r0;
import io.elevenlabs.readerapp.ui.components.x;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorActionsSectionKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileHeaderKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.author.components.AuthorProfileSortRowKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.mini.MiniPlayerKt;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ChipKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.extensions.ComposeExtensionsKt;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.f0;
import q2.g0;
import q2.k5;
import q2.u7;
import q2.v7;
import r1.d2;
import r1.l2;
import r1.p2;
import r1.z1;
import rd.c1;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.x0;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u001a]\u0010\f\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u00ad\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u001a\b\u0002\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00072 \b\u0002\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aÅ\u0001\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u001e2\u0006\u0010!\u001a\u00020 2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\u0003H\u0007¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\u0003H\u0007¢\u0006\u0004\b(\u0010'\u001a\u000f\u0010)\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010'\u001a\u000f\u0010*\u001a\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010'\u001a\u000f\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b+\u0010'\u001a\u000f\u0010,\u001a\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010'\u001a\u000f\u0010-\u001a\u00020\u0003H\u0007¢\u0006\u0004\b-\u0010'\u001a\u000f\u0010.\u001a\u00020\u0003H\u0007¢\u0006\u0004\b.\u0010'\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u00100¨\u00063²\u0006\u0010\u00101\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00102\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "authorId", "Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function1;", "onNavigateToReadDetails", "Lkotlin/Function2;", "Lio/elevenlabs/domain/Analytics$Event$PlayerActivationSource;", "onNavigateToPlayer", "Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileViewModel;", "vm", AuthorProfileScreenKt.TAG, "(Ljava/lang/String;Lho/a;Lho/l;Lho/p;Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lua/b;", "Lio/elevenlabs/domain/model/AuthorProfileSection;", "subpagePagingItems", "onSortChange", "action", "onShareClick", "miniPlayer", "AuthorProfileScreenUi", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/author/AuthorProfileState;Lua/b;Lho/a;Lho/l;Lho/p;Lho/l;Lho/l;Lho/p;Lu2/m;II)V", "Lio/elevenlabs/domain/model/AuthorProfile;", "author", "", "selectedTabIndex", "selectedSubpageId", "", "currentSubpageSortKeys", "", "isFollowOperationInFlight", "onSelectTab", "onFollowToggle", "AuthorProfileContent", "(Lio/elevenlabs/domain/model/AuthorProfile;Lua/b;ILjava/lang/String;Ljava/util/Map;ZLho/l;Lho/a;Lho/l;Lho/p;Lho/l;Lho/p;Lu2/m;II)V", "Preview_AuthorProfileScreen_Loading", "(Lu2/m;I)V", "Preview_AuthorProfileScreen_Error", "Preview_AuthorProfileScreen_WithBooks", "Preview_AuthorProfileScreen_WithSubpagesBooks", "Preview_AuthorProfileScreen_WithSubpagesSeries", "Preview_AuthorProfileScreen_SubpageLoading", "Preview_AuthorProfileScreen_MinimalAuthor", "Preview_AuthorProfileScreen_NoContent", "TAG", "Ljava/lang/String;", "linkToShare", "miniPlayerHeight", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class AuthorProfileScreenKt {
    private static final String TAG = "AuthorProfileScreen";

    private static final void AuthorProfileContent(final AuthorProfile authorProfile, final ua.b bVar, final int i10, final String str, final Map<String, String> map, final boolean z6, final ho.l lVar, final ho.a aVar, final ho.l lVar2, final ho.p pVar, final ho.l lVar3, ho.p pVar2, u2.m mVar, int i11, int i12) {
        int i13;
        int i14;
        boolean z10;
        q qVar;
        int i15;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        u2.e eVar;
        h4.e eVar2;
        h4.d dVar;
        h4.e eVar3;
        x0 x0Var;
        i3.l lVar4;
        h4.e eVar4;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean h10;
        int i26;
        int i27;
        ho.p pVar3 = pVar2;
        q qVar2 = (q) mVar;
        qVar2.Z(933738005);
        if ((i11 & 6) == 0) {
            if (qVar2.h(authorProfile)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i13 = i27 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i11 & 64) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i13 |= i26;
        }
        if ((i11 & 384) == 0) {
            if (qVar2.d(i10)) {
                i25 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i25 = 128;
            }
            i13 |= i25;
        }
        if ((i11 & 3072) == 0) {
            if (qVar2.f(str)) {
                i24 = 2048;
            } else {
                i24 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i24;
        }
        if ((i11 & 24576) == 0) {
            if (qVar2.h(map)) {
                i23 = 16384;
            } else {
                i23 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i23;
        }
        if ((196608 & i11) == 0) {
            if (qVar2.g(z6)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i13 |= i22;
        }
        if ((i11 & 1572864) == 0) {
            if (qVar2.h(lVar)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        if ((i11 & 12582912) == 0) {
            if (qVar2.h(aVar)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        if ((i11 & 100663296) == 0) {
            if (qVar2.h(lVar2)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i13 |= i19;
        }
        if ((i11 & 805306368) == 0) {
            if (qVar2.h(pVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i13 |= i18;
        }
        if ((i12 & 6) == 0) {
            if (qVar2.h(lVar3)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i12 | i17;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (qVar2.h(pVar3)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        int i28 = i14;
        if ((i13 & 306783379) == 306783378 && (i28 & 19) == 18) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (qVar2.O(i13 & 1, z10)) {
            Object L = qVar2.L();
            u2.e eVar5 = u2.l.f33918a;
            if (L == eVar5) {
                i15 = 0;
                L = com.google.android.gms.internal.play_billing.b.t(0, qVar2);
            } else {
                i15 = 0;
            }
            x0 x0Var2 = (x0) L;
            float rememberPxToDp = ComposeExtensionsKt.rememberPxToDp(AuthorProfileContent$lambda$1(x0Var2), (u2.m) qVar2, i15);
            i3.q qVar3 = i3.q.f13017a;
            t d10 = p2.d(qVar3, 1.0f);
            i3.l lVar5 = i3.d.f12997a;
            f1 d11 = r1.p.d(lVar5, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            t c5 = i3.a.c(d10, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar6 = h4.g.f11907f;
            r.J(eVar6, d11, qVar2);
            h4.e eVar7 = h4.g.f11906e;
            r.J(eVar7, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar8 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar8);
            h4.d dVar2 = h4.g.f11909h;
            r.F(dVar2, qVar2);
            h4.e eVar9 = h4.g.f11905d;
            r.J(eVar9, c5, qVar2);
            t d12 = p2.d(qVar3, 1.0f);
            d2 f10 = r1.d.f(u.P, u.P, u.P, rememberPxToDp, 7);
            boolean h11 = qVar2.h(authorProfile);
            if ((458752 & i13) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z20 = h11 | z11;
            if ((29360128 & i13) == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z21 = z20 | z12;
            if ((i28 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z22 = z21 | z13;
            if ((234881024 & i13) == 67108864) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z23 = z22 | z14;
            if ((i13 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z24 = z23 | z15;
            if ((3670016 & i13) == 1048576) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z25 = z24 | z16;
            if ((i13 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean h12 = z25 | z17 | qVar2.h(map);
            if ((1879048192 & i13) == 536870912) {
                z18 = true;
            } else {
                z18 = false;
            }
            boolean z26 = h12 | z18;
            if ((i13 & 112) != 32 && ((i13 & 64) == 0 || !qVar2.h(bVar))) {
                z19 = false;
            } else {
                z19 = true;
            }
            boolean z27 = z19 | z26;
            Object L2 = qVar2.L();
            if (!z27 && L2 != eVar5) {
                eVar = eVar5;
                eVar2 = eVar7;
                dVar = dVar2;
                eVar3 = eVar8;
                x0Var = x0Var2;
                lVar4 = lVar5;
                eVar4 = eVar6;
            } else {
                eVar = eVar5;
                eVar2 = eVar7;
                dVar = dVar2;
                eVar3 = eVar8;
                x0Var = x0Var2;
                lVar4 = lVar5;
                eVar4 = eVar6;
                ho.l lVar6 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.a
                    @Override // ho.l
                    public final Object invoke(Object obj) {
                        z AuthorProfileContent$lambda$3$0$0;
                        AuthorProfileContent$lambda$3$0$0 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0(AuthorProfile.this, str, bVar, z6, aVar, lVar3, lVar2, i10, lVar, map, pVar, (t1.t) obj);
                        return AuthorProfileContent$lambda$3$0$0;
                    }
                };
                qVar2.h0(lVar6);
                L2 = lVar6;
            }
            c1.c(d12, null, f10, false, null, null, null, false, null, (ho.l) L2, qVar2, 6, 506);
            qVar = qVar2;
            t b10 = r1.t.f29349a.b(qVar3, i3.d.Z);
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new b(x0Var, 0);
                qVar.h0(L3);
            }
            t q = i0.q(b10, (ho.l) L3);
            f1 d13 = r1.p.d(lVar4, false);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(q, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(eVar4, d13, qVar);
            r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            r.J(eVar9, c10, qVar);
            pVar3 = pVar2;
            j0.c.r((i28 >> 3) & 14, pVar3, qVar, true, true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new s(authorProfile, bVar, i10, str, map, z6, lVar, aVar, lVar2, pVar, lVar3, pVar3, i11, i12);
        }
    }

    private static final int AuthorProfileContent$lambda$1(x0 x0Var) {
        return ((u2.f1) x0Var).h();
    }

    private static final void AuthorProfileContent$lambda$2(x0 x0Var, int i10) {
        ((u2.f1) x0Var).i(i10);
    }

    public static final z AuthorProfileContent$lambda$3$0$0(AuthorProfile authorProfile, String str, ua.b bVar, boolean z6, ho.a aVar, ho.l lVar, ho.l lVar2, final int i10, final ho.l lVar3, Map map, ho.p pVar, t1.t tVar) {
        final AuthorProfile authorProfile2;
        Object obj;
        tVar.getClass();
        for (AuthorProfileSection authorProfileSection : authorProfile.getSections()) {
            if (authorProfileSection instanceof AuthorProfileSection.Header) {
                t1.t.c(tVar, null, null, new c3.j(new h((AuthorProfileSection.Header) authorProfileSection, 0), true, -1888050738), 3);
            } else if (authorProfileSection instanceof AuthorProfileSection.Actions) {
                t1.t.c(tVar, null, null, new c3.j(new j(authorProfile, (AuthorProfileSection.Actions) authorProfileSection, z6, aVar, lVar), true, 529874039), 3);
            } else if (authorProfileSection instanceof AuthorProfileSection.Series) {
                t1.t.c(tVar, null, null, new c3.j(new h((AuthorProfileSection.Series) authorProfileSection, 1), true, -760777770), 3);
            } else if (authorProfileSection instanceof AuthorProfileSection.Read) {
                t1.t.c(tVar, null, null, new c3.j(new defpackage.b((AuthorProfileSection.Read) authorProfileSection, lVar2, 6), true, -2051429579), 3);
            } else {
                c6.p();
                return null;
            }
        }
        if (!authorProfile.getPages().isEmpty()) {
            if (authorProfile.getPages().size() > 1) {
                authorProfile2 = authorProfile;
                t1.t.c(tVar, null, null, new c3.j(new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.k
                    @Override // ho.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        z AuthorProfileContent$lambda$3$0$0$1;
                        int intValue = ((Integer) obj4).intValue();
                        AuthorProfileContent$lambda$3$0$0$1 = AuthorProfileScreenKt.AuthorProfileContent$lambda$3$0$0$1(AuthorProfile.this, i10, lVar3, (t1.b) obj2, (u2.m) obj3, intValue);
                        return AuthorProfileContent$lambda$3$0$0$1;
                    }
                }, true, -740776988), 3);
            } else {
                authorProfile2 = authorProfile;
            }
            if (str != null) {
                Iterator<T> it = authorProfile2.getPages().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (kotlin.jvm.internal.m.c(((AuthorProfilePage) obj).getId(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AuthorProfilePage authorProfilePage = (AuthorProfilePage) obj;
                if (authorProfilePage != null && !authorProfilePage.getAvailableSorts().isEmpty()) {
                    t1.t.c(tVar, null, null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.a(map, str, authorProfilePage, pVar, authorProfile2, 4), true, 527215770), 3);
                }
            }
            t1.t.d(tVar, bVar.c(), null, new c3.j(new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.d(bVar, lVar2, authorProfile, z6, aVar, lVar), true, -414810570), 6);
            if ((bVar.d().f32555a instanceof ta.r) && bVar.c() == 0) {
                t1.t.c(tVar, null, null, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.getLambda$443301901$app_productionRelease(), 3);
            }
            if (bVar.d().f32557c instanceof ta.r) {
                t1.t.c(tVar, null, null, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.getLambda$28254316$app_productionRelease(), 3);
            }
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$0$0(AuthorProfileSection authorProfileSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileHeaderKt.AuthorProfileHeader((AuthorProfileSection.Header) authorProfileSection, r1.d.I(i3.q.f13017a, u.P, 8, u.P, u.P, 13), qVar, 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$0$1(AuthorProfile authorProfile, AuthorProfileSection authorProfileSection, boolean z6, ho.a aVar, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z10)) {
            AuthorActionsSectionKt.AuthorActionsSection(authorProfile.isFollowing(), z6, ((AuthorProfileSection.Actions) authorProfileSection).getData().getShareLink(), aVar, lVar, r1.d.I(i3.q.f13017a, u.P, 8, u.P, u.P, 13), qVar, 196608, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$0$2(AuthorProfileSection authorProfileSection, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            SeriesSectionKt.SeriesSection((AuthorProfileSection.Series) authorProfileSection, r1.d.I(i3.q.f13017a, u.P, 8, u.P, u.P, 13), qVar, 48, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$0$3(AuthorProfileSection authorProfileSection, ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            AuthorProfileSection.Read read = (AuthorProfileSection.Read) authorProfileSection;
            ReadSectionKt.ReadSection(read.getData().getRead(), read.getData().getOrderLabel(), r1.d.G(i3.q.f13017a, u.P, 8, 1), lVar, qVar, 384, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$1(AuthorProfile authorProfile, int i10, ho.l lVar, t1.b bVar, u2.m mVar, int i11) {
        boolean z6;
        bVar.getClass();
        if ((i11 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            r1.h g10 = r1.j.g(8);
            float f10 = 20;
            d2 f11 = r1.d.f(f10, 16, f10, u.P, 8);
            boolean h10 = qVar.h(authorProfile) | qVar.d(i10) | qVar.f(lVar);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new t3(authorProfile, i10, lVar, 1);
                qVar.h0(L);
            }
            c1.d(e10, null, f11, g10, null, null, false, null, (ho.l) L, qVar, 24582, 490);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$1$0$0(AuthorProfile authorProfile, final int i10, final ho.l lVar, t1.t tVar) {
        tVar.getClass();
        final List<AuthorProfilePage> pages = authorProfile.getPages();
        ((t1.i) tVar).u(pages.size(), null, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt$AuthorProfileContent$lambda$3$0$0$1$0$0$$inlined$itemsIndexed$default$2
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final Object invoke(int i11) {
                pages.get(i11);
                return null;
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt$AuthorProfileContent$lambda$3$0$0$1$0$0$$inlined$itemsIndexed$default$3
            public final void invoke(t1.b bVar, final int i11, u2.m mVar, int i12) {
                int i13;
                boolean z6;
                boolean z10;
                int i14;
                int i15;
                if ((i12 & 6) == 0) {
                    if (((q) mVar).f(bVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i12 | i15;
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    if (((q) mVar).d(i11)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i13 |= i14;
                }
                boolean z11 = true;
                if ((i13 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                q qVar = (q) mVar;
                if (qVar.O(i13 & 1, z6)) {
                    AuthorProfilePage authorProfilePage = (AuthorProfilePage) pages.get(i11);
                    qVar.X(165395655);
                    String name = authorProfilePage.getName();
                    if (i10 == i11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean f10 = qVar.f(lVar);
                    if ((((i13 & 112) ^ 48) <= 32 || !qVar.d(i11)) && (i13 & 48) != 32) {
                        z11 = false;
                    }
                    boolean z12 = f10 | z11;
                    Object L = qVar.L();
                    if (z12 || L == u2.l.f33918a) {
                        final ho.l lVar2 = lVar;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.AuthorProfileScreenKt$AuthorProfileContent$1$1$1$2$1$1$1$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1302invoke() {
                                ho.l.this.invoke(Integer.valueOf(i11));
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1302invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ChipKt.Chip(name, null, z10, null, null, null, (ho.a) L, null, null, qVar, 0, 442);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((t1.b) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, 2039820996));
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$2$1(Map map, String str, AuthorProfilePage authorProfilePage, ho.p pVar, AuthorProfile authorProfile, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        float f10;
        bVar.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String str2 = (String) map.get(str);
            if (str2 == null) {
                str2 = "";
            }
            Map<String, String> availableSorts = authorProfilePage.getAvailableSorts();
            String itemCountLabel = authorProfilePage.getItemCountLabel();
            boolean f11 = qVar.f(pVar) | qVar.f(str);
            Object L = qVar.L();
            if (f11 || L == u2.l.f33918a) {
                L = new io.elevenlabs.data.database.entities.reads.h(pVar, str, 5);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            if (authorProfile.getPages().size() > 1) {
                f10 = 16;
            } else {
                f10 = 24;
            }
            AuthorProfileSortRowKt.AuthorProfileSortRow(str2, availableSorts, itemCountLabel, lVar, r1.d.I(i3.q.f13017a, u.P, f10, u.P, 12, 5), qVar, 0, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$2$1$0$0(ho.p pVar, String str, String str2) {
        str2.getClass();
        pVar.invoke(str, str2);
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$0$0$3(ua.b bVar, ho.l lVar, AuthorProfile authorProfile, boolean z6, ho.a aVar, ho.l lVar2, t1.b bVar2, int i10, u2.m mVar, int i11) {
        int i12;
        boolean z10;
        int i13;
        bVar2.getClass();
        if ((i11 & 48) == 0) {
            if (((q) mVar).d(i10)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i11 | i13;
        } else {
            i12 = i11;
        }
        if ((i12 & 145) != 144) {
            z10 = true;
        } else {
            z10 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i12 & 1, z10)) {
            AuthorProfileSection authorProfileSection = (AuthorProfileSection) bVar.b(i10);
            if (authorProfileSection == null) {
                qVar.X(-1000675900);
                qVar.p(false);
            } else {
                qVar.X(-1000675899);
                if (authorProfileSection instanceof AuthorProfileSection.Header) {
                    qVar.X(-847616648);
                    AuthorProfileHeaderKt.AuthorProfileHeader((AuthorProfileSection.Header) authorProfileSection, null, qVar, 0, 2);
                    qVar.p(false);
                } else if (authorProfileSection instanceof AuthorProfileSection.Series) {
                    qVar.X(-847382722);
                    SeriesSectionKt.SeriesSection((AuthorProfileSection.Series) authorProfileSection, null, qVar, 0, 2);
                    qVar.p(false);
                } else if (authorProfileSection instanceof AuthorProfileSection.Read) {
                    qVar.X(-847151276);
                    AuthorProfileSection.Read read = (AuthorProfileSection.Read) authorProfileSection;
                    ReadSectionKt.ReadSection(read.getData().getRead(), read.getData().getOrderLabel(), null, lVar, qVar, 0, 4);
                    qVar.p(false);
                } else if (authorProfileSection instanceof AuthorProfileSection.Actions) {
                    qVar.X(-846749082);
                    AuthorActionsSectionKt.AuthorActionsSection(authorProfile.isFollowing(), z6, ((AuthorProfileSection.Actions) authorProfileSection).getData().getShareLink(), aVar, lVar2, null, qVar, 0, 32);
                    qVar.p(false);
                } else {
                    throw com.google.android.gms.internal.play_billing.b.h(-1551364378, qVar, false);
                }
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$3$1$0(x0 x0Var, h5.l lVar) {
        AuthorProfileContent$lambda$2(x0Var, (int) (lVar.f12092a & 4294967295L));
        return z.f31622a;
    }

    public static final z AuthorProfileContent$lambda$4(AuthorProfile authorProfile, ua.b bVar, int i10, String str, Map map, boolean z6, ho.l lVar, ho.a aVar, ho.l lVar2, ho.p pVar, ho.l lVar3, ho.p pVar2, int i11, int i12, u2.m mVar, int i13) {
        AuthorProfileContent(authorProfile, bVar, i10, str, map, z6, lVar, aVar, lVar2, pVar, lVar3, pVar2, mVar, r.M(i11 | 1), r.M(i12));
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        if ((r26 & 16) != 0) goto L160;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorProfileScreen(String str, ho.a aVar, ho.l lVar, final ho.p pVar, AuthorProfileViewModel authorProfileViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar2;
        ho.l lVar2;
        AuthorProfileViewModel authorProfileViewModel2;
        boolean z6;
        AuthorProfileViewModel authorProfileViewModel3;
        q7.c cVar;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        pVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1254692442);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(pVar)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i14;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                authorProfileViewModel2 = authorProfileViewModel;
                if (qVar.h(authorProfileViewModel2)) {
                    i13 = 16384;
                    i12 |= i13;
                }
            } else {
                authorProfileViewModel2 = authorProfileViewModel;
            }
            i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i12 |= i13;
        } else {
            authorProfileViewModel2 = authorProfileViewModel;
        }
        if ((i12 & 9363) != 9362) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 16) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        authorProfileViewModel2 = (AuthorProfileViewModel) gg.b.j0(e0.f20562a.b(AuthorProfileViewModel.class), a10, null, o6, cVar, qVar);
                        i12 &= -57345;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                final AuthorProfileViewModel authorProfileViewModel4 = authorProfileViewModel2;
                int i18 = i12;
                qVar.q();
                boolean h10 = qVar.h(authorProfileViewModel4);
                if ((i18 & 14) == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = z10 | h10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z11 || L == eVar) {
                    L = new AuthorProfileScreenKt$AuthorProfileScreen$1$1(authorProfileViewModel4, str, null);
                    qVar.h0(L);
                }
                r.f((ho.p) L, str, qVar);
                AuthorProfileState authorProfileState = (AuthorProfileState) r.o(authorProfileViewModel4.getStateFlow(), qVar, 0).getValue();
                ua.b a11 = ua.d.a(authorProfileViewModel4.getSubpagePagingData(), qVar);
                Object L2 = qVar.L();
                if (L2 == eVar) {
                    L2 = r.A(null);
                    qVar.h0(L2);
                }
                z0 z0Var = (z0) L2;
                String AuthorProfileScreen$lambda$2 = AuthorProfileScreen$lambda$2(z0Var);
                Object L3 = qVar.L();
                if (L3 == eVar) {
                    L3 = new l(z0Var, 2);
                    qVar.h0(L3);
                }
                io.elevenlabs.readerapp.core.extensions.ComposeExtensionsKt.ShareLinkHandler(AuthorProfileScreen$lambda$2, (ho.a) L3, qVar, 48);
                boolean h11 = qVar.h(authorProfileViewModel4);
                Object L4 = qVar.L();
                if (h11 || L4 == eVar) {
                    final int i19 = 0;
                    L4 = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.e
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z AuthorProfileScreen$lambda$5$0;
                            z AuthorProfileScreen$lambda$8;
                            switch (i19) {
                                case 0:
                                    AuthorProfileScreen$lambda$5$0 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$5$0((AuthorProfileViewModel) authorProfileViewModel4, (String) obj, (String) obj2);
                                    return AuthorProfileScreen$lambda$5$0;
                                default:
                                    AuthorProfileScreen$lambda$8 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$8((ho.p) authorProfileViewModel4, (u2.m) obj, ((Integer) obj2).intValue());
                                    return AuthorProfileScreen$lambda$8;
                            }
                        }
                    };
                    qVar.h0(L4);
                }
                ho.p pVar2 = (ho.p) L4;
                boolean h12 = qVar.h(authorProfileViewModel4);
                Object L5 = qVar.L();
                if (h12 || L5 == eVar) {
                    L5 = new i(0, authorProfileViewModel4);
                    qVar.h0(L5);
                }
                ho.l lVar3 = (ho.l) L5;
                Object L6 = qVar.L();
                if (L6 == eVar) {
                    L6 = new b(z0Var, 2);
                    qVar.h0(L6);
                }
                final int i20 = 1;
                int i21 = i18 << 3;
                AuthorProfileScreenUi(authorProfileState, a11, aVar2, lVar2, pVar2, lVar3, (ho.l) L6, c3.k.d(-1116368242, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.e
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z AuthorProfileScreen$lambda$5$0;
                        z AuthorProfileScreen$lambda$8;
                        switch (i20) {
                            case 0:
                                AuthorProfileScreen$lambda$5$0 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$5$0((AuthorProfileViewModel) pVar, (String) obj, (String) obj2);
                                return AuthorProfileScreen$lambda$5$0;
                            default:
                                AuthorProfileScreen$lambda$8 = AuthorProfileScreenKt.AuthorProfileScreen$lambda$8((ho.p) pVar, (u2.m) obj, ((Integer) obj2).intValue());
                                return AuthorProfileScreen$lambda$8;
                        }
                    }
                }, qVar), qVar, (i21 & 896) | 14155840 | (i21 & 7168), 0);
                qVar = qVar;
                authorProfileViewModel3 = authorProfileViewModel4;
            }
        } else {
            qVar.R();
            authorProfileViewModel3 = authorProfileViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(str, aVar, lVar, pVar, (MviViewModel) authorProfileViewModel3, i10, i11, 5);
        }
    }

    private static final String AuthorProfileScreen$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z AuthorProfileScreen$lambda$4$0(z0 z0Var) {
        z0Var.setValue(null);
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$5$0(AuthorProfileViewModel authorProfileViewModel, String str, String str2) {
        str.getClass();
        str2.getClass();
        authorProfileViewModel.onSortChange(str, str2);
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$6$0(AuthorProfileViewModel authorProfileViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(authorProfileViewModel);
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$7$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$8(ho.p pVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            boolean f10 = qVar.f(pVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new b(pVar, 1);
                qVar.h0(L);
            }
            MiniPlayerKt.m1520MiniPlayerGSIvlCE(u.P, false, 0L, (ho.l) L, null, qVar, 48, 21);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$8$0$0(ho.p pVar, String str) {
        str.getClass();
        pVar.invoke(str, Analytics.Event.PlayerActivationSource.Mini);
        return z.f31622a;
    }

    public static final z AuthorProfileScreen$lambda$9(String str, ho.a aVar, ho.l lVar, ho.p pVar, AuthorProfileViewModel authorProfileViewModel, int i10, int i11, u2.m mVar, int i12) {
        AuthorProfileScreen(str, aVar, lVar, pVar, authorProfileViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AuthorProfileScreenUi(final AuthorProfileState authorProfileState, final ua.b bVar, ho.a aVar, ho.l lVar, ho.p pVar, ho.l lVar2, ho.l lVar3, ho.p pVar2, u2.m mVar, int i10, int i11) {
        int i12;
        final ho.l lVar4;
        int i13;
        int i14;
        ho.p pVar3;
        int i15;
        int i16;
        ho.l lVar5;
        int i17;
        int i18;
        ho.l lVar6;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z6;
        q qVar;
        ho.p pVar4;
        final ho.p pVar5;
        ho.l lVar7;
        ho.l lVar8;
        r1 r10;
        final ho.l lVar9;
        final ho.l lVar10;
        final ho.p pVar6;
        int i23;
        boolean h10;
        int i24;
        int i25;
        q qVar2 = (q) mVar;
        qVar2.Z(-140016279);
        if ((i10 & 6) == 0) {
            if (qVar2.h(authorProfileState)) {
                i25 = 4;
            } else {
                i25 = 2;
            }
            i12 = i25 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h10 = qVar2.f(bVar);
            } else {
                h10 = qVar2.h(bVar);
            }
            if (h10) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i12 |= i24;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
                i23 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i23 = 128;
            }
            i12 |= i23;
        }
        int i26 = i11 & 8;
        if (i26 != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            lVar4 = lVar;
            if (qVar2.h(lVar4)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
            i14 = i11 & 16;
            if (i14 == 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                pVar3 = pVar;
                if (qVar2.h(pVar3)) {
                    i15 = 16384;
                } else {
                    i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i12 |= i15;
                i16 = i11 & 32;
                if (i16 != 0) {
                    i12 |= 196608;
                } else if ((196608 & i10) == 0) {
                    lVar5 = lVar2;
                    if (qVar2.h(lVar5)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                    i18 = i11 & 64;
                    if (i18 == 0) {
                        i12 |= 1572864;
                    } else if ((1572864 & i10) == 0) {
                        lVar6 = lVar3;
                        if (qVar2.h(lVar6)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i12 |= i19;
                        i20 = i11 & 128;
                        if (i20 != 0) {
                            i21 = i12 | 12582912;
                        } else {
                            int i27 = i12;
                            if ((i10 & 12582912) == 0) {
                                if (qVar2.h(pVar2)) {
                                    i22 = 8388608;
                                } else {
                                    i22 = 4194304;
                                }
                                i21 = i27 | i22;
                            } else {
                                i21 = i27;
                            }
                        }
                        if ((i21 & 4793491) != 4793490) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i21 & 1, z6)) {
                            Object obj = u2.l.f33918a;
                            if (i26 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new r0(28);
                                    qVar2.h0(L);
                                }
                                lVar4 = (ho.l) L;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.assistant.components.c(23);
                                    qVar2.h0(L2);
                                }
                                pVar5 = (ho.p) L2;
                            } else {
                                pVar5 = pVar3;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj) {
                                    L3 = new r0(29);
                                    qVar2.h0(L3);
                                }
                                lVar9 = (ho.l) L3;
                            } else {
                                lVar9 = lVar5;
                            }
                            if (i18 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == obj) {
                                    L4 = new f(0);
                                    qVar2.h0(L4);
                                }
                                lVar10 = (ho.l) L4;
                            } else {
                                lVar10 = lVar6;
                            }
                            if (i20 != 0) {
                                pVar6 = ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1306getLambda$690191985$app_productionRelease();
                            } else {
                                pVar6 = pVar2;
                            }
                            qVar = qVar2;
                            k5.a(null, c3.k.d(607128365, true, new d(1, aVar), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(-1498981192, true, new ho.q() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.author.g
                                @Override // ho.q
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    z AuthorProfileScreenUi$lambda$5;
                                    int intValue = ((Integer) obj4).intValue();
                                    AuthorProfileScreenUi$lambda$5 = AuthorProfileScreenKt.AuthorProfileScreenUi$lambda$5(AuthorProfileState.this, lVar9, bVar, lVar4, pVar5, lVar10, pVar6, (z1) obj2, (u2.m) obj3, intValue);
                                    return AuthorProfileScreenUi$lambda$5;
                                }
                            }, qVar2), qVar, 805306416, 509);
                            pVar4 = pVar6;
                            lVar8 = lVar10;
                            lVar7 = lVar9;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            pVar4 = pVar2;
                            pVar5 = pVar3;
                            lVar7 = lVar5;
                            lVar8 = lVar6;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new x(authorProfileState, bVar, aVar, lVar4, pVar5, lVar7, lVar8, pVar4, i10, i11);
                            return;
                        }
                        return;
                    }
                    lVar6 = lVar3;
                    i20 = i11 & 128;
                    if (i20 != 0) {
                    }
                    if ((i21 & 4793491) != 4793490) {
                    }
                    if (qVar2.O(i21 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                lVar5 = lVar2;
                i18 = i11 & 64;
                if (i18 == 0) {
                }
                lVar6 = lVar3;
                i20 = i11 & 128;
                if (i20 != 0) {
                }
                if ((i21 & 4793491) != 4793490) {
                }
                if (qVar2.O(i21 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            pVar3 = pVar;
            i16 = i11 & 32;
            if (i16 != 0) {
            }
            lVar5 = lVar2;
            i18 = i11 & 64;
            if (i18 == 0) {
            }
            lVar6 = lVar3;
            i20 = i11 & 128;
            if (i20 != 0) {
            }
            if ((i21 & 4793491) != 4793490) {
            }
            if (qVar2.O(i21 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        lVar4 = lVar;
        i14 = i11 & 16;
        if (i14 == 0) {
        }
        pVar3 = pVar;
        i16 = i11 & 32;
        if (i16 != 0) {
        }
        lVar5 = lVar2;
        i18 = i11 & 64;
        if (i18 == 0) {
        }
        lVar6 = lVar3;
        i20 = i11 & 128;
        if (i20 != 0) {
        }
        if ((i21 & 4793491) != 4793490) {
        }
        if (qVar2.O(i21 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z AuthorProfileScreenUi$lambda$0$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$1$0(String str, String str2) {
        str.getClass();
        str2.getClass();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$2$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$3$0(String str) {
        str.getClass();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$4(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ho.p m1307getLambda$713021463$app_productionRelease = ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1307getLambda$713021463$app_productionRelease();
            c3.j d10 = c3.k.d(-2031153625, true, new d(0, aVar), qVar);
            float f10 = v7.f27814a;
            u7 a10 = v7.a((f0) qVar.j(g0.f27130a));
            q2.s.c(m1307getLambda$713021463$app_productionRelease, null, d10, null, u.P, null, a10.a(p3.x.f26437l, a10.f27776b, a10.f27777c, a10.f27778d, a10.f27779e, a10.f27780f), qVar, 390);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$4$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, (String) null, c3.k.d(1260593516, true, new h(aVar, 2), qVar), (ho.q) null, (i3.f) null, qVar, 384, 27);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$4$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5(AuthorProfileState authorProfileState, ho.l lVar, ua.b bVar, ho.l lVar2, ho.p pVar, ho.l lVar3, ho.p pVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        q qVar;
        int i12;
        String str;
        int i13;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((q) mVar).f(z1Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i10 | i13;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar2 = (q) mVar;
        if (qVar2.O(i11 & 1, z6)) {
            i3.q qVar3 = i3.q.f13017a;
            t D = r1.d.D(p2.d(qVar3, 1.0f), z1Var);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            t c5 = i3.a.c(D, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar = h4.g.f11907f;
            r.J(eVar, d10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            r.J(eVar4, c5, qVar2);
            if (authorProfileState.isLoadingProfile() && authorProfileState.getAuthor() == null) {
                qVar2.X(1966941118);
                t d11 = p2.d(qVar3, 1.0f);
                f1 d12 = r1.p.d(i3.d.f13001e, false);
                int hashCode2 = Long.hashCode(qVar2.T);
                c3.o l7 = qVar2.l();
                t c10 = i3.a.c(d11, qVar2);
                qVar2.b0();
                if (qVar2.S) {
                    qVar2.k(fVar);
                } else {
                    qVar2.k0();
                }
                r.J(eVar, d12, qVar2);
                r.J(eVar2, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                r.J(eVar4, c10, qVar2);
                LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar2, 0, 15);
                qVar = qVar2;
                qVar.p(true);
                qVar.p(false);
            } else {
                qVar = qVar2;
                String errorMessage = authorProfileState.getErrorMessage();
                u2.e eVar5 = u2.l.f33918a;
                if (errorMessage != null && authorProfileState.getAuthor() == null) {
                    qVar.X(1967252637);
                    t d13 = p2.d(qVar3, 1.0f);
                    String errorMessage2 = authorProfileState.getErrorMessage();
                    boolean f10 = qVar.f(lVar);
                    Object L = qVar.L();
                    if (f10 || L == eVar5) {
                        L = new l(lVar, 0);
                        qVar.h0(L);
                    }
                    ErrorScreenKt.m1837ErrorScreenuDo3WH8(d13, null, errorMessage2, 0L, (ho.a) L, qVar, 6, 10);
                    qVar.p(false);
                } else if (authorProfileState.getAuthor() != null) {
                    qVar.X(1967555104);
                    AuthorProfile author = authorProfileState.getAuthor();
                    SelectedSubpage selectedSubpage = authorProfileState.getSelectedSubpage();
                    if (selectedSubpage != null) {
                        i12 = selectedSubpage.getIndex();
                    } else {
                        i12 = 0;
                    }
                    SelectedSubpage selectedSubpage2 = authorProfileState.getSelectedSubpage();
                    if (selectedSubpage2 != null) {
                        str = selectedSubpage2.getId();
                    } else {
                        str = null;
                    }
                    String str2 = str;
                    Map<String, String> currentSubpageSortKeys = authorProfileState.getCurrentSubpageSortKeys();
                    boolean isFollowOperationInFlight = authorProfileState.isFollowOperationInFlight();
                    boolean f11 = qVar.f(lVar);
                    Object L2 = qVar.L();
                    if (f11 || L2 == eVar5) {
                        L2 = new b(lVar, 3);
                        qVar.h0(L2);
                    }
                    ho.l lVar4 = (ho.l) L2;
                    boolean f12 = qVar.f(lVar);
                    Object L3 = qVar.L();
                    if (f12 || L3 == eVar5) {
                        L3 = new l(lVar, 1);
                        qVar.h0(L3);
                    }
                    AuthorProfileContent(author, bVar, i12, str2, currentSubpageSortKeys, isFollowOperationInFlight, lVar4, (ho.a) L3, lVar2, pVar, lVar3, pVar2, qVar, 64, 0);
                    qVar.p(false);
                } else {
                    qVar.X(1968414672);
                    qVar.p(false);
                }
            }
            qVar.p(true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$1$0(ho.l lVar) {
        lVar.invoke(new f(2));
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$1$0$0(AuthorProfileViewModel authorProfileViewModel) {
        authorProfileViewModel.getClass();
        authorProfileViewModel.onRetry();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$2$0(ho.l lVar, int i10) {
        lVar.invoke(new io.elevenlabs.highlighter.t(i10, 10));
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$2$0$0(int i10, AuthorProfileViewModel authorProfileViewModel) {
        authorProfileViewModel.getClass();
        authorProfileViewModel.selectTab(i10);
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$3$0(ho.l lVar) {
        lVar.invoke(new f(1));
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$5$0$3$0$0(AuthorProfileViewModel authorProfileViewModel) {
        authorProfileViewModel.getClass();
        authorProfileViewModel.onFollowToggle();
        return z.f31622a;
    }

    public static final z AuthorProfileScreenUi$lambda$6(AuthorProfileState authorProfileState, ua.b bVar, ho.a aVar, ho.l lVar, ho.p pVar, ho.l lVar2, ho.l lVar3, ho.p pVar2, int i10, int i11, u2.m mVar, int i12) {
        AuthorProfileScreenUi(authorProfileState, bVar, aVar, lVar, pVar, lVar2, lVar3, pVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1980136782);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1309getLambda$990775964$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 3);
        }
    }

    public static final z Preview_AuthorProfileScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_Error(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1313472510);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1304getLambda$207369576$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 4);
        }
    }

    public static final z Preview_AuthorProfileScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_Loading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_MinimalAuthor(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1575863506);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.getLambda$1673709288$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 7);
        }
    }

    public static final z Preview_AuthorProfileScreen_MinimalAuthor$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_MinimalAuthor(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_NoContent(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1222268994);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.getLambda$885728468$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 5);
        }
    }

    public static final z Preview_AuthorProfileScreen_NoContent$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_NoContent(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_SubpageLoading(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-656031449);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1303getLambda$1917779503$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 0);
        }
    }

    public static final z Preview_AuthorProfileScreen_SubpageLoading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_SubpageLoading(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_WithBooks(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1246315722);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1308getLambda$940654112$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 2);
        }
    }

    public static final z Preview_AuthorProfileScreen_WithBooks$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_WithBooks(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_WithSubpagesBooks(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-107371354);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.getLambda$710126524$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 6);
        }
    }

    public static final z Preview_AuthorProfileScreen_WithSubpagesBooks$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_WithSubpagesBooks(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_AuthorProfileScreen_WithSubpagesSeries(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(369554235);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$AuthorProfileScreenKt.INSTANCE.m1305getLambda$57815323$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c(i10, 1);
        }
    }

    public static final z Preview_AuthorProfileScreen_WithSubpagesSeries$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_AuthorProfileScreen_WithSubpagesSeries(mVar, r.M(i10 | 1));
        return z.f31622a;
    }
}
