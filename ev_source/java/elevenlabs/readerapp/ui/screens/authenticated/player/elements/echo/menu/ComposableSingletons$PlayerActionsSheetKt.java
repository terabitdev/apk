package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu;

import c3.j;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import ho.p;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.DownloadAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.voices.voicedesign.steps.a;
import io.livekit.android.rpc.RpcError;
import j1.w1;
import kotlin.Metadata;
import l2.c0;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import lm.b;
import lm.c;
import lm.d;
import sn.z;
import u2.e;
import u2.l;
import u2.m;
import u2.q;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class ComposableSingletons$PlayerActionsSheetKt {
    public static final ComposableSingletons$PlayerActionsSheetKt INSTANCE = new ComposableSingletons$PlayerActionsSheetKt();

    /* renamed from: lambda$-1666692005 */
    private static p f442lambda$1666692005 = new j(new a(24), false, -1666692005);

    /* renamed from: lambda$-184009001 */
    private static p f444lambda$184009001 = new j(new lm.a(7), false, -184009001);
    private static p lambda$1655559156 = new j(new lm.a(10), false, 1655559156);
    private static p lambda$396404667 = new j(new lm.a(12), false, 396404667);

    /* renamed from: lambda$-1767670041 */
    private static p f443lambda$1767670041 = new j(new lm.a(15), false, -1767670041);
    private static p lambda$237743238 = new j(new lm.a(17), false, 237743238);
    private static p lambda$1510290398 = new j(new lm.a(21), false, 1510290398);
    private static p lambda$933996734 = new j(new lm.a(22), false, 933996734);

    public static final z lambda_1510290398$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(29);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new w1(11);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c0(14);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new c0(15);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new c0(16);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new c0(17);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new w1(12);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new c0(18);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new w1(13);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new w1(14);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new c(19);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new a(25);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new a(26);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new c0(10);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new c0(11);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new a(27);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new c0(12);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new c0(13);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, stubReadMeta$default, playerDisplayMode, true, true, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, false, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1510290398$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new b(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(0);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new b(23);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new b(24);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new b(25);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new b(26);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(1);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new b(27);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new c(2);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new c(3);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new w1(29);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new lm.a(8);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(9);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new b(19);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new b(20);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(11);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new b(21);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new b(22);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, stubReadMeta$default, playerDisplayMode, false, true, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_1655559156$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new b(0);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new w1(21);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new b(6);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new b(7);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new b(8);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new b(9);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new w1(22);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new b(10);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new w1(23);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new w1(24);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new w1(20);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new lm.a(3);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(4);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new b(1);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new b(2);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(5);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new b(4);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new b(5);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, stubReadMeta$default, playerDisplayMode, true, true, false, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_237743238$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new b(28);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(5);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(3);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new d(4);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new d(5);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new d(6);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(6);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new d(7);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new c(7);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new c(8);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new c(4);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new lm.a(13);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(14);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new b(29);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new d(0);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(16);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new d(1);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new d(2);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, stubReadMeta$default, playerDisplayMode, true, false, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_396404667$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0(m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            copy = r4.copy((r84 & 1) != 0 ? r4.articleImageUrl : null, (r84 & 2) != 0 ? r4.author : null, (r84 & 4) != 0 ? r4.chapters : null, (r84 & 8) != 0 ? r4.charCount : 0L, (r84 & 16) != 0 ? r4.createdAt : null, (r84 & 32) != 0 ? r4.updatedAt : null, (r84 & 64) != 0 ? r4.addedAt : null, (r84 & 128) != 0 ? r4.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r4.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.source : null, (r84 & 2048) != 0 ? r4.title : null, (r84 & 4096) != 0 ? r4.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.url : null, (r84 & 16384) != 0 ? r4.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.originalFileType : null, (r84 & 65536) != 0 ? r4.hasOriginalAudio : false, (r84 & 131072) != 0 ? r4.matureContent : false, (r84 & 262144) != 0 ? r4.origin : null, (r84 & 524288) != 0 ? r4.contentType : null, (r84 & 1048576) != 0 ? r4.genre : null, (r84 & 2097152) != 0 ? r4.isBookType : false, (r84 & 4194304) != 0 ? r4.fromUserImport : false, (r84 & 8388608) != 0 ? r4.rating : null, (r84 & 16777216) != 0 ? r4.userRating : null, (r84 & 33554432) != 0 ? r4.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r4.creationStatus : null, (r84 & 134217728) != 0 ? r4.creationProgress : null, (r84 & 268435456) != 0 ? r4.isArchived : false, (r84 & 536870912) != 0 ? r4.markedAsUnread : false, (r84 & 1073741824) != 0 ? r4.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r4.publicationDate : null, (r85 & 1) != 0 ? r4.language : null, (r85 & 2) != 0 ? r4.publisherProfileId : null, (r85 & 4) != 0 ? r4.canDelete : false, (r85 & 8) != 0 ? r4.androidProductId : null, (r85 & 16) != 0 ? r4.isPaid : false, (r85 & 32) != 0 ? r4.offlineReadData : null, (r85 & 64) != 0 ? r4.previewAudio : null, (r85 & 128) != 0 ? r4.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.voiceSelectionConfig : null, (r85 & 512) != 0 ? r4.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.displayMode : null, (r85 & 2048) != 0 ? r4.inUserLibrary : false, (r85 & 4096) != 0 ? r4.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.audioType : null, (r85 & 16384) != 0 ? r4.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r4.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r4.audioDurationSeconds : null, (r85 & 262144) != 0 ? r4.audioTypes : null, (r85 & 524288) != 0 ? r4.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r4.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r4.coverImageUrls : null, (r85 & 4194304) != 0 ? r4.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(8);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(10);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(13);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new d(14);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new d(15);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new d(16);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(11);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new d(17);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new c(12);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new c(13);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new c(9);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new lm.a(18);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(19);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new d(9);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new d(10);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(20);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new d(11);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new d(12);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, copy, playerDisplayMode, false, false, false, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, false, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda_933996734$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0(m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            copy = r4.copy((r84 & 1) != 0 ? r4.articleImageUrl : null, (r84 & 2) != 0 ? r4.author : null, (r84 & 4) != 0 ? r4.chapters : null, (r84 & 8) != 0 ? r4.charCount : 0L, (r84 & 16) != 0 ? r4.createdAt : null, (r84 & 32) != 0 ? r4.updatedAt : null, (r84 & 64) != 0 ? r4.addedAt : null, (r84 & 128) != 0 ? r4.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r4.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.source : null, (r84 & 2048) != 0 ? r4.title : null, (r84 & 4096) != 0 ? r4.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.url : "https://example.com", (r84 & 16384) != 0 ? r4.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.originalFileType : null, (r84 & 65536) != 0 ? r4.hasOriginalAudio : false, (r84 & 131072) != 0 ? r4.matureContent : false, (r84 & 262144) != 0 ? r4.origin : null, (r84 & 524288) != 0 ? r4.contentType : null, (r84 & 1048576) != 0 ? r4.genre : null, (r84 & 2097152) != 0 ? r4.isBookType : false, (r84 & 4194304) != 0 ? r4.fromUserImport : true, (r84 & 8388608) != 0 ? r4.rating : null, (r84 & 16777216) != 0 ? r4.userRating : null, (r84 & 33554432) != 0 ? r4.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r4.creationStatus : null, (r84 & 134217728) != 0 ? r4.creationProgress : null, (r84 & 268435456) != 0 ? r4.isArchived : false, (r84 & 536870912) != 0 ? r4.markedAsUnread : false, (r84 & 1073741824) != 0 ? r4.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r4.publicationDate : null, (r85 & 1) != 0 ? r4.language : null, (r85 & 2) != 0 ? r4.publisherProfileId : null, (r85 & 4) != 0 ? r4.canDelete : true, (r85 & 8) != 0 ? r4.androidProductId : null, (r85 & 16) != 0 ? r4.isPaid : false, (r85 & 32) != 0 ? r4.offlineReadData : null, (r85 & 64) != 0 ? r4.previewAudio : null, (r85 & 128) != 0 ? r4.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.voiceSelectionConfig : null, (r85 & 512) != 0 ? r4.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.displayMode : null, (r85 & 2048) != 0 ? r4.inUserLibrary : false, (r85 & 4096) != 0 ? r4.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.audioType : null, (r85 & 16384) != 0 ? r4.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r4.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r4.audioDurationSeconds : null, (r85 & 262144) != 0 ? r4.audioTypes : null, (r85 & 524288) != 0 ? r4.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r4.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r4.coverImageUrls : null, (r85 & 4194304) != 0 ? r4.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(23);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new w1(25);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new b(13);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new b(14);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new b(15);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new b(16);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new w1(26);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new b(17);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new w1(27);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new w1(28);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new c(20);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new a(28);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(1);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new c0(28);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new b(3);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(6);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new b(11);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new b(12);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, copy, playerDisplayMode, true, true, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1666692005$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0(m mVar, int i10) {
        boolean z6;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            ReadMeta stubReadMeta$default = ReadsFactoryKt.stubReadMeta$default(null, 1, null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Text;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new d(18);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new c(15);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new d(24);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new d(25);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new d(26);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new d(27);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new c(16);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new d(28);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new c(17);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new c(18);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new c(14);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new lm.a(23);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(24);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new d(19);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new d(20);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(25);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new d(21);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new d(22);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, stubReadMeta$default, playerDisplayMode, true, true, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__1767670041$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0(m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        if ((i10 & 3) != 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        q qVar = (q) mVar;
        if (qVar.O(i10 & 1, z6)) {
            copy = r4.copy((r84 & 1) != 0 ? r4.articleImageUrl : null, (r84 & 2) != 0 ? r4.author : null, (r84 & 4) != 0 ? r4.chapters : null, (r84 & 8) != 0 ? r4.charCount : 0L, (r84 & 16) != 0 ? r4.createdAt : null, (r84 & 32) != 0 ? r4.updatedAt : null, (r84 & 64) != 0 ? r4.addedAt : null, (r84 & 128) != 0 ? r4.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r4.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.source : null, (r84 & 2048) != 0 ? r4.title : null, (r84 & 4096) != 0 ? r4.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.url : null, (r84 & 16384) != 0 ? r4.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.originalFileType : null, (r84 & 65536) != 0 ? r4.hasOriginalAudio : false, (r84 & 131072) != 0 ? r4.matureContent : false, (r84 & 262144) != 0 ? r4.origin : null, (r84 & 524288) != 0 ? r4.contentType : null, (r84 & 1048576) != 0 ? r4.genre : null, (r84 & 2097152) != 0 ? r4.isBookType : false, (r84 & 4194304) != 0 ? r4.fromUserImport : false, (r84 & 8388608) != 0 ? r4.rating : null, (r84 & 16777216) != 0 ? r4.userRating : null, (r84 & 33554432) != 0 ? r4.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r4.creationStatus : null, (r84 & 134217728) != 0 ? r4.creationProgress : null, (r84 & 268435456) != 0 ? r4.isArchived : false, (r84 & 536870912) != 0 ? r4.markedAsUnread : false, (r84 & 1073741824) != 0 ? r4.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r4.publicationDate : null, (r85 & 1) != 0 ? r4.language : null, (r85 & 2) != 0 ? r4.publisherProfileId : null, (r85 & 4) != 0 ? r4.canDelete : false, (r85 & 8) != 0 ? r4.androidProductId : null, (r85 & 16) != 0 ? r4.isPaid : false, (r85 & 32) != 0 ? r4.offlineReadData : null, (r85 & 64) != 0 ? r4.previewAudio : null, (r85 & 128) != 0 ? r4.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r4.voiceSelectionConfig : null, (r85 & 512) != 0 ? r4.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r4.displayMode : null, (r85 & 2048) != 0 ? r4.inUserLibrary : false, (r85 & 4096) != 0 ? r4.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r4.audioType : null, (r85 & 16384) != 0 ? r4.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r4.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r4.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r4.audioDurationSeconds : null, (r85 & 262144) != 0 ? r4.audioTypes : null, (r85 & 524288) != 0 ? r4.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r4.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r4.coverImageUrls : null, (r85 & 4194304) != 0 ? r4.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Audio;
            Object L = qVar.L();
            e eVar = l.f33918a;
            if (L == eVar) {
                L = new c0(19);
                qVar.h0(L);
            }
            ho.l lVar = (ho.l) L;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new w1(16);
                qVar.h0(L2);
            }
            ho.a aVar = (ho.a) L2;
            Object L3 = qVar.L();
            if (L3 == eVar) {
                L3 = new c0(24);
                qVar.h0(L3);
            }
            ho.l lVar2 = (ho.l) L3;
            Object L4 = qVar.L();
            if (L4 == eVar) {
                L4 = new c0(25);
                qVar.h0(L4);
            }
            ho.l lVar3 = (ho.l) L4;
            Object L5 = qVar.L();
            if (L5 == eVar) {
                L5 = new c0(26);
                qVar.h0(L5);
            }
            ho.l lVar4 = (ho.l) L5;
            Object L6 = qVar.L();
            if (L6 == eVar) {
                L6 = new c0(27);
                qVar.h0(L6);
            }
            ho.l lVar5 = (ho.l) L6;
            Object L7 = qVar.L();
            if (L7 == eVar) {
                L7 = new w1(17);
                qVar.h0(L7);
            }
            ho.a aVar2 = (ho.a) L7;
            Object L8 = qVar.L();
            if (L8 == eVar) {
                L8 = new c0(29);
                qVar.h0(L8);
            }
            ho.l lVar6 = (ho.l) L8;
            Object L9 = qVar.L();
            if (L9 == eVar) {
                L9 = new w1(18);
                qVar.h0(L9);
            }
            ho.a aVar3 = (ho.a) L9;
            Object L10 = qVar.L();
            if (L10 == eVar) {
                L10 = new w1(19);
                qVar.h0(L10);
            }
            ho.a aVar4 = (ho.a) L10;
            Object L11 = qVar.L();
            if (L11 == eVar) {
                L11 = new w1(15);
                qVar.h0(L11);
            }
            ho.a aVar5 = (ho.a) L11;
            Object L12 = qVar.L();
            if (L12 == eVar) {
                L12 = new a(29);
                qVar.h0(L12);
            }
            p pVar = (p) L12;
            Object L13 = qVar.L();
            if (L13 == eVar) {
                L13 = new lm.a(0);
                qVar.h0(L13);
            }
            p pVar2 = (p) L13;
            Object L14 = qVar.L();
            if (L14 == eVar) {
                L14 = new c0(20);
                qVar.h0(L14);
            }
            ho.l lVar7 = (ho.l) L14;
            Object L15 = qVar.L();
            if (L15 == eVar) {
                L15 = new c0(21);
                qVar.h0(L15);
            }
            ho.l lVar8 = (ho.l) L15;
            Object L16 = qVar.L();
            if (L16 == eVar) {
                L16 = new lm.a(2);
                qVar.h0(L16);
            }
            p pVar3 = (p) L16;
            Object L17 = qVar.L();
            if (L17 == eVar) {
                L17 = new c0(22);
                qVar.h0(L17);
            }
            ho.l lVar9 = (ho.l) L17;
            Object L18 = qVar.L();
            if (L18 == eVar) {
                L18 = new c0(23);
                qVar.h0(L18);
            }
            PlayerActionsSheetKt.PlayerActionsSheet(lVar, copy, playerDisplayMode, true, true, true, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, true, true, lVar8, pVar3, lVar9, (ho.l) L18, null, null, qVar, 920350086, 920350134, 28086, 100663296);
        } else {
            qVar.R();
        }
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$0$0(ho.l lVar) {
        lVar.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$11$0(DownloadAction downloadAction, Analytics.Event.PlayerActionSource playerActionSource) {
        downloadAction.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$12$0(PlayerDisplayMode playerDisplayMode, Analytics.Event.PlayerActionSource playerActionSource) {
        playerDisplayMode.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$13$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$14$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$15$0(String str, Analytics.Event.PlayerActionSource playerActionSource) {
        str.getClass();
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$16$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$17$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$2$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$3$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$4$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$5$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z lambda__184009001$lambda$0$7$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    /* renamed from: getLambda$-1666692005$app_productionRelease */
    public final p m1509getLambda$1666692005$app_productionRelease() {
        return f442lambda$1666692005;
    }

    /* renamed from: getLambda$-1767670041$app_productionRelease */
    public final p m1510getLambda$1767670041$app_productionRelease() {
        return f443lambda$1767670041;
    }

    /* renamed from: getLambda$-184009001$app_productionRelease */
    public final p m1511getLambda$184009001$app_productionRelease() {
        return f444lambda$184009001;
    }

    public final p getLambda$1510290398$app_productionRelease() {
        return lambda$1510290398;
    }

    public final p getLambda$1655559156$app_productionRelease() {
        return lambda$1655559156;
    }

    public final p getLambda$237743238$app_productionRelease() {
        return lambda$237743238;
    }

    public final p getLambda$396404667$app_productionRelease() {
        return lambda$396404667;
    }

    public final p getLambda$933996734$app_productionRelease() {
        return lambda$933996734;
    }
}
