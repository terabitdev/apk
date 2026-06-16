package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import f4.f1;
import io.elevenlabs.domain.ConfigurationKt;
import io.elevenlabs.domain.model.LimitReachedData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.ui.components.BackButtonKt;
import io.elevenlabs.ui.components.ButtonKt;
import io.elevenlabs.ui.components.ButtonVariant;
import io.elevenlabs.ui.components.ErrorContainerKt;
import io.elevenlabs.ui.components.LoaderKt;
import io.elevenlabs.ui.components.headers.HeaderActionsKt;
import io.elevenlabs.ui.theme.ElevenLabsTheme;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import q2.j7;
import q2.k5;
import q2.y2;
import r1.i2;
import r1.k2;
import r1.l2;
import r1.m1;
import r1.p2;
import r1.z1;
import s4.y0;
import u2.r1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001ac\u0010\u000e\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aS\u0010\u0014\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u001e\u0010\u0012\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0018\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"", "initialFileUri", "Lkotlin/Function0;", "Lsn/z;", "onClose", "Lkotlin/Function1;", "Lio/elevenlabs/domain/model/ReadMeta;", "onNavigateToRead", "", "isPodcastMode", "Lio/elevenlabs/domain/model/LimitReachedData;", "onNavigateToAddPodcastLimitReached", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileViewModel;", "vm", "ImportFileScreen", "(Ljava/lang/String;Lho/a;Lho/l;ZLho/l;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileViewModel;Lu2/m;II)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileState;", RemoteConfigConstants.ResponseFieldKey.STATE, "action", "onPickFile", "ImportFileScreenUI", "(Lho/a;Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/ImportFileState;Lho/l;Lho/a;Lu2/m;I)V", "Preview_ImportFileScreen_Loading", "(Lu2/m;I)V", "Preview_ImportFileScreen_Failed", "Preview_ImportFileScreen_Failed_LongFileName", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ImportFileScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ImportFileScreen(String str, ho.a aVar, ho.l lVar, boolean z6, ho.l lVar2, ImportFileViewModel importFileViewModel, u2.m mVar, int i10, int i11) {
        int i12;
        ho.l lVar3;
        int i13;
        ImportFileViewModel importFileViewModel2;
        boolean z10;
        r1 r10;
        ho.l lVar4;
        u2.e eVar;
        q7.c cVar;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        aVar.getClass();
        lVar.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1751103234);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i16 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.g(z6)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        int i19 = i11 & 16;
        if (i19 != 0) {
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
                    importFileViewModel2 = importFileViewModel;
                    if (qVar.h(importFileViewModel2)) {
                        i14 = 131072;
                        i12 |= i14;
                    }
                } else {
                    importFileViewModel2 = importFileViewModel;
                }
                i14 = 65536;
                i12 |= i14;
            } else {
                importFileViewModel2 = importFileViewModel;
            }
            boolean z16 = true;
            if ((74899 & i12) == 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!qVar.O(i12 & 1, z10)) {
                qVar.T();
                int i20 = i10 & 1;
                u2.e eVar2 = u2.l.f33918a;
                if (i20 != 0 && !qVar.y()) {
                    qVar.R();
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                    }
                    eVar = eVar2;
                } else {
                    if (i19 != 0) {
                        Object L = qVar.L();
                        if (L == eVar2) {
                            L = new j(18);
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
                            ImportFileViewModel importFileViewModel3 = (ImportFileViewModel) gg.b.j0(kotlin.jvm.internal.e0.f20562a.b(ImportFileViewModel.class), a10, null, o6, cVar, qVar);
                            i12 &= -458753;
                            lVar3 = lVar4;
                            importFileViewModel2 = importFileViewModel3;
                        } else {
                            c6.x("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        }
                    } else {
                        eVar = eVar2;
                        lVar3 = lVar4;
                    }
                }
                qVar.q();
                ImportFileState importFileState = (ImportFileState) u2.r.o(importFileViewModel2.getStateFlow(), qVar, 0).getValue();
                androidx.fragment.app.n0 n0Var = new androidx.fragment.app.n0(1);
                boolean h10 = qVar.h(importFileViewModel2) | qVar.h(importFileState);
                int i21 = i12 & 112;
                if (i21 == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z17 = h10 | z11;
                Object L2 = qVar.L();
                if (z17 || L2 == eVar) {
                    L2 = new io.elevenlabs.readerapp.ui.screens.authenticated.pronunciations.o(importFileViewModel2, importFileState, aVar, 5);
                    qVar.h0(L2);
                }
                j.j C = android.support.v4.media.session.b.C(n0Var, (ho.l) L2, qVar, 0);
                boolean f10 = qVar.f(C);
                Object L3 = qVar.L();
                if (f10 || L3 == eVar) {
                    L3 = new x(C, importFileViewModel2, 0);
                    qVar.h0(L3);
                }
                ho.a aVar2 = (ho.a) L3;
                if ((i12 & 14) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean h11 = z12 | qVar.h(importFileViewModel2) | qVar.f(aVar2);
                Object L4 = qVar.L();
                if (h11 || L4 == eVar) {
                    L4 = new ImportFileScreenKt$ImportFileScreen$2$1(str, importFileViewModel2, aVar2, null);
                    qVar.h0(L4);
                }
                u2.r.f((ho.p) L4, sn.z.f31622a, qVar);
                Boolean valueOf = Boolean.valueOf(z6);
                boolean h12 = qVar.h(importFileViewModel2);
                if ((i12 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = z13 | h12;
                Object L5 = qVar.L();
                if (z18 || L5 == eVar) {
                    L5 = new ImportFileScreenKt$ImportFileScreen$3$1(importFileViewModel2, z6, null);
                    qVar.h0(L5);
                }
                u2.r.f((ho.p) L5, valueOf, qVar);
                ReadMeta navigateToRead = importFileState.getNavigateToRead();
                boolean h13 = qVar.h(importFileState);
                if ((i12 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z19 = h13 | z14;
                Object L6 = qVar.L();
                if (z19 || L6 == eVar) {
                    L6 = new ImportFileScreenKt$ImportFileScreen$4$1(importFileState, lVar, null);
                    qVar.h0(L6);
                }
                u2.r.f((ho.p) L6, navigateToRead, qVar);
                LimitReachedData navigateToAddPodcastLimitReached = importFileState.getNavigateToAddPodcastLimitReached();
                boolean h14 = qVar.h(importFileState);
                if ((57344 & i12) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean h15 = h14 | z15 | qVar.h(importFileViewModel2);
                Object L7 = qVar.L();
                if (h15 || L7 == eVar) {
                    L7 = new ImportFileScreenKt$ImportFileScreen$5$1(importFileState, lVar3, importFileViewModel2, null);
                    qVar.h0(L7);
                }
                u2.r.f((ho.p) L7, navigateToAddPodcastLimitReached, qVar);
                Boolean valueOf2 = Boolean.valueOf(importFileState.getNavigateClose());
                boolean h16 = qVar.h(importFileState);
                if (i21 != 32) {
                    z16 = false;
                }
                boolean z20 = h16 | z16;
                Object L8 = qVar.L();
                if (z20 || L8 == eVar) {
                    L8 = new ImportFileScreenKt$ImportFileScreen$6$1(importFileState, aVar, null);
                    qVar.h0(L8);
                }
                u2.r.f((ho.p) L8, valueOf2, qVar);
                boolean h17 = qVar.h(importFileViewModel2);
                Object L9 = qVar.L();
                if (h17 || L9 == eVar) {
                    L9 = new y(importFileViewModel2, 0);
                    qVar.h0(L9);
                }
                ho.l lVar5 = (ho.l) L9;
                boolean f11 = qVar.f(aVar2);
                Object L10 = qVar.L();
                if (f11 || L10 == eVar) {
                    L10 = new f(2, aVar2);
                    qVar.h0(L10);
                }
                ImportFileScreenUI(aVar, importFileState, lVar5, (ho.a) L10, qVar, (i12 >> 3) & 14);
            } else {
                qVar.R();
            }
            ho.l lVar6 = lVar3;
            ImportFileViewModel importFileViewModel4 = importFileViewModel2;
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.ocr.o(str, aVar, lVar, z6, lVar6, importFileViewModel4, i10, i11);
                return;
            }
            return;
        }
        lVar3 = lVar2;
        if ((196608 & i10) != 0) {
        }
        boolean z162 = true;
        if ((74899 & i12) == 74898) {
        }
        if (!qVar.O(i12 & 1, z10)) {
        }
        ho.l lVar62 = lVar3;
        ImportFileViewModel importFileViewModel42 = importFileViewModel2;
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final sn.z ImportFileScreen$lambda$0$0(LimitReachedData limitReachedData) {
        limitReachedData.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreen$lambda$1$0(ImportFileViewModel importFileViewModel, ImportFileState importFileState, ho.a aVar, Uri uri) {
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            importFileViewModel.onFilePicked(uri2);
        } else if (importFileState.getFile() == null) {
            aVar.invoke();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreen$lambda$10(String str, ho.a aVar, ho.l lVar, boolean z6, ho.l lVar2, ImportFileViewModel importFileViewModel, int i10, int i11, u2.m mVar, int i12) {
        ImportFileScreen(str, aVar, lVar, z6, lVar2, importFileViewModel, mVar, u2.r.M(i10 | 1), i11);
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreen$lambda$2$0(j.j jVar, ImportFileViewModel importFileViewModel) {
        try {
            jVar.a(ConfigurationKt.getSupportedMimeTypes().toArray(new String[0]));
        } catch (ActivityNotFoundException e10) {
            importFileViewModel.onFilePickerUnavailable(e10);
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreen$lambda$8$0(ImportFileViewModel importFileViewModel, ho.l lVar) {
        lVar.getClass();
        lVar.invoke(importFileViewModel);
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreen$lambda$9$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final void ImportFileScreenUI(final ho.a aVar, final ImportFileState importFileState, final ho.l lVar, final ho.a aVar2, u2.m mVar, final int i10) {
        int i11;
        boolean z6;
        ho.a aVar3;
        r1 r10;
        ho.p pVar;
        int i12;
        int i13;
        int i14;
        int i15;
        aVar.getClass();
        importFileState.getClass();
        lVar.getClass();
        aVar2.getClass();
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2088296867);
        if ((i10 & 6) == 0) {
            if (qVar.h(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(importFileState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(lVar)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
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
        if (qVar.O(i11 & 1, z6)) {
            if (importFileState.getFile() == null) {
                qVar.X(149508322);
                r1.p.a(p2.e(i3.q.f13017a, 1.0f), qVar, 6);
                qVar.p(false);
                r10 = qVar.r();
                if (r10 != null) {
                    final int i16 = 1;
                    pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.w
                        @Override // ho.p
                        public final Object invoke(Object obj, Object obj2) {
                            sn.z ImportFileScreenUI$lambda$3;
                            sn.z ImportFileScreenUI$lambda$0;
                            switch (i16) {
                                case 0:
                                    int intValue = ((Integer) obj2).intValue();
                                    ImportFileScreenUI$lambda$3 = ImportFileScreenKt.ImportFileScreenUI$lambda$3(aVar, importFileState, lVar, aVar2, i10, (u2.m) obj, intValue);
                                    return ImportFileScreenUI$lambda$3;
                                default:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    ImportFileScreenUI$lambda$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$0(aVar, importFileState, lVar, aVar2, i10, (u2.m) obj, intValue2);
                                    return ImportFileScreenUI$lambda$0;
                            }
                        }
                    };
                    r10.f34012d = pVar;
                }
                return;
            }
            aVar3 = aVar;
            qVar.X(149541957);
            qVar.p(false);
            k5.a(null, c3.k.d(1473668385, true, new d(aVar3, 1), qVar), null, null, null, 0, 0L, 0L, null, c3.k.d(-1813875348, true, new fm.o(importFileState, aVar2, lVar, 25), qVar), qVar, 805306416, 509);
        } else {
            aVar3 = aVar;
            qVar.R();
        }
        r10 = qVar.r();
        if (r10 != null) {
            final int i17 = 0;
            final ho.a aVar4 = aVar3;
            pVar = new ho.p() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.reads.w
                @Override // ho.p
                public final Object invoke(Object obj, Object obj2) {
                    sn.z ImportFileScreenUI$lambda$3;
                    sn.z ImportFileScreenUI$lambda$0;
                    switch (i17) {
                        case 0:
                            int intValue = ((Integer) obj2).intValue();
                            ImportFileScreenUI$lambda$3 = ImportFileScreenKt.ImportFileScreenUI$lambda$3(aVar4, importFileState, lVar, aVar2, i10, (u2.m) obj, intValue);
                            return ImportFileScreenUI$lambda$3;
                        default:
                            int intValue2 = ((Integer) obj2).intValue();
                            ImportFileScreenUI$lambda$0 = ImportFileScreenKt.ImportFileScreenUI$lambda$0(aVar4, importFileState, lVar, aVar2, i10, (u2.m) obj, intValue2);
                            return ImportFileScreenUI$lambda$0;
                    }
                }
            };
            r10.f34012d = pVar;
        }
    }

    public static final sn.z ImportFileScreenUI$lambda$0(ho.a aVar, ImportFileState importFileState, ho.l lVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        ImportFileScreenUI(aVar, importFileState, lVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$1(ho.a aVar, u2.m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        u2.q qVar = (u2.q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            HeaderActionsKt.HeaderActions((i3.t) null, kj.c.R(qVar, R.string.import_file_title), c3.k.d(944695740, true, new b(1, aVar), qVar), (ho.q) null, (i3.f) null, qVar, 384, 25);
        } else {
            qVar.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$1$0(ho.a aVar, l2 l2Var, u2.m mVar, int i10) {
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

    public static final sn.z ImportFileScreenUI$lambda$2(ImportFileState importFileState, ho.a aVar, ho.l lVar, z1 z1Var, u2.m mVar, int i10) {
        int i11;
        boolean z6;
        int i12;
        i3.q qVar;
        boolean z10;
        u2.q qVar2;
        int i13;
        z1Var.getClass();
        if ((i10 & 6) == 0) {
            if (((u2.q) mVar).f(z1Var)) {
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
        u2.q qVar3 = (u2.q) mVar;
        if (qVar3.O(i11 & 1, z6)) {
            i3.q qVar4 = i3.q.f13017a;
            i3.t o6 = r1.d.o(r1.d.D(qVar4, z1Var), z1Var);
            r1.e eVar = r1.j.f29230c;
            i3.j jVar = i3.d.B0;
            r1.x a10 = r1.w.a(eVar, jVar, qVar3, 0);
            int hashCode = Long.hashCode(qVar3.T);
            c3.o l4 = qVar3.l();
            i3.t c5 = i3.a.c(o6, qVar3);
            h4.h.f11920i.getClass();
            ho.a aVar2 = h4.g.f11903b;
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(aVar2);
            } else {
                qVar3.k0();
            }
            h4.e eVar2 = h4.g.f11907f;
            u2.r.J(eVar2, a10, qVar3);
            h4.e eVar3 = h4.g.f11906e;
            u2.r.J(eVar3, l4, qVar3);
            Integer valueOf = Integer.valueOf(hashCode);
            h4.e eVar4 = h4.g.f11908g;
            u2.r.y(qVar3, valueOf, eVar4);
            h4.d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar3);
            h4.e eVar5 = h4.g.f11905d;
            u2.r.J(eVar5, c5, qVar3);
            i3.t v9 = p2.v(p2.e(qVar4, 1.0f), null, 3);
            ElevenLabsTheme elevenLabsTheme = ElevenLabsTheme.INSTANCE;
            int i14 = ElevenLabsTheme.$stable;
            i3.t x10 = ib.i.x(elevenLabsTheme, qVar3, i14, v9);
            r1.x a11 = r1.w.a(eVar, jVar, qVar3, 0);
            int hashCode2 = Long.hashCode(qVar3.T);
            c3.o l7 = qVar3.l();
            i3.t c10 = i3.a.c(x10, qVar3);
            qVar3.b0();
            if (qVar3.S) {
                qVar3.k(aVar2);
            } else {
                qVar3.k0();
            }
            u2.r.J(eVar2, a11, qVar3);
            u2.r.J(eVar3, l7, qVar3);
            defpackage.f.u(hashCode2, qVar3, eVar4, qVar3, dVar);
            u2.r.J(eVar5, c10, qVar3);
            boolean isLoading = importFileState.isLoading();
            Object obj = u2.l.f33918a;
            if (isLoading) {
                qVar3.X(950759579);
                String R = kj.c.R(qVar3, R.string.import_file_uploading);
                i3.t c11 = m3.h.c(l1.n.j(1, elevenLabsTheme.getColor(qVar3, i14).getDivider().m2059getLine0d7_KjU(), p2.e(qVar4, 1.0f), elevenLabsTheme.getShapes(qVar3, i14).getMx()), elevenLabsTheme.getShapes(qVar3, i14).getMx());
                boolean f10 = qVar3.f(R);
                Object L = qVar3.L();
                if (f10 || L == obj) {
                    L = new r(R, 1);
                    qVar3.h0(L);
                }
                i3.t F = r1.d.F(p4.q.c(c11, true, (ho.l) L), elevenLabsTheme.getSpacings(qVar3, i14).m2356getX4D9Ej5fM(), elevenLabsTheme.getSpacings(qVar3, i14).m2351getX10D9Ej5fM());
                r1.x a12 = r1.w.a(eVar, i3.d.C0, qVar3, 48);
                int hashCode3 = Long.hashCode(qVar3.T);
                c3.o l10 = qVar3.l();
                i3.t c12 = i3.a.c(F, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(aVar2);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar2, a12, qVar3);
                u2.r.J(eVar3, l10, qVar3);
                defpackage.f.u(hashCode3, qVar3, eVar4, qVar3, dVar);
                u2.r.J(eVar5, c12, qVar3);
                i12 = i14;
                LoaderKt.m1840LoadereopBjH0(null, 0L, 0L, null, qVar3, 0, 15);
                qVar = qVar4;
                ib.i.p(elevenLabsTheme, qVar3, i12, qVar, qVar3);
                j7.d(kj.c.R(qVar3, R.string.import_file_uploading), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, elevenLabsTheme.getTypo(qVar3, i12).getBodyLarge500(), qVar3, 0, 0, 131070);
                qVar2 = qVar3;
                qVar2.p(true);
                qVar2.p(false);
            } else {
                i12 = i14;
                qVar3.X(952161244);
                String R2 = kj.c.R(qVar3, R.string.import_file_accessibility_change_file);
                i3.t c13 = m3.h.c(l1.n.j(1, elevenLabsTheme.getColor(qVar3, i12).getDivider().m2059getLine0d7_KjU(), p2.e(qVar4, 1.0f), elevenLabsTheme.getShapes(qVar3, i12).getMx()), elevenLabsTheme.getShapes(qVar3, i12).getMx());
                boolean f11 = qVar3.f(R2);
                Object L2 = qVar3.L();
                if (f11 || L2 == obj) {
                    L2 = new r(R2, 2);
                    qVar3.h0(L2);
                }
                i3.t c14 = p4.q.c(c13, true, (ho.l) L2);
                boolean f12 = qVar3.f(aVar);
                Object L3 = qVar3.L();
                if (f12 || L3 == obj) {
                    L3 = new f(3, aVar);
                    qVar3.h0(L3);
                }
                i3.t x11 = ib.i.x(elevenLabsTheme, qVar3, i12, l1.n.p(c14, false, null, null, null, (ho.a) L3, 15));
                k2 a13 = i2.a(r1.j.f29228a, i3.d.f13005z0, qVar3, 48);
                int hashCode4 = Long.hashCode(qVar3.T);
                c3.o l11 = qVar3.l();
                i3.t c15 = i3.a.c(x11, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(aVar2);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar2, a13, qVar3);
                u2.r.J(eVar3, l11, qVar3);
                defpackage.f.u(hashCode4, qVar3, eVar4, qVar3, dVar);
                u2.r.J(eVar5, c15, qVar3);
                qVar = qVar4;
                i3.t h10 = l1.n.h(m3.h.c(p2.o(qVar, 52), elevenLabsTheme.getShapes(qVar3, i12).getMd()), elevenLabsTheme.getColor(qVar3, i12).getBackground().m2005getSecondary0d7_KjU(), p3.h0.f26395b);
                f1 d10 = r1.p.d(i3.d.f13001e, false);
                int hashCode5 = Long.hashCode(qVar3.T);
                c3.o l12 = qVar3.l();
                i3.t c16 = i3.a.c(h10, qVar3);
                qVar3.b0();
                if (qVar3.S) {
                    qVar3.k(aVar2);
                } else {
                    qVar3.k0();
                }
                u2.r.J(eVar2, d10, qVar3);
                u2.r.J(eVar3, l12, qVar3);
                defpackage.f.u(hashCode5, qVar3, eVar4, qVar3, dVar);
                u2.r.J(eVar5, c16, qVar3);
                y2.a(kd.a.M(io.elevenlabs.ui.R.drawable.file, qVar3, 0), null, null, 0L, qVar3, u3.c.$stable | 48, 12);
                qVar3.p(true);
                r1.d.g(p2.s(qVar, elevenLabsTheme.getSpacings(qVar3, i12).m2355getX3D9Ej5fM()), qVar3);
                String name = importFileState.getFile().getName();
                if (name == null) {
                    qVar3.X(300810675);
                    name = kj.c.R(qVar3, R.string.import_file_default_file_name);
                    z10 = false;
                } else {
                    z10 = false;
                    qVar3.X(300809094);
                }
                qVar3.p(z10);
                String str = name;
                y0 bodyLarge500 = elevenLabsTheme.getTypo(qVar3, i12).getBodyLarge500();
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                j7.d(str, new m1(1.0f, true), 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, null, bodyLarge500, qVar3, 0, 24960, 110588);
                qVar2 = qVar3;
                qVar2.p(true);
                qVar2.p(false);
            }
            if (!wq.n.m0(importFileState.getError())) {
                qVar2.X(954279908);
                r1.d.g(p2.f(qVar, elevenLabsTheme.getSpacings(qVar2, i12).m2353getX2D9Ej5fM()), qVar2);
                ErrorContainerKt.ErrorContainer(importFileState.getError(), qVar2, 0);
                qVar2.p(false);
            } else {
                qVar2.X(954431746);
                qVar2.p(false);
            }
            r1.d.g(p2.f(qVar, elevenLabsTheme.getSpacings(qVar2, i12).m2355getX3D9Ej5fM()), qVar2);
            i3.t e10 = p2.e(qVar, 1.0f);
            String R3 = kj.c.R(qVar2, R.string.import_file_listen);
            int i15 = io.elevenlabs.ui.R.drawable.listen;
            ButtonVariant buttonVariant = ButtonVariant.Primary;
            boolean z11 = !importFileState.isLoading();
            boolean f13 = qVar2.f(lVar);
            Object L4 = qVar2.L();
            if (f13 || L4 == obj) {
                L4 = new a(lVar, 2);
                qVar2.h0(L4);
            }
            u2.q qVar5 = qVar2;
            ButtonKt.Button(R3, (ho.a) L4, e10, null, buttonVariant, Integer.valueOf(i15), null, false, z11, false, qVar5, 24960, 712);
            qVar5.p(true);
            qVar5.p(true);
        } else {
            qVar3.R();
        }
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$2$0$0$0$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$2$0$0$2$0(String str, p4.b0 b0Var) {
        b0Var.getClass();
        p4.y.i(b0Var, 0);
        p4.y.d(str, b0Var);
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$2$0$0$3$0(ho.a aVar) {
        aVar.invoke();
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$2$0$0$5$0(ho.l lVar) {
        lVar.invoke(new j(20));
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$2$0$0$5$0$0(ImportFileViewModel importFileViewModel) {
        importFileViewModel.getClass();
        importFileViewModel.listen();
        return sn.z.f31622a;
    }

    public static final sn.z ImportFileScreenUI$lambda$3(ho.a aVar, ImportFileState importFileState, ho.l lVar, ho.a aVar2, int i10, u2.m mVar, int i11) {
        ImportFileScreenUI(aVar, importFileState, lVar, aVar2, mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportFileScreen_Failed(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1243423813);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(5);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ImportFileState importFileState = new ImportFileState(new SelectedFile("file://whatever", "file-name.pdf"), false, "Sorry, the file you provided cannot be processed. Please check your internet connection and try again.", null, null, false, false, 120, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j(21);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(7);
                qVar.h0(L3);
            }
            ImportFileScreenUI(aVar, importFileState, lVar, (ho.a) L3, qVar, 3462);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 20);
        }
    }

    public static final sn.z Preview_ImportFileScreen_Failed$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportFileScreen_Failed$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_ImportFileScreen_Failed(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportFileScreen_Failed_LongFileName(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-617706327);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(8);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ImportFileState importFileState = new ImportFileState(new SelectedFile("file://whatever", "file-name-that-will-take-more-than-two-lines-and-should-be-split.pdf"), false, "Sorry, the file you provided cannot be processed. Please check your internet connection and try again.", null, null, false, false, 120, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j(22);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(9);
                qVar.h0(L3);
            }
            ImportFileScreenUI(aVar, importFileState, lVar, (ho.a) L3, qVar, 3462);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 21);
        }
    }

    public static final sn.z Preview_ImportFileScreen_Failed_LongFileName$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportFileScreen_Failed_LongFileName$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_ImportFileScreen_Failed_LongFileName(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_ImportFileScreen_Loading(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1406135808);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = new c(4);
                qVar.h0(L);
            }
            ho.a aVar = (ho.a) L;
            ImportFileState importFileState = new ImportFileState(new SelectedFile("file://whatever", "file-name.pdf"), true, null, null, null, false, false, 124, null);
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new j(19);
                qVar.h0(L2);
            }
            ho.l lVar = (ho.l) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c(6);
                qVar.h0(L3);
            }
            ImportFileScreenUI(aVar, importFileState, lVar, (ho.a) L3, qVar, 3462);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.purchases.hourshistory.e(i10, 19);
        }
    }

    public static final sn.z Preview_ImportFileScreen_Loading$lambda$1$0(ho.l lVar) {
        lVar.getClass();
        return sn.z.f31622a;
    }

    public static final sn.z Preview_ImportFileScreen_Loading$lambda$3(int i10, u2.m mVar, int i11) {
        Preview_ImportFileScreen_Loading(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }
}
