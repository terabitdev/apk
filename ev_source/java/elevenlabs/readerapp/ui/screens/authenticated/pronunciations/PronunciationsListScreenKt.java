package io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations;

import a2.o2;
import androidx.lifecycle.j1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import i3.t;
import io.elevenlabs.domain.model.Pronunciation;
import io.elevenlabs.domain.model.PronunciationPreviewState;
import io.elevenlabs.readerapp.ui.components.u0;
import io.elevenlabs.readerapp.ui.models.UiAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.components.PronunciationPreviewButtonVariant;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.ActionConfig;
import io.elevenlabs.ui.components.ActionSpec;
import io.elevenlabs.ui.components.ActionSpecBuilder;
import io.elevenlabs.ui.components.BackButtonWithBackgroundKt;
import io.elevenlabs.ui.components.ButtonIconKt;
import io.elevenlabs.ui.components.ButtonIconSize;
import io.elevenlabs.ui.components.ButtonIconVariant;
import io.elevenlabs.ui.components.CalloutKt;
import io.elevenlabs.ui.components.CalloutType;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.SwipeToActionBoxKt;
import io.elevenlabs.ui.components.SwipeToActionMenuController;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.elevenlabs.ui.theme.ElevenLabsThemeKt;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import q2.j7;
import q2.k5;
import q2.p5;
import q2.y2;
import q2.y4;
import r1.d2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.w;
import r1.x;
import r1.z1;
import rd.c1;
import sn.z;
import t2.u;
import u2.r1;
import u2.s2;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aU\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aY\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u001e\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a_\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010 \u001a\u00020\u0001H\u0007¢\u0006\u0004\b \u0010\u0017\u001a\u000f\u0010!\u001a\u00020\u0001H\u0007¢\u0006\u0004\b!\u0010\u0017\u001a\u000f\u0010\"\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010\u0017\"\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'²\u0006\f\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002²\u0006\u000e\u0010&\u001a\u00020%8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onGoBack", "Lkotlin/Function2;", "", "Lio/elevenlabs/domain/model/Pronunciation;", "onNavigateToEdit", "Lkotlin/Function1;", "onNavigateToLink", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListViewModel;", "vm", PronunciationsListScreenKt.TAG, "(Lho/a;Lho/p;Lho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "PronunciationsListScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/pronunciations/PronunciationsListState;Lho/l;Lho/a;Lho/l;Lu2/m;I)V", "Li3/t;", "modifier", "GetFeedbackItem", "(Lho/l;Li3/t;Lu2/m;I)V", "EmptyState", "(Lu2/m;I)V", "pronunciation", "Lio/elevenlabs/domain/model/PronunciationPreviewState;", "previewState", "onEdit", "onDelete", "onPlayPreview", "PronunciationItem", "(Lio/elevenlabs/domain/model/Pronunciation;Lio/elevenlabs/domain/model/PronunciationPreviewState;Lho/l;Lho/l;Lho/a;Li3/t;Lu2/m;II)V", "Preview_PronunciationsListScreenUI", "Preview_PronunciationsListScreenUI_Empty", "Preview_PronunciationsListScreenUI_Loading", "TAG", "Ljava/lang/String;", "", "showDeleteDialog", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PronunciationsListScreenKt {
    private static final String TAG = "PronunciationsListScreen";

    private static final void EmptyState(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(541674775);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t d10 = p2.d(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t E = r1.d.E(d10, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM());
            x a10 = w.a(r1.j.f29232e, i3.d.C0, qVar, 54);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(E, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(h4.g.f11907f, a10, qVar);
            u2.r.J(h4.g.f11906e, l4, qVar);
            u2.r.y(qVar, Integer.valueOf(hashCode), h4.g.f11908g);
            u2.r.F(h4.g.f11909h, qVar);
            u2.r.J(h4.g.f11905d, c5, qVar);
            y2.a(kd.a.M(R.drawable.pronunciations, qVar, 0), null, p2.o(qVar2, 48), ib.i.w(elevenLabsTheme, qVar, i11), qVar, u3.c.$stable | 432, 0);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2358getX6D9Ej5fM()), qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_empty_state_title), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge600(), qVar, 0, 0, 130042);
            ib.i.A(elevenLabsTheme, qVar, i11, qVar2, qVar);
            j7.d(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_empty_state_subtitle), null, defpackage.f.A(elevenLabsTheme, qVar, i11), 0L, null, 0L, new e5.k(3), 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium400(), qVar, 0, 0, 130042);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h(i10, 4);
        }
    }

    public static final z EmptyState$lambda$1(int i10, u2.m mVar, int i11) {
        EmptyState(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void GetFeedbackItem(ho.l lVar, t tVar, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        int i13;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1026185235);
        if ((i10 & 6) == 0) {
            if (qVar.h(lVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(tVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        boolean z10 = true;
        if ((i11 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            CalloutType.Large large = new CalloutType.Large(kj.c.R(qVar, io.elevenlabs.readerapp.R.string.give_feedback_generic_title), kj.c.R(qVar, io.elevenlabs.readerapp.R.string.give_feedback_pronunciations_subtitle));
            int i14 = io.elevenlabs.readerapp.R.drawable.get_feedback_item_img;
            if ((i11 & 14) != 4) {
                z10 = false;
            }
            Object L = qVar.L();
            if (z10 || L == u2.l.f33918a) {
                L = new d(lVar, 2);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i15 = ElevenLabsTheme.$stable;
            CalloutKt.Callout(large, i14, aVar, r1.d.F(tVar, elevenLabsTheme.getSpacings(qVar, i15).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i15).m2356getX4D9Ej5fM()), qVar, CalloutType.Large.$stable, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new n(lVar, tVar, i10);
        }
    }

    public static final z GetFeedbackItem$lambda$0$0(ho.l lVar) {
        lVar.invoke("https://form.typeform.com/to/syjYmZAu");
        return z.f31622a;
    }

    public static final z GetFeedbackItem$lambda$1(ho.l lVar, t tVar, int i10, u2.m mVar, int i11) {
        GetFeedbackItem(lVar, tVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PronunciationsListScreenUI(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(652208744);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationsListScreenKt.INSTANCE.getLambda$288654334$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h(i10, 1);
        }
    }

    public static final z Preview_PronunciationsListScreenUI$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PronunciationsListScreenUI(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PronunciationsListScreenUI_Empty(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-55091654);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationsListScreenKt.INSTANCE.getLambda$1885073232$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h(i10, 3);
        }
    }

    public static final z Preview_PronunciationsListScreenUI_Empty$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PronunciationsListScreenUI_Empty(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PronunciationsListScreenUI_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(580041579);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            ElevenLabsThemeKt.ElevenLabsTheme(false, ComposableSingletons$PronunciationsListScreenKt.INSTANCE.getLambda$1062690561$app_productionRelease(), qVar, 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new h(i10, 2);
        }
    }

    public static final z Preview_PronunciationsListScreenUI_Loading$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PronunciationsListScreenUI_Loading(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PronunciationItem(Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, ho.l lVar, ho.l lVar2, ho.a aVar, t tVar, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        t tVar2;
        int i13;
        boolean z6;
        u2.q qVar;
        t tVar3;
        r1 r10;
        t tVar4;
        z0 z0Var;
        u2.e eVar;
        boolean z10;
        u2.q qVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        u2.q qVar3 = (u2.q) mVar;
        qVar3.Z(1880741573);
        if ((i10 & 6) == 0) {
            if (qVar3.h(pronunciation)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar3.d(pronunciationPreviewState.ordinal())) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            lVar3 = lVar;
            if (qVar3.h(lVar3)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        } else {
            lVar3 = lVar;
        }
        if ((i10 & 3072) == 0) {
            if (qVar3.h(lVar2)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i10 & 24576) == 0) {
            if (qVar3.h(aVar)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        int i19 = i11 & 32;
        if (i19 != 0) {
            i12 |= 196608;
        } else if ((196608 & i10) == 0) {
            tVar2 = tVar;
            if (qVar3.f(tVar2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
            if ((74899 & i12) == 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar3.O(i12 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                Object L = qVar3.L();
                u2.e eVar2 = u2.l.f33918a;
                if (L == eVar2) {
                    L = u2.r.A(Boolean.FALSE);
                    qVar3.h0(L);
                }
                z0 z0Var2 = (z0) L;
                if (PronunciationItem$lambda$1(z0Var2)) {
                    qVar3.X(1324175845);
                    Object L2 = qVar3.L();
                    if (L2 == eVar2) {
                        L2 = new p(z0Var2, 1);
                        qVar3.h0(L2);
                    }
                    ho.a aVar2 = (ho.a) L2;
                    if ((i12 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean h10 = z13 | qVar3.h(pronunciation);
                    Object L3 = qVar3.L();
                    if (h10 || L3 == eVar2) {
                        L3 = new c3.b(lVar2, pronunciation, z0Var2, 23);
                        qVar3.h0(L3);
                    }
                    String R = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_delete_dialog_confirm_title);
                    String R2 = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_delete_dialog_confirm_message);
                    String R3 = kj.c.R(qVar3, android.R.string.cancel);
                    String R4 = kj.c.R(qVar3, io.elevenlabs.readerapp.R.string.menu_action_delete);
                    z10 = true;
                    z0Var = z0Var2;
                    eVar = eVar2;
                    z11 = false;
                    ConfirmationDialogKt.ConfirmationDialog(aVar2, (ho.a) L3, R, R2, R3, R4, false, qVar3, 6, 64);
                    qVar2 = qVar3;
                    qVar2.p(false);
                } else {
                    z0Var = z0Var2;
                    eVar = eVar2;
                    z10 = true;
                    qVar2 = qVar3;
                    z11 = false;
                    qVar2.X(1324721693);
                    qVar2.p(false);
                }
                int i20 = R.drawable.text_edit;
                String R5 = kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_edit_pronunciation);
                ReaderColors readerColors = ReaderColors.INSTANCE;
                ActionConfig actionConfig = new ActionConfig(i20, R5, readerColors.m2372getBlue5000d7_KjU(), false, false, 24, null);
                ActionConfig actionConfig2 = new ActionConfig(R.drawable.trash_can, kj.c.R(qVar2, io.elevenlabs.readerapp.R.string.pronunciations_list_screen_delete_pronunciation), readerColors.m2449getRed5000d7_KjU(), true, false, 16, null);
                boolean z14 = z11;
                u2.e eVar3 = eVar;
                t tVar5 = tVar4;
                boolean z15 = z10;
                int i21 = i12;
                ActionSpec actionSpec = SwipeToActionBoxKt.actionSpec(c3.k.d(1960016017, z15, new io.elevenlabs.readerapp.ui.screens.authenticated.a(actionConfig, lVar3, pronunciation, actionConfig2, z0Var, 7), qVar2), qVar2, 6);
                Object L4 = qVar2.L();
                if (L4 == eVar3) {
                    L4 = new SwipeToActionMenuController();
                    qVar2.h0(L4);
                }
                SwipeToActionMenuController swipeToActionMenuController = (SwipeToActionMenuController) L4;
                String originalText = pronunciation.getOriginalText();
                t e10 = p2.e(tVar5, 1.0f);
                if ((57344 & i21) == 16384) {
                    z12 = z15;
                } else {
                    z12 = z14;
                }
                Object L5 = qVar2.L();
                if (z12 || L5 == eVar3) {
                    L5 = new p(aVar, 2);
                    qVar2.h0(L5);
                }
                qVar = qVar2;
                SwipeToActionBoxKt.SwipeToActionBox(originalText, l1.n.p(e10, false, null, null, null, (ho.a) L5, 15), null, actionSpec, null, swipeToActionMenuController, c3.k.d(-762657934, z15, new h2.d(pronunciationPreviewState, aVar, swipeToActionMenuController, pronunciation, 6), qVar2), qVar, (SwipeToActionMenuController.$stable << 15) | 1572864, 20);
                tVar3 = tVar5;
            } else {
                qVar = qVar3;
                qVar.R();
                tVar3 = tVar2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new u0((Object) pronunciation, (Object) pronunciationPreviewState, (sn.d) lVar, (Object) lVar2, aVar, tVar3, i10, i11, 9);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar3.O(i12 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    private static final boolean PronunciationItem$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void PronunciationItem$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z PronunciationItem$lambda$3$0(z0 z0Var) {
        PronunciationItem$lambda$2(z0Var, false);
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$4$0(ho.l lVar, Pronunciation pronunciation, z0 z0Var) {
        PronunciationItem$lambda$2(z0Var, false);
        lVar.invoke(pronunciation);
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$5(ActionConfig actionConfig, ho.l lVar, Pronunciation pronunciation, ActionConfig actionConfig2, z0 z0Var, ActionSpecBuilder actionSpecBuilder, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        boolean h10;
        int i12;
        actionSpecBuilder.getClass();
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                h10 = ((u2.q) mVar).f(actionSpecBuilder);
            } else {
                h10 = ((u2.q) mVar).h(actionSpecBuilder);
            }
            if (h10) {
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
            boolean h11 = qVar.h(actionConfig) | qVar.f(lVar) | qVar.h(pronunciation) | qVar.h(actionConfig2);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (h11 || L == eVar) {
                o2 o2Var = new o2(actionConfig, actionConfig2, lVar, pronunciation, z0Var, 5);
                qVar.h0(o2Var);
                L = o2Var;
            }
            actionSpecBuilder.handlers((ho.l) L);
            boolean h12 = qVar.h(actionConfig) | qVar.h(actionConfig2);
            Object L2 = qVar.L();
            if (h12 || L2 == eVar) {
                L2 = new q(actionConfig, actionConfig2, 5);
                qVar.h0(L2);
            }
            actionSpecBuilder.placement((ho.l) L2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$5$0$0(ActionConfig actionConfig, ActionConfig actionConfig2, ho.l lVar, Pronunciation pronunciation, z0 z0Var, ActionSpecBuilder.HandlerScope handlerScope) {
        handlerScope.getClass();
        handlerScope.handledBy(actionConfig, new f(lVar, pronunciation, 1));
        handlerScope.handledBy(actionConfig2, new p(z0Var, 0));
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$5$0$0$0(ho.l lVar, Pronunciation pronunciation) {
        lVar.invoke(pronunciation);
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$5$0$0$1(z0 z0Var) {
        PronunciationItem$lambda$2(z0Var, true);
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$5$1$0(ActionConfig actionConfig, ActionConfig actionConfig2, ActionSpecBuilder.PlacementScope placementScope) {
        placementScope.getClass();
        placementScope.setEndSide(ig.f.I(actionConfig, actionConfig2));
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$7$0(ho.a aVar) {
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$8(PronunciationPreviewState pronunciationPreviewState, ho.a aVar, SwipeToActionMenuController swipeToActionMenuController, Pronunciation pronunciation, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i11 = ElevenLabsTheme.$stable;
            t F = r1.d.F(l1.n.h(e10, ib.i.d(elevenLabsTheme, qVar, i11), h0.f26395b), elevenLabsTheme.getSpacings(qVar, i11).m2357getX5D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM());
            k2 a10 = i2.a(r1.j.f29228a, i3.d.f13004y0, qVar, 0);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            t c5 = i3.a.c(F, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            PronunciationPreviewButtonKt.PronunciationPreviewButton(pronunciationPreviewState, PronunciationPreviewButtonVariant.ITEM, aVar, r1.d.I(qVar2, u.P, 6, u.P, u.P, 13), false, qVar, 3120, 16);
            r1.d.g(p2.s(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2353getX2D9Ej5fM()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a11 = w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            t c10 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            j7.d(pronunciation.getOriginalText(), null, defpackage.f.b(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyMedium500(), qVar, 0, 0, 131066);
            r1.d.g(p2.f(qVar2, elevenLabsTheme.getSpacings(qVar, i11).m2350getX1D9Ej5fM()), qVar);
            j7.d(pronunciation.getSpokenText(), null, ib.i.w(elevenLabsTheme, qVar, i11), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar, i11).getBodyLarge500(), qVar, 0, 0, 131066);
            qVar.p(true);
            float f10 = -elevenLabsTheme.getSpacings(qVar, i11).m2351getX10D9Ej5fM();
            ButtonIconVariant buttonIconVariant = ButtonIconVariant.Transparent;
            ButtonIconSize buttonIconSize = ButtonIconSize.Medium;
            int i12 = R.drawable.more_dots;
            t I = r1.d.I(qVar2, 4, u.P, u.P, u.P, 14);
            String R = kj.c.R(qVar, io.elevenlabs.readerapp.R.string.player_accessibility_more);
            boolean h10 = qVar.h(swipeToActionMenuController) | qVar.c(f10);
            Object L = qVar.L();
            if (h10 || L == u2.l.f33918a) {
                L = new p5(swipeToActionMenuController, f10, 2);
                qVar.h0(L);
            }
            ButtonIconKt.ButtonIcon(i12, R, (ho.a) L, I, buttonIconVariant, buttonIconSize, false, false, false, qVar, 224256, 448);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$8$0$1$0(SwipeToActionMenuController swipeToActionMenuController, float f10) {
        swipeToActionMenuController.m1882showjoFl9I((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(0) & 4294967295L));
        return z.f31622a;
    }

    public static final z PronunciationItem$lambda$9(Pronunciation pronunciation, PronunciationPreviewState pronunciationPreviewState, ho.l lVar, ho.l lVar2, ho.a aVar, t tVar, int i10, int i11, u2.m mVar, int i12) {
        PronunciationItem(pronunciation, pronunciationPreviewState, lVar, lVar2, aVar, tVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if ((r20 & 8) != 0) goto L129;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PronunciationsListScreen(ho.a aVar, ho.p pVar, ho.l lVar, PronunciationsListViewModel pronunciationsListViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar2;
        PronunciationsListViewModel pronunciationsListViewModel2;
        boolean z6;
        q7.c cVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(552960862);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(pVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i10 & 384) == 0) {
            lVar2 = lVar;
            if (qVar.h(lVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                pronunciationsListViewModel2 = pronunciationsListViewModel;
                if (qVar.h(pronunciationsListViewModel2)) {
                    i13 = 2048;
                    i12 |= i13;
                }
            } else {
                pronunciationsListViewModel2 = pronunciationsListViewModel;
            }
            i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            i12 |= i13;
        } else {
            pronunciationsListViewModel2 = pronunciationsListViewModel;
        }
        boolean z10 = true;
        if ((i12 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i12 & 1, z6)) {
            qVar.T();
            if ((i10 & 1) != 0 && !qVar.y()) {
                qVar.R();
            } else {
                if ((i11 & 8) != 0) {
                    androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                    if (a10 != null) {
                        pl.f o6 = tb.a.o(a10, qVar);
                        if (a10 instanceof androidx.lifecycle.o) {
                            cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                        } else {
                            cVar = q7.a.f28123b;
                        }
                        j1 j02 = gg.b.j0(e0.f20562a.b(PronunciationsListViewModel.class), a10, null, o6, cVar, qVar);
                        qVar = qVar;
                        pronunciationsListViewModel2 = (PronunciationsListViewModel) j02;
                        i12 &= -7169;
                    } else {
                        c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return;
                    }
                }
                qVar.q();
                z0 m10 = c1.m(pronunciationsListViewModel2.getStateFlow(), qVar, 0);
                UiAction<sn.k> navigateToEdit = PronunciationsListScreen$lambda$0(m10).getNavigateToEdit();
                boolean f10 = qVar.f(m10) | qVar.h(pronunciationsListViewModel2);
                if ((i12 & 112) != 32) {
                    z10 = false;
                }
                boolean z11 = f10 | z10;
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (z11 || L == eVar) {
                    L = new PronunciationsListScreenKt$PronunciationsListScreen$1$1(pronunciationsListViewModel2, pVar, m10, null);
                    qVar.h0(L);
                }
                u2.r.f((ho.p) L, navigateToEdit, qVar);
                PronunciationsListState PronunciationsListScreen$lambda$0 = PronunciationsListScreen$lambda$0(m10);
                boolean h10 = qVar.h(pronunciationsListViewModel2);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new l(pronunciationsListViewModel2, 6);
                    qVar.h0(L2);
                }
                PronunciationsListScreenUI(PronunciationsListScreen$lambda$0, (ho.l) L2, aVar, lVar2, qVar, ((i12 << 6) & 896) | ((i12 << 3) & 7168));
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.core.l(aVar, (Object) pVar, (Object) lVar, (Object) pronunciationsListViewModel2, i10, i11, 20);
        }
    }

    public static final PronunciationsListState PronunciationsListScreen$lambda$0(s2 s2Var) {
        return (PronunciationsListState) s2Var.getValue();
    }

    public static final z PronunciationsListScreen$lambda$2$0(PronunciationsListViewModel pronunciationsListViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(pronunciationsListViewModel);
        return z.f31622a;
    }

    public static final z PronunciationsListScreen$lambda$3(ho.a aVar, ho.p pVar, ho.l lVar, PronunciationsListViewModel pronunciationsListViewModel, int i10, int i11, u2.m mVar, int i12) {
        PronunciationsListScreen(aVar, pVar, lVar, pronunciationsListViewModel, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    public static final void PronunciationsListScreenUI(PronunciationsListState pronunciationsListState, ho.l lVar, ho.a aVar, ho.l lVar2, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(1890748990);
        if ((i10 & 6) == 0) {
            if (qVar2.h(pronunciationsListState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar2.h(lVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(aVar)) {
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
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar2.O(i11 & 1, z6)) {
            qVar = qVar2;
            k5.a(null, c3.k.d(506866682, true, new e(aVar, 1), qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(2017104143, true, new fm.o(pronunciationsListState, lVar, lVar2, 21), qVar2), qVar, 805306416, 509);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(pronunciationsListState, lVar, aVar, lVar2, i10, 7);
        }
    }

    public static final z PronunciationsListScreenUI$lambda$0(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((t) null, ComposableSingletons$PronunciationsListScreenKt.INSTANCE.m1628getLambda$642327699$app_productionRelease(), c3.k.d(-1877350721, true, new i(aVar, 1), qVar), (ho.q) null, (i3.f) null, qVar, 432, 25);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationsListScreenUI$lambda$0$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonWithBackgroundKt.BackButtonWithBackground(aVar, u.P, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationsListScreenUI$lambda$1(PronunciationsListState pronunciationsListState, ho.l lVar, ho.l lVar2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        u2.q qVar;
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
        u2.q qVar2 = (u2.q) mVar;
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
            u2.r.J(eVar, d10, qVar2);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar2, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar2);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar2);
            if (pronunciationsListState.isLoading()) {
                qVar2.X(-892511384);
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
                u2.r.J(eVar, d12, qVar2);
                u2.r.J(eVar2, l7, qVar2);
                defpackage.f.u(hashCode2, qVar2, eVar3, qVar2, dVar);
                u2.r.J(eVar4, c10, qVar2);
                y4.a(null, 0L, u.P, 0L, 0, u.P, qVar2, 0, 63);
                qVar = qVar2;
                qVar.p(true);
                qVar.p(false);
            } else {
                qVar = qVar2;
                if (pronunciationsListState.getPronunciations().isEmpty()) {
                    qVar.X(-892207367);
                    EmptyState(qVar, 0);
                    qVar.p(false);
                } else {
                    qVar.X(-892085103);
                    t e10 = p2.e(qVar3, 1.0f);
                    d2 d13 = r1.d.d(u.P, ElevenLabsTheme.INSTANCE.getSpacings(qVar, ElevenLabsTheme.$stable).m2356getX4D9Ej5fM(), 1);
                    boolean h10 = qVar.h(pronunciationsListState) | qVar.f(lVar) | qVar.f(lVar2);
                    Object L = qVar.L();
                    if (h10 || L == u2.l.f33918a) {
                        L = new o(pronunciationsListState, lVar, lVar2, 0);
                        qVar.h0(L);
                    }
                    c1.c(e10, null, d13, false, null, null, null, false, null, (ho.l) L, qVar, 6, 506);
                    qVar.p(false);
                }
            }
            qVar.p(true);
        } else {
            qVar2.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationsListScreenUI$lambda$1$0$1$0(final PronunciationsListState pronunciationsListState, final ho.l lVar, ho.l lVar2, t1.t tVar) {
        tVar.getClass();
        final List<Pronunciation> pronunciations = pronunciationsListState.getPronunciations();
        final m mVar = new m(15);
        final PronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$1 pronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$1 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$1
            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((Pronunciation) obj);
            }

            @Override // ho.l
            public final Void invoke(Pronunciation pronunciation) {
                return null;
            }
        };
        ((t1.i) tVar).u(pronunciations.size(), new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$2
            public final Object invoke(int i10) {
                return ho.l.this.invoke(pronunciations.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$3
            public final Object invoke(int i10) {
                return ho.l.this.invoke(pronunciations.get(i10));
            }

            @Override // ho.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        }, new c3.j(new ho.r() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$lambda$1$0$1$0$$inlined$items$default$4
            public final void invoke(t1.b bVar, int i10, u2.m mVar2, int i11) {
                int i12;
                boolean z6;
                PronunciationPreviewState pronunciationPreviewState;
                int i13;
                int i14;
                if ((i11 & 6) == 0) {
                    if (((u2.q) mVar2).f(bVar)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = i11 | i14;
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
                    final Pronunciation pronunciation = (Pronunciation) pronunciations.get(i10);
                    qVar.X(-1461499010);
                    if (kotlin.jvm.internal.m.c(pronunciationsListState.getPreviewPlayingPronunciationId(), pronunciation.getId())) {
                        pronunciationPreviewState = pronunciationsListState.getPreviewState();
                    } else {
                        pronunciationPreviewState = PronunciationPreviewState.Stopped;
                    }
                    PronunciationPreviewState pronunciationPreviewState2 = pronunciationPreviewState;
                    boolean f10 = qVar.f(lVar);
                    Object L = qVar.L();
                    Object obj = u2.l.f33918a;
                    if (f10 || L == obj) {
                        final ho.l lVar3 = lVar;
                        L = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$1$1
                            public final void invoke(final Pronunciation pronunciation2) {
                                pronunciation2.getClass();
                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$1$1.1
                                    public final void invoke(PronunciationsListViewModel pronunciationsListViewModel) {
                                        pronunciationsListViewModel.getClass();
                                        pronunciationsListViewModel.onEditPronunciation(Pronunciation.this);
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((PronunciationsListViewModel) obj2);
                                        return z.f31622a;
                                    }
                                });
                            }

                            @Override // ho.l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Pronunciation) obj2);
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L);
                    }
                    ho.l lVar4 = (ho.l) L;
                    boolean f11 = qVar.f(lVar);
                    Object L2 = qVar.L();
                    if (f11 || L2 == obj) {
                        final ho.l lVar5 = lVar;
                        L2 = new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$2$1
                            public final void invoke(final Pronunciation pronunciation2) {
                                pronunciation2.getClass();
                                ho.l.this.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$2$1.1
                                    public final void invoke(PronunciationsListViewModel pronunciationsListViewModel) {
                                        pronunciationsListViewModel.getClass();
                                        pronunciationsListViewModel.onDeletePronunciation(Pronunciation.this);
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((PronunciationsListViewModel) obj2);
                                        return z.f31622a;
                                    }
                                });
                            }

                            @Override // ho.l
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                invoke((Pronunciation) obj2);
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L2);
                    }
                    ho.l lVar6 = (ho.l) L2;
                    boolean f12 = qVar.f(lVar) | qVar.h(pronunciation);
                    Object L3 = qVar.L();
                    if (f12 || L3 == obj) {
                        final ho.l lVar7 = lVar;
                        L3 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$3$1
                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m1629invoke() {
                                ho.l lVar8 = ho.l.this;
                                final Pronunciation pronunciation2 = pronunciation;
                                lVar8.invoke(new ho.l() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.PronunciationsListScreenKt$PronunciationsListScreenUI$2$1$2$1$2$3$1.1
                                    public final void invoke(PronunciationsListViewModel pronunciationsListViewModel) {
                                        pronunciationsListViewModel.getClass();
                                        pronunciationsListViewModel.onPlayPreview(Pronunciation.this);
                                    }

                                    @Override // ho.l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((PronunciationsListViewModel) obj2);
                                        return z.f31622a;
                                    }
                                });
                            }

                            @Override // ho.a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m1629invoke();
                                return z.f31622a;
                            }
                        };
                        qVar.h0(L3);
                    }
                    PronunciationsListScreenKt.PronunciationItem(pronunciation, pronunciationPreviewState2, lVar4, lVar6, (ho.a) L3, t1.b.a(bVar, i3.q.f13017a, null, 7), qVar, 0, 0);
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
        }, true, 802480018));
        t1.t.c(tVar, null, null, new c3.j(new i(lVar2, 2), true, -1487757397), 3);
        return z.f31622a;
    }

    public static final Object PronunciationsListScreenUI$lambda$1$0$1$0$0(Pronunciation pronunciation) {
        pronunciation.getClass();
        return pronunciation.getId();
    }

    public static final z PronunciationsListScreenUI$lambda$1$0$1$0$2(ho.l lVar, t1.b bVar, u2.m mVar, int i10) {
        boolean z6;
        int i11;
        bVar.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            GetFeedbackItem(lVar, t1.b.a(bVar, i3.q.f13017a, null, 7), qVar, 0);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z PronunciationsListScreenUI$lambda$2(PronunciationsListState pronunciationsListState, ho.l lVar, ho.a aVar, ho.l lVar2, int i10, u2.m mVar, int i11) {
        PronunciationsListScreenUI(pronunciationsListState, lVar, aVar, lVar2, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }
}
