package io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu;

import a2.d0;
import a2.h3;
import android.gov.nist.javax.sip.header.ParameterNames;
import c3.k;
import c3.o;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.c6;
import f4.f1;
import h4.d;
import h4.e;
import h4.f;
import h4.f2;
import h4.h;
import ho.a;
import ho.l;
import ho.p;
import ho.r;
import i3.t;
import ib.i;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.model.CoverImageSize;
import io.elevenlabs.domain.model.DisplayMode;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.OfflineReadStatus;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.model.SampleConfig;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.DownloadAction;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.c0;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.echo.menu.PlayerActionsSheetKt;
import io.elevenlabs.ui.R;
import io.elevenlabs.ui.components.CachedAsyncImageKt;
import io.elevenlabs.ui.components.ConfirmationDialogKt;
import io.elevenlabs.ui.components.DividerKt;
import io.elevenlabs.ui.components.VoiceAvatarKt;
import io.elevenlabs.ui.components.scaffolds.BottomSheetControl;
import io.elevenlabs.ui.components.scaffolds.BottomSheetScaffoldKt;
import io.elevenlabs.ui.echo.EchoTheme;
import io.elevenlabs.ui.echo.EchoThemeColors;
import io.elevenlabs.ui.echo.EchoThemeShapes;
import io.elevenlabs.ui.echo.EchoThemeTypography;
import io.elevenlabs.ui.echo.components.ButtonIconContainerSize;
import io.elevenlabs.ui.echo.components.ButtonIconKt;
import io.elevenlabs.ui.echo.components.TileKt;
import io.elevenlabs.ui.echo.components.UpsellTitleKt;
import io.livekit.android.rpc.RpcError;
import kj.c;
import kotlin.Metadata;
import l1.n;
import livekit.LivekitInternal$NodeStats;
import lm.g;
import p3.h0;
import p4.b0;
import q2.e5;
import q2.j7;
import q2.y2;
import r1.d2;
import r1.i1;
import r1.i2;
import r1.j;
import r1.k2;
import r1.m1;
import r1.p2;
import r1.u0;
import r1.w;
import r1.x;
import r1.y;
import s4.y0;
import sn.z;
import t2.u;
import u2.m;
import u2.q;
import u2.r1;
import u2.z0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u001aË\u0003\u0010&\u001a\u00020\u00022\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00182\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00182\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u00002\n\b\u0002\u0010$\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010 H\u0001¢\u0006\u0004\b&\u0010'\u001a9\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020 2\b\u0010)\u001a\u0004\u0018\u00010 2\b\u0010*\u001a\u0004\u0018\u00010 2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b,\u0010-\u001aa\u00100\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u0010/\u001a\u00020.H\u0003¢\u0006\u0004\b0\u00101\u001a9\u00106\u001a\u00020\u00022\b\b\u0001\u00103\u001a\u0002022\u0006\u0010(\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\b\b\u0002\u00105\u001a\u00020\bH\u0003¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010 2\b\u0010%\u001a\u0004\u0018\u00010 2\u0006\u0010(\u001a\u00020 2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b8\u0010-\u001a\u000f\u00109\u001a\u00020\u0002H\u0003¢\u0006\u0004\b9\u0010:\u001a?\u0010;\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\u0018H\u0003¢\u0006\u0004\b;\u0010<\u001a=\u0010=\u001a\u00020\u00022\u001e\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0003¢\u0006\u0004\b=\u0010>\u001a\u000f\u0010?\u001a\u00020\u0002H\u0001¢\u0006\u0004\b?\u0010:\u001a\u000f\u0010@\u001a\u00020\u0002H\u0001¢\u0006\u0004\b@\u0010:\u001a\u000f\u0010A\u001a\u00020\u0002H\u0001¢\u0006\u0004\bA\u0010:\u001a\u000f\u0010B\u001a\u00020\u0002H\u0001¢\u0006\u0004\bB\u0010:\u001a\u000f\u0010C\u001a\u00020\u0002H\u0001¢\u0006\u0004\bC\u0010:\u001a\u000f\u0010D\u001a\u00020\u0002H\u0001¢\u0006\u0004\bD\u0010:\u001a\u000f\u0010E\u001a\u00020\u0002H\u0001¢\u0006\u0004\bE\u0010:\u001a\u000f\u0010F\u001a\u00020\u0002H\u0001¢\u0006\u0004\bF\u0010:¨\u0006H²\u0006\u000e\u0010G\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lkotlin/Function1;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/PlayerViewModel;", "Lsn/z;", "action", "Lio/elevenlabs/domain/model/ReadMeta;", "readMeta", "Lio/elevenlabs/domain/model/PlayerDisplayMode;", "displayMode", "", "canUpgrade", "canShare", "isVoiceAssistantAvailable", "Lkotlin/Function0;", "onDismiss", "Lio/elevenlabs/domain/Analytics$Event$PlayerActionSource;", "onViewDetailsClick", "onRateTitleClick", "onAddToCollectionClick", "onBookmarksClick", "onSleepTimerClick", "onHelpClick", "onVoicesClick", "onSoundscapesClick", "onPronunciationsClick", "Lkotlin/Function2;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/player/DownloadAction;", "onDownloadActionClick", "onChangeDisplayMode", "onSearchClick", "showSearchButton", "showContentsButton", "onContentsClick", "", "onOpenInBrowserClick", "onVoiceChatClick", "onShareClick", "voiceId", "voiceImageUrl", "PlayerActionsSheet", "(Lho/l;Lio/elevenlabs/domain/model/ReadMeta;Lio/elevenlabs/domain/model/PlayerDisplayMode;ZZZLho/a;Lho/l;Lho/l;Lho/l;Lho/l;Lho/a;Lho/l;Lho/a;Lho/a;Lho/a;Lho/p;Lho/p;Lho/l;ZZLho/l;Lho/p;Lho/l;Lho/l;Ljava/lang/String;Ljava/lang/String;Lu2/m;IIII)V", "title", "author", "imageUrl", "onClose", "SheetHeader", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lho/a;Lu2/m;I)V", "Li3/t;", "modifier", "QuickActionsRow", "(ZZLho/a;Lho/a;Lho/a;Lho/a;Li3/t;Lu2/m;II)V", "", ParameterNames.ICON, "onClick", "isDestructive", "SheetMenuItem", "(ILjava/lang/String;Lho/a;ZLu2/m;II)V", "SheetMenuItemVoice", "SheetDivider", "(Lu2/m;I)V", "SheetMenuItemDownload", "(Lio/elevenlabs/domain/model/ReadMeta;Lho/a;Lho/p;Lu2/m;I)V", "SheetMenuItemDelete", "(Lho/l;Lho/a;Lu2/m;I)V", "Preview_PlayerActionsSheet_UserImport_Full", "Preview_PlayerActionsSheet_CatalogContent", "Preview_PlayerActionsSheet_UltraUser", "Preview_PlayerActionsSheet_NoShare", "Preview_PlayerActionsSheet_TextMode", "Preview_PlayerActionsSheet_NoVoiceChat", "Preview_PlayerActionsSheet_NoChapters", "Preview_PlayerActionsSheet_Minimal", "deleteConfirmationVisible", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerActionsSheetKt {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OfflineReadStatus.values().length];
            try {
                iArr[OfflineReadStatus.DOWNLOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OfflineReadStatus.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OfflineReadStatus.EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OfflineReadStatus.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DownloadAction.values().length];
            try {
                iArr2[DownloadAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DownloadAction.REMOVE_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DownloadAction.CANCEL_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DownloadAction.RETRY_DOWNLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void PlayerActionsSheet(final l lVar, final ReadMeta readMeta, final PlayerDisplayMode playerDisplayMode, final boolean z6, final boolean z10, final boolean z11, final a aVar, final l lVar2, final l lVar3, final l lVar4, final l lVar5, final a aVar2, final l lVar6, final a aVar3, final a aVar4, final a aVar5, final p pVar, final p pVar2, final l lVar7, final boolean z12, final boolean z13, final l lVar8, final p pVar3, l lVar9, l lVar10, String str, String str2, m mVar, final int i10, final int i11, final int i12, final int i13) {
        int i14;
        boolean z14;
        boolean z15;
        l lVar11;
        int i15;
        l lVar12;
        a aVar6;
        int i16;
        int i17;
        int i18;
        q qVar;
        final l lVar13;
        final l lVar14;
        final String str3;
        final String str4;
        l lVar15;
        final l lVar16;
        lVar.getClass();
        readMeta.getClass();
        playerDisplayMode.getClass();
        aVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        lVar5.getClass();
        aVar2.getClass();
        lVar6.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        pVar.getClass();
        pVar2.getClass();
        lVar7.getClass();
        lVar8.getClass();
        pVar3.getClass();
        q qVar2 = (q) mVar;
        qVar2.Z(-208218050);
        if ((i10 & 6) == 0) {
            i14 = (qVar2.h(lVar) ? 4 : 2) | i10;
        } else {
            i14 = i10;
        }
        if ((i10 & 48) == 0) {
            i14 |= qVar2.h(readMeta) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i14 |= qVar2.d(playerDisplayMode.ordinal()) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        if ((i10 & 3072) == 0) {
            z14 = z6;
            i14 |= qVar2.g(z14) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            z14 = z6;
        }
        int i19 = i10 & 24576;
        int i20 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        if (i19 == 0) {
            z15 = z10;
            i14 |= qVar2.g(z15) ? 16384 : 8192;
        } else {
            z15 = z10;
        }
        if ((i10 & 196608) == 0) {
            i14 |= qVar2.g(z11) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i14 |= qVar2.h(aVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i14 |= qVar2.h(lVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i14 |= qVar2.h(lVar3) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i14 |= qVar2.h(lVar4) ? 536870912 : 268435456;
        }
        int i21 = i14;
        if ((i11 & 6) == 0) {
            lVar11 = lVar5;
            i15 = i11 | (qVar2.h(lVar11) ? 4 : 2);
        } else {
            lVar11 = lVar5;
            i15 = i11;
        }
        if ((i11 & 48) == 0) {
            i15 |= qVar2.h(aVar2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            lVar12 = lVar6;
            i15 |= qVar2.h(lVar12) ? RpcError.MAX_MESSAGE_BYTES : 128;
        } else {
            lVar12 = lVar6;
        }
        if ((i11 & 3072) == 0) {
            aVar6 = aVar3;
            i15 |= qVar2.h(aVar6) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            aVar6 = aVar3;
        }
        if ((i11 & 24576) == 0) {
            i15 |= qVar2.h(aVar4) ? 16384 : 8192;
        }
        if ((i11 & 196608) == 0) {
            i15 |= qVar2.h(aVar5) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= qVar2.h(pVar) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= qVar2.h(pVar2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= qVar2.h(lVar7) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= qVar2.g(z12) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i16 = i12 | (qVar2.g(z13) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= qVar2.h(lVar8) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i16 |= qVar2.h(pVar3) ? RpcError.MAX_MESSAGE_BYTES : 128;
        }
        int i22 = i16;
        int i23 = i13 & 8388608;
        if (i23 != 0) {
            i17 = i22 | 3072;
        } else {
            int i24 = i22;
            if ((i12 & 3072) == 0) {
                i24 |= qVar2.h(lVar9) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i17 = i24;
        }
        int i25 = i13 & 16777216;
        if (i25 != 0) {
            i18 = i17 | 24576;
        } else {
            int i26 = i17;
            if ((i12 & 24576) == 0) {
                if (qVar2.h(lVar10)) {
                    i20 = 16384;
                }
                i18 = i26 | i20;
            } else {
                i18 = i26;
            }
        }
        int i27 = i13 & 33554432;
        if (i27 != 0) {
            i18 |= 196608;
        } else if ((i12 & 196608) == 0) {
            i18 |= qVar2.f(str) ? 131072 : 65536;
        }
        int i28 = i13 & 67108864;
        if (i28 != 0) {
            i18 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            i18 |= qVar2.f(str2) ? 1048576 : 524288;
        }
        final boolean z16 = false;
        if (qVar2.O(i21 & 1, ((i21 & 306783379) == 306783378 && (i15 & 306783379) == 306783378 && (i18 & 599187) == 599186) ? false : true)) {
            Object obj = u2.l.f33918a;
            if (i23 != 0) {
                Object L = qVar2.L();
                if (L == obj) {
                    L = new g(2);
                    qVar2.h0(L);
                }
                lVar15 = (l) L;
            } else {
                lVar15 = lVar9;
            }
            if (i25 != 0) {
                Object L2 = qVar2.L();
                if (L2 == obj) {
                    L2 = new g(3);
                    qVar2.h0(L2);
                }
                lVar16 = (l) L2;
            } else {
                lVar16 = lVar10;
            }
            final String str5 = i27 != 0 ? null : str;
            final String str6 = i28 != 0 ? null : str2;
            SampleConfig sampleConfig = readMeta.getSampleConfig();
            if (sampleConfig != null && sampleConfig.isSample()) {
                z16 = true;
            }
            final l lVar17 = lVar15;
            final boolean z17 = z15;
            final boolean z18 = z14;
            final l lVar18 = lVar12;
            final a aVar7 = aVar6;
            final l lVar19 = lVar11;
            qVar = qVar2;
            BottomSheetScaffoldKt.EchoBottomSheetScaffold(false, aVar, null, false, null, k.d(-1480762432, true, new h3(readMeta, 11), qVar2), k.d(1204953681, true, new r() { // from class: lm.h
                @Override // ho.r
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    z PlayerActionsSheet$lambda$3;
                    int intValue = ((Integer) obj5).intValue();
                    PlayerActionsSheet$lambda$3 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3(z18, z11, z13, lVar17, lVar8, lVar19, aVar2, readMeta, playerDisplayMode, pVar2, lVar, str5, str6, aVar7, aVar4, aVar5, z12, lVar7, z17, lVar16, z16, lVar3, lVar4, pVar, lVar2, pVar3, lVar18, (y) obj2, (BottomSheetControl) obj3, (m) obj4, intValue);
                    return PlayerActionsSheet$lambda$3;
                }
            }, qVar), qVar, ((i21 >> 15) & 112) | 1769472, 29);
            lVar13 = lVar17;
            str3 = str5;
            str4 = str6;
            lVar14 = lVar16;
        } else {
            qVar = qVar2;
            qVar.R();
            lVar13 = lVar9;
            lVar14 = lVar10;
            str3 = str;
            str4 = str2;
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new p() { // from class: lm.i
                @Override // ho.p
                public final Object invoke(Object obj2, Object obj3) {
                    z PlayerActionsSheet$lambda$4;
                    int intValue = ((Integer) obj3).intValue();
                    PlayerActionsSheet$lambda$4 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$4(l.this, readMeta, playerDisplayMode, z6, z10, z11, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, z12, z13, lVar8, pVar3, lVar13, lVar14, str3, str4, i10, i11, i12, i13, (m) obj2, intValue);
                    return PlayerActionsSheet$lambda$4;
                }
            };
        }
    }

    public static final z PlayerActionsSheet$lambda$0$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$1$0(Analytics.Event.PlayerActionSource playerActionSource) {
        playerActionSource.getClass();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$2(ReadMeta readMeta, BottomSheetControl bottomSheetControl, m mVar, int i10) {
        bottomSheetControl.getClass();
        String title = readMeta.getTitle();
        String author = readMeta.getAuthor();
        String coverImageUrl = ReadMetaKt.coverImageUrl(readMeta, CoverImageSize.Medium);
        q qVar = (q) mVar;
        boolean h10 = qVar.h(bottomSheetControl);
        Object L = qVar.L();
        if (h10 || L == u2.l.f33918a) {
            L = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g(bottomSheetControl, 5);
            qVar.h0(L);
        }
        SheetHeader(title, author, coverImageUrl, (a) L, qVar, 0);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$2$0$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3(boolean z6, boolean z10, boolean z11, final l lVar, final l lVar2, final l lVar3, a aVar, ReadMeta readMeta, PlayerDisplayMode playerDisplayMode, p pVar, final l lVar4, String str, String str2, a aVar2, a aVar3, a aVar4, boolean z12, final l lVar5, boolean z13, final l lVar6, boolean z14, final l lVar7, final l lVar8, p pVar2, final l lVar9, p pVar3, final l lVar10, y yVar, final BottomSheetControl bottomSheetControl, m mVar, int i10) {
        e eVar;
        d dVar;
        int i11;
        int i12;
        boolean z15;
        int i13;
        int i14;
        yVar.getClass();
        bottomSheetControl.getClass();
        i3.q qVar = i3.q.f13017a;
        t e10 = p2.e(qVar, 1.0f);
        r1.e eVar2 = j.f29230c;
        i3.j jVar = i3.d.B0;
        x a10 = w.a(eVar2, jVar, mVar, 0);
        q qVar2 = (q) mVar;
        int hashCode = Long.hashCode(qVar2.T);
        o l4 = qVar2.l();
        t c5 = i3.a.c(e10, mVar);
        h.f11920i.getClass();
        f fVar = h4.g.f11903b;
        f2 f2Var = qVar2.f33969a;
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        e eVar3 = h4.g.f11907f;
        u2.r.J(eVar3, a10, mVar);
        e eVar4 = h4.g.f11906e;
        u2.r.J(eVar4, l4, mVar);
        Integer valueOf = Integer.valueOf(hashCode);
        e eVar5 = h4.g.f11908g;
        u2.r.y(mVar, valueOf, eVar5);
        d dVar2 = h4.g.f11909h;
        u2.r.F(dVar2, mVar);
        e eVar6 = h4.g.f11905d;
        u2.r.J(eVar6, c5, mVar);
        t e11 = p2.e(qVar, 1.0f);
        if (1.0f <= 0.0d) {
            s1.a.a("invalid weight; must be greater than zero");
        }
        t y10 = n.y(e11.then(new m1(1.0f, false)), n.x(mVar), true, true);
        x a11 = w.a(eVar2, jVar, mVar, 0);
        int hashCode2 = Long.hashCode(qVar2.T);
        o l7 = qVar2.l();
        t c10 = i3.a.c(y10, mVar);
        qVar2.b0();
        if (qVar2.S) {
            qVar2.k(fVar);
        } else {
            qVar2.k0();
        }
        u2.r.J(eVar3, a11, mVar);
        u2.r.J(eVar4, l7, mVar);
        u2.r.y(mVar, Integer.valueOf(hashCode2), eVar5);
        u2.r.F(dVar2, mVar);
        u2.r.J(eVar6, c10, mVar);
        EchoTheme echoTheme = EchoTheme.INSTANCE;
        int i15 = EchoTheme.$stable;
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i15).getX4()), mVar);
        t G = r1.d.G(qVar, echoTheme.getSpacings(mVar, i15).getX5(), u.P, 2);
        boolean h10 = qVar2.h(bottomSheetControl) | qVar2.f(lVar);
        Object L = qVar2.L();
        u2.e eVar7 = u2.l.f33918a;
        if (h10 || L == eVar7) {
            final int i16 = 0;
            L = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i16) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L);
        }
        a aVar5 = (a) L;
        boolean h11 = qVar2.h(bottomSheetControl) | qVar2.f(lVar2);
        Object L2 = qVar2.L();
        if (h11 || L2 == eVar7) {
            final int i17 = 8;
            L2 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i17) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar2);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L2);
        }
        a aVar6 = (a) L2;
        boolean h12 = qVar2.h(bottomSheetControl) | qVar2.f(lVar3);
        Object L3 = qVar2.L();
        if (h12 || L3 == eVar7) {
            final int i18 = 11;
            L3 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i18) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L3);
        }
        a aVar7 = (a) L3;
        boolean h13 = qVar2.h(bottomSheetControl) | qVar2.f(aVar);
        Object L4 = qVar2.L();
        if (h13 || L4 == eVar7) {
            eVar = eVar6;
            L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.d(bottomSheetControl, aVar, 3);
            qVar2.h0(L4);
        } else {
            eVar = eVar6;
        }
        QuickActionsRow(z10, z11, aVar5, aVar6, aVar7, (a) L4, G, mVar, 0, 0);
        m mVar2 = mVar;
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar2, i15).getX4()), mVar2);
        if (readMeta.getDisplayMode() != DisplayMode.AudioOnly) {
            qVar2.X(-1940356729);
            PlayerDisplayMode playerDisplayMode2 = PlayerDisplayMode.Audio;
            if (playerDisplayMode == playerDisplayMode2) {
                i13 = R.drawable.ic_bars_three_2;
            } else {
                i13 = R.drawable.headphones_support;
            }
            if (playerDisplayMode == playerDisplayMode2) {
                i14 = io.elevenlabs.readerapp.R.string.player_display_text;
            } else {
                i14 = io.elevenlabs.readerapp.R.string.player_display_player;
            }
            String R = c.R(mVar2, i14);
            boolean h14 = qVar2.h(bottomSheetControl) | qVar2.f(pVar) | qVar2.d(playerDisplayMode.ordinal());
            Object L5 = qVar2.L();
            if (h14 || L5 == eVar7) {
                dVar = dVar2;
                L5 = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.m(bottomSheetControl, pVar, playerDisplayMode, 4);
                qVar2.h0(L5);
            } else {
                dVar = dVar2;
            }
            SheetMenuItem(i13, R, (a) L5, false, mVar, 0, 8);
            mVar2 = mVar;
            qVar2.p(false);
        } else {
            dVar = dVar2;
            qVar2.X(-1939159323);
            qVar2.p(false);
        }
        int i19 = R.drawable.ic_color_palette;
        String R2 = c.R(mVar2, io.elevenlabs.readerapp.R.string.player_customize_title);
        boolean h15 = qVar2.h(bottomSheetControl) | qVar2.f(lVar4);
        Object L6 = qVar2.L();
        if (h15 || L6 == eVar7) {
            final int i20 = 12;
            L6 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i20) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar4);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L6);
        }
        SheetMenuItem(i19, R2, (a) L6, false, mVar2, 0, 8);
        String R3 = c.R(mVar2, io.elevenlabs.readerapp.R.string.player_voices_title);
        boolean h16 = qVar2.h(bottomSheetControl) | qVar2.f(aVar2);
        Object L7 = qVar2.L();
        if (h16 || L7 == eVar7) {
            L7 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.d(bottomSheetControl, aVar2, 4);
            qVar2.h0(L7);
        }
        SheetMenuItemVoice(str, str2, R3, (a) L7, mVar, 0);
        int i21 = R.drawable.ic_sound_fx_outline;
        String R4 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_soundscapes_soundscapes);
        boolean h17 = qVar2.h(bottomSheetControl) | qVar2.f(aVar3);
        Object L8 = qVar2.L();
        if (h17 || L8 == eVar7) {
            L8 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.d(bottomSheetControl, aVar3, 5);
            qVar2.h0(L8);
        }
        SheetMenuItem(i21, R4, (a) L8, false, mVar, 0, 8);
        int i22 = R.drawable.ic_book;
        String R5 = c.R(mVar, io.elevenlabs.readerapp.R.string.menu_action_open_pronunciations_screen);
        boolean h18 = qVar2.h(bottomSheetControl) | qVar2.f(aVar4);
        Object L9 = qVar2.L();
        if (h18 || L9 == eVar7) {
            L9 = new io.elevenlabs.readerapp.ui.screens.authenticated.explore.components.d(bottomSheetControl, aVar4, 6);
            qVar2.h0(L9);
        }
        SheetMenuItem(i22, R5, (a) L9, false, mVar, 0, 8);
        SheetDivider(mVar, 0);
        if (z11) {
            qVar2.X(-1937570728);
            int i23 = R.drawable.ic_bullet_list;
            String R6 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_item_contents);
            boolean h19 = qVar2.h(bottomSheetControl) | qVar2.f(lVar2);
            Object L10 = qVar2.L();
            if (h19 || L10 == eVar7) {
                final int i24 = 13;
                L10 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i24) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar2);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L10);
            }
            SheetMenuItem(i23, R6, (a) L10, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1937158459);
            qVar2.p(false);
        }
        int i25 = R.drawable.ic_bookmark;
        String R7 = c.R(mVar, io.elevenlabs.readerapp.R.string.bookmarking_menu_title);
        boolean h20 = qVar2.h(bottomSheetControl) | qVar2.f(lVar3);
        Object L11 = qVar2.L();
        if (h20 || L11 == eVar7) {
            final int i26 = 1;
            L11 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i26) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar3);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L11);
        }
        SheetMenuItem(i25, R7, (a) L11, false, mVar, 0, 8);
        if (z12) {
            qVar2.X(-1936729140);
            int i27 = R.drawable.ic_magnifying_glass;
            String R8 = c.R(mVar, io.elevenlabs.readerapp.R.string.search_bar_search_placeholder);
            boolean h21 = qVar2.h(bottomSheetControl) | qVar2.f(lVar5);
            Object L12 = qVar2.L();
            if (h21 || L12 == eVar7) {
                final int i28 = 2;
                L12 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i28) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar5);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L12);
            }
            SheetMenuItem(i27, R8, (a) L12, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1936305339);
            qVar2.p(false);
        }
        if (z13) {
            qVar2.X(-1936259552);
            int i29 = R.drawable.ic_arrow_out_of_box;
            String R9 = c.R(mVar, io.elevenlabs.readerapp.R.string.read_details_more_actions_item_title_share);
            boolean h22 = qVar2.h(bottomSheetControl) | qVar2.f(lVar6);
            Object L13 = qVar2.L();
            if (h22 || L13 == eVar7) {
                final int i30 = 3;
                L13 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i30) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar6);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L13);
            }
            SheetMenuItem(i29, R9, (a) L13, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1935824219);
            qVar2.p(false);
        }
        if (readMeta.getFromUserImport() && !z14) {
            qVar2.X(-1935682394);
            int i31 = R.drawable.ic_star;
            String R10 = c.R(mVar, io.elevenlabs.readerapp.R.string.rating_title);
            boolean h23 = qVar2.h(bottomSheetControl) | qVar2.f(lVar7);
            Object L14 = qVar2.L();
            if (h23 || L14 == eVar7) {
                final int i32 = 4;
                L14 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i32) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar7);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L14);
            }
            SheetMenuItem(i31, R10, (a) L14, false, mVar, 0, 8);
            i11 = 0;
            qVar2.p(false);
        } else {
            i11 = 0;
            qVar2.X(-1935283579);
            qVar2.p(false);
        }
        SheetDivider(mVar, i11);
        int i33 = R.drawable.ic_plus_large;
        String R11 = c.R(mVar, io.elevenlabs.readerapp.R.string.read_page_menu_add_to_collection);
        boolean h24 = qVar2.h(bottomSheetControl) | qVar2.f(lVar8);
        Object L15 = qVar2.L();
        if (h24 || L15 == eVar7) {
            final int i34 = 5;
            L15 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i34) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar8);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L15);
        }
        SheetMenuItem(i33, R11, (a) L15, false, mVar, 0, 8);
        boolean h25 = qVar2.h(bottomSheetControl);
        Object L16 = qVar2.L();
        if (h25 || L16 == eVar7) {
            L16 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g(bottomSheetControl, 6);
            qVar2.h0(L16);
        }
        SheetMenuItemDownload(readMeta, (a) L16, pVar2, mVar, 0);
        if (readMeta.getFromUserImport()) {
            qVar2.X(-1934460250);
            String R12 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_rename);
            int i35 = R.drawable.text_edit;
            boolean h26 = qVar2.h(bottomSheetControl) | qVar2.f(lVar4);
            Object L17 = qVar2.L();
            if (h26 || L17 == eVar7) {
                final int i36 = 6;
                L17 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i36) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L17);
            }
            SheetMenuItem(i35, R12, (a) L17, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1934105083);
            qVar2.p(false);
        }
        if (readMeta.getCanDelete()) {
            qVar2.X(-1934057839);
            boolean h27 = qVar2.h(bottomSheetControl);
            Object L18 = qVar2.L();
            if (h27 || L18 == eVar7) {
                L18 = new io.elevenlabs.readerapp.ui.screens.authenticated.account.components.g(bottomSheetControl, 7);
                qVar2.h0(L18);
            }
            i12 = 0;
            SheetMenuItemDelete(lVar4, (a) L18, mVar, 0);
            qVar2.p(false);
        } else {
            i12 = 0;
            qVar2.X(-1933884859);
            qVar2.p(false);
        }
        SheetDivider(mVar, i12);
        if (readMeta.getFromUserImport()) {
            qVar2.X(-1933705834);
            int i37 = R.drawable.ic_circle_info;
            String R13 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_view_details);
            boolean h28 = qVar2.h(bottomSheetControl) | qVar2.f(lVar9);
            Object L19 = qVar2.L();
            if (h28 || L19 == eVar7) {
                final int i38 = 7;
                L19 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i38) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar9);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L19);
            }
            SheetMenuItem(i37, R13, (a) L19, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1933291643);
            qVar2.p(false);
        }
        String url = readMeta.getUrl();
        if (url != null && !wq.n.m0(url)) {
            qVar2.X(-1933112773);
            int i39 = R.drawable.globus__map__earth__globe;
            String R14 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_open_in_browser);
            boolean h29 = qVar2.h(bottomSheetControl) | qVar2.f(pVar3) | qVar2.f(url);
            Object L20 = qVar2.L();
            if (h29 || L20 == eVar7) {
                L20 = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.m(bottomSheetControl, pVar3, url, 3);
                qVar2.h0(L20);
            }
            SheetMenuItem(i39, R14, (a) L20, false, mVar, 0, 8);
            qVar2.p(false);
        } else {
            qVar2.X(-1932672635);
            qVar2.p(false);
        }
        int i40 = R.drawable.ic_rescue_ring;
        String R15 = c.R(mVar, io.elevenlabs.readerapp.R.string.report_issue_sheet_title);
        boolean h30 = qVar2.h(bottomSheetControl) | qVar2.f(lVar10);
        Object L21 = qVar2.L();
        if (h30 || L21 == eVar7) {
            final int i41 = 9;
            L21 = new a() { // from class: lm.j
                @Override // ho.a
                public final Object invoke() {
                    z PlayerActionsSheet$lambda$3$0$0$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$10$0;
                    z PlayerActionsSheet$lambda$3$0$0$11$0;
                    z PlayerActionsSheet$lambda$3$0$0$12$0;
                    z PlayerActionsSheet$lambda$3$0$0$13$0;
                    z PlayerActionsSheet$lambda$3$0$0$14$0;
                    z PlayerActionsSheet$lambda$3$0$0$16$0;
                    z PlayerActionsSheet$lambda$3$0$0$18$0;
                    z PlayerActionsSheet$lambda$3$0$0$1$0;
                    z PlayerActionsSheet$lambda$3$0$0$20$0;
                    z PlayerActionsSheet$lambda$3$0$1$0$0;
                    z PlayerActionsSheet$lambda$3$0$0$2$0;
                    z PlayerActionsSheet$lambda$3$0$0$5$0;
                    z PlayerActionsSheet$lambda$3$0$0$9$0;
                    switch (i41) {
                        case 0:
                            PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$0$0;
                        case 1:
                            PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$10$0;
                        case 2:
                            PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$11$0;
                        case 3:
                            PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$12$0;
                        case 4:
                            PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$13$0;
                        case 5:
                            PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$14$0;
                        case 6:
                            PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$16$0;
                        case 7:
                            PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$18$0;
                        case 8:
                            PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$1$0;
                        case 9:
                            PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$20$0;
                        case 10:
                            PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$1$0$0;
                        case 11:
                            PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$2$0;
                        case 12:
                            PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$5$0;
                        default:
                            PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar10);
                            return PlayerActionsSheet$lambda$3$0$0$9$0;
                    }
                }
            };
            qVar2.h0(L21);
        }
        SheetMenuItem(i40, R15, (a) L21, false, mVar, 0, 8);
        r1.d.g(p2.f(qVar, echoTheme.getSpacings(mVar, i15).getX4()), mVar);
        qVar2.p(true);
        if (z6) {
            qVar2.X(-1469001267);
            t F = r1.d.F(p2.e(qVar, 1.0f), echoTheme.getSpacings(mVar, i15).getX5(), echoTheme.getSpacings(mVar, i15).getX4());
            f1 d10 = r1.p.d(i3.d.f12997a, false);
            int hashCode3 = Long.hashCode(qVar2.T);
            o l10 = qVar2.l();
            t c11 = i3.a.c(F, mVar);
            qVar2.b0();
            if (qVar2.S) {
                qVar2.k(fVar);
            } else {
                qVar2.k0();
            }
            u2.r.J(eVar3, d10, mVar);
            u2.r.J(eVar4, l10, mVar);
            u2.r.y(mVar, Integer.valueOf(hashCode3), eVar5);
            u2.r.F(dVar, mVar);
            u2.r.J(eVar, c11, mVar);
            String R16 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_menu_upsell_title);
            String R17 = c.R(mVar, io.elevenlabs.readerapp.R.string.player_menu_upsell_description);
            boolean h31 = qVar2.h(bottomSheetControl) | qVar2.f(lVar4);
            Object L22 = qVar2.L();
            if (h31 || L22 == eVar7) {
                final int i42 = 10;
                L22 = new a() { // from class: lm.j
                    @Override // ho.a
                    public final Object invoke() {
                        z PlayerActionsSheet$lambda$3$0$0$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$10$0;
                        z PlayerActionsSheet$lambda$3$0$0$11$0;
                        z PlayerActionsSheet$lambda$3$0$0$12$0;
                        z PlayerActionsSheet$lambda$3$0$0$13$0;
                        z PlayerActionsSheet$lambda$3$0$0$14$0;
                        z PlayerActionsSheet$lambda$3$0$0$16$0;
                        z PlayerActionsSheet$lambda$3$0$0$18$0;
                        z PlayerActionsSheet$lambda$3$0$0$1$0;
                        z PlayerActionsSheet$lambda$3$0$0$20$0;
                        z PlayerActionsSheet$lambda$3$0$1$0$0;
                        z PlayerActionsSheet$lambda$3$0$0$2$0;
                        z PlayerActionsSheet$lambda$3$0$0$5$0;
                        z PlayerActionsSheet$lambda$3$0$0$9$0;
                        switch (i42) {
                            case 0:
                                PlayerActionsSheet$lambda$3$0$0$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$0$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$0$0;
                            case 1:
                                PlayerActionsSheet$lambda$3$0$0$10$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$10$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$10$0;
                            case 2:
                                PlayerActionsSheet$lambda$3$0$0$11$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$11$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$11$0;
                            case 3:
                                PlayerActionsSheet$lambda$3$0$0$12$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$12$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$12$0;
                            case 4:
                                PlayerActionsSheet$lambda$3$0$0$13$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$13$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$13$0;
                            case 5:
                                PlayerActionsSheet$lambda$3$0$0$14$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$14$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$14$0;
                            case 6:
                                PlayerActionsSheet$lambda$3$0$0$16$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$16$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$16$0;
                            case 7:
                                PlayerActionsSheet$lambda$3$0$0$18$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$18$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$18$0;
                            case 8:
                                PlayerActionsSheet$lambda$3$0$0$1$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$1$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$1$0;
                            case 9:
                                PlayerActionsSheet$lambda$3$0$0$20$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$20$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$20$0;
                            case 10:
                                PlayerActionsSheet$lambda$3$0$1$0$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$1$0$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$1$0$0;
                            case 11:
                                PlayerActionsSheet$lambda$3$0$0$2$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$2$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$2$0;
                            case 12:
                                PlayerActionsSheet$lambda$3$0$0$5$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$5$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$5$0;
                            default:
                                PlayerActionsSheet$lambda$3$0$0$9$0 = PlayerActionsSheetKt.PlayerActionsSheet$lambda$3$0$0$9$0(bottomSheetControl, lVar4);
                                return PlayerActionsSheet$lambda$3$0$0$9$0;
                        }
                    }
                };
                qVar2.h0(L22);
            }
            UpsellTitleKt.UpsellBanner(R16, R17, (a) L22, mVar, 0);
            z15 = true;
            qVar2.p(true);
            qVar2.p(false);
        } else {
            z15 = true;
            qVar2.X(-1468249765);
            qVar2.p(false);
        }
        qVar2.p(z15);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$0$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetQuickAction);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$1$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetQuickAction);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$10$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$11$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$12$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$13$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$14$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$15$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$16$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(new g(0));
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$16$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onRenameClick$default(playerViewModel, null, 1, null);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$17$0(BottomSheetControl bottomSheetControl) {
        bottomSheetControl.close();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$18$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$19$0(BottomSheetControl bottomSheetControl, p pVar, String str) {
        bottomSheetControl.close();
        pVar.invoke(str, Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$2$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetQuickAction);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$20$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$3$0(BottomSheetControl bottomSheetControl, a aVar) {
        bottomSheetControl.close();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$4$0(BottomSheetControl bottomSheetControl, p pVar, PlayerDisplayMode playerDisplayMode) {
        bottomSheetControl.close();
        PlayerDisplayMode playerDisplayMode2 = PlayerDisplayMode.Audio;
        if (playerDisplayMode == playerDisplayMode2) {
            playerDisplayMode2 = PlayerDisplayMode.Text;
        }
        pVar.invoke(playerDisplayMode2, Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$5$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(new g(1));
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$5$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.onCustomizeClick$default(playerViewModel, null, 1, null);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$6$0(BottomSheetControl bottomSheetControl, a aVar) {
        bottomSheetControl.close();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$7$0(BottomSheetControl bottomSheetControl, a aVar) {
        bottomSheetControl.close();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$8$0(BottomSheetControl bottomSheetControl, a aVar) {
        bottomSheetControl.close();
        aVar.invoke();
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$0$9$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$1$0$0(BottomSheetControl bottomSheetControl, l lVar) {
        bottomSheetControl.close();
        lVar.invoke(new g(5));
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$3$0$1$0$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        PlayerViewModel.showPaywall$default(playerViewModel, null, 1, null);
        return z.f31622a;
    }

    public static final z PlayerActionsSheet$lambda$4(l lVar, ReadMeta readMeta, PlayerDisplayMode playerDisplayMode, boolean z6, boolean z10, boolean z11, a aVar, l lVar2, l lVar3, l lVar4, l lVar5, a aVar2, l lVar6, a aVar3, a aVar4, a aVar5, p pVar, p pVar2, l lVar7, boolean z12, boolean z13, l lVar8, p pVar3, l lVar9, l lVar10, String str, String str2, int i10, int i11, int i12, int i13, m mVar, int i14) {
        PlayerActionsSheet(lVar, readMeta, playerDisplayMode, z6, z10, z11, aVar, lVar2, lVar3, lVar4, lVar5, aVar2, lVar6, aVar3, aVar4, aVar5, pVar, pVar2, lVar7, z12, z13, lVar8, pVar3, lVar9, lVar10, str, str2, mVar, u2.r.M(i10 | 1), u2.r.M(i11), u2.r.M(i12), i13);
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_CatalogContent(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(1804829681);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.m1511getLambda$184009001$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 3);
        }
    }

    public static final z Preview_PlayerActionsSheet_CatalogContent$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_CatalogContent(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_Minimal(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-175862556);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.getLambda$933996734$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 8);
        }
    }

    public static final z Preview_PlayerActionsSheet_Minimal$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_Minimal(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_NoChapters(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(350426616);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.getLambda$1510290398$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 10);
        }
    }

    public static final z Preview_PlayerActionsSheet_NoChapters$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_NoChapters(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_NoShare(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-713454623);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.getLambda$396404667$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 7);
        }
    }

    public static final z Preview_PlayerActionsSheet_NoShare$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_NoShare(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_NoVoiceChat(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1358295636);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.getLambda$237743238$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 4);
        }
    }

    public static final z Preview_PlayerActionsSheet_NoVoiceChat$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_NoVoiceChat(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_TextMode(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1813569663);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.m1510getLambda$1767670041$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 5);
        }
    }

    public static final z Preview_PlayerActionsSheet_TextMode$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_TextMode(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_UltraUser(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(232670874);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.getLambda$1655559156$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 11);
        }
    }

    public static final z Preview_PlayerActionsSheet_UltraUser$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_UltraUser(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    public static final void Preview_PlayerActionsSheet_UserImport_Full(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-142235007);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerActionsSheetKt.INSTANCE.m1509getLambda$1666692005$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 6);
        }
    }

    public static final z Preview_PlayerActionsSheet_UserImport_Full$lambda$0(int i10, m mVar, int i11) {
        Preview_PlayerActionsSheet_UserImport_Full(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void QuickActionsRow(boolean z6, boolean z10, a aVar, a aVar2, a aVar3, a aVar4, t tVar, m mVar, int i10, int i11) {
        int i12;
        t tVar2;
        int i13;
        boolean z11;
        r1 r10;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        q qVar = (q) mVar;
        qVar.Z(-626456665);
        if ((i10 & 6) == 0) {
            if (qVar.g(z6)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i12 = i19 | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.g(z10)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i12 |= i18;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(aVar)) {
                i17 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i17 = 128;
            }
            i12 |= i17;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar2)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i16;
        }
        if ((i10 & 24576) == 0) {
            if (qVar.h(aVar3)) {
                i15 = 16384;
            } else {
                i15 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i15;
        }
        if ((196608 & i10) == 0) {
            if (qVar.h(aVar4)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i12 |= i14;
        }
        int i20 = i11 & 64;
        if (i20 != 0) {
            i12 |= 1572864;
        } else if ((1572864 & i10) == 0) {
            tVar2 = tVar;
            if (qVar.f(tVar2)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i12 |= i13;
            if ((599187 & i12) == 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i12 & 1, z11)) {
                if (i20 != 0) {
                    tVar2 = i3.q.f13017a;
                }
                t t10 = r1.d.t(p2.e(tVar2, 1.0f), i1.f29224a);
                u0 u0Var = j.f29228a;
                k2 a10 = i2.a(j.g(EchoTheme.INSTANCE.getSpacings(qVar, EchoTheme.$stable).getX3()), i3.d.f13004y0, qVar, 0);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c5 = i3.a.c(t10, qVar);
                h.f11920i.getClass();
                f fVar = h4.g.f11903b;
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
                if (1.0f <= 0.0d) {
                    s1.a.a("invalid weight; must be greater than zero");
                }
                t c10 = p2.c(new m1(1.0f, true), 1.0f);
                if (z6) {
                    qVar.X(1071358554);
                    z12 = false;
                    TileKt.Tile(c.R(qVar, io.elevenlabs.readerapp.R.string.account_settings_voice_chat), R.drawable.bubble_stars_outline, aVar, c10, null, false, qVar, i12 & 896, 48);
                    qVar.p(false);
                } else {
                    z12 = false;
                    qVar.X(1071632439);
                    qVar.p(false);
                }
                if (z10) {
                    qVar.X(1071749960);
                    TileKt.Tile(c.R(qVar, io.elevenlabs.readerapp.R.string.player_item_contents), R.drawable.ic_bullet_list, aVar2, c10, null, false, qVar, (i12 >> 3) & 896, 48);
                    qVar.p(z12);
                } else {
                    qVar.X(1072024744);
                    TileKt.Tile(c.R(qVar, io.elevenlabs.readerapp.R.string.bookmarking_menu_title), R.drawable.ic_bookmark, aVar3, c10, null, false, qVar, (i12 >> 6) & 896, 48);
                    qVar.p(z12);
                }
                TileKt.Tile(c.R(qVar, io.elevenlabs.readerapp.R.string.menu_action_sleep_timer), R.drawable.clock_snooze, aVar4, c10, null, false, qVar, (i12 >> 9) & 896, 48);
                qVar.p(true);
            } else {
                qVar.R();
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.q(z6, z10, aVar, aVar2, aVar3, aVar4, tVar2, i10, i11);
                return;
            }
            return;
        }
        tVar2 = tVar;
        if ((599187 & i12) == 599186) {
        }
        if (!qVar.O(i12 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z QuickActionsRow$lambda$1(boolean z6, boolean z10, a aVar, a aVar2, a aVar3, a aVar4, t tVar, int i10, int i11, m mVar, int i12) {
        QuickActionsRow(z6, z10, aVar, aVar2, aVar3, aVar4, tVar, mVar, u2.r.M(i10 | 1), i11);
        return z.f31622a;
    }

    private static final void SheetDivider(m mVar, int i10) {
        boolean z6;
        q qVar = (q) mVar;
        qVar.Z(-1813927934);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            t e10 = p2.e(i3.q.f13017a, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i11 = EchoTheme.$stable;
            DividerKt.m1827DivideriJQMabo(r1.d.F(e10, echoTheme.getSpacings(qVar, i11).getX5(), echoTheme.getSpacings(qVar, i11).getX2()), echoTheme.getColors(qVar, i11).getBorder().getQuiniary(qVar, EchoThemeColors.Border.$stable), qVar, 0, 0);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new jm.a(i10, 9);
        }
    }

    public static final z SheetDivider$lambda$0(int i10, m mVar, int i11) {
        SheetDivider(mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SheetHeader(String str, String str2, String str3, a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        EchoTheme echoTheme;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        q qVar = (q) mVar;
        qVar.Z(373472187);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.f(str2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str3)) {
                i14 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        int i17 = i11;
        if ((i17 & 1171) != 1170) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i17 & 1, z6)) {
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme2 = EchoTheme.INSTANCE;
            int i18 = EchoTheme.$stable;
            t H = r1.d.H(e10, echoTheme2.getSpacings(qVar, i18).getX5(), echoTheme2.getSpacings(qVar, i18).getX5(), echoTheme2.getSpacings(qVar, i18).getX1_5(), echoTheme2.getSpacings(qVar, i18).getX2());
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c5 = i3.a.c(H, qVar);
            h.f11920i.getClass();
            f fVar = h4.g.f11903b;
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            e eVar = h4.g.f11907f;
            u2.r.J(eVar, a10, qVar);
            e eVar2 = h4.g.f11906e;
            u2.r.J(eVar2, l4, qVar);
            Integer valueOf = Integer.valueOf(hashCode);
            e eVar3 = h4.g.f11908g;
            u2.r.y(qVar, valueOf, eVar3);
            d dVar = h4.g.f11909h;
            u2.r.F(dVar, qVar);
            e eVar4 = h4.g.f11905d;
            u2.r.J(eVar4, c5, qVar);
            t o6 = p2.o(qVar2, 48);
            EchoThemeShapes shapes = echoTheme2.getShapes(qVar, i18);
            int i19 = EchoThemeShapes.$stable;
            t h10 = n.h(n.j(1, echoTheme2.getColors(qVar, i18).getBorder().getSeptenaryAlpha(qVar, EchoThemeColors.Border.$stable), m3.h.c(o6, shapes.getLg(qVar, i19)), echoTheme2.getShapes(qVar, i18).getLg(qVar, i19)), echoTheme2.getColors(qVar, i18).getFill().getUndenary(qVar, EchoThemeColors.Fill.$stable), h0.f26395b);
            f1 d10 = r1.p.d(i3.d.f13001e, false);
            int hashCode2 = Long.hashCode(qVar.T);
            o l7 = qVar.l();
            t c10 = i3.a.c(h10, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, d10, qVar);
            u2.r.J(eVar2, l7, qVar);
            defpackage.f.u(hashCode2, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c10, qVar);
            CachedAsyncImageKt.m1792CachedAsyncImageN55sxy0(str3, p2.p(qVar2, 24, 36), null, null, null, null, str, qVar, ((i17 >> 6) & 14) | 48 | ((i17 << 18) & 3670016), 60);
            qVar.p(true);
            r1.d.g(p2.s(qVar2, echoTheme2.getSpacings(qVar, i18).getX4()), qVar);
            if (1.0f <= 0.0d) {
                s1.a.a("invalid weight; must be greater than zero");
            }
            m1 m1Var = new m1(1.0f, true);
            x a11 = w.a(j.g(echoTheme2.getSpacings(qVar, i18).getX0_5()), i3.d.B0, qVar, 0);
            int hashCode3 = Long.hashCode(qVar.T);
            o l10 = qVar.l();
            t c11 = i3.a.c(m1Var, qVar);
            qVar.b0();
            if (qVar.S) {
                qVar.k(fVar);
            } else {
                qVar.k0();
            }
            u2.r.J(eVar, a11, qVar);
            u2.r.J(eVar2, l10, qVar);
            defpackage.f.u(hashCode3, qVar, eVar3, qVar, dVar);
            u2.r.J(eVar4, c11, qVar);
            EchoThemeTypography typography = echoTheme2.getTypography(qVar, i18);
            int i20 = EchoThemeTypography.$stable;
            y0 baseRegular500 = typography.getBaseRegular500(qVar, i20);
            EchoThemeColors.Text text = echoTheme2.getColors(qVar, i18).getText();
            int i21 = EchoThemeColors.Text.$stable;
            j7.d(str, null, text.getPrimary(qVar, i21), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, baseRegular500, qVar, i17 & 14, 24960, 110586);
            qVar = qVar;
            if (str2 == null || wq.n.m0(str2)) {
                echoTheme = echoTheme2;
                i12 = i18;
                qVar.X(-1871425971);
                qVar.p(false);
            } else {
                qVar.X(-1871699329);
                echoTheme = echoTheme2;
                i12 = i18;
                j7.d(str2, null, i.b(i18, i21, echoTheme2, qVar, qVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, null, echoTheme2.getTypography(qVar, i18).getSmRegular400(qVar, i20), qVar, (i17 >> 3) & 14, 24960, 110586);
                qVar = qVar;
                qVar.p(false);
            }
            qVar.p(true);
            float x3_5 = echoTheme.getSpacings(qVar, i12).getX3_5();
            ButtonIconKt.m1961ButtonIconFhKo8ac(R.drawable.ic_cross_large, c.R(qVar, R.string.accessibility_bottom_sheet_dialog_close), aVar, null, 20, 0L, new ButtonIconContainerSize.WrapIcon(new d2(x3_5, x3_5, x3_5, x3_5)), null, false, qVar, ((i17 >> 3) & 896) | 24576 | (ButtonIconContainerSize.WrapIcon.$stable << 18), 424);
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c0(str, str2, str3, aVar, i10, 1);
        }
    }

    public static final z SheetHeader$lambda$1(String str, String str2, String str3, a aVar, int i10, m mVar, int i11) {
        SheetHeader(str, str2, str3, aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void SheetMenuItem(final int i10, final String str, final a aVar, boolean z6, m mVar, final int i11, final int i12) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        final boolean z12;
        r1 r10;
        boolean z13;
        long primary;
        boolean z14;
        boolean z15;
        long primary2;
        long primary3;
        int i15;
        int i16;
        int i17;
        q qVar = (q) mVar;
        qVar.Z(1071342055);
        if ((i11 & 6) == 0) {
            if (qVar.d(i10)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (qVar.f(str)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i11 & 384) == 0) {
            if (qVar.h(aVar)) {
                i15 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        int i18 = i12 & 8;
        if (i18 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            z10 = z6;
            if (qVar.g(z10)) {
                i14 = 2048;
            } else {
                i14 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i14;
            if ((i13 & 1171) == 1170) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!qVar.O(i13 & 1, z11)) {
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z10;
                }
                i3.q qVar2 = i3.q.f13017a;
                t e10 = p2.e(qVar2, 1.0f);
                EchoTheme echoTheme = EchoTheme.INSTANCE;
                int i19 = EchoTheme.$stable;
                t c5 = m3.h.c(e10, echoTheme.getShapes(qVar, i19).getMd(qVar, EchoThemeShapes.$stable));
                Object L = qVar.L();
                u2.e eVar = u2.l.f33918a;
                if (L == eVar) {
                    L = j0.c.o(qVar);
                }
                p1.l lVar = (p1.l) L;
                if (z13) {
                    qVar.X(449638918);
                    primary = echoTheme.getColors(qVar, i19).getIcon().getCriticalPrimary(qVar, EchoThemeColors.Icon.$stable);
                    qVar.p(false);
                } else {
                    qVar.X(449728942);
                    primary = echoTheme.getColors(qVar, i19).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable);
                    qVar.p(false);
                }
                t F = r1.d.F(n.n(c5, lVar, e5.b(u.P, 3, primary, false), false, new p4.k(0), aVar, 12), echoTheme.getSpacings(qVar, i19).getX5(), echoTheme.getSpacings(qVar, i19).getX3());
                if ((i13 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                Object L2 = qVar.L();
                if (z14 || L2 == eVar) {
                    L2 = new lc.q(str, 10);
                    qVar.h0(L2);
                }
                t c10 = p4.q.c(F, true, (l) L2);
                k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
                int hashCode = Long.hashCode(qVar.T);
                o l4 = qVar.l();
                t c11 = i3.a.c(c10, qVar);
                h.f11920i.getClass();
                f fVar = h4.g.f11903b;
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
                u2.r.J(h4.g.f11905d, c11, qVar);
                u3.c M = kd.a.M(i10, qVar, i13 & 14);
                t o6 = p2.o(qVar2, 20);
                if (z13) {
                    qVar.X(-1929089710);
                    primary2 = echoTheme.getColors(qVar, i19).getIcon().getCriticalPrimary(qVar, EchoThemeColors.Icon.$stable);
                    z15 = false;
                    qVar.p(false);
                } else {
                    z15 = false;
                    qVar.X(-1929015558);
                    primary2 = echoTheme.getColors(qVar, i19).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable);
                    qVar.p(false);
                }
                boolean z16 = z15;
                long j4 = primary2;
                int i20 = i13;
                y2.a(M, null, o6, j4, qVar, u3.c.$stable | 432, 0);
                r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i19).getX3()), qVar);
                y0 baseRegular400 = echoTheme.getTypography(qVar, i19).getBaseRegular400(qVar, EchoThemeTypography.$stable);
                if (z13) {
                    primary3 = i.g(-1928732342, i19, echoTheme, qVar, qVar).getCriticalPrimary(qVar, EchoThemeColors.Text.$stable);
                    qVar.p(z16);
                } else {
                    primary3 = i.g(-1928650254, i19, echoTheme, qVar, qVar).getPrimary(qVar, EchoThemeColors.Text.$stable);
                    qVar.p(z16);
                }
                j7.d(str, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0.a(baseRegular400, primary3, 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, (i20 >> 3) & 14, 24960, 110590);
                qVar = qVar;
                qVar.p(true);
                z12 = z13;
            } else {
                qVar.R();
                z12 = z10;
            }
            r10 = qVar.r();
            if (r10 == null) {
                r10.f34012d = new p() { // from class: lm.k
                    @Override // ho.p
                    public final Object invoke(Object obj, Object obj2) {
                        z SheetMenuItem$lambda$3;
                        int intValue = ((Integer) obj2).intValue();
                        SheetMenuItem$lambda$3 = PlayerActionsSheetKt.SheetMenuItem$lambda$3(i10, str, aVar, z12, i11, i12, (m) obj, intValue);
                        return SheetMenuItem$lambda$3;
                    }
                };
                return;
            }
            return;
        }
        z10 = z6;
        if ((i13 & 1171) == 1170) {
        }
        if (!qVar.O(i13 & 1, z11)) {
        }
        r10 = qVar.r();
        if (r10 == null) {
        }
    }

    public static final z SheetMenuItem$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z SheetMenuItem$lambda$3(int i10, String str, a aVar, boolean z6, int i11, int i12, m mVar, int i13) {
        SheetMenuItem(i10, str, aVar, z6, mVar, u2.r.M(i11 | 1), i12);
        return z.f31622a;
    }

    private static final void SheetMenuItemDelete(l lVar, a aVar, m mVar, int i10) {
        int i11;
        boolean z6;
        boolean z10;
        int i12;
        int i13;
        q qVar = (q) mVar;
        qVar.Z(-32171049);
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
            if (qVar.h(aVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = i11;
        boolean z11 = true;
        if ((i14 & 19) != 18) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i14 & 1, z6)) {
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = u2.r.A(Boolean.FALSE);
                qVar.h0(L);
            }
            z0 z0Var = (z0) L;
            String R = c.R(qVar, io.elevenlabs.readerapp.R.string.player_delete);
            int i15 = R.drawable.trash_can;
            Object L2 = qVar.L();
            if (L2 == eVar) {
                L2 = new d0(z0Var, 24);
                qVar.h0(L2);
            }
            SheetMenuItem(i15, R, (a) L2, true, qVar, 3456, 0);
            if (SheetMenuItemDelete$lambda$1(z0Var)) {
                qVar.X(-629547664);
                Object L3 = qVar.L();
                if (L3 == eVar) {
                    L3 = new d0(z0Var, 25);
                    qVar.h0(L3);
                }
                a aVar2 = (a) L3;
                if ((i14 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i14 & 14) != 4) {
                    z11 = false;
                }
                boolean z12 = z10 | z11;
                Object L4 = qVar.L();
                if (z12 || L4 == eVar) {
                    L4 = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.t(aVar, lVar);
                    qVar.h0(L4);
                }
                ConfirmationDialogKt.ConfirmationDialog(aVar2, (a) L4, c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_title), c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_message), c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_dismiss), c.R(qVar, io.elevenlabs.readerapp.R.string.read_delete_confirmation_confirm), false, qVar, 6, 64);
                qVar = qVar;
                qVar.p(false);
            } else {
                qVar.X(-628875925);
                qVar.p(false);
            }
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.player.elements.n(lVar, aVar, i10);
        }
    }

    private static final boolean SheetMenuItemDelete$lambda$1(z0 z0Var) {
        return ((Boolean) z0Var.getValue()).booleanValue();
    }

    private static final void SheetMenuItemDelete$lambda$2(z0 z0Var, boolean z6) {
        z0Var.setValue(Boolean.valueOf(z6));
    }

    public static final z SheetMenuItemDelete$lambda$3$0(z0 z0Var) {
        SheetMenuItemDelete$lambda$2(z0Var, true);
        return z.f31622a;
    }

    public static final z SheetMenuItemDelete$lambda$4$0(z0 z0Var) {
        SheetMenuItemDelete$lambda$2(z0Var, false);
        return z.f31622a;
    }

    public static final z SheetMenuItemDelete$lambda$5$0(a aVar, l lVar) {
        aVar.invoke();
        lVar.invoke(new g(4));
        return z.f31622a;
    }

    public static final z SheetMenuItemDelete$lambda$5$0$0(PlayerViewModel playerViewModel) {
        playerViewModel.getClass();
        playerViewModel.delete(Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z SheetMenuItemDelete$lambda$6(l lVar, a aVar, int i10, m mVar, int i11) {
        SheetMenuItemDelete(lVar, aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SheetMenuItemDownload(ReadMeta readMeta, a aVar, p pVar, m mVar, int i10) {
        ReadMeta readMeta2;
        int i11;
        boolean z6;
        DownloadAction downloadAction;
        String R;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(1615520336);
        if ((i10 & 6) == 0) {
            readMeta2 = readMeta;
            if (qVar.h(readMeta2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            readMeta2 = readMeta;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (qVar.h(aVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (qVar.h(pVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        boolean z11 = true;
        if ((i11 & 147) != 146) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i11 & 1, z6)) {
            OfflineReadData offlineReadData = readMeta2.getOfflineReadData();
            if (offlineReadData == null) {
                downloadAction = DownloadAction.DOWNLOAD;
            } else {
                int i16 = WhenMappings.$EnumSwitchMapping$0[offlineReadData.getStatus().ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 == 4) {
                                downloadAction = DownloadAction.RETRY_DOWNLOAD;
                            } else {
                                c6.p();
                                return;
                            }
                        } else {
                            downloadAction = DownloadAction.DOWNLOAD;
                        }
                    } else {
                        downloadAction = DownloadAction.REMOVE_DOWNLOAD;
                    }
                } else {
                    downloadAction = DownloadAction.CANCEL_DOWNLOAD;
                }
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$1;
            int i17 = iArr[downloadAction.ordinal()];
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 != 3) {
                        if (i17 == 4) {
                            qVar.X(2031883612);
                            R = c.R(qVar, io.elevenlabs.readerapp.R.string.read_options_retry_download);
                            qVar.p(false);
                        } else {
                            throw b.h(2031870877, qVar, false);
                        }
                    } else {
                        qVar.X(2031879805);
                        R = c.R(qVar, io.elevenlabs.readerapp.R.string.read_options_cancel_download);
                        qVar.p(false);
                    }
                } else {
                    qVar.X(2031875965);
                    R = c.R(qVar, io.elevenlabs.readerapp.R.string.read_options_remove_download);
                    qVar.p(false);
                }
            } else {
                qVar.X(2031872342);
                R = c.R(qVar, io.elevenlabs.readerapp.R.string.read_options_download);
                qVar.p(false);
            }
            int i18 = iArr[downloadAction.ordinal()];
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 != 3) {
                        if (i18 == 4) {
                            i12 = R.drawable.restart;
                        } else {
                            c6.p();
                            return;
                        }
                    } else {
                        i12 = R.drawable.close;
                    }
                } else {
                    i12 = R.drawable.trash_can;
                }
            } else {
                i12 = R.drawable.download;
            }
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 896) != 256) {
                z11 = false;
            }
            boolean d10 = z10 | z11 | qVar.d(downloadAction.ordinal());
            Object L = qVar.L();
            if (d10 || L == u2.l.f33918a) {
                L = new io.elevenlabs.readerapp.ui.screens.authenticated.voices.m(aVar, pVar, downloadAction, 2);
                qVar.h0(L);
            }
            SheetMenuItem(i12, R, (a) L, false, qVar, 0, 8);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new lm.f(i10, 0, readMeta, aVar, pVar);
        }
    }

    public static final z SheetMenuItemDownload$lambda$0$0(a aVar, p pVar, DownloadAction downloadAction) {
        aVar.invoke();
        pVar.invoke(downloadAction, Analytics.Event.PlayerActionSource.ActionsSheetMenuItem);
        return z.f31622a;
    }

    public static final z SheetMenuItemDownload$lambda$1(ReadMeta readMeta, a aVar, p pVar, int i10, m mVar, int i11) {
        SheetMenuItemDownload(readMeta, aVar, pVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }

    private static final void SheetMenuItemVoice(String str, String str2, String str3, a aVar, m mVar, int i10) {
        int i11;
        String str4;
        boolean z6;
        String str5;
        int i12;
        int i13;
        int i14;
        int i15;
        q qVar = (q) mVar;
        qVar.Z(-1938295828);
        if ((i10 & 6) == 0) {
            if (qVar.f(str)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str4 = str2;
            if (qVar.f(str4)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        } else {
            str4 = str2;
        }
        if ((i10 & 384) == 0) {
            if (qVar.f(str3)) {
                i13 = RpcError.MAX_MESSAGE_BYTES;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (qVar.h(aVar)) {
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
            i3.q qVar2 = i3.q.f13017a;
            t e10 = p2.e(qVar2, 1.0f);
            EchoTheme echoTheme = EchoTheme.INSTANCE;
            int i16 = EchoTheme.$stable;
            t c5 = m3.h.c(e10, echoTheme.getShapes(qVar, i16).getMd(qVar, EchoThemeShapes.$stable));
            Object L = qVar.L();
            u2.e eVar = u2.l.f33918a;
            if (L == eVar) {
                L = j0.c.o(qVar);
            }
            boolean z10 = false;
            t F = r1.d.F(n.n(c5, (p1.l) L, e5.b(u.P, 3, echoTheme.getColors(qVar, i16).getIcon().getPrimary(qVar, EchoThemeColors.Icon.$stable), false), false, new p4.k(0), aVar, 12), echoTheme.getSpacings(qVar, i16).getX5(), echoTheme.getSpacings(qVar, i16).getX3());
            if ((i11 & 896) == 256) {
                z10 = true;
            }
            Object L2 = qVar.L();
            if (z10 || L2 == eVar) {
                L2 = new lc.q(str3, 11);
                qVar.h0(L2);
            }
            t c10 = p4.q.c(F, true, (l) L2);
            k2 a10 = i2.a(j.f29228a, i3.d.f13005z0, qVar, 48);
            int hashCode = Long.hashCode(qVar.T);
            o l4 = qVar.l();
            t c11 = i3.a.c(c10, qVar);
            h.f11920i.getClass();
            f fVar = h4.g.f11903b;
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
            u2.r.J(h4.g.f11905d, c11, qVar);
            if (str == null) {
                str5 = "";
            } else {
                str5 = str;
            }
            VoiceAvatarKt.VoiceAvatar(str5, str4, p2.o(qVar2, 20), false, false, qVar, (i11 & 112) | 384, 24);
            r1.d.g(p2.s(qVar2, echoTheme.getSpacings(qVar, i16).getX3()), qVar);
            j7.d(str3, null, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, y0.a(echoTheme.getTypography(qVar, i16).getBaseRegular400(qVar, EchoThemeTypography.$stable), echoTheme.getColors(qVar, i16).getText().getPrimary(qVar, EchoThemeColors.Text.$stable), 0L, null, null, null, 0L, 0, 0L, null, null, 16777214), qVar, (i11 >> 6) & 14, 24960, 110590);
            qVar = qVar;
            qVar.p(true);
        } else {
            qVar.R();
        }
        r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new c0(str, str2, str3, aVar, i10, 2);
        }
    }

    public static final z SheetMenuItemVoice$lambda$1$0(String str, b0 b0Var) {
        b0Var.getClass();
        p4.y.d(str, b0Var);
        return z.f31622a;
    }

    public static final z SheetMenuItemVoice$lambda$3(String str, String str2, String str3, a aVar, int i10, m mVar, int i11) {
        SheetMenuItemVoice(str, str2, str3, aVar, mVar, u2.r.M(i10 | 1));
        return z.f31622a;
    }
}
