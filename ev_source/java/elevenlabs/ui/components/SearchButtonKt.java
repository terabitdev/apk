package io.elevenlabs.ui.components;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.R;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u0005*\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"", "accessibilityLabel", "Lkotlin/Function0;", "Lsn/z;", "onClick", "Li3/t;", "modifier", "Lio/elevenlabs/ui/components/ButtonIconSize;", "size", "SearchButton", "(ILho/a;Li3/t;Lio/elevenlabs/ui/components/ButtonIconSize;Lu2/m;II)V", "Li1/j2;", "transitionScope", "Li1/g0;", "animatedContentScope", "searchButtonSharedElement", "(Li3/t;Li1/j2;Li1/g0;Lu2/m;I)Li3/t;", "headerTitleSharedElement", "", "SEARCH_SHARED_ELEMENT_KEY", "Ljava/lang/String;", "HEADER_TITLE_SHARED_ELEMENT_KEY", "ui_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class SearchButtonKt {
    public static final String HEADER_TITLE_SHARED_ELEMENT_KEY = "header-title";
    public static final String SEARCH_SHARED_ELEMENT_KEY = "search-button-to-input-field";

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchButton(int i10, ho.a aVar, i3.t tVar, ButtonIconSize buttonIconSize, u2.m mVar, int i11, int i12) {
        int i13;
        ho.a aVar2;
        i3.t tVar2;
        int i14;
        int i15;
        int ordinal;
        int i16;
        boolean z6;
        i3.t tVar3;
        ButtonIconSize buttonIconSize2;
        u2.r1 r10;
        i3.t tVar4;
        ButtonIconSize buttonIconSize3;
        int i17;
        int i18;
        aVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1150379869);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i13 = i18 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            aVar2 = aVar;
            if (qVar.h(aVar2)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i13 |= i17;
        } else {
            aVar2 = aVar;
        }
        int i19 = i12 & 4;
        if (i19 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i13 |= i14;
            i15 = i12 & 8;
            if (i15 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                if (buttonIconSize == null) {
                    ordinal = -1;
                } else {
                    ordinal = buttonIconSize.ordinal();
                }
                if (qVar.d(ordinal)) {
                    i16 = 2048;
                } else {
                    i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i13 |= i16;
            }
            if ((i13 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!qVar.O(i13 & 1, z6)) {
                if (i19 != 0) {
                    tVar4 = i3.q.f13017a;
                } else {
                    tVar4 = tVar2;
                }
                if (i15 != 0) {
                    buttonIconSize3 = ButtonIconSize.Small;
                } else {
                    buttonIconSize3 = buttonIconSize;
                }
                int i20 = i13 << 3;
                ho.a aVar3 = aVar2;
                ButtonIconKt.ButtonIcon(R.drawable.magnifying_glass, kj.c.R(qVar, i10), aVar3, tVar4, ButtonIconVariant.Menu, buttonIconSize3, false, false, false, qVar, (i20 & 7168) | (i20 & 896) | 24576 | ((i13 << 6) & 458752), 448);
                tVar3 = tVar4;
                buttonIconSize2 = buttonIconSize3;
            } else {
                qVar.R();
                tVar3 = tVar2;
                buttonIconSize2 = buttonIconSize;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.f1(i10, aVar, tVar3, buttonIconSize2, i11, i12);
                return;
            }
            return;
        }
        tVar2 = tVar;
        i15 = i12 & 8;
        if (i15 == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (!qVar.O(i13 & 1, z6)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z SearchButton$lambda$0(int i10, ho.a aVar, i3.t tVar, ButtonIconSize buttonIconSize, int i11, int i12, u2.m mVar, int i13) {
        SearchButton(i10, aVar, tVar, buttonIconSize, mVar, u2.r.M(i11 | 1), i12);
        return sn.z.f31622a;
    }

    public static final i3.t headerTitleSharedElement(i3.t tVar, i1.j2 j2Var, i1.g0 g0Var, u2.m mVar, int i10) {
        tVar.getClass();
        if (j2Var != null && g0Var != null) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(-2094067212);
            i3.t a10 = i1.j2.a(j2Var, tVar, i1.j2.c(HEADER_TITLE_SHARED_ELEMENT_KEY, qVar), g0Var);
            qVar.p(false);
            return a10;
        }
        u2.q qVar2 = (u2.q) mVar;
        qVar2.X(1317931704);
        qVar2.p(false);
        return tVar;
    }

    public static final i3.t searchButtonSharedElement(i3.t tVar, i1.j2 j2Var, i1.g0 g0Var, u2.m mVar, int i10) {
        tVar.getClass();
        if (j2Var != null && g0Var != null) {
            u2.q qVar = (u2.q) mVar;
            qVar.X(1826345371);
            i3.t a10 = i1.j2.a(j2Var, tVar, i1.j2.c(SEARCH_SHARED_ELEMENT_KEY, qVar), g0Var);
            qVar.p(false);
            return a10;
        }
        u2.q qVar2 = (u2.q) mVar;
        qVar2.X(1826617303);
        qVar2.p(false);
        return i3.q.f13017a;
    }
}
