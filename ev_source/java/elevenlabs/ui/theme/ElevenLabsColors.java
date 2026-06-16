package io.elevenlabs.ui.theme;

import android.gov.nist.core.Separators;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.ui.theme.ReaderColors;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;
import p3.h0;
import p3.x;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0003\b\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n¥\u0001¦\u0001§\u0001¨\u0001©\u0001B'\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017R\u0014\u0010 \u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0014\u0010\"\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0014\u0010$\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u0017R\u0014\u0010&\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0017R\u0014\u0010(\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0017R\u0014\u0010*\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0014\u0010,\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0014\u0010.\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u0017R\u0014\u00100\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0017R\u0014\u00102\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R\u0014\u00104\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0014\u00106\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0017R\u0014\u00108\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0017R\u0014\u0010:\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0017R\u0014\u0010<\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0017R\u0014\u0010>\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010\u0017R\u0014\u0010@\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u0017R\u0014\u0010B\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0017R\u0014\u0010D\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u0014\u0010F\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u0017R\u0014\u0010H\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0017R\u0014\u0010J\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bI\u0010\u0017R\u0014\u0010L\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010N\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010P\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u0017R\u0014\u0010R\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0014\u0010T\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0017R\u0014\u0010V\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0017R\u0014\u0010X\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bW\u0010\u0017R\u0014\u0010Z\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bY\u0010\u0017R\u0014\u0010\\\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0017R\u0014\u0010^\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u0017R\u0014\u0010`\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010\u0017R\u0014\u0010b\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\ba\u0010\u0017R\u0014\u0010d\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u0017R\u0014\u0010f\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\be\u0010\u0017R\u0014\u0010h\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\u0017R\u0014\u0010j\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0017R\u0014\u0010l\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0017R\u0014\u0010n\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0017R\u0014\u0010p\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0017R\u0014\u0010r\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bq\u0010\u0017R\u0014\u0010t\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010\u0017R\u0014\u0010v\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\u0017R\u0014\u0010x\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010\u0017R\u0014\u0010z\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\by\u0010\u0017R\u0014\u0010|\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b{\u0010\u0017R\u0014\u0010~\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010\u0017R\u0015\u0010\u0080\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u007f\u0010\u0017R\u0016\u0010\u0082\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u0017R\u0016\u0010\u0084\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0017R\u0016\u0010\u0086\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010\u0017R\u0016\u0010\u0088\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010\u0017R\u0016\u0010\u008a\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010\u0017R\u0016\u0010\u008c\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0017R\u0016\u0010\u008e\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0017R\u0016\u0010\u0090\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010\u0017R\u0016\u0010\u0092\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010\u0017R\u0016\u0010\u0094\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010\u0017R\u0016\u0010\u0096\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010\u0017R\u0016\u0010\u0098\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u0017R\u0016\u0010\u009a\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u0017R\u0016\u0010\u009c\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010\u0017R\u0016\u0010\u009e\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010\u0017R\u0016\u0010 \u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010\u0017R\u0016\u0010¢\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010\u0017R\u0016\u0010¤\u0001\u001a\u00020\u00138&X¦\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010\u0017\u0082\u0001\u0004ª\u0001«\u0001¨\u0006¬\u0001"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors;", "", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;", "neutral", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;", "brand", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;", "semantic", "<init>", "(Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;)V", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;", "getNeutral", "()Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;", "getBrand", "()Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;", "getSemantic", "()Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;", "Lp3/x;", "transparent", "J", "getTransparent-0d7_KjU", "()J", "", "isDark", "()Z", "getPrimaryText-0d7_KjU", "primaryText", "getSecondaryText-0d7_KjU", "secondaryText", "getTertiaryText-0d7_KjU", "tertiaryText", "getPrimaryBg-0d7_KjU", "primaryBg", "getSecondaryBg-0d7_KjU", "secondaryBg", "getTertiaryBg-0d7_KjU", "tertiaryBg", "getSelectableInactiveText-0d7_KjU", "selectableInactiveText", "getSelectableActiveText-0d7_KjU", "selectableActiveText", "getSelectableInactiveBg-0d7_KjU", "selectableInactiveBg", "getSelectableActiveBg-0d7_KjU", "selectableActiveBg", "getPrimaryButtonText-0d7_KjU", "primaryButtonText", "getSecondaryButtonText-0d7_KjU", "secondaryButtonText", "getTertiaryButtonText-0d7_KjU", "tertiaryButtonText", "getQuaternaryButtonText-0d7_KjU", "quaternaryButtonText", "getDangerLightButtonText-0d7_KjU", "dangerLightButtonText", "getDangerConfirmButtonText-0d7_KjU", "dangerConfirmButtonText", "getPrimaryButtonBg-0d7_KjU", "primaryButtonBg", "getSecondaryButtonBg-0d7_KjU", "secondaryButtonBg", "getTertiaryButtonBg-0d7_KjU", "tertiaryButtonBg", "getTransparentButtonBg-0d7_KjU", "transparentButtonBg", "getTransparentButtonText-0d7_KjU", "transparentButtonText", "getTransparentButtonBorder-0d7_KjU", "transparentButtonBorder", "getTransparentInvertedButtonBg-0d7_KjU", "transparentInvertedButtonBg", "getTransparentInvertedButtonText-0d7_KjU", "transparentInvertedButtonText", "getTransparentInvertedButtonBorder-0d7_KjU", "transparentInvertedButtonBorder", "getQuaternaryButtonBg-0d7_KjU", "quaternaryButtonBg", "getDangerLightButtonBg-0d7_KjU", "dangerLightButtonBg", "getDangerConfirmButtonBg-0d7_KjU", "dangerConfirmButtonBg", "getPrimaryButtonBorder-0d7_KjU", "primaryButtonBorder", "getSecondaryButtonBorder-0d7_KjU", "secondaryButtonBorder", "getTertiaryButtonBorder-0d7_KjU", "tertiaryButtonBorder", "getQuaternaryButtonBorder-0d7_KjU", "quaternaryButtonBorder", "getDangerLightButtonBorder-0d7_KjU", "dangerLightButtonBorder", "getDangerConfirmButtonBorder-0d7_KjU", "dangerConfirmButtonBorder", "getTextContentBg-0d7_KjU", "textContentBg", "getTextContentTint-0d7_KjU", "textContentTint", "getFileContentBg-0d7_KjU", "fileContentBg", "getFileContentTint-0d7_KjU", "fileContentTint", "getWebsiteContentBg-0d7_KjU", "websiteContentBg", "getWebsiteContentTint-0d7_KjU", "websiteContentTint", "getLoaderBackgroundTint-0d7_KjU", "loaderBackgroundTint", "getDividerLineColor-0d7_KjU", "dividerLineColor", "getDividerLightLineColor-0d7_KjU", "dividerLightLineColor", "getContainerShadow-0d7_KjU", "containerShadow", "getInputActiveBorder-0d7_KjU", "inputActiveBorder", "getInputInactiveBorder-0d7_KjU", "inputInactiveBorder", "getInputErrorBorder-0d7_KjU", "inputErrorBorder", "getInputDisabledBorder-0d7_KjU", "inputDisabledBorder", "getHintBg-0d7_KjU", "hintBg", "getCameraBackground-0d7_KjU", "cameraBackground", "getCameraPictureBorder-0d7_KjU", "cameraPictureBorder", "getSplashBackground-0d7_KjU", "splashBackground", "getExploreBoxText-0d7_KjU", "exploreBoxText", "getExploreBoxBackground-0d7_KjU", "exploreBoxBackground", "getDownloadIcon-0d7_KjU", "downloadIcon", "getCardBg-0d7_KjU", "cardBg", "getHomeGradientBgEnd-0d7_KjU", "homeGradientBgEnd", "getReadCoverBg-0d7_KjU", "readCoverBg", "getProgressBarBg-0d7_KjU", "progressBarBg", "getProgressBarFg-0d7_KjU", "progressBarFg", "getUnarchiveActionBg-0d7_KjU", "unarchiveActionBg", "getShareDetailsBackground-0d7_KjU", "shareDetailsBackground", "getShareDetailsPrimaryText-0d7_KjU", "shareDetailsPrimaryText", "getShareDetailsSecondaryText-0d7_KjU", "shareDetailsSecondaryText", "getShareDetailsActionBackground-0d7_KjU", "shareDetailsActionBackground", "getShareDetailsContentPlaceholder-0d7_KjU", "shareDetailsContentPlaceholder", "getSquareIconButtonFg-0d7_KjU", "squareIconButtonFg", "getSquareIconButtonBg-0d7_KjU", "squareIconButtonBg", "getIconSuccessTint-0d7_KjU", "iconSuccessTint", "Neutral", "Brand", "Semantic", "Light", "Dark", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Dark;", "Lio/elevenlabs/ui/theme/ElevenLabsColors$Light;", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public abstract class ElevenLabsColors {
    public static final int $stable = 0;
    private final Brand brand;
    private final Neutral neutral;
    private final Semantic semantic;
    private final long transparent;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u008d\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001a\u0010/\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001a\u00105\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u00107\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001a\u00109\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001a\u0010;\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010C\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001a\u0010G\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001a\u0010M\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010O\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u001a\u0010S\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001a\u0010U\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u001a\u0010W\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u001a\u0010Y\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001a\u0010[\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u001a\u0010]\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u001a\u0010_\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001a\u0010a\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u001a\u0010c\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u001a\u0010e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u001a\u0010g\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u001a\u0010i\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u001a\u0010k\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001a\u0010o\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001a\u0010q\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u001a\u0010s\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u001a\u0010u\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010\n\u001a\u0004\bv\u0010\fR\u001a\u0010w\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010\fR\u001a\u0010y\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010\n\u001a\u0004\bz\u0010\fR\u001a\u0010{\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010\n\u001a\u0004\b|\u0010\fR\u001a\u0010}\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u0010\fR\u001b\u0010\u007f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001d\u0010\u0081\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\n\u001a\u0005\b\u0082\u0001\u0010\fR\u001d\u0010\u0083\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\fR\u001d\u0010\u0085\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR\u001d\u0010\u0087\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\n\u001a\u0005\b\u0088\u0001\u0010\fR\u001d\u0010\u0089\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001d\u0010\u008b\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001d\u0010\u008d\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\n\u001a\u0005\b\u008e\u0001\u0010\fR\u001d\u0010\u008f\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\n\u001a\u0005\b\u0090\u0001\u0010\fR\u001d\u0010\u0091\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0092\u0001\u0010\fR\u001d\u0010\u0093\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\n\u001a\u0005\b\u0094\u0001\u0010\f¨\u0006\u0095\u0001"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors$Dark;", "Lio/elevenlabs/ui/theme/ElevenLabsColors;", "<init>", "()V", "", "isDark", "Z", "()Z", "Lp3/x;", "primaryText", "J", "getPrimaryText-0d7_KjU", "()J", "secondaryText", "getSecondaryText-0d7_KjU", "tertiaryText", "getTertiaryText-0d7_KjU", "primaryBg", "getPrimaryBg-0d7_KjU", "secondaryBg", "getSecondaryBg-0d7_KjU", "tertiaryBg", "getTertiaryBg-0d7_KjU", "selectableInactiveText", "getSelectableInactiveText-0d7_KjU", "selectableActiveText", "getSelectableActiveText-0d7_KjU", "selectableInactiveBg", "getSelectableInactiveBg-0d7_KjU", "selectableActiveBg", "getSelectableActiveBg-0d7_KjU", "primaryButtonText", "getPrimaryButtonText-0d7_KjU", "secondaryButtonText", "getSecondaryButtonText-0d7_KjU", "tertiaryButtonText", "getTertiaryButtonText-0d7_KjU", "quaternaryButtonText", "getQuaternaryButtonText-0d7_KjU", "quaternaryButtonBg", "getQuaternaryButtonBg-0d7_KjU", "quaternaryButtonBorder", "getQuaternaryButtonBorder-0d7_KjU", "dangerLightButtonText", "getDangerLightButtonText-0d7_KjU", "dangerConfirmButtonText", "getDangerConfirmButtonText-0d7_KjU", "primaryButtonBg", "getPrimaryButtonBg-0d7_KjU", "secondaryButtonBg", "getSecondaryButtonBg-0d7_KjU", "tertiaryButtonBg", "getTertiaryButtonBg-0d7_KjU", "dangerLightButtonBg", "getDangerLightButtonBg-0d7_KjU", "dangerConfirmButtonBg", "getDangerConfirmButtonBg-0d7_KjU", "primaryButtonBorder", "getPrimaryButtonBorder-0d7_KjU", "secondaryButtonBorder", "getSecondaryButtonBorder-0d7_KjU", "tertiaryButtonBorder", "getTertiaryButtonBorder-0d7_KjU", "transparentButtonBg", "getTransparentButtonBg-0d7_KjU", "transparentButtonText", "getTransparentButtonText-0d7_KjU", "transparentButtonBorder", "getTransparentButtonBorder-0d7_KjU", "transparentInvertedButtonBg", "getTransparentInvertedButtonBg-0d7_KjU", "transparentInvertedButtonText", "getTransparentInvertedButtonText-0d7_KjU", "transparentInvertedButtonBorder", "getTransparentInvertedButtonBorder-0d7_KjU", "dangerLightButtonBorder", "getDangerLightButtonBorder-0d7_KjU", "dangerConfirmButtonBorder", "getDangerConfirmButtonBorder-0d7_KjU", "textContentBg", "getTextContentBg-0d7_KjU", "textContentTint", "getTextContentTint-0d7_KjU", "fileContentBg", "getFileContentBg-0d7_KjU", "fileContentTint", "getFileContentTint-0d7_KjU", "websiteContentBg", "getWebsiteContentBg-0d7_KjU", "websiteContentTint", "getWebsiteContentTint-0d7_KjU", "loaderBackgroundTint", "getLoaderBackgroundTint-0d7_KjU", "dividerLineColor", "getDividerLineColor-0d7_KjU", "dividerLightLineColor", "getDividerLightLineColor-0d7_KjU", "containerShadow", "getContainerShadow-0d7_KjU", "inputActiveBorder", "getInputActiveBorder-0d7_KjU", "inputInactiveBorder", "getInputInactiveBorder-0d7_KjU", "inputErrorBorder", "getInputErrorBorder-0d7_KjU", "inputDisabledBorder", "getInputDisabledBorder-0d7_KjU", "hintBg", "getHintBg-0d7_KjU", "cameraBackground", "getCameraBackground-0d7_KjU", "cameraPictureBorder", "getCameraPictureBorder-0d7_KjU", "splashBackground", "getSplashBackground-0d7_KjU", "exploreBoxText", "getExploreBoxText-0d7_KjU", "exploreBoxBackground", "getExploreBoxBackground-0d7_KjU", "downloadIcon", "getDownloadIcon-0d7_KjU", "cardBg", "getCardBg-0d7_KjU", "homeGradientBgEnd", "getHomeGradientBgEnd-0d7_KjU", "readCoverBg", "getReadCoverBg-0d7_KjU", "progressBarBg", "getProgressBarBg-0d7_KjU", "progressBarFg", "getProgressBarFg-0d7_KjU", "unarchiveActionBg", "getUnarchiveActionBg-0d7_KjU", "shareDetailsBackground", "getShareDetailsBackground-0d7_KjU", "shareDetailsPrimaryText", "getShareDetailsPrimaryText-0d7_KjU", "shareDetailsSecondaryText", "getShareDetailsSecondaryText-0d7_KjU", "shareDetailsActionBackground", "getShareDetailsActionBackground-0d7_KjU", "shareDetailsContentPlaceholder", "getShareDetailsContentPlaceholder-0d7_KjU", "squareIconButtonFg", "getSquareIconButtonFg-0d7_KjU", "squareIconButtonBg", "getSquareIconButtonBg-0d7_KjU", "iconSuccessTint", "getIconSuccessTint-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Dark extends ElevenLabsColors {
        public static final int $stable = 0;
        private final long cameraBackground;
        private final long cameraPictureBorder;
        private final long cardBg;
        private final long containerShadow;
        private final long dangerConfirmButtonBg;
        private final long dangerConfirmButtonBorder;
        private final long dangerConfirmButtonText;
        private final long dangerLightButtonBg;
        private final long dangerLightButtonBorder;
        private final long dangerLightButtonText;
        private final long dividerLightLineColor;
        private final long dividerLineColor;
        private final long downloadIcon;
        private final long exploreBoxBackground;
        private final long exploreBoxText;
        private final long fileContentBg;
        private final long fileContentTint;
        private final long hintBg;
        private final long homeGradientBgEnd;
        private final long iconSuccessTint;
        private final long inputActiveBorder;
        private final long inputDisabledBorder;
        private final long inputErrorBorder;
        private final long inputInactiveBorder;
        private final boolean isDark;
        private final long loaderBackgroundTint;
        private final long primaryBg;
        private final long primaryButtonBg;
        private final long primaryButtonBorder;
        private final long primaryButtonText;
        private final long primaryText;
        private final long progressBarBg;
        private final long progressBarFg;
        private final long quaternaryButtonBg;
        private final long quaternaryButtonBorder;
        private final long quaternaryButtonText;
        private final long readCoverBg;
        private final long secondaryBg;
        private final long secondaryButtonBg;
        private final long secondaryButtonBorder;
        private final long secondaryButtonText;
        private final long secondaryText;
        private final long selectableActiveBg;
        private final long selectableActiveText;
        private final long selectableInactiveBg;
        private final long selectableInactiveText;
        private final long shareDetailsActionBackground;
        private final long shareDetailsBackground;
        private final long shareDetailsContentPlaceholder;
        private final long shareDetailsPrimaryText;
        private final long shareDetailsSecondaryText;
        private final long splashBackground;
        private final long squareIconButtonBg;
        private final long squareIconButtonFg;
        private final long tertiaryBg;
        private final long tertiaryButtonBg;
        private final long tertiaryButtonBorder;
        private final long tertiaryButtonText;
        private final long tertiaryText;
        private final long textContentBg;
        private final long textContentTint;
        private final long transparentButtonBg;
        private final long transparentButtonBorder;
        private final long transparentButtonText;
        private final long transparentInvertedButtonBg;
        private final long transparentInvertedButtonBorder;
        private final long transparentInvertedButtonText;
        private final long unarchiveActionBg;
        private final long websiteContentBg;
        private final long websiteContentTint;

        public Dark() {
            super(null, null, null, 7, null);
            this.isDark = true;
            this.primaryText = getNeutral().m2323getWhite0d7_KjU();
            this.secondaryText = getNeutral().m2318getGreyDark0d7_KjU();
            this.tertiaryText = getNeutral().m2319getGreyDarker0d7_KjU();
            this.primaryBg = h0.e(4280821800L);
            this.secondaryBg = h0.e(4279176975L);
            this.tertiaryBg = h0.e(4280887593L);
            this.selectableInactiveText = getNeutral().m2323getWhite0d7_KjU();
            this.selectableActiveText = getNeutral().m2316getBlack0d7_KjU();
            this.selectableInactiveBg = h0.e(4282335039L);
            this.selectableActiveBg = getNeutral().m2323getWhite0d7_KjU();
            this.primaryButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.secondaryButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.tertiaryButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.quaternaryButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.quaternaryButtonBg = getNeutral().m2322getTransparent0d7_KjU();
            this.quaternaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerLightButtonText = getSemantic().m2331getNegative0d7_KjU();
            this.dangerConfirmButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.primaryButtonBg = getNeutral().m2323getWhite0d7_KjU();
            this.secondaryButtonBg = h0.e(4282335039L);
            this.tertiaryButtonBg = getNeutral().m2316getBlack0d7_KjU();
            this.dangerLightButtonBg = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerConfirmButtonBg = getSemantic().m2331getNegative0d7_KjU();
            this.primaryButtonBorder = getNeutral().m2323getWhite0d7_KjU();
            this.secondaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.tertiaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.transparentButtonBg = x.b(0.8f, getNeutral().m2323getWhite0d7_KjU());
            this.transparentButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.transparentButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.transparentInvertedButtonBg = x.b(0.1f, getNeutral().m2316getBlack0d7_KjU());
            this.transparentInvertedButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.transparentInvertedButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerLightButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerConfirmButtonBorder = getSemantic().m2331getNegative0d7_KjU();
            this.textContentBg = getBrand().m2297getGreenDark0d7_KjU();
            this.textContentTint = getBrand().m2298getGreenLight0d7_KjU();
            this.fileContentBg = getBrand().m2304getTealDark0d7_KjU();
            this.fileContentTint = getBrand().m2305getTealLight0d7_KjU();
            this.websiteContentBg = getBrand().m2294getBlueDark0d7_KjU();
            this.websiteContentTint = getBrand().m2295getBlueLight0d7_KjU();
            this.loaderBackgroundTint = getNeutral().m2319getGreyDarker0d7_KjU();
            this.dividerLineColor = h0.c(452984831);
            this.dividerLightLineColor = h0.c(452984831);
            this.containerShadow = h0.c(352321535);
            this.inputActiveBorder = getSemantic().m2330getAccent0d7_KjU();
            this.inputInactiveBorder = getNeutral().m2317getGrey0d7_KjU();
            this.inputErrorBorder = getSemantic().m2331getNegative0d7_KjU();
            this.inputDisabledBorder = getNeutral().m2317getGrey0d7_KjU();
            this.hintBg = x.b(0.05f, getSemantic().m2330getAccent0d7_KjU());
            this.cameraBackground = getNeutral().m2316getBlack0d7_KjU();
            this.cameraPictureBorder = getNeutral().m2323getWhite0d7_KjU();
            this.splashBackground = getNeutral().m2316getBlack0d7_KjU();
            this.exploreBoxText = getNeutral().m2323getWhite0d7_KjU();
            this.exploreBoxBackground = getNeutral().m2318getGreyDark0d7_KjU();
            this.downloadIcon = getSemantic().m2333getPositive0d7_KjU();
            this.cardBg = h0.e(4282203453L);
            this.homeGradientBgEnd = getNeutral().m2316getBlack0d7_KjU();
            this.readCoverBg = h0.c(872415231);
            this.progressBarBg = h0.c(855638016);
            long j4 = x.f26431f;
            this.progressBarFg = j4;
            this.unarchiveActionBg = getSemantic().m2333getPositive0d7_KjU();
            this.shareDetailsBackground = x.f26427b;
            this.shareDetailsPrimaryText = j4;
            this.shareDetailsSecondaryText = x.b(0.6f, j4);
            this.shareDetailsActionBackground = x.b(0.2f, j4);
            this.shareDetailsContentPlaceholder = getNeutral().m2318getGreyDark0d7_KjU();
            this.squareIconButtonFg = ReaderColors.INSTANCE.m2466getWhite0d7_KjU();
            this.squareIconButtonBg = ReaderColors.Transparent.INSTANCE.m2507getWhite40d7_KjU();
            this.iconSuccessTint = getBrand().m2297getGreenDark0d7_KjU();
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCameraBackground-0d7_KjU, reason: from getter */
        public long getCameraBackground() {
            return this.cameraBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCameraPictureBorder-0d7_KjU, reason: from getter */
        public long getCameraPictureBorder() {
            return this.cameraPictureBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCardBg-0d7_KjU, reason: from getter */
        public long getCardBg() {
            return this.cardBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getContainerShadow-0d7_KjU, reason: from getter */
        public long getContainerShadow() {
            return this.containerShadow;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonBg-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonBg() {
            return this.dangerConfirmButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonBorder-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonBorder() {
            return this.dangerConfirmButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonText-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonText() {
            return this.dangerConfirmButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonBg-0d7_KjU, reason: from getter */
        public long getDangerLightButtonBg() {
            return this.dangerLightButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonBorder-0d7_KjU, reason: from getter */
        public long getDangerLightButtonBorder() {
            return this.dangerLightButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonText-0d7_KjU, reason: from getter */
        public long getDangerLightButtonText() {
            return this.dangerLightButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDividerLightLineColor-0d7_KjU, reason: from getter */
        public long getDividerLightLineColor() {
            return this.dividerLightLineColor;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDividerLineColor-0d7_KjU, reason: from getter */
        public long getDividerLineColor() {
            return this.dividerLineColor;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDownloadIcon-0d7_KjU, reason: from getter */
        public long getDownloadIcon() {
            return this.downloadIcon;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getExploreBoxBackground-0d7_KjU, reason: from getter */
        public long getExploreBoxBackground() {
            return this.exploreBoxBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getExploreBoxText-0d7_KjU, reason: from getter */
        public long getExploreBoxText() {
            return this.exploreBoxText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getFileContentBg-0d7_KjU, reason: from getter */
        public long getFileContentBg() {
            return this.fileContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getFileContentTint-0d7_KjU, reason: from getter */
        public long getFileContentTint() {
            return this.fileContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getHintBg-0d7_KjU, reason: from getter */
        public long getHintBg() {
            return this.hintBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getHomeGradientBgEnd-0d7_KjU, reason: from getter */
        public long getHomeGradientBgEnd() {
            return this.homeGradientBgEnd;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getIconSuccessTint-0d7_KjU, reason: from getter */
        public long getIconSuccessTint() {
            return this.iconSuccessTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputActiveBorder-0d7_KjU, reason: from getter */
        public long getInputActiveBorder() {
            return this.inputActiveBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputDisabledBorder-0d7_KjU, reason: from getter */
        public long getInputDisabledBorder() {
            return this.inputDisabledBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputErrorBorder-0d7_KjU, reason: from getter */
        public long getInputErrorBorder() {
            return this.inputErrorBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputInactiveBorder-0d7_KjU, reason: from getter */
        public long getInputInactiveBorder() {
            return this.inputInactiveBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getLoaderBackgroundTint-0d7_KjU, reason: from getter */
        public long getLoaderBackgroundTint() {
            return this.loaderBackgroundTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryBg-0d7_KjU, reason: from getter */
        public long getPrimaryBg() {
            return this.primaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonBg-0d7_KjU, reason: from getter */
        public long getPrimaryButtonBg() {
            return this.primaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonBorder-0d7_KjU, reason: from getter */
        public long getPrimaryButtonBorder() {
            return this.primaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonText-0d7_KjU, reason: from getter */
        public long getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryText-0d7_KjU, reason: from getter */
        public long getPrimaryText() {
            return this.primaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getProgressBarBg-0d7_KjU, reason: from getter */
        public long getProgressBarBg() {
            return this.progressBarBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getProgressBarFg-0d7_KjU, reason: from getter */
        public long getProgressBarFg() {
            return this.progressBarFg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonBg-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonBg() {
            return this.quaternaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonBorder-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonBorder() {
            return this.quaternaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonText-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonText() {
            return this.quaternaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getReadCoverBg-0d7_KjU, reason: from getter */
        public long getReadCoverBg() {
            return this.readCoverBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryBg-0d7_KjU, reason: from getter */
        public long getSecondaryBg() {
            return this.secondaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonBg-0d7_KjU, reason: from getter */
        public long getSecondaryButtonBg() {
            return this.secondaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonBorder-0d7_KjU, reason: from getter */
        public long getSecondaryButtonBorder() {
            return this.secondaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonText-0d7_KjU, reason: from getter */
        public long getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryText-0d7_KjU, reason: from getter */
        public long getSecondaryText() {
            return this.secondaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableActiveBg-0d7_KjU, reason: from getter */
        public long getSelectableActiveBg() {
            return this.selectableActiveBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableActiveText-0d7_KjU, reason: from getter */
        public long getSelectableActiveText() {
            return this.selectableActiveText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableInactiveBg-0d7_KjU, reason: from getter */
        public long getSelectableInactiveBg() {
            return this.selectableInactiveBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableInactiveText-0d7_KjU, reason: from getter */
        public long getSelectableInactiveText() {
            return this.selectableInactiveText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsActionBackground-0d7_KjU, reason: from getter */
        public long getShareDetailsActionBackground() {
            return this.shareDetailsActionBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsBackground-0d7_KjU, reason: from getter */
        public long getShareDetailsBackground() {
            return this.shareDetailsBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsContentPlaceholder-0d7_KjU, reason: from getter */
        public long getShareDetailsContentPlaceholder() {
            return this.shareDetailsContentPlaceholder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsPrimaryText-0d7_KjU, reason: from getter */
        public long getShareDetailsPrimaryText() {
            return this.shareDetailsPrimaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsSecondaryText-0d7_KjU, reason: from getter */
        public long getShareDetailsSecondaryText() {
            return this.shareDetailsSecondaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSplashBackground-0d7_KjU, reason: from getter */
        public long getSplashBackground() {
            return this.splashBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSquareIconButtonBg-0d7_KjU, reason: from getter */
        public long getSquareIconButtonBg() {
            return this.squareIconButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSquareIconButtonFg-0d7_KjU, reason: from getter */
        public long getSquareIconButtonFg() {
            return this.squareIconButtonFg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryBg-0d7_KjU, reason: from getter */
        public long getTertiaryBg() {
            return this.tertiaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonBg-0d7_KjU, reason: from getter */
        public long getTertiaryButtonBg() {
            return this.tertiaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonBorder-0d7_KjU, reason: from getter */
        public long getTertiaryButtonBorder() {
            return this.tertiaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonText-0d7_KjU, reason: from getter */
        public long getTertiaryButtonText() {
            return this.tertiaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryText-0d7_KjU, reason: from getter */
        public long getTertiaryText() {
            return this.tertiaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTextContentBg-0d7_KjU, reason: from getter */
        public long getTextContentBg() {
            return this.textContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTextContentTint-0d7_KjU, reason: from getter */
        public long getTextContentTint() {
            return this.textContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonBg-0d7_KjU, reason: from getter */
        public long getTransparentButtonBg() {
            return this.transparentButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonBorder-0d7_KjU, reason: from getter */
        public long getTransparentButtonBorder() {
            return this.transparentButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonText-0d7_KjU, reason: from getter */
        public long getTransparentButtonText() {
            return this.transparentButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonBg-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonBg() {
            return this.transparentInvertedButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonBorder-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonBorder() {
            return this.transparentInvertedButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonText-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonText() {
            return this.transparentInvertedButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getUnarchiveActionBg-0d7_KjU, reason: from getter */
        public long getUnarchiveActionBg() {
            return this.unarchiveActionBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getWebsiteContentBg-0d7_KjU, reason: from getter */
        public long getWebsiteContentBg() {
            return this.websiteContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getWebsiteContentTint-0d7_KjU, reason: from getter */
        public long getWebsiteContentTint() {
            return this.websiteContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: isDark, reason: from getter */
        public boolean getIsDark() {
            return this.isDark;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0003\b\u008d\u0001\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b$\u0010\fR\u001a\u0010%\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001a\u0010'\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010\n\u001a\u0004\b(\u0010\fR\u001a\u0010)\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b*\u0010\fR\u001a\u0010+\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b,\u0010\fR\u001a\u0010-\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b.\u0010\fR\u001a\u0010/\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b0\u0010\fR\u001a\u00101\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b2\u0010\fR\u001a\u00103\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010\n\u001a\u0004\b4\u0010\fR\u001a\u00105\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010\n\u001a\u0004\b6\u0010\fR\u001a\u00107\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR\u001a\u00109\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b:\u0010\fR\u001a\u0010;\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b<\u0010\fR\u001a\u0010=\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b>\u0010\fR\u001a\u0010?\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b@\u0010\fR\u001a\u0010A\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\bB\u0010\fR\u001a\u0010C\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bD\u0010\fR\u001a\u0010E\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bF\u0010\fR\u001a\u0010G\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\n\u001a\u0004\bH\u0010\fR\u001a\u0010I\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bJ\u0010\fR\u001a\u0010K\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010\n\u001a\u0004\bL\u0010\fR\u001a\u0010M\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bN\u0010\fR\u001a\u0010O\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010\n\u001a\u0004\bP\u0010\fR\u001a\u0010Q\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010\n\u001a\u0004\bR\u0010\fR\u001a\u0010S\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010\n\u001a\u0004\bT\u0010\fR\u001a\u0010U\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010\n\u001a\u0004\bV\u0010\fR\u001a\u0010W\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010\n\u001a\u0004\bX\u0010\fR\u001a\u0010Y\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010\n\u001a\u0004\bZ\u0010\fR\u001a\u0010[\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\n\u001a\u0004\b\\\u0010\fR\u001a\u0010]\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010\n\u001a\u0004\b^\u0010\fR\u001a\u0010_\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010\n\u001a\u0004\b`\u0010\fR\u001a\u0010a\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010\n\u001a\u0004\bb\u0010\fR\u001a\u0010c\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010\n\u001a\u0004\bd\u0010\fR\u001a\u0010e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\be\u0010\n\u001a\u0004\bf\u0010\fR\u001a\u0010g\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010\n\u001a\u0004\bh\u0010\fR\u001a\u0010i\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010\n\u001a\u0004\bj\u0010\fR\u001a\u0010k\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010\n\u001a\u0004\bl\u0010\fR\u001a\u0010m\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010\n\u001a\u0004\bn\u0010\fR\u001a\u0010o\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010\n\u001a\u0004\bp\u0010\fR\u001a\u0010q\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bq\u0010\n\u001a\u0004\br\u0010\fR\u001a\u0010s\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bs\u0010\n\u001a\u0004\bt\u0010\fR\u001a\u0010u\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bu\u0010\n\u001a\u0004\bv\u0010\fR\u001a\u0010w\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010\n\u001a\u0004\bx\u0010\fR\u001a\u0010y\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010\n\u001a\u0004\bz\u0010\fR\u001a\u0010{\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010\n\u001a\u0004\b|\u0010\fR\u001a\u0010}\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010\n\u001a\u0004\b~\u0010\fR\u001b\u0010\u007f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\r\n\u0004\b\u007f\u0010\n\u001a\u0005\b\u0080\u0001\u0010\fR\u001d\u0010\u0081\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\n\u001a\u0005\b\u0082\u0001\u0010\fR\u001d\u0010\u0083\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\n\u001a\u0005\b\u0084\u0001\u0010\fR\u001d\u0010\u0085\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\n\u001a\u0005\b\u0086\u0001\u0010\fR\u001d\u0010\u0087\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\n\u001a\u0005\b\u0088\u0001\u0010\fR\u001d\u0010\u0089\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\n\u001a\u0005\b\u008a\u0001\u0010\fR\u001d\u0010\u008b\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\n\u001a\u0005\b\u008c\u0001\u0010\fR\u001d\u0010\u008d\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\n\u001a\u0005\b\u008e\u0001\u0010\fR\u001d\u0010\u008f\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\n\u001a\u0005\b\u0090\u0001\u0010\fR\u001d\u0010\u0091\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\n\u001a\u0005\b\u0092\u0001\u0010\fR\u001d\u0010\u0093\u0001\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\n\u001a\u0005\b\u0094\u0001\u0010\f¨\u0006\u0095\u0001"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors$Light;", "Lio/elevenlabs/ui/theme/ElevenLabsColors;", "<init>", "()V", "", "isDark", "Z", "()Z", "Lp3/x;", "primaryText", "J", "getPrimaryText-0d7_KjU", "()J", "secondaryText", "getSecondaryText-0d7_KjU", "tertiaryText", "getTertiaryText-0d7_KjU", "primaryBg", "getPrimaryBg-0d7_KjU", "secondaryBg", "getSecondaryBg-0d7_KjU", "tertiaryBg", "getTertiaryBg-0d7_KjU", "selectableInactiveText", "getSelectableInactiveText-0d7_KjU", "selectableActiveText", "getSelectableActiveText-0d7_KjU", "selectableInactiveBg", "getSelectableInactiveBg-0d7_KjU", "selectableActiveBg", "getSelectableActiveBg-0d7_KjU", "primaryButtonText", "getPrimaryButtonText-0d7_KjU", "secondaryButtonText", "getSecondaryButtonText-0d7_KjU", "tertiaryButtonText", "getTertiaryButtonText-0d7_KjU", "quaternaryButtonText", "getQuaternaryButtonText-0d7_KjU", "quaternaryButtonBorder", "getQuaternaryButtonBorder-0d7_KjU", "quaternaryButtonBg", "getQuaternaryButtonBg-0d7_KjU", "dangerLightButtonText", "getDangerLightButtonText-0d7_KjU", "dangerConfirmButtonText", "getDangerConfirmButtonText-0d7_KjU", "primaryButtonBg", "getPrimaryButtonBg-0d7_KjU", "secondaryButtonBg", "getSecondaryButtonBg-0d7_KjU", "tertiaryButtonBg", "getTertiaryButtonBg-0d7_KjU", "transparentButtonBg", "getTransparentButtonBg-0d7_KjU", "transparentButtonText", "getTransparentButtonText-0d7_KjU", "transparentButtonBorder", "getTransparentButtonBorder-0d7_KjU", "transparentInvertedButtonBg", "getTransparentInvertedButtonBg-0d7_KjU", "transparentInvertedButtonText", "getTransparentInvertedButtonText-0d7_KjU", "transparentInvertedButtonBorder", "getTransparentInvertedButtonBorder-0d7_KjU", "dangerLightButtonBg", "getDangerLightButtonBg-0d7_KjU", "dangerConfirmButtonBg", "getDangerConfirmButtonBg-0d7_KjU", "primaryButtonBorder", "getPrimaryButtonBorder-0d7_KjU", "secondaryButtonBorder", "getSecondaryButtonBorder-0d7_KjU", "tertiaryButtonBorder", "getTertiaryButtonBorder-0d7_KjU", "dangerLightButtonBorder", "getDangerLightButtonBorder-0d7_KjU", "dangerConfirmButtonBorder", "getDangerConfirmButtonBorder-0d7_KjU", "textContentBg", "getTextContentBg-0d7_KjU", "textContentTint", "getTextContentTint-0d7_KjU", "fileContentBg", "getFileContentBg-0d7_KjU", "fileContentTint", "getFileContentTint-0d7_KjU", "websiteContentBg", "getWebsiteContentBg-0d7_KjU", "websiteContentTint", "getWebsiteContentTint-0d7_KjU", "loaderBackgroundTint", "getLoaderBackgroundTint-0d7_KjU", "dividerLineColor", "getDividerLineColor-0d7_KjU", "dividerLightLineColor", "getDividerLightLineColor-0d7_KjU", "containerShadow", "getContainerShadow-0d7_KjU", "inputActiveBorder", "getInputActiveBorder-0d7_KjU", "inputInactiveBorder", "getInputInactiveBorder-0d7_KjU", "inputErrorBorder", "getInputErrorBorder-0d7_KjU", "inputDisabledBorder", "getInputDisabledBorder-0d7_KjU", "hintBg", "getHintBg-0d7_KjU", "cameraBackground", "getCameraBackground-0d7_KjU", "cameraPictureBorder", "getCameraPictureBorder-0d7_KjU", "splashBackground", "getSplashBackground-0d7_KjU", "exploreBoxText", "getExploreBoxText-0d7_KjU", "exploreBoxBackground", "getExploreBoxBackground-0d7_KjU", "downloadIcon", "getDownloadIcon-0d7_KjU", "cardBg", "getCardBg-0d7_KjU", "homeGradientBgEnd", "getHomeGradientBgEnd-0d7_KjU", "readCoverBg", "getReadCoverBg-0d7_KjU", "progressBarBg", "getProgressBarBg-0d7_KjU", "progressBarFg", "getProgressBarFg-0d7_KjU", "unarchiveActionBg", "getUnarchiveActionBg-0d7_KjU", "shareDetailsBackground", "getShareDetailsBackground-0d7_KjU", "shareDetailsPrimaryText", "getShareDetailsPrimaryText-0d7_KjU", "shareDetailsSecondaryText", "getShareDetailsSecondaryText-0d7_KjU", "shareDetailsActionBackground", "getShareDetailsActionBackground-0d7_KjU", "shareDetailsContentPlaceholder", "getShareDetailsContentPlaceholder-0d7_KjU", "squareIconButtonFg", "getSquareIconButtonFg-0d7_KjU", "squareIconButtonBg", "getSquareIconButtonBg-0d7_KjU", "iconSuccessTint", "getIconSuccessTint-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final class Light extends ElevenLabsColors {
        public static final int $stable = 0;
        private final long cameraBackground;
        private final long cameraPictureBorder;
        private final long cardBg;
        private final long containerShadow;
        private final long dangerConfirmButtonBg;
        private final long dangerConfirmButtonBorder;
        private final long dangerConfirmButtonText;
        private final long dangerLightButtonBg;
        private final long dangerLightButtonBorder;
        private final long dangerLightButtonText;
        private final long dividerLightLineColor;
        private final long dividerLineColor;
        private final long downloadIcon;
        private final long exploreBoxBackground;
        private final long exploreBoxText;
        private final long fileContentBg;
        private final long fileContentTint;
        private final long hintBg;
        private final long homeGradientBgEnd;
        private final long iconSuccessTint;
        private final long inputActiveBorder;
        private final long inputDisabledBorder;
        private final long inputErrorBorder;
        private final long inputInactiveBorder;
        private final boolean isDark;
        private final long loaderBackgroundTint;
        private final long primaryBg;
        private final long primaryButtonBg;
        private final long primaryButtonBorder;
        private final long primaryButtonText;
        private final long primaryText;
        private final long progressBarBg;
        private final long progressBarFg;
        private final long quaternaryButtonBg;
        private final long quaternaryButtonBorder;
        private final long quaternaryButtonText;
        private final long readCoverBg;
        private final long secondaryBg;
        private final long secondaryButtonBg;
        private final long secondaryButtonBorder;
        private final long secondaryButtonText;
        private final long secondaryText;
        private final long selectableActiveBg;
        private final long selectableActiveText;
        private final long selectableInactiveBg;
        private final long selectableInactiveText;
        private final long shareDetailsActionBackground;
        private final long shareDetailsBackground;
        private final long shareDetailsContentPlaceholder;
        private final long shareDetailsPrimaryText;
        private final long shareDetailsSecondaryText;
        private final long splashBackground;
        private final long squareIconButtonBg;
        private final long squareIconButtonFg;
        private final long tertiaryBg;
        private final long tertiaryButtonBg;
        private final long tertiaryButtonBorder;
        private final long tertiaryButtonText;
        private final long tertiaryText;
        private final long textContentBg;
        private final long textContentTint;
        private final long transparentButtonBg;
        private final long transparentButtonBorder;
        private final long transparentButtonText;
        private final long transparentInvertedButtonBg;
        private final long transparentInvertedButtonBorder;
        private final long transparentInvertedButtonText;
        private final long unarchiveActionBg;
        private final long websiteContentBg;
        private final long websiteContentTint;

        public Light() {
            super(null, null, null, 7, null);
            this.primaryText = getNeutral().m2316getBlack0d7_KjU();
            this.secondaryText = getNeutral().m2319getGreyDarker0d7_KjU();
            this.tertiaryText = getNeutral().m2318getGreyDark0d7_KjU();
            this.primaryBg = getNeutral().m2323getWhite0d7_KjU();
            this.secondaryBg = h0.e(4294177779L);
            this.tertiaryBg = getNeutral().m2321getGreyLighter0d7_KjU();
            this.selectableInactiveText = getNeutral().m2316getBlack0d7_KjU();
            this.selectableActiveText = getNeutral().m2323getWhite0d7_KjU();
            this.selectableInactiveBg = getNeutral().m2321getGreyLighter0d7_KjU();
            this.selectableActiveBg = getNeutral().m2316getBlack0d7_KjU();
            this.primaryButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.secondaryButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.tertiaryButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.quaternaryButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.quaternaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.quaternaryButtonBg = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerLightButtonText = getSemantic().m2331getNegative0d7_KjU();
            this.dangerConfirmButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.primaryButtonBg = getNeutral().m2316getBlack0d7_KjU();
            this.secondaryButtonBg = getNeutral().m2321getGreyLighter0d7_KjU();
            this.tertiaryButtonBg = getNeutral().m2323getWhite0d7_KjU();
            this.transparentButtonBg = x.b(0.8f, getNeutral().m2323getWhite0d7_KjU());
            this.transparentButtonText = getNeutral().m2316getBlack0d7_KjU();
            this.transparentButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.transparentInvertedButtonBg = x.b(0.1f, getNeutral().m2316getBlack0d7_KjU());
            this.transparentInvertedButtonText = getNeutral().m2323getWhite0d7_KjU();
            this.transparentInvertedButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerLightButtonBg = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerConfirmButtonBg = getSemantic().m2331getNegative0d7_KjU();
            this.primaryButtonBorder = getNeutral().m2316getBlack0d7_KjU();
            this.secondaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.tertiaryButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerLightButtonBorder = getNeutral().m2322getTransparent0d7_KjU();
            this.dangerConfirmButtonBorder = getSemantic().m2331getNegative0d7_KjU();
            this.textContentBg = getBrand().m2298getGreenLight0d7_KjU();
            this.textContentTint = getBrand().m2297getGreenDark0d7_KjU();
            this.fileContentBg = getBrand().m2305getTealLight0d7_KjU();
            this.fileContentTint = getBrand().m2304getTealDark0d7_KjU();
            this.websiteContentBg = getBrand().m2295getBlueLight0d7_KjU();
            this.websiteContentTint = getBrand().m2294getBlueDark0d7_KjU();
            this.loaderBackgroundTint = getNeutral().m2319getGreyDarker0d7_KjU();
            this.dividerLineColor = getNeutral().m2320getGreyLight0d7_KjU();
            this.dividerLightLineColor = getNeutral().m2321getGreyLighter0d7_KjU();
            this.containerShadow = x.b(0.1f, getNeutral().m2316getBlack0d7_KjU());
            this.inputActiveBorder = getSemantic().m2330getAccent0d7_KjU();
            this.inputInactiveBorder = getNeutral().m2317getGrey0d7_KjU();
            this.inputErrorBorder = getSemantic().m2331getNegative0d7_KjU();
            this.inputDisabledBorder = getNeutral().m2317getGrey0d7_KjU();
            this.hintBg = x.b(0.05f, getSemantic().m2330getAccent0d7_KjU());
            this.cameraBackground = getNeutral().m2316getBlack0d7_KjU();
            this.cameraPictureBorder = getNeutral().m2323getWhite0d7_KjU();
            this.splashBackground = getNeutral().m2323getWhite0d7_KjU();
            this.exploreBoxText = getNeutral().m2323getWhite0d7_KjU();
            this.exploreBoxBackground = getNeutral().m2318getGreyDark0d7_KjU();
            this.downloadIcon = getSemantic().m2333getPositive0d7_KjU();
            this.cardBg = getPrimaryBg();
            this.homeGradientBgEnd = getTertiaryBg();
            this.readCoverBg = getTertiaryBg();
            long j4 = x.f26431f;
            this.progressBarBg = j4;
            long j10 = x.f26427b;
            this.progressBarFg = j10;
            this.unarchiveActionBg = getSemantic().m2333getPositive0d7_KjU();
            this.shareDetailsBackground = j10;
            this.shareDetailsPrimaryText = j4;
            this.shareDetailsSecondaryText = x.b(0.6f, j4);
            this.shareDetailsActionBackground = x.b(0.2f, j4);
            this.shareDetailsContentPlaceholder = getNeutral().m2318getGreyDark0d7_KjU();
            this.squareIconButtonFg = ReaderColors.INSTANCE.m2366getBlack0d7_KjU();
            this.squareIconButtonBg = ReaderColors.Transparent.INSTANCE.m2482getBlack40d7_KjU();
            this.iconSuccessTint = getBrand().m2297getGreenDark0d7_KjU();
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCameraBackground-0d7_KjU, reason: from getter */
        public long getCameraBackground() {
            return this.cameraBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCameraPictureBorder-0d7_KjU, reason: from getter */
        public long getCameraPictureBorder() {
            return this.cameraPictureBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getCardBg-0d7_KjU, reason: from getter */
        public long getCardBg() {
            return this.cardBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getContainerShadow-0d7_KjU, reason: from getter */
        public long getContainerShadow() {
            return this.containerShadow;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonBg-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonBg() {
            return this.dangerConfirmButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonBorder-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonBorder() {
            return this.dangerConfirmButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerConfirmButtonText-0d7_KjU, reason: from getter */
        public long getDangerConfirmButtonText() {
            return this.dangerConfirmButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonBg-0d7_KjU, reason: from getter */
        public long getDangerLightButtonBg() {
            return this.dangerLightButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonBorder-0d7_KjU, reason: from getter */
        public long getDangerLightButtonBorder() {
            return this.dangerLightButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDangerLightButtonText-0d7_KjU, reason: from getter */
        public long getDangerLightButtonText() {
            return this.dangerLightButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDividerLightLineColor-0d7_KjU, reason: from getter */
        public long getDividerLightLineColor() {
            return this.dividerLightLineColor;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDividerLineColor-0d7_KjU, reason: from getter */
        public long getDividerLineColor() {
            return this.dividerLineColor;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getDownloadIcon-0d7_KjU, reason: from getter */
        public long getDownloadIcon() {
            return this.downloadIcon;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getExploreBoxBackground-0d7_KjU, reason: from getter */
        public long getExploreBoxBackground() {
            return this.exploreBoxBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getExploreBoxText-0d7_KjU, reason: from getter */
        public long getExploreBoxText() {
            return this.exploreBoxText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getFileContentBg-0d7_KjU, reason: from getter */
        public long getFileContentBg() {
            return this.fileContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getFileContentTint-0d7_KjU, reason: from getter */
        public long getFileContentTint() {
            return this.fileContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getHintBg-0d7_KjU, reason: from getter */
        public long getHintBg() {
            return this.hintBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getHomeGradientBgEnd-0d7_KjU, reason: from getter */
        public long getHomeGradientBgEnd() {
            return this.homeGradientBgEnd;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getIconSuccessTint-0d7_KjU, reason: from getter */
        public long getIconSuccessTint() {
            return this.iconSuccessTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputActiveBorder-0d7_KjU, reason: from getter */
        public long getInputActiveBorder() {
            return this.inputActiveBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputDisabledBorder-0d7_KjU, reason: from getter */
        public long getInputDisabledBorder() {
            return this.inputDisabledBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputErrorBorder-0d7_KjU, reason: from getter */
        public long getInputErrorBorder() {
            return this.inputErrorBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getInputInactiveBorder-0d7_KjU, reason: from getter */
        public long getInputInactiveBorder() {
            return this.inputInactiveBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getLoaderBackgroundTint-0d7_KjU, reason: from getter */
        public long getLoaderBackgroundTint() {
            return this.loaderBackgroundTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryBg-0d7_KjU, reason: from getter */
        public long getPrimaryBg() {
            return this.primaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonBg-0d7_KjU, reason: from getter */
        public long getPrimaryButtonBg() {
            return this.primaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonBorder-0d7_KjU, reason: from getter */
        public long getPrimaryButtonBorder() {
            return this.primaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryButtonText-0d7_KjU, reason: from getter */
        public long getPrimaryButtonText() {
            return this.primaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getPrimaryText-0d7_KjU, reason: from getter */
        public long getPrimaryText() {
            return this.primaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getProgressBarBg-0d7_KjU, reason: from getter */
        public long getProgressBarBg() {
            return this.progressBarBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getProgressBarFg-0d7_KjU, reason: from getter */
        public long getProgressBarFg() {
            return this.progressBarFg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonBg-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonBg() {
            return this.quaternaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonBorder-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonBorder() {
            return this.quaternaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getQuaternaryButtonText-0d7_KjU, reason: from getter */
        public long getQuaternaryButtonText() {
            return this.quaternaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getReadCoverBg-0d7_KjU, reason: from getter */
        public long getReadCoverBg() {
            return this.readCoverBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryBg-0d7_KjU, reason: from getter */
        public long getSecondaryBg() {
            return this.secondaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonBg-0d7_KjU, reason: from getter */
        public long getSecondaryButtonBg() {
            return this.secondaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonBorder-0d7_KjU, reason: from getter */
        public long getSecondaryButtonBorder() {
            return this.secondaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryButtonText-0d7_KjU, reason: from getter */
        public long getSecondaryButtonText() {
            return this.secondaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSecondaryText-0d7_KjU, reason: from getter */
        public long getSecondaryText() {
            return this.secondaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableActiveBg-0d7_KjU, reason: from getter */
        public long getSelectableActiveBg() {
            return this.selectableActiveBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableActiveText-0d7_KjU, reason: from getter */
        public long getSelectableActiveText() {
            return this.selectableActiveText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableInactiveBg-0d7_KjU, reason: from getter */
        public long getSelectableInactiveBg() {
            return this.selectableInactiveBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSelectableInactiveText-0d7_KjU, reason: from getter */
        public long getSelectableInactiveText() {
            return this.selectableInactiveText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsActionBackground-0d7_KjU, reason: from getter */
        public long getShareDetailsActionBackground() {
            return this.shareDetailsActionBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsBackground-0d7_KjU, reason: from getter */
        public long getShareDetailsBackground() {
            return this.shareDetailsBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsContentPlaceholder-0d7_KjU, reason: from getter */
        public long getShareDetailsContentPlaceholder() {
            return this.shareDetailsContentPlaceholder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsPrimaryText-0d7_KjU, reason: from getter */
        public long getShareDetailsPrimaryText() {
            return this.shareDetailsPrimaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getShareDetailsSecondaryText-0d7_KjU, reason: from getter */
        public long getShareDetailsSecondaryText() {
            return this.shareDetailsSecondaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSplashBackground-0d7_KjU, reason: from getter */
        public long getSplashBackground() {
            return this.splashBackground;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSquareIconButtonBg-0d7_KjU, reason: from getter */
        public long getSquareIconButtonBg() {
            return this.squareIconButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getSquareIconButtonFg-0d7_KjU, reason: from getter */
        public long getSquareIconButtonFg() {
            return this.squareIconButtonFg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryBg-0d7_KjU, reason: from getter */
        public long getTertiaryBg() {
            return this.tertiaryBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonBg-0d7_KjU, reason: from getter */
        public long getTertiaryButtonBg() {
            return this.tertiaryButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonBorder-0d7_KjU, reason: from getter */
        public long getTertiaryButtonBorder() {
            return this.tertiaryButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryButtonText-0d7_KjU, reason: from getter */
        public long getTertiaryButtonText() {
            return this.tertiaryButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTertiaryText-0d7_KjU, reason: from getter */
        public long getTertiaryText() {
            return this.tertiaryText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTextContentBg-0d7_KjU, reason: from getter */
        public long getTextContentBg() {
            return this.textContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTextContentTint-0d7_KjU, reason: from getter */
        public long getTextContentTint() {
            return this.textContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonBg-0d7_KjU, reason: from getter */
        public long getTransparentButtonBg() {
            return this.transparentButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonBorder-0d7_KjU, reason: from getter */
        public long getTransparentButtonBorder() {
            return this.transparentButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentButtonText-0d7_KjU, reason: from getter */
        public long getTransparentButtonText() {
            return this.transparentButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonBg-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonBg() {
            return this.transparentInvertedButtonBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonBorder-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonBorder() {
            return this.transparentInvertedButtonBorder;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getTransparentInvertedButtonText-0d7_KjU, reason: from getter */
        public long getTransparentInvertedButtonText() {
            return this.transparentInvertedButtonText;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getUnarchiveActionBg-0d7_KjU, reason: from getter */
        public long getUnarchiveActionBg() {
            return this.unarchiveActionBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getWebsiteContentBg-0d7_KjU, reason: from getter */
        public long getWebsiteContentBg() {
            return this.websiteContentBg;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: getWebsiteContentTint-0d7_KjU, reason: from getter */
        public long getWebsiteContentTint() {
            return this.websiteContentTint;
        }

        @Override // io.elevenlabs.ui.theme.ElevenLabsColors
        /* renamed from: isDark, reason: from getter */
        public boolean getIsDark() {
            return this.isDark;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ElevenLabsColors(Neutral neutral, Brand brand, Semantic semantic, int i10, f fVar) {
        this(r1, r2, r3, null);
        Neutral neutral2;
        Brand brand2;
        Semantic semantic2;
        if ((i10 & 1) != 0) {
            neutral2 = new Neutral(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 255, null);
        } else {
            neutral2 = neutral;
        }
        if ((i10 & 2) != 0) {
            brand2 = new Brand(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        } else {
            brand2 = brand;
        }
        if ((i10 & 4) != 0) {
            semantic2 = new Semantic(0L, 0L, 0L, 0L, 15, null);
        } else {
            semantic2 = semantic;
        }
    }

    public final Brand getBrand() {
        return this.brand;
    }

    /* renamed from: getCameraBackground-0d7_KjU, reason: not valid java name */
    public abstract long getCameraBackground();

    /* renamed from: getCameraPictureBorder-0d7_KjU, reason: not valid java name */
    public abstract long getCameraPictureBorder();

    /* renamed from: getCardBg-0d7_KjU, reason: not valid java name */
    public abstract long getCardBg();

    /* renamed from: getContainerShadow-0d7_KjU, reason: not valid java name */
    public abstract long getContainerShadow();

    /* renamed from: getDangerConfirmButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getDangerConfirmButtonBg();

    /* renamed from: getDangerConfirmButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getDangerConfirmButtonBorder();

    /* renamed from: getDangerConfirmButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getDangerConfirmButtonText();

    /* renamed from: getDangerLightButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getDangerLightButtonBg();

    /* renamed from: getDangerLightButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getDangerLightButtonBorder();

    /* renamed from: getDangerLightButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getDangerLightButtonText();

    /* renamed from: getDividerLightLineColor-0d7_KjU, reason: not valid java name */
    public abstract long getDividerLightLineColor();

    /* renamed from: getDividerLineColor-0d7_KjU, reason: not valid java name */
    public abstract long getDividerLineColor();

    /* renamed from: getDownloadIcon-0d7_KjU, reason: not valid java name */
    public abstract long getDownloadIcon();

    /* renamed from: getExploreBoxBackground-0d7_KjU, reason: not valid java name */
    public abstract long getExploreBoxBackground();

    /* renamed from: getExploreBoxText-0d7_KjU, reason: not valid java name */
    public abstract long getExploreBoxText();

    /* renamed from: getFileContentBg-0d7_KjU, reason: not valid java name */
    public abstract long getFileContentBg();

    /* renamed from: getFileContentTint-0d7_KjU, reason: not valid java name */
    public abstract long getFileContentTint();

    /* renamed from: getHintBg-0d7_KjU, reason: not valid java name */
    public abstract long getHintBg();

    /* renamed from: getHomeGradientBgEnd-0d7_KjU, reason: not valid java name */
    public abstract long getHomeGradientBgEnd();

    /* renamed from: getIconSuccessTint-0d7_KjU, reason: not valid java name */
    public abstract long getIconSuccessTint();

    /* renamed from: getInputActiveBorder-0d7_KjU, reason: not valid java name */
    public abstract long getInputActiveBorder();

    /* renamed from: getInputDisabledBorder-0d7_KjU, reason: not valid java name */
    public abstract long getInputDisabledBorder();

    /* renamed from: getInputErrorBorder-0d7_KjU, reason: not valid java name */
    public abstract long getInputErrorBorder();

    /* renamed from: getInputInactiveBorder-0d7_KjU, reason: not valid java name */
    public abstract long getInputInactiveBorder();

    /* renamed from: getLoaderBackgroundTint-0d7_KjU, reason: not valid java name */
    public abstract long getLoaderBackgroundTint();

    public final Neutral getNeutral() {
        return this.neutral;
    }

    /* renamed from: getPrimaryBg-0d7_KjU, reason: not valid java name */
    public abstract long getPrimaryBg();

    /* renamed from: getPrimaryButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getPrimaryButtonBg();

    /* renamed from: getPrimaryButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getPrimaryButtonBorder();

    /* renamed from: getPrimaryButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getPrimaryButtonText();

    /* renamed from: getPrimaryText-0d7_KjU, reason: not valid java name */
    public abstract long getPrimaryText();

    /* renamed from: getProgressBarBg-0d7_KjU, reason: not valid java name */
    public abstract long getProgressBarBg();

    /* renamed from: getProgressBarFg-0d7_KjU, reason: not valid java name */
    public abstract long getProgressBarFg();

    /* renamed from: getQuaternaryButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getQuaternaryButtonBg();

    /* renamed from: getQuaternaryButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getQuaternaryButtonBorder();

    /* renamed from: getQuaternaryButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getQuaternaryButtonText();

    /* renamed from: getReadCoverBg-0d7_KjU, reason: not valid java name */
    public abstract long getReadCoverBg();

    /* renamed from: getSecondaryBg-0d7_KjU, reason: not valid java name */
    public abstract long getSecondaryBg();

    /* renamed from: getSecondaryButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getSecondaryButtonBg();

    /* renamed from: getSecondaryButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getSecondaryButtonBorder();

    /* renamed from: getSecondaryButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getSecondaryButtonText();

    /* renamed from: getSecondaryText-0d7_KjU, reason: not valid java name */
    public abstract long getSecondaryText();

    /* renamed from: getSelectableActiveBg-0d7_KjU, reason: not valid java name */
    public abstract long getSelectableActiveBg();

    /* renamed from: getSelectableActiveText-0d7_KjU, reason: not valid java name */
    public abstract long getSelectableActiveText();

    /* renamed from: getSelectableInactiveBg-0d7_KjU, reason: not valid java name */
    public abstract long getSelectableInactiveBg();

    /* renamed from: getSelectableInactiveText-0d7_KjU, reason: not valid java name */
    public abstract long getSelectableInactiveText();

    public final Semantic getSemantic() {
        return this.semantic;
    }

    /* renamed from: getShareDetailsActionBackground-0d7_KjU, reason: not valid java name */
    public abstract long getShareDetailsActionBackground();

    /* renamed from: getShareDetailsBackground-0d7_KjU, reason: not valid java name */
    public abstract long getShareDetailsBackground();

    /* renamed from: getShareDetailsContentPlaceholder-0d7_KjU, reason: not valid java name */
    public abstract long getShareDetailsContentPlaceholder();

    /* renamed from: getShareDetailsPrimaryText-0d7_KjU, reason: not valid java name */
    public abstract long getShareDetailsPrimaryText();

    /* renamed from: getShareDetailsSecondaryText-0d7_KjU, reason: not valid java name */
    public abstract long getShareDetailsSecondaryText();

    /* renamed from: getSplashBackground-0d7_KjU, reason: not valid java name */
    public abstract long getSplashBackground();

    /* renamed from: getSquareIconButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getSquareIconButtonBg();

    /* renamed from: getSquareIconButtonFg-0d7_KjU, reason: not valid java name */
    public abstract long getSquareIconButtonFg();

    /* renamed from: getTertiaryBg-0d7_KjU, reason: not valid java name */
    public abstract long getTertiaryBg();

    /* renamed from: getTertiaryButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getTertiaryButtonBg();

    /* renamed from: getTertiaryButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getTertiaryButtonBorder();

    /* renamed from: getTertiaryButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getTertiaryButtonText();

    /* renamed from: getTertiaryText-0d7_KjU, reason: not valid java name */
    public abstract long getTertiaryText();

    /* renamed from: getTextContentBg-0d7_KjU, reason: not valid java name */
    public abstract long getTextContentBg();

    /* renamed from: getTextContentTint-0d7_KjU, reason: not valid java name */
    public abstract long getTextContentTint();

    /* renamed from: getTransparent-0d7_KjU, reason: not valid java name and from getter */
    public final long getTransparent() {
        return this.transparent;
    }

    /* renamed from: getTransparentButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentButtonBg();

    /* renamed from: getTransparentButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentButtonBorder();

    /* renamed from: getTransparentButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentButtonText();

    /* renamed from: getTransparentInvertedButtonBg-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentInvertedButtonBg();

    /* renamed from: getTransparentInvertedButtonBorder-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentInvertedButtonBorder();

    /* renamed from: getTransparentInvertedButtonText-0d7_KjU, reason: not valid java name */
    public abstract long getTransparentInvertedButtonText();

    /* renamed from: getUnarchiveActionBg-0d7_KjU, reason: not valid java name */
    public abstract long getUnarchiveActionBg();

    /* renamed from: getWebsiteContentBg-0d7_KjU, reason: not valid java name */
    public abstract long getWebsiteContentBg();

    /* renamed from: getWebsiteContentTint-0d7_KjU, reason: not valid java name */
    public abstract long getWebsiteContentTint();

    /* renamed from: isDark */
    public abstract boolean getIsDark();

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;", "", "Lp3/x;", "positive", "negative", "notice", "accent", "<init>", "(JJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lio/elevenlabs/ui/theme/ElevenLabsColors$Semantic;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPositive-0d7_KjU", "getNegative-0d7_KjU", "getNotice-0d7_KjU", "getAccent-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Semantic {
        public static final int $stable = 0;
        private final long accent;
        private final long negative;
        private final long notice;
        private final long positive;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Semantic(long j4, long j10, long j11, long j12, int i10, f fVar) {
            this(r0, r2, r4, r6, null);
            long j13;
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j13 = h0.e(4278226781L);
            } else {
                j13 = j4;
            }
            if ((i10 & 2) != 0) {
                j14 = h0.e(4293539881L);
            } else {
                j14 = j10;
            }
            if ((i10 & 4) != 0) {
                j15 = h0.e(4294160189L);
            } else {
                j15 = j11;
            }
            if ((i10 & 8) != 0) {
                j16 = h0.e(4278217471L);
            } else {
                j16 = j12;
            }
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Semantic m2324copyjRlVdoo$default(Semantic semantic, long j4, long j10, long j11, long j12, int i10, Object obj) {
            long j13;
            if ((i10 & 1) != 0) {
                j4 = semantic.positive;
            }
            long j14 = j4;
            if ((i10 & 2) != 0) {
                j10 = semantic.negative;
            }
            long j15 = j10;
            if ((i10 & 4) != 0) {
                j11 = semantic.notice;
            }
            long j16 = j11;
            if ((i10 & 8) != 0) {
                j13 = semantic.accent;
            } else {
                j13 = j12;
            }
            return semantic.m2329copyjRlVdoo(j14, j15, j16, j13);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPositive() {
            return this.positive;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getNegative() {
            return this.negative;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getNotice() {
            return this.notice;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getAccent() {
            return this.accent;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Semantic m2329copyjRlVdoo(long positive, long negative, long notice, long accent) {
            return new Semantic(positive, negative, notice, accent, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Semantic)) {
                return false;
            }
            Semantic semantic = (Semantic) other;
            if (x.c(this.positive, semantic.positive) && x.c(this.negative, semantic.negative) && x.c(this.notice, semantic.notice) && x.c(this.accent, semantic.accent)) {
                return true;
            }
            return false;
        }

        /* renamed from: getAccent-0d7_KjU, reason: not valid java name */
        public final long m2330getAccent0d7_KjU() {
            return this.accent;
        }

        /* renamed from: getNegative-0d7_KjU, reason: not valid java name */
        public final long m2331getNegative0d7_KjU() {
            return this.negative;
        }

        /* renamed from: getNotice-0d7_KjU, reason: not valid java name */
        public final long m2332getNotice0d7_KjU() {
            return this.notice;
        }

        /* renamed from: getPositive-0d7_KjU, reason: not valid java name */
        public final long m2333getPositive0d7_KjU() {
            return this.positive;
        }

        public int hashCode() {
            long j4 = this.positive;
            int i10 = x.f26439n;
            return Long.hashCode(this.accent) + b.g(this.notice, b.g(this.negative, Long.hashCode(j4) * 31, 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.positive);
            String i11 = x.i(this.negative);
            return defpackage.f.n(defpackage.f.s("Semantic(positive=", i10, ", negative=", i11, ", notice="), x.i(this.notice), ", accent=", x.i(this.accent), Separators.RPAREN);
        }

        private Semantic(long j4, long j10, long j11, long j12) {
            this.positive = j4;
            this.negative = j10;
            this.notice = j11;
            this.accent = j12;
        }

        public /* synthetic */ Semantic(long j4, long j10, long j11, long j12, f fVar) {
            this(j4, j10, j11, j12);
        }
    }

    private ElevenLabsColors(Neutral neutral, Brand brand, Semantic semantic) {
        this.neutral = neutral;
        this.brand = brand;
        this.semantic = semantic;
        this.transparent = h0.c(0);
    }

    public /* synthetic */ ElevenLabsColors(Neutral neutral, Brand brand, Semantic semantic, f fVar) {
        this(neutral, brand, semantic);
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u000e¨\u00064"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;", "", "Lp3/x;", "transparent", "black", "greyDarker", "greyDark", "grey", "greyLight", "greyLighter", "white", "<init>", "(JJJJJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "copy-FD3wquc", "(JJJJJJJJ)Lio/elevenlabs/ui/theme/ElevenLabsColors$Neutral;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTransparent-0d7_KjU", "getBlack-0d7_KjU", "getGreyDarker-0d7_KjU", "getGreyDark-0d7_KjU", "getGrey-0d7_KjU", "getGreyLight-0d7_KjU", "getGreyLighter-0d7_KjU", "getWhite-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Neutral {
        public static final int $stable = 0;
        private final long black;
        private final long grey;
        private final long greyDark;
        private final long greyDarker;
        private final long greyLight;
        private final long greyLighter;
        private final long transparent;
        private final long white;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Neutral(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i10, f fVar) {
            this(r1, r3, r5, r7, r9, r11, r13, r15, null);
            long j17;
            long j18;
            long j19;
            long j20;
            long j21;
            long j22;
            long j23;
            long j24;
            if ((i10 & 1) != 0) {
                j17 = h0.c(0);
            } else {
                j17 = j4;
            }
            if ((i10 & 2) != 0) {
                j18 = h0.e(4278190080L);
            } else {
                j18 = j10;
            }
            if ((i10 & 4) != 0) {
                j19 = h0.e(4285493103L);
            } else {
                j19 = j11;
            }
            if ((i10 & 8) != 0) {
                j20 = h0.e(4287927444L);
            } else {
                j20 = j12;
            }
            if ((i10 & 16) != 0) {
                j21 = h0.e(4292401368L);
            } else {
                j21 = j13;
            }
            if ((i10 & 32) != 0) {
                j22 = h0.e(4293322470L);
            } else {
                j22 = j14;
            }
            if ((i10 & 64) != 0) {
                j23 = h0.e(4294177779L);
            } else {
                j23 = j15;
            }
            if ((i10 & 128) != 0) {
                j24 = h0.e(4294967295L);
            } else {
                j24 = j16;
            }
        }

        /* renamed from: copy-FD3wquc$default, reason: not valid java name */
        public static /* synthetic */ Neutral m2306copyFD3wquc$default(Neutral neutral, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i10, Object obj) {
            long j17;
            long j18;
            long j19;
            long j20;
            long j21;
            long j22;
            long j23;
            long j24;
            long j25;
            if ((i10 & 1) != 0) {
                j17 = neutral.transparent;
            } else {
                j17 = j4;
            }
            if ((i10 & 2) != 0) {
                j18 = neutral.black;
            } else {
                j18 = j10;
            }
            if ((i10 & 4) != 0) {
                j19 = neutral.greyDarker;
            } else {
                j19 = j11;
            }
            if ((i10 & 8) != 0) {
                j20 = neutral.greyDark;
            } else {
                j20 = j12;
            }
            if ((i10 & 16) != 0) {
                j21 = neutral.grey;
            } else {
                j21 = j13;
            }
            if ((i10 & 32) != 0) {
                j22 = neutral.greyLight;
            } else {
                j22 = j14;
            }
            if ((i10 & 64) != 0) {
                j23 = neutral.greyLighter;
            } else {
                j23 = j15;
            }
            if ((i10 & 128) != 0) {
                j24 = neutral.white;
                j25 = j17;
            } else {
                j24 = j16;
                j25 = j17;
            }
            return neutral.m2315copyFD3wquc(j25, j18, j19, j20, j21, j22, j23, j24);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getTransparent() {
            return this.transparent;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBlack() {
            return this.black;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreyDarker() {
            return this.greyDarker;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreyDark() {
            return this.greyDark;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getGrey() {
            return this.grey;
        }

        /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreyLight() {
            return this.greyLight;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreyLighter() {
            return this.greyLighter;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getWhite() {
            return this.white;
        }

        /* renamed from: copy-FD3wquc, reason: not valid java name */
        public final Neutral m2315copyFD3wquc(long transparent, long black, long greyDarker, long greyDark, long grey, long greyLight, long greyLighter, long white) {
            return new Neutral(transparent, black, greyDarker, greyDark, grey, greyLight, greyLighter, white, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Neutral)) {
                return false;
            }
            Neutral neutral = (Neutral) other;
            if (x.c(this.transparent, neutral.transparent) && x.c(this.black, neutral.black) && x.c(this.greyDarker, neutral.greyDarker) && x.c(this.greyDark, neutral.greyDark) && x.c(this.grey, neutral.grey) && x.c(this.greyLight, neutral.greyLight) && x.c(this.greyLighter, neutral.greyLighter) && x.c(this.white, neutral.white)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
        public final long m2316getBlack0d7_KjU() {
            return this.black;
        }

        /* renamed from: getGrey-0d7_KjU, reason: not valid java name */
        public final long m2317getGrey0d7_KjU() {
            return this.grey;
        }

        /* renamed from: getGreyDark-0d7_KjU, reason: not valid java name */
        public final long m2318getGreyDark0d7_KjU() {
            return this.greyDark;
        }

        /* renamed from: getGreyDarker-0d7_KjU, reason: not valid java name */
        public final long m2319getGreyDarker0d7_KjU() {
            return this.greyDarker;
        }

        /* renamed from: getGreyLight-0d7_KjU, reason: not valid java name */
        public final long m2320getGreyLight0d7_KjU() {
            return this.greyLight;
        }

        /* renamed from: getGreyLighter-0d7_KjU, reason: not valid java name */
        public final long m2321getGreyLighter0d7_KjU() {
            return this.greyLighter;
        }

        /* renamed from: getTransparent-0d7_KjU, reason: not valid java name */
        public final long m2322getTransparent0d7_KjU() {
            return this.transparent;
        }

        /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
        public final long m2323getWhite0d7_KjU() {
            return this.white;
        }

        public int hashCode() {
            long j4 = this.transparent;
            int i10 = x.f26439n;
            return Long.hashCode(this.white) + b.g(this.greyLighter, b.g(this.greyLight, b.g(this.grey, b.g(this.greyDark, b.g(this.greyDarker, b.g(this.black, Long.hashCode(j4) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.transparent);
            String i11 = x.i(this.black);
            String i12 = x.i(this.greyDarker);
            String i13 = x.i(this.greyDark);
            String i14 = x.i(this.grey);
            String i15 = x.i(this.greyLight);
            String i16 = x.i(this.greyLighter);
            String i17 = x.i(this.white);
            StringBuilder s10 = defpackage.f.s("Neutral(transparent=", i10, ", black=", i11, ", greyDarker=");
            defpackage.f.x(s10, i12, ", greyDark=", i13, ", grey=");
            defpackage.f.x(s10, i14, ", greyLight=", i15, ", greyLighter=");
            return defpackage.f.n(s10, i16, ", white=", i17, Separators.RPAREN);
        }

        private Neutral(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.transparent = j4;
            this.black = j10;
            this.greyDarker = j11;
            this.greyDark = j12;
            this.grey = j13;
            this.greyLight = j14;
            this.greyLighter = j15;
            this.white = j16;
        }

        public /* synthetic */ Neutral(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, f fVar) {
            this(j4, j10, j11, j12, j13, j14, j15, j16);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0012J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0012J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0012J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0012J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0012J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0012J\u0088\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00101\u001a\u000200HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b=\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b>\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u0012R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0012R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\bB\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00107\u001a\u0004\bC\u0010\u0012¨\u0006D"}, d2 = {"Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;", "", "Lp3/x;", "elevenYellow", "purpleLight", "purpleDark", "tealLight", "tealDark", "orangeLight", "orangeDark", "greenLight", "greenDark", "blueLight", "blueDark", "redLight", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "component10-0d7_KjU", "component10", "component11-0d7_KjU", "component11", "component12-0d7_KjU", "component12", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Lio/elevenlabs/ui/theme/ElevenLabsColors$Brand;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getElevenYellow-0d7_KjU", "getPurpleLight-0d7_KjU", "getPurpleDark-0d7_KjU", "getTealLight-0d7_KjU", "getTealDark-0d7_KjU", "getOrangeLight-0d7_KjU", "getOrangeDark-0d7_KjU", "getGreenLight-0d7_KjU", "getGreenDark-0d7_KjU", "getBlueLight-0d7_KjU", "getBlueDark-0d7_KjU", "getRedLight-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Brand {
        public static final int $stable = 0;
        private final long blueDark;
        private final long blueLight;
        private final long elevenYellow;
        private final long greenDark;
        private final long greenLight;
        private final long orangeDark;
        private final long orangeLight;
        private final long purpleDark;
        private final long purpleLight;
        private final long redLight;
        private final long tealDark;
        private final long tealLight;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Brand(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i10, f fVar) {
            this(r17, r25, r27, r29, r31, r33, r35, r37, r22, r24, r1, r19, null);
            long j21;
            long j22;
            long j23;
            long j24;
            long j25;
            long j26;
            long j27;
            long j28;
            long j29;
            long j30;
            long j31;
            long j32;
            if ((i10 & 1) != 0) {
                j21 = h0.e(4294963540L);
            } else {
                j21 = j4;
            }
            if ((i10 & 2) != 0) {
                j22 = h0.e(4294374143L);
            } else {
                j22 = j10;
            }
            if ((i10 & 4) != 0) {
                j23 = h0.e(4287840240L);
            } else {
                j23 = j11;
            }
            if ((i10 & 8) != 0) {
                j24 = h0.e(4293066751L);
            } else {
                j24 = j12;
            }
            if ((i10 & 16) != 0) {
                j25 = h0.e(4278286749L);
            } else {
                j25 = j13;
            }
            if ((i10 & 32) != 0) {
                j26 = h0.e(4294964192L);
            } else {
                j26 = j14;
            }
            if ((i10 & 64) != 0) {
                j27 = h0.e(4291640076L);
            } else {
                j27 = j15;
            }
            if ((i10 & 128) != 0) {
                j28 = h0.e(4293132253L);
            } else {
                j28 = j16;
            }
            long j33 = j21;
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                j29 = h0.e(4278551557L);
            } else {
                j29 = j17;
            }
            long j34 = j29;
            if ((i10 & 512) != 0) {
                j30 = h0.e(4293785087L);
            } else {
                j30 = j18;
            }
            long j35 = j30;
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                j31 = h0.e(4279198462L);
            } else {
                j31 = j19;
            }
            if ((i10 & 2048) != 0) {
                j32 = h0.e(4294894306L);
            } else {
                j32 = j20;
            }
            long j36 = j22;
            long j37 = j23;
            long j38 = j24;
            long j39 = j25;
            long j40 = j26;
            long j41 = j27;
            long j42 = j28;
        }

        /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
        public static /* synthetic */ Brand m2280copy2qZNXz8$default(Brand brand, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, int i10, Object obj) {
            long j21;
            long j22;
            long j23;
            long j24;
            long j25;
            long j26;
            long j27;
            long j28;
            long j29;
            long j30;
            long j31;
            long j32;
            long j33;
            if ((i10 & 1) != 0) {
                j21 = brand.elevenYellow;
            } else {
                j21 = j4;
            }
            if ((i10 & 2) != 0) {
                j22 = brand.purpleLight;
            } else {
                j22 = j10;
            }
            if ((i10 & 4) != 0) {
                j23 = brand.purpleDark;
            } else {
                j23 = j11;
            }
            if ((i10 & 8) != 0) {
                j24 = brand.tealLight;
            } else {
                j24 = j12;
            }
            if ((i10 & 16) != 0) {
                j25 = brand.tealDark;
            } else {
                j25 = j13;
            }
            if ((i10 & 32) != 0) {
                j26 = brand.orangeLight;
            } else {
                j26 = j14;
            }
            if ((i10 & 64) != 0) {
                j27 = brand.orangeDark;
            } else {
                j27 = j15;
            }
            long j34 = j21;
            if ((i10 & 128) != 0) {
                j28 = brand.greenLight;
            } else {
                j28 = j16;
            }
            long j35 = j28;
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                j29 = brand.greenDark;
            } else {
                j29 = j17;
            }
            long j36 = j29;
            if ((i10 & 512) != 0) {
                j30 = brand.blueLight;
            } else {
                j30 = j18;
            }
            long j37 = j30;
            if ((i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                j31 = brand.blueDark;
            } else {
                j31 = j19;
            }
            if ((i10 & 2048) != 0) {
                j33 = j31;
                j32 = brand.redLight;
            } else {
                j32 = j20;
                j33 = j31;
            }
            return brand.m2293copy2qZNXz8(j34, j22, j23, j24, j25, j26, j27, j35, j36, j37, j33, j32);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getElevenYellow() {
            return this.elevenYellow;
        }

        /* renamed from: component10-0d7_KjU, reason: not valid java name and from getter */
        public final long getBlueLight() {
            return this.blueLight;
        }

        /* renamed from: component11-0d7_KjU, reason: not valid java name and from getter */
        public final long getBlueDark() {
            return this.blueDark;
        }

        /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
        public final long getRedLight() {
            return this.redLight;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getPurpleLight() {
            return this.purpleLight;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getPurpleDark() {
            return this.purpleDark;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getTealLight() {
            return this.tealLight;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getTealDark() {
            return this.tealDark;
        }

        /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
        public final long getOrangeLight() {
            return this.orangeLight;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getOrangeDark() {
            return this.orangeDark;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreenLight() {
            return this.greenLight;
        }

        /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
        public final long getGreenDark() {
            return this.greenDark;
        }

        /* renamed from: copy-2qZNXz8, reason: not valid java name */
        public final Brand m2293copy2qZNXz8(long elevenYellow, long purpleLight, long purpleDark, long tealLight, long tealDark, long orangeLight, long orangeDark, long greenLight, long greenDark, long blueLight, long blueDark, long redLight) {
            return new Brand(elevenYellow, purpleLight, purpleDark, tealLight, tealDark, orangeLight, orangeDark, greenLight, greenDark, blueLight, blueDark, redLight, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Brand)) {
                return false;
            }
            Brand brand = (Brand) other;
            if (x.c(this.elevenYellow, brand.elevenYellow) && x.c(this.purpleLight, brand.purpleLight) && x.c(this.purpleDark, brand.purpleDark) && x.c(this.tealLight, brand.tealLight) && x.c(this.tealDark, brand.tealDark) && x.c(this.orangeLight, brand.orangeLight) && x.c(this.orangeDark, brand.orangeDark) && x.c(this.greenLight, brand.greenLight) && x.c(this.greenDark, brand.greenDark) && x.c(this.blueLight, brand.blueLight) && x.c(this.blueDark, brand.blueDark) && x.c(this.redLight, brand.redLight)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBlueDark-0d7_KjU, reason: not valid java name */
        public final long m2294getBlueDark0d7_KjU() {
            return this.blueDark;
        }

        /* renamed from: getBlueLight-0d7_KjU, reason: not valid java name */
        public final long m2295getBlueLight0d7_KjU() {
            return this.blueLight;
        }

        /* renamed from: getElevenYellow-0d7_KjU, reason: not valid java name */
        public final long m2296getElevenYellow0d7_KjU() {
            return this.elevenYellow;
        }

        /* renamed from: getGreenDark-0d7_KjU, reason: not valid java name */
        public final long m2297getGreenDark0d7_KjU() {
            return this.greenDark;
        }

        /* renamed from: getGreenLight-0d7_KjU, reason: not valid java name */
        public final long m2298getGreenLight0d7_KjU() {
            return this.greenLight;
        }

        /* renamed from: getOrangeDark-0d7_KjU, reason: not valid java name */
        public final long m2299getOrangeDark0d7_KjU() {
            return this.orangeDark;
        }

        /* renamed from: getOrangeLight-0d7_KjU, reason: not valid java name */
        public final long m2300getOrangeLight0d7_KjU() {
            return this.orangeLight;
        }

        /* renamed from: getPurpleDark-0d7_KjU, reason: not valid java name */
        public final long m2301getPurpleDark0d7_KjU() {
            return this.purpleDark;
        }

        /* renamed from: getPurpleLight-0d7_KjU, reason: not valid java name */
        public final long m2302getPurpleLight0d7_KjU() {
            return this.purpleLight;
        }

        /* renamed from: getRedLight-0d7_KjU, reason: not valid java name */
        public final long m2303getRedLight0d7_KjU() {
            return this.redLight;
        }

        /* renamed from: getTealDark-0d7_KjU, reason: not valid java name */
        public final long m2304getTealDark0d7_KjU() {
            return this.tealDark;
        }

        /* renamed from: getTealLight-0d7_KjU, reason: not valid java name */
        public final long m2305getTealLight0d7_KjU() {
            return this.tealLight;
        }

        public int hashCode() {
            long j4 = this.elevenYellow;
            int i10 = x.f26439n;
            return Long.hashCode(this.redLight) + b.g(this.blueDark, b.g(this.blueLight, b.g(this.greenDark, b.g(this.greenLight, b.g(this.orangeDark, b.g(this.orangeLight, b.g(this.tealDark, b.g(this.tealLight, b.g(this.purpleDark, b.g(this.purpleLight, Long.hashCode(j4) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.elevenYellow);
            String i11 = x.i(this.purpleLight);
            String i12 = x.i(this.purpleDark);
            String i13 = x.i(this.tealLight);
            String i14 = x.i(this.tealDark);
            String i15 = x.i(this.orangeLight);
            String i16 = x.i(this.orangeDark);
            String i17 = x.i(this.greenLight);
            String i18 = x.i(this.greenDark);
            String i19 = x.i(this.blueLight);
            String i20 = x.i(this.blueDark);
            String i21 = x.i(this.redLight);
            StringBuilder s10 = defpackage.f.s("Brand(elevenYellow=", i10, ", purpleLight=", i11, ", purpleDark=");
            defpackage.f.x(s10, i12, ", tealLight=", i13, ", tealDark=");
            defpackage.f.x(s10, i14, ", orangeLight=", i15, ", orangeDark=");
            defpackage.f.x(s10, i16, ", greenLight=", i17, ", greenDark=");
            defpackage.f.x(s10, i18, ", blueLight=", i19, ", blueDark=");
            return defpackage.f.n(s10, i20, ", redLight=", i21, Separators.RPAREN);
        }

        private Brand(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
            this.elevenYellow = j4;
            this.purpleLight = j10;
            this.purpleDark = j11;
            this.tealLight = j12;
            this.tealDark = j13;
            this.orangeLight = j14;
            this.orangeDark = j15;
            this.greenLight = j16;
            this.greenDark = j17;
            this.blueLight = j18;
            this.blueDark = j19;
            this.redLight = j20;
        }

        public /* synthetic */ Brand(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, f fVar) {
            this(j4, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20);
        }
    }
}
