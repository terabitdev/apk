package io.elevenlabs.readerapp.core;

import a2.a2;
import a2.v0;
import a2.z1;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i1.m0;
import i1.y0;
import i3.t;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.highlighter.y;
import io.elevenlabs.readerapp.core.Survey;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.InputKt;
import io.elevenlabs.ui.components.InputState;
import io.elevenlabs.ui.components.SelectableBoxKt;
import io.elevenlabs.ui.components.headers.HeaderKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import r1.p2;
import r1.w;
import r1.x;
import sn.z;
import t2.u;
import u2.q;
import u2.r;
import u2.r1;
import u2.z0;
import y4.d0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a/\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022 \b\u0002\u0010\f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0004\u0012\u00020\u00030\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0014\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00162\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u000bH\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u000f\u0010\u001d\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001f\u0010\u001e¨\u0006\"²\u0006\u0010\u0010 \u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lio/elevenlabs/readerapp/core/Survey;", "survey", "Lkotlin/Function0;", "Lsn/z;", "onDismiss", "Lio/elevenlabs/readerapp/core/SurveyViewModel;", "vm", "SurveySheet", "(Lio/elevenlabs/readerapp/core/Survey;Lho/a;Lio/elevenlabs/readerapp/core/SurveyViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/core/SurveyState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function1;", "action", "onClose", "SurveySheetUI", "(Lio/elevenlabs/readerapp/core/SurveyState;Lho/a;Lho/l;Lho/a;Lu2/m;II)V", "", "Lio/elevenlabs/readerapp/core/Survey$Question$Choice;", "choices", "onSubmit", "SingleSelectQuestionView", "(Ljava/util/List;Lho/l;Lu2/m;I)V", "", "actionText", "", "isMandatory", "placeholder", "OpenQuestionView", "(Ljava/lang/String;ZLjava/lang/String;Lho/l;Lu2/m;I)V", "Preview_SurveySheet_SingleSelect", "(Lu2/m;I)V", "Preview_SurveySheet_Open", "selectedChoice", ParameterNames.TEXT, "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SurveySheetKt {
    private static final void OpenQuestionView(String str, boolean z6, String str2, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z10;
        q qVar;
        InputState inputState;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        int i15;
        ho.l lVar2 = lVar;
        q qVar2 = (q) mVar;
        qVar2.Z(-2086598307);
        if ((i10 & 6) == 0) {
            if (qVar2.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.g(z6)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.f(str2)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(lVar2)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (qVar2.O(i11 & 1, z10)) {
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = r.A("");
                qVar2.h0(L);
            }
            z0 z0Var = (z0) L;
            i3.q qVar3 = i3.q.f13017a;
            t e10 = p2.e(qVar3, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i16 = ElevenLabsTheme.$stable;
            t I = r1.d.I(r1.d.G(e10, elevenLabsTheme.getSpacings(qVar2, i16).m2357getX5D9Ej5fM(), u.P, 2), u.P, 20, u.P, u.P, 13);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar2, 0);
            int hashCode = Long.hashCode(qVar2.T);
            c3.o l4 = qVar2.l();
            t c5 = i3.a.c(I, qVar2);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            r.J(eVar2, a10, qVar2);
            h4.e eVar3 = h4.g.f11906e;
            r.J(eVar3, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            r.y(qVar2, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            r.F(dVar, qVar2);
            h4.e eVar5 = h4.g.f11905d;
            r.J(eVar5, c5, qVar2);
            int i17 = i11;
            float f10 = 230;
            t h10 = p2.h(p2.e(qVar3, 1.0f), u.P, f10, 1);
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode2 = Long.hashCode(qVar2.T);
            c3.o l7 = qVar2.l();
            t c10 = i3.a.c(h10, qVar2);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            r.J(eVar2, d10, qVar2);
            r.J(eVar3, l7, qVar2);
            defpackage.f.u(hashCode2, qVar2, eVar4, qVar2, dVar);
            r.J(eVar5, c10, qVar2);
            String OpenQuestionView$lambda$1 = OpenQuestionView$lambda$1(z0Var);
            if (OpenQuestionView$lambda$1(z0Var).length() > 0) {
                inputState = InputState.Active;
            } else {
                inputState = InputState.Default;
            }
            InputState inputState2 = inputState;
            t h11 = p2.h(qVar3, u.P, f10, 1);
            t d11 = p2.d(qVar3, 1.0f);
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = new b(z0Var, 4);
                qVar2.h0(L2);
            }
            InputKt.Input(OpenQuestionView$lambda$1, (ho.l) L2, h11, d11, inputState2, (String) null, (String) null, str2, (ho.p) null, (a2) null, (z1) null, (d0) null, false, 0, (u2.m) qVar2, ((i17 << 15) & 29360128) | 3504, 384, 12128);
            qVar2.p(true);
            r1.d.g(p2.f(qVar3, elevenLabsTheme.getSpacings(qVar2, i16).m2351getX10D9Ej5fM()), qVar2);
            if (z6 && OpenQuestionView$lambda$1(z0Var).length() <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            ButtonSize buttonSize = ButtonSize.Medium;
            t I2 = r1.d.I(p2.e(qVar3, 1.0f), u.P, u.P, u.P, elevenLabsTheme.getSpacings(qVar2, i16).m2358getX6D9Ej5fM(), 7);
            if ((i17 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object L3 = qVar2.L();
            if (!z12 && L3 != eVar) {
                lVar2 = lVar;
            } else {
                lVar2 = lVar;
                L3 = new g(lVar2, z0Var, 1);
                qVar2.h0(L3);
            }
            ButtonKt.Button(str, (ho.a) L3, I2, buttonSize, null, null, null, false, z11, false, qVar2, (i17 & 14) | 3072, 752);
            qVar = qVar2;
            qVar.p(true);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new id.k(str, z6, str2, lVar2, i10);
        }
    }

    private static final String OpenQuestionView$lambda$1(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final z OpenQuestionView$lambda$3$0$0$0(z0 z0Var, String str) {
        str.getClass();
        z0Var.setValue(str);
        return z.f31622a;
    }

    public static final z OpenQuestionView$lambda$3$1$0(ho.l lVar, z0 z0Var) {
        lVar.invoke(OpenQuestionView$lambda$1(z0Var));
        return z.f31622a;
    }

    public static final z OpenQuestionView$lambda$4(String str, boolean z6, String str2, ho.l lVar, int i10, u2.m mVar, int i11) {
        OpenQuestionView(str, z6, str2, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SurveySheet_Open(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1696089316);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            if (L == u2.l.f33918a) {
                L = new n(3);
                qVar.h0(L);
            }
            SurveySheetUI(new SurveyState(new Survey(ig.f.H(new Survey.Question(new Survey.Question.QuestionType.Open("Submit", true, "Enter your answer", (ho.l) L), "Open Question"))), 0, 2, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 17);
        }
    }

    public static final Analytics.Event Preview_SurveySheet_Open$lambda$0$0(String str) {
        str.getClass();
        return Analytics.Event.HomeViewedPage.INSTANCE;
    }

    public static final z Preview_SurveySheet_Open$lambda$1(int i10, u2.m mVar, int i11) {
        Preview_SurveySheet_Open(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_SurveySheet_SingleSelect(u2.m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(2010469002);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Analytics.Event.HomeViewedPage homeViewedPage = Analytics.Event.HomeViewedPage.INSTANCE;
            SurveySheetUI(new SurveyState(new Survey(ig.f.H(new Survey.Question(new Survey.Question.QuestionType.SingleSelect(ig.f.I(new Survey.Question.Choice("Option 1", homeViewedPage, null), new Survey.Question.Choice("Option 2", homeViewedPage, null))), "Sample Question"))), 0, 2, null), null, null, null, qVar, 0, 14);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new y(i10, 18);
        }
    }

    public static final z Preview_SurveySheet_SingleSelect$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_SurveySheet_SingleSelect(mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SingleSelectQuestionView(List<Survey.Question.Choice> list, ho.l lVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(-724141061);
        if ((i10 & 6) == 0) {
            if (qVar.h(list)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        int i14 = 32;
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i15 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = r.A(null);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            i3.q qVar2 = i3.q.f13017a;
            float f10 = 1.0f;
            float f11 = 20;
            t I = r1.d.I(r1.d.G(l1.n.y(p2.e(qVar2, 1.0f), l1.n.x(qVar), true, true), f11, u.P, 2), u.P, f11, u.P, u.P, 13);
            x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(I, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            r.J(h4.g.f11907f, a10, qVar);
            r.J(h4.g.f11906e, l4, qVar);
            r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            r.F(h4.g.f11909h, qVar);
            Iterator s10 = com.google.android.gms.internal.play_billing.b.s(qVar, c5, h4.g.f11905d, -195808980, list);
            while (s10.hasNext()) {
                final Survey.Question.Choice choice = (Survey.Question.Choice) s10.next();
                boolean h10 = qVar.h(choice);
                if ((i15 & 112) == i14) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z11 = h10 | z10;
                Object L2 = qVar.L();
                if (z11 || L2 == eVar) {
                    L2 = new c3.b(choice, lVar, z0Var, 4);
                    qVar.h0(L2);
                }
                SelectableBoxKt.m1873SelectableBox3f6hBDE((ho.a) L2, kotlin.jvm.internal.m.c(SingleSelectQuestionView$lambda$1(z0Var), choice), choice.getText(), r1.d.G(p2.e(qVar2, f10), u.P, 6, 1), 0L, null, c3.k.d(-1441325779, true, new ho.p() { // from class: io.elevenlabs.readerapp.core.j
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z SingleSelectQuestionView$lambda$3$0$1;
                        int intValue = ((Integer) obj2).intValue();
                        SingleSelectQuestionView$lambda$3$0$1 = SurveySheetKt.SingleSelectQuestionView$lambda$3$0$1(Survey.Question.Choice.this, (u2.m) obj, intValue);
                        return SingleSelectQuestionView$lambda$3$0$1;
                    }
                }, qVar), qVar, 1575936, 48);
                eVar = eVar;
                f10 = 1.0f;
                z0Var = z0Var;
                qVar2 = qVar2;
                i14 = 32;
            }
            qVar.p(false);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new k(list, lVar, i10, 0);
        }
    }

    private static final Survey.Question.Choice SingleSelectQuestionView$lambda$1(z0 z0Var) {
        return (Survey.Question.Choice) z0Var.getValue();
    }

    public static final z SingleSelectQuestionView$lambda$3$0$0$0(Survey.Question.Choice choice, ho.l lVar, z0 z0Var) {
        z0Var.setValue(choice);
        lVar.invoke(choice);
        return z.f31622a;
    }

    public static final z SingleSelectQuestionView$lambda$3$0$1(Survey.Question.Choice choice, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String text = choice.getText();
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            j7.d(text, r1.d.E(i3.q.f13017a, 12), defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge500(), qVar, 48, 0, 131064);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z SingleSelectQuestionView$lambda$4(List list, ho.l lVar, int i10, u2.m mVar, int i11) {
        SingleSelectQuestionView(list, lVar, mVar, r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void SurveySheet(Survey survey, ho.a aVar, SurveyViewModel surveyViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        SurveyViewModel surveyViewModel2;
        boolean z6;
        SurveyViewModel surveyViewModel3;
        q7.c cVar;
        SurveyViewModel surveyViewModel4;
        boolean h10;
        Object L;
        int i13;
        int i14;
        int i15;
        survey.getClass();
        aVar.getClass();
        q qVar = (q) mVar;
        qVar.Z(1624643610);
        if ((i10 & 6) == 0) {
            if (qVar.h(survey)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i10 & 384) == 0) {
            if ((i11 & 4) == 0) {
                surveyViewModel2 = surveyViewModel;
                if (qVar.h(surveyViewModel2)) {
                    i13 = RpcError.MAX_MESSAGE_BYTES;
                    i12 |= i13;
                }
            } else {
                surveyViewModel2 = surveyViewModel;
            }
            i13 = 128;
            i12 |= i13;
        } else {
            surveyViewModel2 = surveyViewModel;
        }
        int i16 = i12;
        if ((i16 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i16 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
                if ((i11 & 4) != 0) {
                    i16 &= -897;
                }
            } else if ((i11 & 4) != 0) {
                androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                if (a10 != null) {
                    pl.f o6 = tb.a.o(a10, qVar);
                    if (a10 instanceof androidx.lifecycle.o) {
                        cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = q7.a.f28123b;
                    }
                    i16 &= -897;
                    surveyViewModel4 = (SurveyViewModel) gg.b.j0(e0.f20562a.b(SurveyViewModel.class), a10, null, o6, cVar, qVar);
                    qVar.q();
                    h10 = qVar.h(surveyViewModel4) | qVar.h(survey);
                    L = qVar.L();
                    if (!h10 || L == u2.l.f33918a) {
                        L = new SurveySheetKt$SurveySheet$1$1(surveyViewModel4, survey, null);
                        qVar.h0(L);
                    }
                    r.f((ho.p) L, survey, qVar);
                    BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, u.P, aVar, false, (ho.r) c3.k.d(-920092888, true, new h((SurveyState) r.o(surveyViewModel4.getStateFlow(), qVar, 0).getValue(), aVar, surveyViewModel4, 0), qVar), (u2.m) qVar, ((i16 << 9) & 57344) | 1572864, 47);
                    surveyViewModel3 = surveyViewModel4;
                } else {
                    c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
            }
            surveyViewModel4 = surveyViewModel2;
            qVar.q();
            h10 = qVar.h(surveyViewModel4) | qVar.h(survey);
            L = qVar.L();
            if (!h10) {
            }
            L = new SurveySheetKt$SurveySheet$1$1(surveyViewModel4, survey, null);
            qVar.h0(L);
            r.f((ho.p) L, survey, qVar);
            BottomSheetScaffoldKt.m1899BottomSheetScaffoldjb40ds(false, false, 0L, u.P, aVar, false, (ho.r) c3.k.d(-920092888, true, new h((SurveyState) r.o(surveyViewModel4.getStateFlow(), qVar, 0).getValue(), aVar, surveyViewModel4, 0), qVar), (u2.m) qVar, ((i16 << 9) & 57344) | 1572864, 47);
            surveyViewModel3 = surveyViewModel4;
        } else {
            qVar.R();
            surveyViewModel3 = surveyViewModel2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new fm.f(survey, aVar, surveyViewModel3, i10, i11, 6);
        }
    }

    public static final z SurveySheet$lambda$1(SurveyState surveyState, ho.a aVar, SurveyViewModel surveyViewModel, r1.y yVar, BottomSheetControl bottomSheetControl, u2.m mVar, int i10) {
        yVar.getClass();
        bottomSheetControl.getClass();
        q qVar = (q) mVar;
        boolean h10 = qVar.h(surveyViewModel);
        Object L = qVar.L();
        u2.e eVar = u2.l.f33918a;
        if (h10 || L == eVar) {
            L = new b(surveyViewModel, 3);
            qVar.h0(L);
        }
        ho.l lVar = (ho.l) L;
        boolean h11 = qVar.h(bottomSheetControl);
        Object L2 = qVar.L();
        if (h11 || L2 == eVar) {
            L2 = new c(bottomSheetControl, 1);
            qVar.h0(L2);
        }
        SurveySheetUI(surveyState, aVar, lVar, (ho.a) L2, qVar, 0, 0);
        return z.f31622a;
    }

    public static final z SurveySheet$lambda$1$0$0(SurveyViewModel surveyViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(surveyViewModel);
        return z.f31622a;
    }

    public static final z SurveySheet$lambda$1$1$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z SurveySheet$lambda$2(Survey survey, ho.a aVar, SurveyViewModel surveyViewModel, int i10, int i11, u2.m mVar, int i12) {
        SurveySheet(survey, aVar, surveyViewModel, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SurveySheetUI(SurveyState surveyState, ho.a aVar, ho.l lVar, ho.a aVar2, u2.m mVar, int i10, int i11) {
        int i12;
        ho.a aVar3;
        int i13;
        int i14;
        ho.l lVar2;
        int i15;
        int i16;
        ho.a aVar4;
        int i17;
        boolean z6;
        ho.a aVar5;
        ho.l lVar3;
        ho.a aVar6;
        r1 r10;
        boolean z10;
        int i18;
        q qVar = (q) mVar;
        qVar.Z(1605479748);
        if ((i10 & 6) == 0) {
            if (qVar.h(surveyState)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            aVar3 = aVar;
            if (qVar.h(aVar3)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
            i14 = i11 & 4;
            if (i14 == 0) {
                i12 |= 384;
            } else if ((i10 & 384) == 0) {
                lVar2 = lVar;
                if (qVar.h(lVar2)) {
                    i15 = RpcError.MAX_MESSAGE_BYTES;
                } else {
                    i15 = 128;
                }
                i12 |= i15;
                i16 = i11 & 8;
                if (i16 != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    aVar4 = aVar2;
                    if (qVar.h(aVar4)) {
                        i17 = 2048;
                    } else {
                        i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i12 |= i17;
                    if ((i12 & 1171) == 1170) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!qVar.O(i12 & 1, z6)) {
                        u2.e eVar = u2.l.f33918a;
                        if (i19 != 0) {
                            Object L = qVar.L();
                            if (L == eVar) {
                                L = new f(5);
                                qVar.h0(L);
                            }
                            aVar5 = (ho.a) L;
                        } else {
                            aVar5 = aVar3;
                        }
                        if (i14 != 0) {
                            Object L2 = qVar.L();
                            if (L2 == eVar) {
                                L2 = new n(6);
                                qVar.h0(L2);
                            }
                            lVar3 = (ho.l) L2;
                        } else {
                            lVar3 = lVar2;
                        }
                        if (i16 != 0) {
                            Object L3 = qVar.L();
                            if (L3 == eVar) {
                                L3 = new f(6);
                                qVar.h0(L3);
                            }
                            aVar6 = (ho.a) L3;
                        } else {
                            aVar6 = aVar4;
                        }
                        Survey survey = surveyState.getSurvey();
                        if (survey == null) {
                            qVar.X(91615358);
                            qVar.p(false);
                        } else {
                            qVar.X(91615359);
                            Survey.Question question = (Survey.Question) tn.o.z0(surveyState.getCurrentPage(), survey.getQuestions());
                            if (question == null) {
                                qVar.X(264831342);
                                qVar.p(false);
                                z10 = false;
                            } else {
                                qVar.X(264831343);
                                t d10 = p2.d(i3.q.f13017a, 1.0f);
                                x a10 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
                                int hashCode = Long.hashCode(qVar.T);
                                c3.o l4 = qVar.l();
                                t c5 = i3.a.c(d10, qVar);
                                h4.h.f11920i.getClass();
                                h4.f fVar = h4.g.f11903b;
                                qVar.b0();
                                if (qVar.S) {
                                    qVar.k(fVar);
                                } else {
                                    qVar.k0();
                                }
                                r.J(h4.g.f11907f, a10, qVar);
                                r.J(h4.g.f11906e, l4, qVar);
                                r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
                                r.F(h4.g.f11909h, qVar);
                                r.J(h4.g.f11905d, c5, qVar);
                                HeaderKt.Header(question.getQuestion(), null, null, null, null, 0, qVar, 0, 62);
                                Object L4 = qVar.L();
                                if (L4 == eVar) {
                                    L4 = new n(7);
                                    qVar.h0(L4);
                                }
                                i1.l.b(question, null, (ho.l) L4, null, null, null, c3.k.d(1489736141, true, new h(lVar3, aVar6, aVar5, 1), qVar), qVar, 1573248, 58);
                                qVar = qVar;
                                qVar.p(true);
                                z10 = false;
                                qVar.p(false);
                            }
                            qVar.p(z10);
                        }
                    } else {
                        qVar.R();
                        aVar5 = aVar3;
                        lVar3 = lVar2;
                        aVar6 = aVar4;
                    }
                    r10 = qVar.r();
                    if (r10 == null) {
                        r10.f34012d = new l((Object) surveyState, (Object) aVar5, lVar3, (Object) aVar6, i10, i11, 0);
                        return;
                    }
                    return;
                }
                aVar4 = aVar2;
                if ((i12 & 1171) == 1170) {
                }
                if (!qVar.O(i12 & 1, z6)) {
                }
                r10 = qVar.r();
                if (r10 == null) {
                }
            }
            lVar2 = lVar;
            i16 = i11 & 8;
            if (i16 != 0) {
            }
            aVar4 = aVar2;
            if ((i12 & 1171) == 1170) {
            }
            if (!qVar.O(i12 & 1, z6)) {
            }
            r10 = qVar.r();
            if (r10 == null) {
            }
        }
        aVar3 = aVar;
        i14 = i11 & 4;
        if (i14 == 0) {
        }
        lVar2 = lVar;
        i16 = i11 & 8;
        if (i16 != 0) {
        }
        aVar4 = aVar2;
        if ((i12 & 1171) == 1170) {
        }
        if (!qVar.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SurveySheetUI$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final m0 SurveySheetUI$lambda$3$0$0$0$0(i1.q qVar) {
        qVar.getClass();
        return i1.l.c(y0.k(1, new n(4)), y0.n(new n(5)));
    }

    public static final int SurveySheetUI$lambda$3$0$0$0$0$1(int i10) {
        return -i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0087, code lost:
    
        if (r7.f(r2) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final z SurveySheetUI$lambda$3$0$0$1(ho.l lVar, ho.a aVar, ho.a aVar2, i1.o oVar, Survey.Question question, u2.m mVar, int i10) {
        Survey.Question question2;
        boolean z6;
        boolean f10;
        Object L;
        oVar.getClass();
        question.getClass();
        Survey.Question.QuestionType type = question.getType();
        boolean z10 = type instanceof Survey.Question.QuestionType.SingleSelect;
        u2.e eVar = u2.l.f33918a;
        if (z10) {
            q qVar = (q) mVar;
            qVar.X(832466987);
            List<Survey.Question.Choice> choices = ((Survey.Question.QuestionType.SingleSelect) question.getType()).getChoices();
            boolean f11 = qVar.f(lVar) | qVar.f(aVar);
            Object L2 = qVar.L();
            if (f11 || L2 == eVar) {
                L2 = new i(lVar, aVar, 2);
                qVar.h0(L2);
            }
            SingleSelectQuestionView(choices, (ho.l) L2, qVar, 0);
            qVar.p(false);
        } else if (type instanceof Survey.Question.QuestionType.Open) {
            q qVar2 = (q) mVar;
            qVar2.X(833121118);
            String actionText = ((Survey.Question.QuestionType.Open) question.getType()).getActionText();
            boolean isMandatory = ((Survey.Question.QuestionType.Open) question.getType()).isMandatory();
            String placeholder = ((Survey.Question.QuestionType.Open) question.getType()).getPlaceholder();
            boolean f12 = qVar2.f(lVar);
            if (((i10 & 112) ^ 48) > 32) {
                question2 = question;
            } else {
                question2 = question;
            }
            if ((i10 & 48) != 32) {
                z6 = false;
                f10 = f12 | z6 | qVar2.f(aVar) | qVar2.f(aVar2);
                L = qVar2.L();
                if (!f10 || L == eVar) {
                    v0 v0Var = new v0(lVar, question2, aVar, aVar2, 5);
                    qVar2.h0(v0Var);
                    L = v0Var;
                }
                OpenQuestionView(actionText, isMandatory, placeholder, (ho.l) L, qVar2, 0);
                qVar2.p(false);
            }
            z6 = true;
            f10 = f12 | z6 | qVar2.f(aVar) | qVar2.f(aVar2);
            L = qVar2.L();
            if (!f10) {
            }
            v0 v0Var2 = new v0(lVar, question2, aVar, aVar2, 5);
            qVar2.h0(v0Var2);
            L = v0Var2;
            OpenQuestionView(actionText, isMandatory, placeholder, (ho.l) L, qVar2, 0);
            qVar2.p(false);
        } else {
            throw com.google.android.gms.internal.play_billing.b.h(1412324844, (q) mVar, false);
        }
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$0$0(ho.l lVar, ho.a aVar, Survey.Question.Choice choice) {
        choice.getClass();
        lVar.invoke(new i(choice, aVar, 0));
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$0$0$0(Survey.Question.Choice choice, ho.a aVar, SurveyViewModel surveyViewModel) {
        surveyViewModel.getClass();
        surveyViewModel.logEvent(choice.getAnalyticsEvent());
        surveyViewModel.handleChoice(choice, new d(aVar, 1));
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$0$0$0$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$1$0(ho.l lVar, Survey.Question question, ho.a aVar, ho.a aVar2, String str) {
        str.getClass();
        lVar.invoke(new v0(question, str, aVar, aVar2, 4));
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$1$0$0(Survey.Question question, String str, ho.a aVar, ho.a aVar2, SurveyViewModel surveyViewModel) {
        surveyViewModel.getClass();
        surveyViewModel.logEvent((Analytics.Event) ((Survey.Question.QuestionType.Open) question.getType()).getAnalyticsEventCreator().invoke(str));
        surveyViewModel.handleNextPage(new g(aVar, aVar2, 2));
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$3$0$0$1$1$0$0$0(ho.a aVar, ho.a aVar2) {
        aVar.invoke();
        aVar2.invoke();
        return z.f31622a;
    }

    public static final z SurveySheetUI$lambda$4(SurveyState surveyState, ho.a aVar, ho.l lVar, ho.a aVar2, int i10, int i11, u2.m mVar, int i12) {
        SurveySheetUI(surveyState, aVar, lVar, aVar2, mVar, r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final int SurveySheetUI$lambda$3$0$0$0$0$0(int i10) {
        return i10;
    }
}
