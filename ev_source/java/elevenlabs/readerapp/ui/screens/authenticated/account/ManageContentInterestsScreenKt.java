package io.elevenlabs.readerapp.ui.screens.authenticated.account;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import f4.f1;
import io.elevenlabs.domain.model.InterestsAnswer;
import io.elevenlabs.domain.model.InterestsQuestion;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.ui.screens.authenticated.account.components.ContentInterestGridItemKt;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ErrorScreenKt;
import io.elevenlabs.ui.components.FullWidthButtonKt;
import io.elevenlabs.ui.components.FullWidthButtonSize;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.k5;
import r1.d2;
import r1.l2;
import r1.p2;
import r1.u0;
import r1.z1;
import rd.c1;
import sn.z;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a'\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001ac\u0010\u000f\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u000f\u0010\u001a\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u000f\u0010\u001b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001c²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsViewModel;", "vm", "ManageContentInterestsScreen", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "onRetryClick", "Lkotlin/Function2;", "Lio/elevenlabs/domain/model/InterestsQuestion;", "", "onInterestClick", "onSaveClick", "ManageContentInterestsUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsState;Lho/a;Lho/a;Lho/p;Lho/a;Lu2/m;II)V", "Li3/t;", "modifier", "onToggle", "Content", "(Li3/t;Lio/elevenlabs/readerapp/ui/screens/authenticated/account/ManageContentInterestsState;Lho/p;Lu2/m;II)V", "previewQuestion", "()Lio/elevenlabs/domain/model/InterestsQuestion;", "Preview_ManageContentInterestsScreen_Loaded", "(Lu2/m;I)V", "Preview_ManageContentInterestsScreen_Loading", "Preview_ManageContentInterestsScreen_Error", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ManageContentInterestsScreenKt {
    private static final void Content(i3.t tVar, final ManageContentInterestsState manageContentInterestsState, final ho.p pVar, u2.m mVar, final int i10, final int i11) {
        i3.t tVar2;
        int i12;
        int i13;
        ManageContentInterestsState manageContentInterestsState2;
        boolean z6;
        ho.p pVar2;
        final i3.t tVar3;
        r1 r10;
        ho.p pVar3;
        int i14;
        final i3.t tVar4;
        boolean z10;
        int i15;
        int i16;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-175911741);
        int i17 = i11 & 1;
        if (i17 != 0) {
            i12 = i10 | 6;
            tVar2 = tVar;
        } else if ((i10 & 6) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            tVar2 = tVar;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            manageContentInterestsState2 = manageContentInterestsState;
            if (qVar.h(manageContentInterestsState2)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        } else {
            manageContentInterestsState2 = manageContentInterestsState;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            if (i17 != 0) {
                tVar4 = i3.q.f13017a;
                i14 = 2;
            } else {
                i14 = 2;
                tVar4 = tVar2;
            }
            InterestsQuestion question = manageContentInterestsState2.getQuestion();
            if (question == null) {
                r10 = qVar.r();
                if (r10 != null) {
                    final int i18 = 0;
                    pVar3 = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.s
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            z Content$lambda$0;
                            z Content$lambda$2;
                            switch (i18) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    Content$lambda$0 = ManageContentInterestsScreenKt.Content$lambda$0(tVar4, manageContentInterestsState, pVar, i10, i11, (u2.m) obj, intValue);
                                    return Content$lambda$0;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    Content$lambda$2 = ManageContentInterestsScreenKt.Content$lambda$2(tVar4, manageContentInterestsState, pVar, i10, i11, (u2.m) obj, intValue2);
                                    return Content$lambda$2;
                            }
                        }
                    };
                    r10.f34012d = pVar3;
                }
                return;
            }
            i3.t tVar5 = tVar4;
            pVar2 = pVar;
            u1.c cVar = new u1.c(i14);
            i3.t d10 = p2.d(tVar5, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i19 = EchoTheme.$stable;
            d2 d2Var = new d2(echoTheme.getSpacings(qVar, i19).getX5(), echoTheme.getSpacings(qVar, i19).getX6(), echoTheme.getSpacings(qVar, i19).getX5(), echoTheme.getSpacings(qVar, i19).getX6());
            u0 u0Var = r1.j.f29228a;
            r1.h g10 = r1.j.g(echoTheme.getSpacings(qVar, i19).getX5());
            r1.h g11 = r1.j.g(echoTheme.getSpacings(qVar, i19).getX5());
            boolean h10 = qVar.h(question);
            if ((i12 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = h10 | z10;
            Object L = qVar.L();
            if (z11 || L == u2.l.f33918a) {
                L = new i(question, pVar2, i14);
                qVar.h0(L);
            }
            tb.a.e(cVar, d10, null, d2Var, g10, g11, null, false, null, (ho.l) L, qVar, 0, 0, 916);
            tVar3 = tVar5;
        } else {
            pVar2 = pVar;
            qVar.R();
            tVar3 = tVar2;
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i20 = 1;
            final ho.p pVar4 = pVar2;
            pVar3 = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.s
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    z Content$lambda$0;
                    z Content$lambda$2;
                    switch (i20) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            Content$lambda$0 = ManageContentInterestsScreenKt.Content$lambda$0(tVar3, manageContentInterestsState, pVar4, i10, i11, (u2.m) obj, intValue);
                            return Content$lambda$0;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            Content$lambda$2 = ManageContentInterestsScreenKt.Content$lambda$2(tVar3, manageContentInterestsState, pVar4, i10, i11, (u2.m) obj, intValue2);
                            return Content$lambda$2;
                    }
                }
            };
            r10.f34012d = pVar3;
        }
    }

    public static final z Content$lambda$0(i3.t tVar, ManageContentInterestsState manageContentInterestsState, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        Content(tVar, manageContentInterestsState, pVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$2] */
    public static final z Content$lambda$1$0(final InterestsQuestion interestsQuestion, final ho.p pVar, u1.w wVar) {
        wVar.getClass();
        j jVar = new j(29);
        ComposableSingletons$ManageContentInterestsScreenKt composableSingletons$ManageContentInterestsScreenKt = ComposableSingletons$ManageContentInterestsScreenKt.INSTANCE;
        u1.w.a(wVar, jVar, composableSingletons$ManageContentInterestsScreenKt.getLambda$1103809167$app_productionRelease());
        u1.w.a(wVar, new t(0), composableSingletons$ManageContentInterestsScreenKt.getLambda$735168184$app_productionRelease());
        final List<InterestsAnswer> answers = interestsQuestion.getAnswers();
        final t tVar = new t(1);
        final ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$1 manageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((InterestsAnswer) obj);
            }

            @Override // ho.l
            public final Void invoke(InterestsAnswer interestsAnswer) {
                return null;
            }
        };
        ((u1.j) wVar).t(answers.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(answers.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$4
            public final Object invoke(int i10) {
                return ho.l.this.invoke(answers.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$lambda$1$0$$inlined$items$default$5
            public final void invoke(u1.m mVar, int i10, u2.m mVar2, int i11) {
                int i12;
                boolean z6;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar2).f(mVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i14 | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    if (((u2.q) mVar2).d(i10)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                u2.q qVar = (u2.q) mVar2;
                if (qVar.O(i12 & 1, z6)) {
                    final InterestsAnswer interestsAnswer = (InterestsAnswer) answers.get(i10);
                    qVar.X(1702806070);
                    boolean selected = interestsAnswer.getSelected();
                    String title = interestsAnswer.getTitle();
                    String icon = interestsAnswer.getIcon();
                    boolean f10 = qVar.f(pVar) | qVar.h(interestsQuestion) | qVar.h(interestsAnswer);
                    Object L = qVar.L();
                    if (f10 || L == u2.l.f33918a) {
                        final ho.p pVar2 = pVar;
                        final InterestsQuestion interestsQuestion2 = interestsQuestion;
                        L = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.account.ManageContentInterestsScreenKt$Content$1$1$4$1$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1232invoke() {
                                ho.p.this.invoke(interestsQuestion2, interestsAnswer.getKey());
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1232invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ContentInterestGridItemKt.ContentInterestGridItem(selected, title, icon, (ho.a) L, null, qVar, 0, 16);
                    qVar.p(false);
                    return;
                }
                qVar.R();
            }

            @Override // ho.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((u1.m) obj, ((Number) obj2).intValue(), (u2.m) obj3, ((Number) obj4).intValue());
                return z.f31622a;
            }
        }, true, -1117249557));
        return z.f31622a;
    }

    public static final u1.e Content$lambda$1$0$0(u1.o oVar) {
        oVar.getClass();
        return new u1.e(wn.e.a(2));
    }

    public static final u1.e Content$lambda$1$0$1(u1.o oVar) {
        oVar.getClass();
        return new u1.e(wn.e.a(2));
    }

    public static final Object Content$lambda$1$0$2(InterestsAnswer interestsAnswer) {
        interestsAnswer.getClass();
        return interestsAnswer.getKey();
    }

    public static final z Content$lambda$2(i3.t tVar, ManageContentInterestsState manageContentInterestsState, ho.p pVar, int i10, int i11, u2.m mVar, int i12) {
        Content(tVar, manageContentInterestsState, pVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManageContentInterestsScreen(ho.a aVar, ManageContentInterestsViewModel manageContentInterestsViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        boolean z6;
        u2.q qVar;
        ManageContentInterestsViewModel manageContentInterestsViewModel2;
        u2.q qVar2;
        q7.c cVar;
        ManageContentInterestsViewModel manageContentInterestsViewModel3;
        boolean h10;
        Object L;
        boolean h11;
        Object L2;
        boolean h12;
        Object L3;
        boolean h13;
        Object L4;
        int i13;
        int i14;
        aVar.getClass();
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(-1933424397);
        if ((i10 & 6) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0 && qVar3.h(manageContentInterestsViewModel)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        boolean z10 = true;
        if ((i12 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar3.O(i12 & 1, z6)) {
            qVar3.T();
            if ((i10 & 1) != 0 && !qVar3.y()) {
                qVar3.R();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    manageContentInterestsViewModel3 = manageContentInterestsViewModel;
                    qVar2 = qVar3;
                    qVar2.q();
                    z0 m10 = c1.m(manageContentInterestsViewModel3.getStateFlow(), qVar2, 0);
                    Boolean valueOf = Boolean.valueOf(ManageContentInterestsScreen$lambda$0(m10).getSubmitted());
                    boolean f10 = qVar2.f(m10);
                    if ((i12 & 14) != 4) {
                    }
                    h10 = f10 | z10 | qVar2.h(manageContentInterestsViewModel3);
                    L = qVar2.L();
                    Object obj = u2.l.f33918a;
                    if (!h10) {
                    }
                    L = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$1$1(aVar, manageContentInterestsViewModel3, m10, null);
                    qVar2.h0(L);
                    u2.r.f((ho.p) L, valueOf, qVar2);
                    ManageContentInterestsState ManageContentInterestsScreen$lambda$0 = ManageContentInterestsScreen$lambda$0(m10);
                    h11 = qVar2.h(manageContentInterestsViewModel3);
                    L2 = qVar2.L();
                    if (!h11) {
                    }
                    L2 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$2$1(manageContentInterestsViewModel3);
                    qVar2.h0(L2);
                    ho.a aVar2 = (ho.a) L2;
                    h12 = qVar2.h(manageContentInterestsViewModel3);
                    L3 = qVar2.L();
                    if (!h12) {
                    }
                    L3 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1(manageContentInterestsViewModel3);
                    qVar2.h0(L3);
                    ho.p pVar = (ho.p) L3;
                    h13 = qVar2.h(manageContentInterestsViewModel3);
                    L4 = qVar2.L();
                    if (!h13) {
                    }
                    L4 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$4$1(manageContentInterestsViewModel3);
                    qVar2.h0(L4);
                    u2.q qVar4 = qVar2;
                    ManageContentInterestsUI(ManageContentInterestsScreen$lambda$0, aVar, aVar2, pVar, (ho.a) L4, qVar4, (i12 << 3) & 112, 0);
                    qVar = qVar4;
                    manageContentInterestsViewModel2 = manageContentInterestsViewModel3;
                }
                qVar2 = qVar3;
                manageContentInterestsViewModel3 = manageContentInterestsViewModel;
                qVar2.q();
                z0 m102 = c1.m(manageContentInterestsViewModel3.getStateFlow(), qVar2, 0);
                Boolean valueOf2 = Boolean.valueOf(ManageContentInterestsScreen$lambda$0(m102).getSubmitted());
                boolean f102 = qVar2.f(m102);
                if ((i12 & 14) != 4) {
                }
                h10 = f102 | z10 | qVar2.h(manageContentInterestsViewModel3);
                L = qVar2.L();
                Object obj2 = u2.l.f33918a;
                if (!h10) {
                }
                L = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$1$1(aVar, manageContentInterestsViewModel3, m102, null);
                qVar2.h0(L);
                u2.r.f((ho.p) L, valueOf2, qVar2);
                ManageContentInterestsState ManageContentInterestsScreen$lambda$02 = ManageContentInterestsScreen$lambda$0(m102);
                h11 = qVar2.h(manageContentInterestsViewModel3);
                L2 = qVar2.L();
                if (!h11) {
                }
                L2 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$2$1(manageContentInterestsViewModel3);
                qVar2.h0(L2);
                ho.a aVar22 = (ho.a) L2;
                h12 = qVar2.h(manageContentInterestsViewModel3);
                L3 = qVar2.L();
                if (!h12) {
                }
                L3 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1(manageContentInterestsViewModel3);
                qVar2.h0(L3);
                ho.p pVar2 = (ho.p) L3;
                h13 = qVar2.h(manageContentInterestsViewModel3);
                L4 = qVar2.L();
                if (!h13) {
                }
                L4 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$4$1(manageContentInterestsViewModel3);
                qVar2.h0(L4);
                u2.q qVar42 = qVar2;
                ManageContentInterestsUI(ManageContentInterestsScreen$lambda$02, aVar, aVar22, pVar2, (ho.a) L4, qVar42, (i12 << 3) & 112, 0);
                qVar = qVar42;
                manageContentInterestsViewModel2 = manageContentInterestsViewModel3;
            } else {
                if ((i11 & 2) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar3);
                    if (a10 != null) {
                        qVar2 = qVar3;
                        pl.f o6 = tb.a.o(a10, qVar2);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        i12 &= -113;
                        manageContentInterestsViewModel3 = (ManageContentInterestsViewModel) gg.b.j0(e0.f20562a.b(ManageContentInterestsViewModel.class), a10, null, o6, cVar, qVar2);
                        qVar2.q();
                        z0 m1022 = c1.m(manageContentInterestsViewModel3.getStateFlow(), qVar2, 0);
                        Boolean valueOf22 = Boolean.valueOf(ManageContentInterestsScreen$lambda$0(m1022).getSubmitted());
                        boolean f1022 = qVar2.f(m1022);
                        if ((i12 & 14) != 4) {
                            z10 = false;
                        }
                        h10 = f1022 | z10 | qVar2.h(manageContentInterestsViewModel3);
                        L = qVar2.L();
                        Object obj22 = u2.l.f33918a;
                        if (!h10 || L == obj22) {
                            L = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$1$1(aVar, manageContentInterestsViewModel3, m1022, null);
                            qVar2.h0(L);
                        }
                        u2.r.f((ho.p) L, valueOf22, qVar2);
                        ManageContentInterestsState ManageContentInterestsScreen$lambda$022 = ManageContentInterestsScreen$lambda$0(m1022);
                        h11 = qVar2.h(manageContentInterestsViewModel3);
                        L2 = qVar2.L();
                        if (!h11 || L2 == obj22) {
                            L2 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$2$1(manageContentInterestsViewModel3);
                            qVar2.h0(L2);
                        }
                        ho.a aVar222 = (ho.a) L2;
                        h12 = qVar2.h(manageContentInterestsViewModel3);
                        L3 = qVar2.L();
                        if (!h12 || L3 == obj22) {
                            L3 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1(manageContentInterestsViewModel3);
                            qVar2.h0(L3);
                        }
                        ho.p pVar22 = (ho.p) L3;
                        h13 = qVar2.h(manageContentInterestsViewModel3);
                        L4 = qVar2.L();
                        if (!h13 || L4 == obj22) {
                            L4 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$4$1(manageContentInterestsViewModel3);
                            qVar2.h0(L4);
                        }
                        u2.q qVar422 = qVar2;
                        ManageContentInterestsUI(ManageContentInterestsScreen$lambda$022, aVar, aVar222, pVar22, (ho.a) L4, qVar422, (i12 << 3) & 112, 0);
                        qVar = qVar422;
                        manageContentInterestsViewModel2 = manageContentInterestsViewModel3;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar2 = qVar3;
                manageContentInterestsViewModel3 = manageContentInterestsViewModel;
                qVar2.q();
                z0 m10222 = c1.m(manageContentInterestsViewModel3.getStateFlow(), qVar2, 0);
                Boolean valueOf222 = Boolean.valueOf(ManageContentInterestsScreen$lambda$0(m10222).getSubmitted());
                boolean f10222 = qVar2.f(m10222);
                if ((i12 & 14) != 4) {
                }
                h10 = f10222 | z10 | qVar2.h(manageContentInterestsViewModel3);
                L = qVar2.L();
                Object obj222 = u2.l.f33918a;
                if (!h10) {
                }
                L = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$1$1(aVar, manageContentInterestsViewModel3, m10222, null);
                qVar2.h0(L);
                u2.r.f((ho.p) L, valueOf222, qVar2);
                ManageContentInterestsState ManageContentInterestsScreen$lambda$0222 = ManageContentInterestsScreen$lambda$0(m10222);
                h11 = qVar2.h(manageContentInterestsViewModel3);
                L2 = qVar2.L();
                if (!h11) {
                }
                L2 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$2$1(manageContentInterestsViewModel3);
                qVar2.h0(L2);
                ho.a aVar2222 = (ho.a) L2;
                h12 = qVar2.h(manageContentInterestsViewModel3);
                L3 = qVar2.L();
                if (!h12) {
                }
                L3 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$3$1(manageContentInterestsViewModel3);
                qVar2.h0(L3);
                ho.p pVar222 = (ho.p) L3;
                h13 = qVar2.h(manageContentInterestsViewModel3);
                L4 = qVar2.L();
                if (!h13) {
                }
                L4 = new ManageContentInterestsScreenKt$ManageContentInterestsScreen$4$1(manageContentInterestsViewModel3);
                qVar2.h0(L4);
                u2.q qVar4222 = qVar2;
                ManageContentInterestsUI(ManageContentInterestsScreen$lambda$0222, aVar, aVar2222, pVar222, (ho.a) L4, qVar4222, (i12 << 3) & 112, 0);
                qVar = qVar4222;
                manageContentInterestsViewModel2 = manageContentInterestsViewModel3;
            }
        } else {
            qVar = qVar3;
            qVar.R();
            manageContentInterestsViewModel2 = manageContentInterestsViewModel;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.p(aVar, manageContentInterestsViewModel2, i10, i11, 7);
        }
    }

    public static final ManageContentInterestsState ManageContentInterestsScreen$lambda$0(s2 s2Var) {
        return (ManageContentInterestsState) s2Var.getValue();
    }

    public static final z ManageContentInterestsScreen$lambda$5(ho.a aVar, ManageContentInterestsViewModel manageContentInterestsViewModel, int i10, int i11, u2.m mVar, int i12) {
        ManageContentInterestsScreen(aVar, manageContentInterestsViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ManageContentInterestsUI(ManageContentInterestsState manageContentInterestsState, ho.a aVar, ho.a aVar2, ho.p pVar, ho.a aVar3, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar4;
        int i13;
        int i14;
        ho.a aVar5;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z6;
        u2.q qVar;
        ho.p pVar2;
        ho.a aVar6;
        ho.a aVar7;
        ho.a aVar8;
        r1 r10;
        int i20;
        ho.a aVar9;
        ho.a aVar10;
        ho.p pVar3;
        ho.a aVar11;
        int i21;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1780684520);
        if ((i10 & 6) == 0) {
            if (qVar2.h(manageContentInterestsState)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar4 = aVar;
            if (qVar2.h(aVar4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                aVar5 = aVar2;
                if (qVar2.h(aVar5)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (qVar2.h(pVar)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    i18 = i11 & 16;
                    if (i18 == 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (qVar2.h(aVar3)) {
                            i19 = 16384;
                        } else {
                            i19 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i12 |= i19;
                        if ((i12 & 9363) != 9362) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (qVar2.O(i12 & 1, z6)) {
                            Object obj = u2.l.f33918a;
                            if (i22 != 0) {
                                Object L = qVar2.L();
                                if (L == obj) {
                                    L = new k(8);
                                    qVar2.h0(L);
                                }
                                aVar9 = (ho.a) L;
                                i20 = i18;
                            } else {
                                i20 = i18;
                                aVar9 = aVar4;
                            }
                            if (i14 != 0) {
                                Object L2 = qVar2.L();
                                if (L2 == obj) {
                                    L2 = new k(9);
                                    qVar2.h0(L2);
                                }
                                aVar10 = (ho.a) L2;
                            } else {
                                aVar10 = aVar5;
                            }
                            if (i16 != 0) {
                                Object L3 = qVar2.L();
                                if (L3 == obj) {
                                    L3 = new l(15);
                                    qVar2.h0(L3);
                                }
                                pVar3 = (ho.p) L3;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i20 != 0) {
                                Object L4 = qVar2.L();
                                if (L4 == obj) {
                                    L4 = new k(10);
                                    qVar2.h0(L4);
                                }
                                aVar11 = (ho.a) L4;
                            } else {
                                aVar11 = aVar3;
                            }
                            aVar7 = aVar10;
                            aVar6 = aVar9;
                            qVar = qVar2;
                            k5.a(null, null, null, null, null, 0, 0L, 0L, null, c3.k.d(-1343160985, true, new io.elevenlabs.readerapp.ui.screens.authenticated.a(manageContentInterestsState, aVar10, aVar9, pVar3, aVar11), qVar2), qVar, 805306368, 511);
                            aVar8 = aVar11;
                            pVar2 = pVar3;
                        } else {
                            qVar = qVar2;
                            qVar.R();
                            pVar2 = pVar;
                            aVar6 = aVar4;
                            aVar7 = aVar5;
                            aVar8 = aVar3;
                        }
                        r10 = qVar.r();
                        if (r10 != null) {
                            r10.f34012d = new io.elevenlabs.readerapp.ui.components.explore.p(manageContentInterestsState, aVar6, aVar7, pVar2, aVar8, i10, i11, 4);
                            return;
                        }
                        return;
                    }
                    if ((i12 & 9363) != 9362) {
                    }
                    if (qVar2.O(i12 & 1, z6)) {
                    }
                    r10 = qVar.r();
                    if (r10 != null) {
                    }
                }
                i18 = i11 & 16;
                if (i18 == 0) {
                }
                if ((i12 & 9363) != 9362) {
                }
                if (qVar2.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 != null) {
                }
            }
            aVar5 = aVar2;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            i18 = i11 & 16;
            if (i18 == 0) {
            }
            if ((i12 & 9363) != 9362) {
            }
            if (qVar2.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 != null) {
            }
        }
        aVar4 = aVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        aVar5 = aVar2;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        i18 = i11 & 16;
        if (i18 == 0) {
        }
        if ((i12 & 9363) != 9362) {
        }
        if (qVar2.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 != null) {
        }
    }

    public static final z ManageContentInterestsUI$lambda$2$0(InterestsQuestion interestsQuestion, String str) {
        interestsQuestion.getClass();
        str.getClass();
        return z.f31622a;
    }

    public static final z ManageContentInterestsUI$lambda$4(ManageContentInterestsState manageContentInterestsState, ho.a aVar, ho.a aVar2, ho.p pVar, ho.a aVar3, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i10 | i12;
        } else {
            i11 = i10;
        }
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i11 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            i3.t d10 = p2.d(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i13 = EchoTheme.$stable;
            i3.t o6 = r1.d.o(r1.d.D(l1.n.h(d10, echoTheme.getColors(qVar, i13).getBackground().getPrimary(qVar, EchoThemeColors.Background.$stable), h0.f26395b), z1Var), z1Var);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar, jVar, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(o6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar);
            u2.q qVar3 = qVar;
            HeaderActionsKt.EchoThemeHeaderActions(null, kj.c.R(qVar, R.string.account_settings_manage_content_interests), c3.k.d(2048096302, true, new p(1, aVar2), qVar), null, qVar3, 384, 9);
            boolean isLoading = manageContentInterestsState.isLoading();
            r1.z zVar = r1.z.f29398a;
            if (isLoading) {
                qVar3.X(-1252265118);
                i3.t c10 = zVar.c(p2.d(qVar2, 1.0f), 1.0f, true);
                f1 d11 = r1.p.d(i3.d.f13001e, false);
                int hashCode2 = Long.hashCode(qVar3.T);
                c3.o l7 = qVar3.l();
                i3.t c11 = i3.a.c(c10, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar2, d11, qVar3);
                u2.r.J(eVar3, l7, qVar3);
                defpackage.f.u(hashCode2, qVar3, eVar4, qVar3, dVar);
                u2.r.J(eVar5, c11, qVar3);
                LoaderKt.LoaderRow(qVar3, 0);
                qVar3.p(true);
                qVar3.p(false);
                z10 = true;
            } else if (manageContentInterestsState.getError() != null) {
                qVar3.X(-1251926412);
                ErrorScreenKt.m1837ErrorScreenuDo3WH8(zVar.c(qVar2, 1.0f, true), null, manageContentInterestsState.getError(), 0L, aVar, qVar3, 0, 10);
                qVar3 = qVar3;
                qVar3.p(false);
                z10 = true;
            } else {
                qVar3.X(-1251655224);
                i3.t d12 = p2.d(qVar2, 1.0f);
                r1.x a11 = r1.w.a(eVar, jVar, qVar3, 0);
                int hashCode3 = Long.hashCode(qVar3.T);
                c3.o l10 = qVar3.l();
                i3.t c12 = i3.a.c(d12, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(fVar);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar2, a11, qVar3);
                u2.r.J(eVar3, l10, qVar3);
                defpackage.f.u(hashCode3, qVar3, eVar4, qVar3, dVar);
                u2.r.J(eVar5, c12, qVar3);
                Content(zVar.c(p2.d(qVar2, 1.0f), 1.0f, true), manageContentInterestsState, pVar, qVar3, 0, 0);
                FullWidthButtonKt.EchoThemeFullWidthButton(kj.c.R(qVar3, R.string.account_settings_content_interests_button_save), aVar3, r1.d.I(r1.d.G(p2.e(qVar2, 1.0f), echoTheme.getSpacings(qVar3, i13).getX5(), t2.u.P, 2), t2.u.P, t2.u.P, t2.u.P, echoTheme.getSpacings(qVar3, i13).getX5(), 7), FullWidthButtonSize.Large, null, null, manageContentInterestsState.isSubmitLoading(), manageContentInterestsState.isSaveButtonEnabled(), false, qVar3, 3072, RCHTTPStatusCodes.NOT_MODIFIED);
                qVar3 = qVar3;
                z10 = true;
                qVar3.p(true);
                qVar3.p(false);
            }
            qVar3.p(z10);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ManageContentInterestsUI$lambda$4$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.EchoThemeBackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z ManageContentInterestsUI$lambda$5(ManageContentInterestsState manageContentInterestsState, ho.a aVar, ho.a aVar2, ho.p pVar, ho.a aVar3, int i10, int i11, u2.m mVar, int i12) {
        ManageContentInterestsUI(manageContentInterestsState, aVar, aVar2, pVar, aVar3, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void Preview_ManageContentInterestsScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1754430532);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ManageContentInterestsUI(new ManageContentInterestsState(false, false, null, false, "Unable to load interests", false, 42, null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 12);
        }
    }

    public static final z Preview_ManageContentInterestsScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ManageContentInterestsScreen_Error(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ManageContentInterestsScreen_Loaded(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(419274827);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ManageContentInterestsUI(new ManageContentInterestsState(false, false, previewQuestion(), false, null, false, 40, null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 11);
        }
    }

    public static final z Preview_ManageContentInterestsScreen_Loaded$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ManageContentInterestsScreen_Loaded(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_ManageContentInterestsScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1667801392);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ManageContentInterestsUI(new ManageContentInterestsState(true, false, null, false, null, false, 58, null), null, null, null, null, qVar, 0, 30);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.c1(i10, 13);
        }
    }

    public static final z Preview_ManageContentInterestsScreen_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_ManageContentInterestsScreen_Loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final InterestsQuestion previewQuestion() {
        return new InterestsQuestion("interests", "What are your interests?", true, ig.f.I(new InterestsAnswer("mystery", "Mystery and Thriller", true, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FGenres%2Fadventre-action.webp?alt=media&token=5c287509-0df8-423c-b557-45ece4673304"), new InterestsAnswer("science", "Science", false, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FGenres%2Fphilosophy.webp?alt=media&token=85407017-867e-4156-afaa-9e8544ec967a"), new InterestsAnswer("business", "Business and Economics", true, "https://firebasestorage.googleapis.com/v0/b/xi-labs.appspot.com/o/readerapp%2FGenres%2Fdystopia.webp?alt=media&token=d6b29595-5912-4af5-9a17-d40925e89581")));
    }
}
