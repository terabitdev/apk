package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonSize;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.InputBorderlessKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.k5;
import r1.l2;
import r1.m1;
import r1.z1;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001ac\u0010\u000e\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aM\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0019\u0010\u0017\u001a\u000f\u0010\u001a\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001d²\u0006\u000e\u0010\u001b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/ReadMeta;", "onNavigateToRead", "", "initialText", "", "isPodcastMode", "Lio/elevenlabs/domain/model/LimitReachedData;", "onNavigateToAddPodcastLimitReached", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteViewModel;", "vm", "WriteScreen", "(Lho/a;Lho/l;Ljava/lang/String;ZLho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onGoBack", "WriteScreenUI", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/WriteState;Ljava/lang/String;Lho/l;Lho/a;Lu2/m;I)V", "Preview_WriteScreen_Idle", "(Lu2/m;I)V", "Preview_WriteScreen_Loading", "Preview_WriteScreen_Input", "Preview_WriteScreen_InputLong", "input", "previousInput", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class WriteScreenKt {
    public static final void Preview_WriteScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(529411672);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            WriteState writeState = new WriteState(false, null, null, null, false, false, false, 127, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new e0(21);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(19);
                qVar.h0(L2);
            }
            WriteScreenUI(writeState, "", lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 15);
        }
    }

    public static final sn.z Preview_WriteScreen_Idle$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_WriteScreen_Idle$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_WriteScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_WriteScreen_Input(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(43333620);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            WriteState writeState = new WriteState(false, "Hello world", null, null, false, false, false, 124, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new e0(23);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(16);
                qVar.h0(L2);
            }
            WriteScreenUI(writeState, "Hello world", lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 12);
        }
    }

    public static final sn.z Preview_WriteScreen_Input$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_WriteScreen_Input$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_WriteScreen_Input(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_WriteScreen_InputLong(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(81975128);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            String R = wq.u.R(100, "Hello world ");
            WriteState writeState = new WriteState(false, R, null, null, false, false, false, 124, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new e0(19);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(18);
                qVar.h0(L2);
            }
            WriteScreenUI(writeState, R, lVar, (ho.a) L2, qVar, 3456);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 14);
        }
    }

    public static final sn.z Preview_WriteScreen_InputLong$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_WriteScreen_InputLong$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_WriteScreen_InputLong(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_WriteScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-517027966);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            WriteState writeState = new WriteState(true, "Hello world", null, null, false, false, false, 124, null);
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new e0(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new k0(17);
                qVar.h0(L2);
            }
            WriteScreenUI(writeState, "", lVar, (ho.a) L2, qVar, 3504);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new m0(i10, 13);
        }
    }

    public static final sn.z Preview_WriteScreen_Loading$lambda$0$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_WriteScreen_Loading$lambda$2(int i10, u2.m mVar, int i11) {
        Preview_WriteScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0285  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WriteScreen(ho.a aVar, ho.l lVar, String str, boolean z6, ho.l lVar2, WriteViewModel writeViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        WriteViewModel writeViewModel2;
        boolean z10;
        ho.l lVar4;
        WriteViewModel writeViewModel3;
        r1 r10;
        u2.e eVar;
        int i14;
        final WriteViewModel writeViewModel4;
        q7.c cVar;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        WriteState writeState;
        String str2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1246810814);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(lVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.g(z6)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i17;
        }
        int i21 = i11 & 16;
        if (i21 != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            lVar3 = lVar2;
            if (qVar.h(lVar3)) {
                i13 = 16384;
            } else {
                i13 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i13;
            if ((196608 & i10) != 0) {
                if ((i11 & 32) == 0) {
                    writeViewModel2 = writeViewModel;
                    if (qVar.h(writeViewModel2)) {
                        i16 = 131072;
                        i12 |= i16;
                    }
                } else {
                    writeViewModel2 = writeViewModel;
                }
                i16 = 65536;
                i12 |= i16;
            } else {
                writeViewModel2 = writeViewModel;
            }
            boolean z14 = true;
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                qVar.T();
                int i22 = i10 & 1;
                u2.e eVar2 = u2.l.f33918a;
                if (i22 != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    i14 = i12;
                    lVar4 = lVar3;
                    writeViewModel4 = writeViewModel2;
                    eVar = eVar2;
                } else {
                    if (i21 != 0) {
                        Object L = qVar.L();
                        if (L == eVar2) {
                            L = new e0(22);
                            qVar.h0(L);
                        }
                        lVar4 = (ho.l) L;
                    } else {
                        lVar4 = lVar3;
                    }
                    if ((i11 & 32) != 0) {
                        androidx.lifecycle.r1 a10 = r7.a.a(qVar);
                        if (a10 != null) {
                            pl.f o6 = tb.a.o(a10, qVar);
                            if (a10 instanceof androidx.lifecycle.o) {
                                cVar = ((androidx.lifecycle.o) a10).getDefaultViewModelCreationExtras();
                            } else {
                                cVar = q7.a.f28123b;
                            }
                            eVar = eVar2;
                            j1 j02 = gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(WriteViewModel.class), a10, null, o6, cVar, qVar);
                            qVar = qVar;
                            WriteViewModel writeViewModel5 = (WriteViewModel) j02;
                            i14 = i12 & (-458753);
                            writeViewModel4 = writeViewModel5;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        eVar = eVar2;
                        i14 = i12;
                        writeViewModel4 = writeViewModel2;
                    }
                }
                qVar.q();
                Context context = (Context) qVar.j(AndroidCompositionLocals_androidKt.f2291b);
                WriteState writeState2 = (WriteState) u2.r.o(writeViewModel4.getStateFlow(), qVar, 0).getValue();
                if ((i14 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean h10 = z11 | qVar.h(writeViewModel4);
                Object L2 = qVar.L();
                if (h10 || L2 == eVar) {
                    L2 = new WriteScreenKt$WriteScreen$2$1(str, writeViewModel4, null);
                    qVar.h0(L2);
                }
                u2.r.f((ho.p) L2, str, qVar);
                Boolean valueOf = Boolean.valueOf(z6);
                boolean h11 = qVar.h(writeViewModel4);
                if ((i14 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z15 = z12 | h11;
                Object L3 = qVar.L();
                if (z15 || L3 == eVar) {
                    L3 = new WriteScreenKt$WriteScreen$3$1(writeViewModel4, z6, null);
                    qVar.h0(L3);
                }
                u2.r.f((ho.p) L3, valueOf, qVar);
                ReadMeta navigateToRead = writeState2.getNavigateToRead();
                boolean h12 = qVar.h(writeState2);
                if ((i14 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z16 = h12 | z13;
                Object L4 = qVar.L();
                if (z16 || L4 == eVar) {
                    L4 = new WriteScreenKt$WriteScreen$4$1(writeState2, lVar, null);
                    qVar.h0(L4);
                }
                u2.r.f((ho.p) L4, navigateToRead, qVar);
                LimitReachedData navigateToAddPodcastLimitReached = writeState2.getNavigateToAddPodcastLimitReached();
                boolean h13 = qVar.h(writeState2);
                if ((57344 & i14) != 16384) {
                    z14 = false;
                }
                boolean h14 = h13 | z14 | qVar.h(writeViewModel4);
                Object L5 = qVar.L();
                if (h14 || L5 == eVar) {
                    L5 = new WriteScreenKt$WriteScreen$5$1(writeState2, lVar4, writeViewModel4, null);
                    qVar.h0(L5);
                }
                u2.r.f((ho.p) L5, navigateToAddPodcastLimitReached, qVar);
                if (writeState2.getShowImportSurvey()) {
                    qVar.X(-862767667);
                    boolean h15 = qVar.h(writeViewModel4);
                    Object L6 = qVar.L();
                    if (h15 || L6 == eVar) {
                        final int i23 = 0;
                        L6 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.v0
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z WriteScreen$lambda$5$0;
                                sn.z WriteScreen$lambda$6$0;
                                switch (i23) {
                                    case 0:
                                        WriteScreen$lambda$5$0 = WriteScreenKt.WriteScreen$lambda$5$0(writeViewModel4);
                                        return WriteScreen$lambda$5$0;
                                    default:
                                        WriteScreen$lambda$6$0 = WriteScreenKt.WriteScreen$lambda$6$0(writeViewModel4);
                                        return WriteScreen$lambda$6$0;
                                }
                            }
                        };
                        qVar.h0(L6);
                    }
                    ho.a aVar2 = (ho.a) L6;
                    boolean h16 = qVar.h(writeViewModel4);
                    Object L7 = qVar.L();
                    if (h16 || L7 == eVar) {
                        final int i24 = 1;
                        L7 = new ho.a() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.v0
                            @Override // ho.a
                            public final Object invoke() {
                                sn.z WriteScreen$lambda$5$0;
                                sn.z WriteScreen$lambda$6$0;
                                switch (i24) {
                                    case 0:
                                        WriteScreen$lambda$5$0 = WriteScreenKt.WriteScreen$lambda$5$0(writeViewModel4);
                                        return WriteScreen$lambda$5$0;
                                    default:
                                        WriteScreen$lambda$6$0 = WriteScreenKt.WriteScreen$lambda$6$0(writeViewModel4);
                                        return WriteScreen$lambda$6$0;
                                }
                            }
                        };
                        qVar.h0(L7);
                    }
                    ho.a aVar3 = (ho.a) L7;
                    boolean h17 = qVar.h(context);
                    Object L8 = qVar.L();
                    if (h17 || L8 == eVar) {
                        L8 = new u(context, 5);
                        qVar.h0(L8);
                    }
                    writeState = writeState2;
                    i15 = i14;
                    ImportContentBrowserSurveySheetKt.ImportContentBrowserSurveySheet(aVar2, aVar3, (ho.l) L8, null, qVar, 0, 8);
                    qVar.p(false);
                } else {
                    i15 = i14;
                    writeState = writeState2;
                    qVar.X(-862441888);
                    qVar.p(false);
                }
                if (str == null) {
                    str2 = writeState.getText();
                } else {
                    str2 = str;
                }
                boolean h18 = qVar.h(writeViewModel4);
                Object L9 = qVar.L();
                if (h18 || L9 == eVar) {
                    L9 = new w0(writeViewModel4, 0);
                    qVar.h0(L9);
                }
                WriteScreenUI(writeState, str2, (ho.l) L9, aVar, qVar, (i15 << 9) & 7168);
                writeViewModel3 = writeViewModel4;
            } else {
                qVar.R();
                lVar4 = lVar3;
                writeViewModel3 = writeViewModel2;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(aVar, lVar, str, z6, lVar4, writeViewModel3, i10, i11, 6);
                return;
            }
            return;
        }
        lVar3 = lVar2;
        if ((196608 & i10) != 0) {
        }
        boolean z142 = true;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z WriteScreen$lambda$0$0(LimitReachedData limitReachedData) {
        limitReachedData.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreen$lambda$5$0(WriteViewModel writeViewModel) {
        writeViewModel.onImportSurveyDismiss();
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreen$lambda$6$0(WriteViewModel writeViewModel) {
        writeViewModel.onImportSurveyShown();
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreen$lambda$7$0(Context context, String str) {
        str.getClass();
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreen$lambda$8$0(WriteViewModel writeViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(writeViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreen$lambda$9(ho.a aVar, ho.l lVar, String str, boolean z6, ho.l lVar2, WriteViewModel writeViewModel, int i10, int i11, u2.m mVar, int i12) {
        WriteScreen(aVar, lVar, str, z6, lVar2, writeViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final void WriteScreenUI(final WriteState writeState, String str, final ho.l lVar, final ho.a aVar, u2.m mVar, int i10) {
        int i11;
        String str2;
        boolean z6;
        u2.q qVar;
        int i12;
        int i13;
        int i14;
        int i15;
        writeState.getClass();
        str.getClass();
        lVar.getClass();
        aVar.getClass();
        u2.q qVar2 = (u2.q) mVar;
        qVar2.Z(-1171863542);
        if ((i10 & 6) == 0) {
            if (qVar2.h(writeState)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            if (qVar2.f(str2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        } else {
            str2 = str;
        }
        if ((i10 & 384) == 0) {
            if (qVar2.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar2.h(aVar)) {
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
            Object L = qVar2.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new n3.v();
                qVar2.h0(L);
            }
            n3.v vVar = (n3.v) L;
            Object L2 = qVar2.L();
            if (L2 == eVar) {
                L2 = u2.r.A(str2);
                qVar2.h0(L2);
            }
            final z0 z0Var = (z0) L2;
            Object L3 = qVar2.L();
            if (L3 == eVar) {
                L3 = u2.r.A(str2);
                qVar2.h0(L3);
            }
            z0 z0Var2 = (z0) L3;
            String text = writeState.getText();
            boolean h10 = qVar2.h(writeState);
            Object L4 = qVar2.L();
            if (h10 || L4 == eVar) {
                L4 = new WriteScreenKt$WriteScreenUI$1$1(writeState, z0Var, null);
                qVar2.h0(L4);
            }
            u2.r.f((ho.p) L4, text, qVar2);
            k5.a(null, c3.k.d(1452341198, true, new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.u0
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z WriteScreenUI$lambda$8;
                    int intValue = ((Integer) obj2).intValue();
                    WriteScreenUI$lambda$8 = WriteScreenKt.WriteScreenUI$lambda$8(ho.a.this, writeState, lVar, z0Var, (u2.m) obj, intValue);
                    return WriteScreenUI$lambda$8;
                }
            }, qVar2), null, null, null, 0, 0L, 0L, null, c3.k.d(452465881, true, new p(lVar, vVar, z0Var, z0Var2), qVar2), qVar2, 805306416, 509);
            qVar = qVar2;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new WriteScreenKt$WriteScreenUI$4$1(vVar, null);
                qVar.h0(L5);
            }
            u2.r.f((ho.p) L5, vVar, qVar);
        } else {
            qVar = qVar2;
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c3.d(writeState, str, lVar, aVar, i10, 11);
        }
    }

    public static final sn.z WriteScreenUI$lambda$11(WriteState writeState, String str, ho.l lVar, ho.a aVar, int i10, u2.m mVar, int i11) {
        WriteScreenUI(writeState, str, lVar, aVar, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final String WriteScreenUI$lambda$2(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    private static final String WriteScreenUI$lambda$5(z0 z0Var) {
        return (String) z0Var.getValue();
    }

    public static final sn.z WriteScreenUI$lambda$8(ho.a aVar, WriteState writeState, ho.l lVar, z0 z0Var, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.write_title), c3.k.d(1498414377, true, new b(4, aVar), qVar), c3.k.d(-1085274552, true, new fm.o(writeState, lVar, z0Var, 28), qVar), (i3.f) null, qVar, 3456, 17);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$8$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            BackButtonKt.BackButton(aVar, null, qVar, 0, 2);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$8$1(WriteState writeState, ho.l lVar, z0 z0Var, l2 l2Var, u2.m mVar, int i10) {
        boolean z6;
        l2Var.getClass();
        if ((i10 & 17) != 16) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            String R = kj.c.R(qVar, R.string.write_listen);
            ButtonVariant buttonVariant = ButtonVariant.Primary;
            ButtonSize buttonSize = ButtonSize.Small;
            int i11 = io.elevenlabs.ui.R.drawable.listen;
            boolean isLoading = writeState.isLoading();
            boolean z10 = !wq.n.m0(WriteScreenUI$lambda$2(z0Var));
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a(lVar, 7);
                qVar.h0(L);
            }
            ButtonKt.Button(R, (ho.a) L, null, buttonSize, buttonVariant, Integer.valueOf(i11), null, isLoading, z10, false, qVar, 27648, 580);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$8$1$0$0(ho.l lVar) {
        lVar.invoke(new e0(20));
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$8$1$0$0$0(WriteViewModel writeViewModel) {
        writeViewModel.getClass();
        writeViewModel.listen();
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$9(ho.l lVar, n3.v vVar, z0 z0Var, z0 z0Var2, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
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
            i3.t o6 = r1.d.o(r1.d.D(qVar2, z1Var), z1Var);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i13 = ElevenLabsTheme.$stable;
            i3.t u6 = r1.d.u(r1.d.G(o6, elevenLabsTheme.getSpacings(qVar, i13).m2350getX1D9Ej5fM(), t2.u.P, 2));
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode = Long.hashCode(qVar.T);
            c3.o l4 = qVar.l();
            i3.t c5 = i3.a.c(u6, qVar);
            h4.h.f11920i.getClass();
            h4.f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            h4.e eVar = h4.g.f11907f;
            u2.r.J(eVar, d10, qVar);
            h4.e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            h4.e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            r1.x a10 = r1.w.a(r1.j.f29230c, i3.d.B0, qVar, 0);
            int hashCode2 = Long.hashCode(qVar.T);
            c3.o l7 = qVar.l();
            i3.t c10 = i3.a.c(qVar2, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            String WriteScreenUI$lambda$2 = WriteScreenUI$lambda$2(z0Var);
            boolean f10 = qVar.f(lVar);
            Object L = qVar.L();
            if (f10 || L == u2.l.f33918a) {
                L = new a2.r(lVar, z0Var, z0Var2, 1);
                qVar.h0(L);
            }
            ho.l lVar2 = (ho.l) L;
            i3.t j4 = n3.d.j(qVar2, vVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            InputBorderlessKt.InputBorderless(WriteScreenUI$lambda$2, lVar2, r1.d.F(j4.then(new m1(1.0f, true)), elevenLabsTheme.getSpacings(qVar, i13).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar, i13).m2355getX3D9Ej5fM()), kj.c.R(qVar, R.string.write_placeholder), null, null, null, null, false, false, qVar, 0, 1008);
            qVar.p(true);
            qVar.p(true);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$9$0$0$0$0(ho.l lVar, z0 z0Var, z0 z0Var2, String str) {
        str.getClass();
        z0Var2.setValue(WriteScreenUI$lambda$2(z0Var));
        z0Var.setValue(str);
        lVar.invoke(new r(str, 11));
        return sn.z.f31622a;
    }

    public static final sn.z WriteScreenUI$lambda$9$0$0$0$0$0(String str, WriteViewModel writeViewModel) {
        writeViewModel.getClass();
        writeViewModel.onInputChanged(str);
        return sn.z.f31622a;
    }
}
