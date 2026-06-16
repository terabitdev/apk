package io.elevenlabs.ui.theme;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.b;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.f;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import p3.x;
import z.h;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:0\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\u0006\u0010.\u001a\u00020/\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203¢\u0006\u0004\b4\u00105J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0005HÆ\u0003J\t\u0010i\u001a\u00020\u0007HÆ\u0003J\t\u0010j\u001a\u00020\tHÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\t\u0010l\u001a\u00020\rHÆ\u0003J\t\u0010m\u001a\u00020\u000fHÆ\u0003J\t\u0010n\u001a\u00020\u0011HÆ\u0003J\t\u0010o\u001a\u00020\u0013HÆ\u0003J\t\u0010p\u001a\u00020\u0015HÆ\u0003J\t\u0010q\u001a\u00020\u0017HÆ\u0003J\t\u0010r\u001a\u00020\u0019HÆ\u0003J\t\u0010s\u001a\u00020\u001bHÆ\u0003J\t\u0010t\u001a\u00020\u001dHÆ\u0003J\t\u0010u\u001a\u00020\u001fHÆ\u0003J\t\u0010v\u001a\u00020!HÆ\u0003J\t\u0010w\u001a\u00020#HÆ\u0003J\t\u0010x\u001a\u00020%HÆ\u0003J\t\u0010y\u001a\u00020'HÆ\u0003J\t\u0010z\u001a\u00020)HÆ\u0003J\t\u0010{\u001a\u00020+HÆ\u0003J\t\u0010|\u001a\u00020-HÆ\u0003J\t\u0010}\u001a\u00020/HÆ\u0003J\t\u0010~\u001a\u000201HÆ\u0003J\t\u0010\u007f\u001a\u000203HÆ\u0003J\u0084\u0002\u0010\u0080\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020/2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u000203HÆ\u0001J\u0016\u0010\u0081\u0001\u001a\u00020\u00032\t\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\f\u0010\u0083\u0001\u001a\u00030\u0084\u0001HÖ\u0081\u0004J\f\u0010\u0085\u0001\u001a\u00030\u0086\u0001HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u00106R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0011\u0010&\u001a\u00020'¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b[\u0010\\R\u0011\u0010*\u001a\u00020+¢\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b_\u0010`R\u0011\u0010.\u001a\u00020/¢\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\be\u0010f¨\u0006\u009f\u0001"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme;", "", "isDark", "", ParameterNames.TEXT, "Lio/elevenlabs/ui/theme/ColorScheme$Text;", "background", "Lio/elevenlabs/ui/theme/ColorScheme$Background;", "buttonText", "Lio/elevenlabs/ui/theme/ColorScheme$ButtonText;", "buttonBackground", "Lio/elevenlabs/ui/theme/ColorScheme$ButtonBackground;", "buttonBorder", "Lio/elevenlabs/ui/theme/ColorScheme$ButtonBorder;", "miniPlayer", "Lio/elevenlabs/ui/theme/ColorScheme$MiniPlayer;", "navBar", "Lio/elevenlabs/ui/theme/ColorScheme$NavBar;", "player", "Lio/elevenlabs/ui/theme/ColorScheme$Player;", "selectable", "Lio/elevenlabs/ui/theme/ColorScheme$Selectable;", FirebaseAnalytics.Event.SEARCH, "Lio/elevenlabs/ui/theme/ColorScheme$Search;", "toast", "Lio/elevenlabs/ui/theme/ColorScheme$Toast;", "loader", "Lio/elevenlabs/ui/theme/ColorScheme$Loader;", "divider", "Lio/elevenlabs/ui/theme/ColorScheme$Divider;", "shadow", "Lio/elevenlabs/ui/theme/ColorScheme$Shadow;", "switchColorScheme", "Lio/elevenlabs/ui/theme/ColorScheme$SwitchColorScheme;", "podcastWarning", "Lio/elevenlabs/ui/theme/ColorScheme$PodcastWarning;", "playerCustomize", "Lio/elevenlabs/ui/theme/ColorScheme$PlayerCustomize;", "metaChip", "Lio/elevenlabs/ui/theme/ColorScheme$MetaChip;", "selectableCard", "Lio/elevenlabs/ui/theme/ColorScheme$SelectableCard;", "tabIndicator", "Lio/elevenlabs/ui/theme/ColorScheme$TabIndicator;", "callout", "Lio/elevenlabs/ui/theme/ColorScheme$Callout;", "squareIconButton", "Lio/elevenlabs/ui/theme/ColorScheme$SquareIconButton;", "voiceCellFeatured", "Lio/elevenlabs/ui/theme/ColorScheme$VoiceCellFeatured;", "loadingShimmer", "Lio/elevenlabs/ui/theme/ColorScheme$LoadingShimmer;", "<init>", "(ZLio/elevenlabs/ui/theme/ColorScheme$Text;Lio/elevenlabs/ui/theme/ColorScheme$Background;Lio/elevenlabs/ui/theme/ColorScheme$ButtonText;Lio/elevenlabs/ui/theme/ColorScheme$ButtonBackground;Lio/elevenlabs/ui/theme/ColorScheme$ButtonBorder;Lio/elevenlabs/ui/theme/ColorScheme$MiniPlayer;Lio/elevenlabs/ui/theme/ColorScheme$NavBar;Lio/elevenlabs/ui/theme/ColorScheme$Player;Lio/elevenlabs/ui/theme/ColorScheme$Selectable;Lio/elevenlabs/ui/theme/ColorScheme$Search;Lio/elevenlabs/ui/theme/ColorScheme$Toast;Lio/elevenlabs/ui/theme/ColorScheme$Loader;Lio/elevenlabs/ui/theme/ColorScheme$Divider;Lio/elevenlabs/ui/theme/ColorScheme$Shadow;Lio/elevenlabs/ui/theme/ColorScheme$SwitchColorScheme;Lio/elevenlabs/ui/theme/ColorScheme$PodcastWarning;Lio/elevenlabs/ui/theme/ColorScheme$PlayerCustomize;Lio/elevenlabs/ui/theme/ColorScheme$MetaChip;Lio/elevenlabs/ui/theme/ColorScheme$SelectableCard;Lio/elevenlabs/ui/theme/ColorScheme$TabIndicator;Lio/elevenlabs/ui/theme/ColorScheme$Callout;Lio/elevenlabs/ui/theme/ColorScheme$SquareIconButton;Lio/elevenlabs/ui/theme/ColorScheme$VoiceCellFeatured;Lio/elevenlabs/ui/theme/ColorScheme$LoadingShimmer;)V", "()Z", "getText", "()Lio/elevenlabs/ui/theme/ColorScheme$Text;", "getBackground", "()Lio/elevenlabs/ui/theme/ColorScheme$Background;", "getButtonText", "()Lio/elevenlabs/ui/theme/ColorScheme$ButtonText;", "getButtonBackground", "()Lio/elevenlabs/ui/theme/ColorScheme$ButtonBackground;", "getButtonBorder", "()Lio/elevenlabs/ui/theme/ColorScheme$ButtonBorder;", "getMiniPlayer", "()Lio/elevenlabs/ui/theme/ColorScheme$MiniPlayer;", "getNavBar", "()Lio/elevenlabs/ui/theme/ColorScheme$NavBar;", "getPlayer", "()Lio/elevenlabs/ui/theme/ColorScheme$Player;", "getSelectable", "()Lio/elevenlabs/ui/theme/ColorScheme$Selectable;", "getSearch", "()Lio/elevenlabs/ui/theme/ColorScheme$Search;", "getToast", "()Lio/elevenlabs/ui/theme/ColorScheme$Toast;", "getLoader", "()Lio/elevenlabs/ui/theme/ColorScheme$Loader;", "getDivider", "()Lio/elevenlabs/ui/theme/ColorScheme$Divider;", "getShadow", "()Lio/elevenlabs/ui/theme/ColorScheme$Shadow;", "getSwitchColorScheme", "()Lio/elevenlabs/ui/theme/ColorScheme$SwitchColorScheme;", "getPodcastWarning", "()Lio/elevenlabs/ui/theme/ColorScheme$PodcastWarning;", "getPlayerCustomize", "()Lio/elevenlabs/ui/theme/ColorScheme$PlayerCustomize;", "getMetaChip", "()Lio/elevenlabs/ui/theme/ColorScheme$MetaChip;", "getSelectableCard", "()Lio/elevenlabs/ui/theme/ColorScheme$SelectableCard;", "getTabIndicator", "()Lio/elevenlabs/ui/theme/ColorScheme$TabIndicator;", "getCallout", "()Lio/elevenlabs/ui/theme/ColorScheme$Callout;", "getSquareIconButton", "()Lio/elevenlabs/ui/theme/ColorScheme$SquareIconButton;", "getVoiceCellFeatured", "()Lio/elevenlabs/ui/theme/ColorScheme$VoiceCellFeatured;", "getLoadingShimmer", "()Lio/elevenlabs/ui/theme/ColorScheme$LoadingShimmer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "copy", "equals", "other", "hashCode", "", "toString", "", "Text", "Background", "ButtonText", "ButtonBackground", "ButtonBorder", "MiniPlayer", "NavBar", "Player", "Selectable", "Search", "Toast", "Loader", "Divider", "Shadow", "SwitchColorScheme", "PodcastWarning", "PlayerCustomize", "SelectableCard", "MetaChip", "TabIndicator", "Callout", "SquareIconButton", "VoiceCellFeatured", "LoadingShimmer", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final /* data */ class ColorScheme {
    public static final int $stable = 0;
    private final Background background;
    private final ButtonBackground buttonBackground;
    private final ButtonBorder buttonBorder;
    private final ButtonText buttonText;
    private final Callout callout;
    private final Divider divider;
    private final boolean isDark;
    private final Loader loader;
    private final LoadingShimmer loadingShimmer;
    private final MetaChip metaChip;
    private final MiniPlayer miniPlayer;
    private final NavBar navBar;
    private final Player player;
    private final PlayerCustomize playerCustomize;
    private final PodcastWarning podcastWarning;
    private final Search search;
    private final Selectable selectable;
    private final SelectableCard selectableCard;
    private final Shadow shadow;
    private final SquareIconButton squareIconButton;
    private final SwitchColorScheme switchColorScheme;
    private final TabIndicator tabIndicator;
    private final Text text;
    private final Toast toast;
    private final VoiceCellFeatured voiceCellFeatured;

    public ColorScheme(boolean z6, Text text, Background background, ButtonText buttonText, ButtonBackground buttonBackground, ButtonBorder buttonBorder, MiniPlayer miniPlayer, NavBar navBar, Player player, Selectable selectable, Search search, Toast toast, Loader loader, Divider divider, Shadow shadow, SwitchColorScheme switchColorScheme, PodcastWarning podcastWarning, PlayerCustomize playerCustomize, MetaChip metaChip, SelectableCard selectableCard, TabIndicator tabIndicator, Callout callout, SquareIconButton squareIconButton, VoiceCellFeatured voiceCellFeatured, LoadingShimmer loadingShimmer) {
        text.getClass();
        background.getClass();
        buttonText.getClass();
        buttonBackground.getClass();
        buttonBorder.getClass();
        miniPlayer.getClass();
        navBar.getClass();
        player.getClass();
        selectable.getClass();
        search.getClass();
        toast.getClass();
        loader.getClass();
        divider.getClass();
        shadow.getClass();
        switchColorScheme.getClass();
        podcastWarning.getClass();
        playerCustomize.getClass();
        metaChip.getClass();
        selectableCard.getClass();
        tabIndicator.getClass();
        callout.getClass();
        squareIconButton.getClass();
        voiceCellFeatured.getClass();
        loadingShimmer.getClass();
        this.isDark = z6;
        this.text = text;
        this.background = background;
        this.buttonText = buttonText;
        this.buttonBackground = buttonBackground;
        this.buttonBorder = buttonBorder;
        this.miniPlayer = miniPlayer;
        this.navBar = navBar;
        this.player = player;
        this.selectable = selectable;
        this.search = search;
        this.toast = toast;
        this.loader = loader;
        this.divider = divider;
        this.shadow = shadow;
        this.switchColorScheme = switchColorScheme;
        this.podcastWarning = podcastWarning;
        this.playerCustomize = playerCustomize;
        this.metaChip = metaChip;
        this.selectableCard = selectableCard;
        this.tabIndicator = tabIndicator;
        this.callout = callout;
        this.squareIconButton = squareIconButton;
        this.voiceCellFeatured = voiceCellFeatured;
        this.loadingShimmer = loadingShimmer;
    }

    public static /* synthetic */ ColorScheme copy$default(ColorScheme colorScheme, boolean z6, Text text, Background background, ButtonText buttonText, ButtonBackground buttonBackground, ButtonBorder buttonBorder, MiniPlayer miniPlayer, NavBar navBar, Player player, Selectable selectable, Search search, Toast toast, Loader loader, Divider divider, Shadow shadow, SwitchColorScheme switchColorScheme, PodcastWarning podcastWarning, PlayerCustomize playerCustomize, MetaChip metaChip, SelectableCard selectableCard, TabIndicator tabIndicator, Callout callout, SquareIconButton squareIconButton, VoiceCellFeatured voiceCellFeatured, LoadingShimmer loadingShimmer, int i10, Object obj) {
        LoadingShimmer loadingShimmer2;
        VoiceCellFeatured voiceCellFeatured2;
        boolean z10 = (i10 & 1) != 0 ? colorScheme.isDark : z6;
        Text text2 = (i10 & 2) != 0 ? colorScheme.text : text;
        Background background2 = (i10 & 4) != 0 ? colorScheme.background : background;
        ButtonText buttonText2 = (i10 & 8) != 0 ? colorScheme.buttonText : buttonText;
        ButtonBackground buttonBackground2 = (i10 & 16) != 0 ? colorScheme.buttonBackground : buttonBackground;
        ButtonBorder buttonBorder2 = (i10 & 32) != 0 ? colorScheme.buttonBorder : buttonBorder;
        MiniPlayer miniPlayer2 = (i10 & 64) != 0 ? colorScheme.miniPlayer : miniPlayer;
        NavBar navBar2 = (i10 & 128) != 0 ? colorScheme.navBar : navBar;
        Player player2 = (i10 & RpcError.MAX_MESSAGE_BYTES) != 0 ? colorScheme.player : player;
        Selectable selectable2 = (i10 & 512) != 0 ? colorScheme.selectable : selectable;
        Search search2 = (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? colorScheme.search : search;
        Toast toast2 = (i10 & 2048) != 0 ? colorScheme.toast : toast;
        Loader loader2 = (i10 & 4096) != 0 ? colorScheme.loader : loader;
        Divider divider2 = (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? colorScheme.divider : divider;
        boolean z11 = z10;
        Shadow shadow2 = (i10 & 16384) != 0 ? colorScheme.shadow : shadow;
        SwitchColorScheme switchColorScheme2 = (i10 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? colorScheme.switchColorScheme : switchColorScheme;
        PodcastWarning podcastWarning2 = (i10 & 65536) != 0 ? colorScheme.podcastWarning : podcastWarning;
        PlayerCustomize playerCustomize2 = (i10 & 131072) != 0 ? colorScheme.playerCustomize : playerCustomize;
        MetaChip metaChip2 = (i10 & 262144) != 0 ? colorScheme.metaChip : metaChip;
        SelectableCard selectableCard2 = (i10 & 524288) != 0 ? colorScheme.selectableCard : selectableCard;
        TabIndicator tabIndicator2 = (i10 & 1048576) != 0 ? colorScheme.tabIndicator : tabIndicator;
        Callout callout2 = (i10 & 2097152) != 0 ? colorScheme.callout : callout;
        SquareIconButton squareIconButton2 = (i10 & 4194304) != 0 ? colorScheme.squareIconButton : squareIconButton;
        VoiceCellFeatured voiceCellFeatured3 = (i10 & 8388608) != 0 ? colorScheme.voiceCellFeatured : voiceCellFeatured;
        if ((i10 & 16777216) != 0) {
            voiceCellFeatured2 = voiceCellFeatured3;
            loadingShimmer2 = colorScheme.loadingShimmer;
        } else {
            loadingShimmer2 = loadingShimmer;
            voiceCellFeatured2 = voiceCellFeatured3;
        }
        return colorScheme.copy(z11, text2, background2, buttonText2, buttonBackground2, buttonBorder2, miniPlayer2, navBar2, player2, selectable2, search2, toast2, loader2, divider2, shadow2, switchColorScheme2, podcastWarning2, playerCustomize2, metaChip2, selectableCard2, tabIndicator2, callout2, squareIconButton2, voiceCellFeatured2, loadingShimmer2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsDark() {
        return this.isDark;
    }

    /* renamed from: component10, reason: from getter */
    public final Selectable getSelectable() {
        return this.selectable;
    }

    /* renamed from: component11, reason: from getter */
    public final Search getSearch() {
        return this.search;
    }

    /* renamed from: component12, reason: from getter */
    public final Toast getToast() {
        return this.toast;
    }

    /* renamed from: component13, reason: from getter */
    public final Loader getLoader() {
        return this.loader;
    }

    /* renamed from: component14, reason: from getter */
    public final Divider getDivider() {
        return this.divider;
    }

    /* renamed from: component15, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: component16, reason: from getter */
    public final SwitchColorScheme getSwitchColorScheme() {
        return this.switchColorScheme;
    }

    /* renamed from: component17, reason: from getter */
    public final PodcastWarning getPodcastWarning() {
        return this.podcastWarning;
    }

    /* renamed from: component18, reason: from getter */
    public final PlayerCustomize getPlayerCustomize() {
        return this.playerCustomize;
    }

    /* renamed from: component19, reason: from getter */
    public final MetaChip getMetaChip() {
        return this.metaChip;
    }

    /* renamed from: component2, reason: from getter */
    public final Text getText() {
        return this.text;
    }

    /* renamed from: component20, reason: from getter */
    public final SelectableCard getSelectableCard() {
        return this.selectableCard;
    }

    /* renamed from: component21, reason: from getter */
    public final TabIndicator getTabIndicator() {
        return this.tabIndicator;
    }

    /* renamed from: component22, reason: from getter */
    public final Callout getCallout() {
        return this.callout;
    }

    /* renamed from: component23, reason: from getter */
    public final SquareIconButton getSquareIconButton() {
        return this.squareIconButton;
    }

    /* renamed from: component24, reason: from getter */
    public final VoiceCellFeatured getVoiceCellFeatured() {
        return this.voiceCellFeatured;
    }

    /* renamed from: component25, reason: from getter */
    public final LoadingShimmer getLoadingShimmer() {
        return this.loadingShimmer;
    }

    /* renamed from: component3, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonText getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonBackground getButtonBackground() {
        return this.buttonBackground;
    }

    /* renamed from: component6, reason: from getter */
    public final ButtonBorder getButtonBorder() {
        return this.buttonBorder;
    }

    /* renamed from: component7, reason: from getter */
    public final MiniPlayer getMiniPlayer() {
        return this.miniPlayer;
    }

    /* renamed from: component8, reason: from getter */
    public final NavBar getNavBar() {
        return this.navBar;
    }

    /* renamed from: component9, reason: from getter */
    public final Player getPlayer() {
        return this.player;
    }

    public final ColorScheme copy(boolean isDark, Text text, Background background, ButtonText buttonText, ButtonBackground buttonBackground, ButtonBorder buttonBorder, MiniPlayer miniPlayer, NavBar navBar, Player player, Selectable selectable, Search search, Toast toast, Loader loader, Divider divider, Shadow shadow, SwitchColorScheme switchColorScheme, PodcastWarning podcastWarning, PlayerCustomize playerCustomize, MetaChip metaChip, SelectableCard selectableCard, TabIndicator tabIndicator, Callout callout, SquareIconButton squareIconButton, VoiceCellFeatured voiceCellFeatured, LoadingShimmer loadingShimmer) {
        text.getClass();
        background.getClass();
        buttonText.getClass();
        buttonBackground.getClass();
        buttonBorder.getClass();
        miniPlayer.getClass();
        navBar.getClass();
        player.getClass();
        selectable.getClass();
        search.getClass();
        toast.getClass();
        loader.getClass();
        divider.getClass();
        shadow.getClass();
        switchColorScheme.getClass();
        podcastWarning.getClass();
        playerCustomize.getClass();
        metaChip.getClass();
        selectableCard.getClass();
        tabIndicator.getClass();
        callout.getClass();
        squareIconButton.getClass();
        voiceCellFeatured.getClass();
        loadingShimmer.getClass();
        return new ColorScheme(isDark, text, background, buttonText, buttonBackground, buttonBorder, miniPlayer, navBar, player, selectable, search, toast, loader, divider, shadow, switchColorScheme, podcastWarning, playerCustomize, metaChip, selectableCard, tabIndicator, callout, squareIconButton, voiceCellFeatured, loadingShimmer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ColorScheme)) {
            return false;
        }
        ColorScheme colorScheme = (ColorScheme) other;
        if (this.isDark == colorScheme.isDark && m.c(this.text, colorScheme.text) && m.c(this.background, colorScheme.background) && m.c(this.buttonText, colorScheme.buttonText) && m.c(this.buttonBackground, colorScheme.buttonBackground) && m.c(this.buttonBorder, colorScheme.buttonBorder) && m.c(this.miniPlayer, colorScheme.miniPlayer) && m.c(this.navBar, colorScheme.navBar) && m.c(this.player, colorScheme.player) && m.c(this.selectable, colorScheme.selectable) && m.c(this.search, colorScheme.search) && m.c(this.toast, colorScheme.toast) && m.c(this.loader, colorScheme.loader) && m.c(this.divider, colorScheme.divider) && m.c(this.shadow, colorScheme.shadow) && m.c(this.switchColorScheme, colorScheme.switchColorScheme) && m.c(this.podcastWarning, colorScheme.podcastWarning) && m.c(this.playerCustomize, colorScheme.playerCustomize) && m.c(this.metaChip, colorScheme.metaChip) && m.c(this.selectableCard, colorScheme.selectableCard) && m.c(this.tabIndicator, colorScheme.tabIndicator) && m.c(this.callout, colorScheme.callout) && m.c(this.squareIconButton, colorScheme.squareIconButton) && m.c(this.voiceCellFeatured, colorScheme.voiceCellFeatured) && m.c(this.loadingShimmer, colorScheme.loadingShimmer)) {
            return true;
        }
        return false;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final ButtonBackground getButtonBackground() {
        return this.buttonBackground;
    }

    public final ButtonBorder getButtonBorder() {
        return this.buttonBorder;
    }

    public final ButtonText getButtonText() {
        return this.buttonText;
    }

    public final Callout getCallout() {
        return this.callout;
    }

    public final Divider getDivider() {
        return this.divider;
    }

    public final Loader getLoader() {
        return this.loader;
    }

    public final LoadingShimmer getLoadingShimmer() {
        return this.loadingShimmer;
    }

    public final MetaChip getMetaChip() {
        return this.metaChip;
    }

    public final MiniPlayer getMiniPlayer() {
        return this.miniPlayer;
    }

    public final NavBar getNavBar() {
        return this.navBar;
    }

    public final Player getPlayer() {
        return this.player;
    }

    public final PlayerCustomize getPlayerCustomize() {
        return this.playerCustomize;
    }

    public final PodcastWarning getPodcastWarning() {
        return this.podcastWarning;
    }

    public final Search getSearch() {
        return this.search;
    }

    public final Selectable getSelectable() {
        return this.selectable;
    }

    public final SelectableCard getSelectableCard() {
        return this.selectableCard;
    }

    public final Shadow getShadow() {
        return this.shadow;
    }

    public final SquareIconButton getSquareIconButton() {
        return this.squareIconButton;
    }

    public final SwitchColorScheme getSwitchColorScheme() {
        return this.switchColorScheme;
    }

    public final TabIndicator getTabIndicator() {
        return this.tabIndicator;
    }

    public final Text getText() {
        return this.text;
    }

    public final Toast getToast() {
        return this.toast;
    }

    public final VoiceCellFeatured getVoiceCellFeatured() {
        return this.voiceCellFeatured;
    }

    public int hashCode() {
        return this.loadingShimmer.hashCode() + ((this.voiceCellFeatured.hashCode() + ((this.squareIconButton.hashCode() + ((this.callout.hashCode() + ((this.tabIndicator.hashCode() + ((this.selectableCard.hashCode() + ((this.metaChip.hashCode() + ((this.playerCustomize.hashCode() + ((this.podcastWarning.hashCode() + ((this.switchColorScheme.hashCode() + ((this.shadow.hashCode() + ((this.divider.hashCode() + ((this.loader.hashCode() + ((this.toast.hashCode() + ((this.search.hashCode() + ((this.selectable.hashCode() + ((this.player.hashCode() + ((this.navBar.hashCode() + ((this.miniPlayer.hashCode() + ((this.buttonBorder.hashCode() + ((this.buttonBackground.hashCode() + ((this.buttonText.hashCode() + ((this.background.hashCode() + ((this.text.hashCode() + (Boolean.hashCode(this.isDark) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final boolean isDark() {
        return this.isDark;
    }

    public String toString() {
        return "ColorScheme(isDark=" + this.isDark + ", text=" + this.text + ", background=" + this.background + ", buttonText=" + this.buttonText + ", buttonBackground=" + this.buttonBackground + ", buttonBorder=" + this.buttonBorder + ", miniPlayer=" + this.miniPlayer + ", navBar=" + this.navBar + ", player=" + this.player + ", selectable=" + this.selectable + ", search=" + this.search + ", toast=" + this.toast + ", loader=" + this.loader + ", divider=" + this.divider + ", shadow=" + this.shadow + ", switchColorScheme=" + this.switchColorScheme + ", podcastWarning=" + this.podcastWarning + ", playerCustomize=" + this.playerCustomize + ", metaChip=" + this.metaChip + ", selectableCard=" + this.selectableCard + ", tabIndicator=" + this.tabIndicator + ", callout=" + this.callout + ", squareIconButton=" + this.squareIconButton + ", voiceCellFeatured=" + this.voiceCellFeatured + ", loadingShimmer=" + this.loadingShimmer + Separators.RPAREN;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Loader;", "", "Lp3/x;", "backgroundTint", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/ui/theme/ColorScheme$Loader;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBackgroundTint-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Loader {
        public static final int $stable = 0;
        private final long backgroundTint;

        private Loader(long j4) {
            this.backgroundTint = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Loader m2060copy8_81llA$default(Loader loader, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = loader.backgroundTint;
            }
            return loader.m2062copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackgroundTint() {
            return this.backgroundTint;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Loader m2062copy8_81llA(long backgroundTint) {
            return new Loader(backgroundTint, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Loader) && x.c(this.backgroundTint, ((Loader) other).backgroundTint)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBackgroundTint-0d7_KjU, reason: not valid java name */
        public final long m2063getBackgroundTint0d7_KjU() {
            return this.backgroundTint;
        }

        public int hashCode() {
            long j4 = this.backgroundTint;
            int i10 = x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return f.C("Loader(backgroundTint=", x.i(this.backgroundTint), Separators.RPAREN);
        }

        public /* synthetic */ Loader(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$LoadingShimmer;", "", "Lp3/x;", "highlight", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/ui/theme/ColorScheme$LoadingShimmer;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getHighlight-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class LoadingShimmer {
        public static final int $stable = 0;
        private final long highlight;

        private LoadingShimmer(long j4) {
            this.highlight = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ LoadingShimmer m2064copy8_81llA$default(LoadingShimmer loadingShimmer, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = loadingShimmer.highlight;
            }
            return loadingShimmer.m2066copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getHighlight() {
            return this.highlight;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final LoadingShimmer m2066copy8_81llA(long highlight) {
            return new LoadingShimmer(highlight, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof LoadingShimmer) && x.c(this.highlight, ((LoadingShimmer) other).highlight)) {
                return true;
            }
            return false;
        }

        /* renamed from: getHighlight-0d7_KjU, reason: not valid java name */
        public final long m2067getHighlight0d7_KjU() {
            return this.highlight;
        }

        public int hashCode() {
            long j4 = this.highlight;
            int i10 = x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return f.C("LoadingShimmer(highlight=", x.i(this.highlight), Separators.RPAREN);
        }

        public /* synthetic */ LoadingShimmer(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$NavBar;", "", "Lp3/x;", "buttonFg", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/ui/theme/ColorScheme$NavBar;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getButtonFg-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class NavBar {
        public static final int $stable = 0;
        private final long buttonFg;

        private NavBar(long j4) {
            this.buttonFg = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ NavBar m2088copy8_81llA$default(NavBar navBar, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = navBar.buttonFg;
            }
            return navBar.m2090copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getButtonFg() {
            return this.buttonFg;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final NavBar m2090copy8_81llA(long buttonFg) {
            return new NavBar(buttonFg, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof NavBar) && x.c(this.buttonFg, ((NavBar) other).buttonFg)) {
                return true;
            }
            return false;
        }

        /* renamed from: getButtonFg-0d7_KjU, reason: not valid java name */
        public final long m2091getButtonFg0d7_KjU() {
            return this.buttonFg;
        }

        public int hashCode() {
            long j4 = this.buttonFg;
            int i10 = x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return f.C("NavBar(buttonFg=", x.i(this.buttonFg), Separators.RPAREN);
        }

        public /* synthetic */ NavBar(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Shadow;", "", "Lp3/x;", "container", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/ui/theme/ColorScheme$Shadow;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getContainer-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Shadow {
        public static final int $stable = 0;
        private final long container;

        private Shadow(long j4) {
            this.container = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ Shadow m2160copy8_81llA$default(Shadow shadow, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = shadow.container;
            }
            return shadow.m2162copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getContainer() {
            return this.container;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final Shadow m2162copy8_81llA(long container) {
            return new Shadow(container, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof Shadow) && x.c(this.container, ((Shadow) other).container)) {
                return true;
            }
            return false;
        }

        /* renamed from: getContainer-0d7_KjU, reason: not valid java name */
        public final long m2163getContainer0d7_KjU() {
            return this.container;
        }

        public int hashCode() {
            long j4 = this.container;
            int i10 = x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return f.C("Shadow(container=", x.i(this.container), Separators.RPAREN);
        }

        public /* synthetic */ Shadow(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$SwitchColorScheme;", "", "Lp3/x;", "tint", "<init>", "(JLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "copy-8_81llA", "(J)Lio/elevenlabs/ui/theme/ColorScheme$SwitchColorScheme;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTint-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class SwitchColorScheme {
        public static final int $stable = 0;
        private final long tint;

        private SwitchColorScheme(long j4) {
            this.tint = j4;
        }

        /* renamed from: copy-8_81llA$default, reason: not valid java name */
        public static /* synthetic */ SwitchColorScheme m2170copy8_81llA$default(SwitchColorScheme switchColorScheme, long j4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = switchColorScheme.tint;
            }
            return switchColorScheme.m2172copy8_81llA(j4);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getTint() {
            return this.tint;
        }

        /* renamed from: copy-8_81llA, reason: not valid java name */
        public final SwitchColorScheme m2172copy8_81llA(long tint) {
            return new SwitchColorScheme(tint, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if ((other instanceof SwitchColorScheme) && x.c(this.tint, ((SwitchColorScheme) other).tint)) {
                return true;
            }
            return false;
        }

        /* renamed from: getTint-0d7_KjU, reason: not valid java name */
        public final long m2173getTint0d7_KjU() {
            return this.tint;
        }

        public int hashCode() {
            long j4 = this.tint;
            int i10 = x.f26439n;
            return Long.hashCode(j4);
        }

        public String toString() {
            return f.C("SwitchColorScheme(tint=", x.i(this.tint), Separators.RPAREN);
        }

        public /* synthetic */ SwitchColorScheme(long j4, kotlin.jvm.internal.f fVar) {
            this(j4);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Divider;", "", "Lp3/x;", "line", "lightLine", "<init>", "(JJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "copy--OWjLjI", "(JJ)Lio/elevenlabs/ui/theme/ColorScheme$Divider;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getLine-0d7_KjU", "getLightLine-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Divider {
        public static final int $stable = 0;
        private final long lightLine;
        private final long line;

        private Divider(long j4, long j10) {
            this.line = j4;
            this.lightLine = j10;
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ Divider m2054copyOWjLjI$default(Divider divider, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = divider.line;
            }
            if ((i10 & 2) != 0) {
                j10 = divider.lightLine;
            }
            return divider.m2057copyOWjLjI(j4, j10);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getLine() {
            return this.line;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getLightLine() {
            return this.lightLine;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final Divider m2057copyOWjLjI(long line, long lightLine) {
            return new Divider(line, lightLine, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Divider)) {
                return false;
            }
            Divider divider = (Divider) other;
            if (x.c(this.line, divider.line) && x.c(this.lightLine, divider.lightLine)) {
                return true;
            }
            return false;
        }

        /* renamed from: getLightLine-0d7_KjU, reason: not valid java name */
        public final long m2058getLightLine0d7_KjU() {
            return this.lightLine;
        }

        /* renamed from: getLine-0d7_KjU, reason: not valid java name */
        public final long m2059getLine0d7_KjU() {
            return this.line;
        }

        public int hashCode() {
            long j4 = this.line;
            int i10 = x.f26439n;
            return Long.hashCode(this.lightLine) + (Long.hashCode(j4) * 31);
        }

        public String toString() {
            return h.c("Divider(line=", x.i(this.line), ", lightLine=", x.i(this.lightLine), Separators.RPAREN);
        }

        public /* synthetic */ Divider(long j4, long j10, kotlin.jvm.internal.f fVar) {
            this(j4, j10);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$PodcastWarning;", "", "Lp3/x;", "bg", ParameterNames.TEXT, "<init>", "(JJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "copy--OWjLjI", "(JJ)Lio/elevenlabs/ui/theme/ColorScheme$PodcastWarning;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBg-0d7_KjU", "getText-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class PodcastWarning {
        public static final int $stable = 0;
        private final long bg;
        private final long text;

        private PodcastWarning(long j4, long j10) {
            this.bg = j4;
            this.text = j10;
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ PodcastWarning m2118copyOWjLjI$default(PodcastWarning podcastWarning, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = podcastWarning.bg;
            }
            if ((i10 & 2) != 0) {
                j10 = podcastWarning.text;
            }
            return podcastWarning.m2121copyOWjLjI(j4, j10);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getText() {
            return this.text;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final PodcastWarning m2121copyOWjLjI(long bg2, long text) {
            return new PodcastWarning(bg2, text, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PodcastWarning)) {
                return false;
            }
            PodcastWarning podcastWarning = (PodcastWarning) other;
            if (x.c(this.bg, podcastWarning.bg) && x.c(this.text, podcastWarning.text)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m2122getBg0d7_KjU() {
            return this.bg;
        }

        /* renamed from: getText-0d7_KjU, reason: not valid java name */
        public final long m2123getText0d7_KjU() {
            return this.text;
        }

        public int hashCode() {
            long j4 = this.bg;
            int i10 = x.f26439n;
            return Long.hashCode(this.text) + (Long.hashCode(j4) * 31);
        }

        public String toString() {
            return h.c("PodcastWarning(bg=", x.i(this.bg), ", text=", x.i(this.text), Separators.RPAREN);
        }

        public /* synthetic */ PodcastWarning(long j4, long j10, kotlin.jvm.internal.f fVar) {
            this(j4, j10);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$SquareIconButton;", "", "Lp3/x;", "bg", "fg", "<init>", "(JJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "copy--OWjLjI", "(JJ)Lio/elevenlabs/ui/theme/ColorScheme$SquareIconButton;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBg-0d7_KjU", "getFg-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class SquareIconButton {
        public static final int $stable = 0;
        private final long bg;
        private final long fg;

        private SquareIconButton(long j4, long j10) {
            this.bg = j4;
            this.fg = j10;
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ SquareIconButton m2164copyOWjLjI$default(SquareIconButton squareIconButton, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = squareIconButton.bg;
            }
            if ((i10 & 2) != 0) {
                j10 = squareIconButton.fg;
            }
            return squareIconButton.m2167copyOWjLjI(j4, j10);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getFg() {
            return this.fg;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final SquareIconButton m2167copyOWjLjI(long bg2, long fg) {
            return new SquareIconButton(bg2, fg, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SquareIconButton)) {
                return false;
            }
            SquareIconButton squareIconButton = (SquareIconButton) other;
            if (x.c(this.bg, squareIconButton.bg) && x.c(this.fg, squareIconButton.fg)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m2168getBg0d7_KjU() {
            return this.bg;
        }

        /* renamed from: getFg-0d7_KjU, reason: not valid java name */
        public final long m2169getFg0d7_KjU() {
            return this.fg;
        }

        public int hashCode() {
            long j4 = this.bg;
            int i10 = x.f26439n;
            return Long.hashCode(this.fg) + (Long.hashCode(j4) * 31);
        }

        public String toString() {
            return h.c("SquareIconButton(bg=", x.i(this.bg), ", fg=", x.i(this.fg), Separators.RPAREN);
        }

        public /* synthetic */ SquareIconButton(long j4, long j10, kotlin.jvm.internal.f fVar) {
            this(j4, j10);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$TabIndicator;", "", "Lp3/x;", "neutral", "active", "<init>", "(JJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "copy--OWjLjI", "(JJ)Lio/elevenlabs/ui/theme/ColorScheme$TabIndicator;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getNeutral-0d7_KjU", "getActive-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class TabIndicator {
        public static final int $stable = 0;
        private final long active;
        private final long neutral;

        private TabIndicator(long j4, long j10) {
            this.neutral = j4;
            this.active = j10;
        }

        /* renamed from: copy--OWjLjI$default, reason: not valid java name */
        public static /* synthetic */ TabIndicator m2174copyOWjLjI$default(TabIndicator tabIndicator, long j4, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = tabIndicator.neutral;
            }
            if ((i10 & 2) != 0) {
                j10 = tabIndicator.active;
            }
            return tabIndicator.m2177copyOWjLjI(j4, j10);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getNeutral() {
            return this.neutral;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getActive() {
            return this.active;
        }

        /* renamed from: copy--OWjLjI, reason: not valid java name */
        public final TabIndicator m2177copyOWjLjI(long neutral, long active) {
            return new TabIndicator(neutral, active, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TabIndicator)) {
                return false;
            }
            TabIndicator tabIndicator = (TabIndicator) other;
            if (x.c(this.neutral, tabIndicator.neutral) && x.c(this.active, tabIndicator.active)) {
                return true;
            }
            return false;
        }

        /* renamed from: getActive-0d7_KjU, reason: not valid java name */
        public final long m2178getActive0d7_KjU() {
            return this.active;
        }

        /* renamed from: getNeutral-0d7_KjU, reason: not valid java name */
        public final long m2179getNeutral0d7_KjU() {
            return this.neutral;
        }

        public int hashCode() {
            long j4 = this.neutral;
            int i10 = x.f26439n;
            return Long.hashCode(this.active) + (Long.hashCode(j4) * 31);
        }

        public String toString() {
            return h.c("TabIndicator(neutral=", x.i(this.neutral), ", active=", x.i(this.active), Separators.RPAREN);
        }

        public /* synthetic */ TabIndicator(long j4, long j10, kotlin.jvm.internal.f fVar) {
            this(j4, j10);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$MetaChip;", "", "Lp3/x;", "bg", "fgPrimary", "fgSecondary", "<init>", "(JJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/elevenlabs/ui/theme/ColorScheme$MetaChip;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBg-0d7_KjU", "getFgPrimary-0d7_KjU", "getFgSecondary-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class MetaChip {
        public static final int $stable = 0;
        private final long bg;
        private final long fgPrimary;
        private final long fgSecondary;

        private MetaChip(long j4, long j10, long j11) {
            this.bg = j4;
            this.fgPrimary = j10;
            this.fgSecondary = j11;
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ MetaChip m2068copyysEtTa8$default(MetaChip metaChip, long j4, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = metaChip.bg;
            }
            long j12 = j4;
            if ((i10 & 2) != 0) {
                j10 = metaChip.fgPrimary;
            }
            long j13 = j10;
            if ((i10 & 4) != 0) {
                j11 = metaChip.fgSecondary;
            }
            return metaChip.m2072copyysEtTa8(j12, j13, j11);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getFgPrimary() {
            return this.fgPrimary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getFgSecondary() {
            return this.fgSecondary;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final MetaChip m2072copyysEtTa8(long bg2, long fgPrimary, long fgSecondary) {
            return new MetaChip(bg2, fgPrimary, fgSecondary, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetaChip)) {
                return false;
            }
            MetaChip metaChip = (MetaChip) other;
            if (x.c(this.bg, metaChip.bg) && x.c(this.fgPrimary, metaChip.fgPrimary) && x.c(this.fgSecondary, metaChip.fgSecondary)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m2073getBg0d7_KjU() {
            return this.bg;
        }

        /* renamed from: getFgPrimary-0d7_KjU, reason: not valid java name */
        public final long m2074getFgPrimary0d7_KjU() {
            return this.fgPrimary;
        }

        /* renamed from: getFgSecondary-0d7_KjU, reason: not valid java name */
        public final long m2075getFgSecondary0d7_KjU() {
            return this.fgSecondary;
        }

        public int hashCode() {
            long j4 = this.bg;
            int i10 = x.f26439n;
            return Long.hashCode(this.fgSecondary) + b.g(this.fgPrimary, Long.hashCode(j4) * 31, 31);
        }

        public String toString() {
            return f.l(x.i(this.fgSecondary), Separators.RPAREN, f.s("MetaChip(bg=", x.i(this.bg), ", fgPrimary=", x.i(this.fgPrimary), ", fgSecondary="));
        }

        public /* synthetic */ MetaChip(long j4, long j10, long j11, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$PlayerCustomize;", "", "Lp3/x;", "actionCircleBg", "actionIcon", "actionButtonText", "<init>", "(JJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/elevenlabs/ui/theme/ColorScheme$PlayerCustomize;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getActionCircleBg-0d7_KjU", "getActionIcon-0d7_KjU", "getActionButtonText-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class PlayerCustomize {
        public static final int $stable = 0;
        private final long actionButtonText;
        private final long actionCircleBg;
        private final long actionIcon;

        private PlayerCustomize(long j4, long j10, long j11) {
            this.actionCircleBg = j4;
            this.actionIcon = j10;
            this.actionButtonText = j11;
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ PlayerCustomize m2110copyysEtTa8$default(PlayerCustomize playerCustomize, long j4, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = playerCustomize.actionCircleBg;
            }
            long j12 = j4;
            if ((i10 & 2) != 0) {
                j10 = playerCustomize.actionIcon;
            }
            long j13 = j10;
            if ((i10 & 4) != 0) {
                j11 = playerCustomize.actionButtonText;
            }
            return playerCustomize.m2114copyysEtTa8(j12, j13, j11);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getActionCircleBg() {
            return this.actionCircleBg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getActionIcon() {
            return this.actionIcon;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getActionButtonText() {
            return this.actionButtonText;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final PlayerCustomize m2114copyysEtTa8(long actionCircleBg, long actionIcon, long actionButtonText) {
            return new PlayerCustomize(actionCircleBg, actionIcon, actionButtonText, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PlayerCustomize)) {
                return false;
            }
            PlayerCustomize playerCustomize = (PlayerCustomize) other;
            if (x.c(this.actionCircleBg, playerCustomize.actionCircleBg) && x.c(this.actionIcon, playerCustomize.actionIcon) && x.c(this.actionButtonText, playerCustomize.actionButtonText)) {
                return true;
            }
            return false;
        }

        /* renamed from: getActionButtonText-0d7_KjU, reason: not valid java name */
        public final long m2115getActionButtonText0d7_KjU() {
            return this.actionButtonText;
        }

        /* renamed from: getActionCircleBg-0d7_KjU, reason: not valid java name */
        public final long m2116getActionCircleBg0d7_KjU() {
            return this.actionCircleBg;
        }

        /* renamed from: getActionIcon-0d7_KjU, reason: not valid java name */
        public final long m2117getActionIcon0d7_KjU() {
            return this.actionIcon;
        }

        public int hashCode() {
            long j4 = this.actionCircleBg;
            int i10 = x.f26439n;
            return Long.hashCode(this.actionButtonText) + b.g(this.actionIcon, Long.hashCode(j4) * 31, 31);
        }

        public String toString() {
            return f.l(x.i(this.actionButtonText), Separators.RPAREN, f.s("PlayerCustomize(actionCircleBg=", x.i(this.actionCircleBg), ", actionIcon=", x.i(this.actionIcon), ", actionButtonText="));
        }

        public /* synthetic */ PlayerCustomize(long j4, long j10, long j11, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Search;", "", "Lp3/x;", "bg", "magnifyingGlass", "clearButton", "<init>", "(JJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/elevenlabs/ui/theme/ColorScheme$Search;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBg-0d7_KjU", "getMagnifyingGlass-0d7_KjU", "getClearButton-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Search {
        public static final int $stable = 0;
        private final long bg;
        private final long clearButton;
        private final long magnifyingGlass;

        private Search(long j4, long j10, long j11) {
            this.bg = j4;
            this.magnifyingGlass = j10;
            this.clearButton = j11;
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Search m2124copyysEtTa8$default(Search search, long j4, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = search.bg;
            }
            long j12 = j4;
            if ((i10 & 2) != 0) {
                j10 = search.magnifyingGlass;
            }
            long j13 = j10;
            if ((i10 & 4) != 0) {
                j11 = search.clearButton;
            }
            return search.m2128copyysEtTa8(j12, j13, j11);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getMagnifyingGlass() {
            return this.magnifyingGlass;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getClearButton() {
            return this.clearButton;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Search m2128copyysEtTa8(long bg2, long magnifyingGlass, long clearButton) {
            return new Search(bg2, magnifyingGlass, clearButton, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Search)) {
                return false;
            }
            Search search = (Search) other;
            if (x.c(this.bg, search.bg) && x.c(this.magnifyingGlass, search.magnifyingGlass) && x.c(this.clearButton, search.clearButton)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m2129getBg0d7_KjU() {
            return this.bg;
        }

        /* renamed from: getClearButton-0d7_KjU, reason: not valid java name */
        public final long m2130getClearButton0d7_KjU() {
            return this.clearButton;
        }

        /* renamed from: getMagnifyingGlass-0d7_KjU, reason: not valid java name */
        public final long m2131getMagnifyingGlass0d7_KjU() {
            return this.magnifyingGlass;
        }

        public int hashCode() {
            long j4 = this.bg;
            int i10 = x.f26439n;
            return Long.hashCode(this.clearButton) + b.g(this.magnifyingGlass, Long.hashCode(j4) * 31, 31);
        }

        public String toString() {
            return f.l(x.i(this.clearButton), Separators.RPAREN, f.s("Search(bg=", x.i(this.bg), ", magnifyingGlass=", x.i(this.magnifyingGlass), ", clearButton="));
        }

        public /* synthetic */ Search(long j4, long j10, long j11, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t¨\u0006 "}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Text;", "", "Lp3/x;", "primary", "secondary", "tertiary", "<init>", "(JJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "copy-ysEtTa8", "(JJJ)Lio/elevenlabs/ui/theme/ColorScheme$Text;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimary-0d7_KjU", "getSecondary-0d7_KjU", "getTertiary-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Text {
        public static final int $stable = 0;
        private final long primary;
        private final long secondary;
        private final long tertiary;

        private Text(long j4, long j10, long j11) {
            this.primary = j4;
            this.secondary = j10;
            this.tertiary = j11;
        }

        /* renamed from: copy-ysEtTa8$default, reason: not valid java name */
        public static /* synthetic */ Text m2180copyysEtTa8$default(Text text, long j4, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j4 = text.primary;
            }
            long j12 = j4;
            if ((i10 & 2) != 0) {
                j10 = text.secondary;
            }
            long j13 = j10;
            if ((i10 & 4) != 0) {
                j11 = text.tertiary;
            }
            return text.m2184copyysEtTa8(j12, j13, j11);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: copy-ysEtTa8, reason: not valid java name */
        public final Text m2184copyysEtTa8(long primary, long secondary, long tertiary) {
            return new Text(primary, secondary, tertiary, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            if (x.c(this.primary, text.primary) && x.c(this.secondary, text.secondary) && x.c(this.tertiary, text.tertiary)) {
                return true;
            }
            return false;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
        public final long m2185getPrimary0d7_KjU() {
            return this.primary;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
        public final long m2186getSecondary0d7_KjU() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
        public final long m2187getTertiary0d7_KjU() {
            return this.tertiary;
        }

        public int hashCode() {
            long j4 = this.primary;
            int i10 = x.f26439n;
            return Long.hashCode(this.tertiary) + b.g(this.secondary, Long.hashCode(j4) * 31, 31);
        }

        public String toString() {
            return f.l(x.i(this.tertiary), Separators.RPAREN, f.s("Text(primary=", x.i(this.primary), ", secondary=", x.i(this.secondary), ", tertiary="));
        }

        public /* synthetic */ Text(long j4, long j10, long j11, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Callout;", "", "Lp3/x;", "bg", "border", "primaryText", "secondaryText", "<init>", "(JJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lio/elevenlabs/ui/theme/ColorScheme$Callout;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBg-0d7_KjU", "getBorder-0d7_KjU", "getPrimaryText-0d7_KjU", "getSecondaryText-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Callout {
        public static final int $stable = 0;
        private final long bg;
        private final long border;
        private final long primaryText;
        private final long secondaryText;

        private Callout(long j4, long j10, long j11, long j12) {
            this.bg = j4;
            this.border = j10;
            this.primaryText = j11;
            this.secondaryText = j12;
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Callout m2044copyjRlVdoo$default(Callout callout, long j4, long j10, long j11, long j12, int i10, Object obj) {
            long j13;
            if ((i10 & 1) != 0) {
                j4 = callout.bg;
            }
            long j14 = j4;
            if ((i10 & 2) != 0) {
                j10 = callout.border;
            }
            long j15 = j10;
            if ((i10 & 4) != 0) {
                j11 = callout.primaryText;
            }
            long j16 = j11;
            if ((i10 & 8) != 0) {
                j13 = callout.secondaryText;
            } else {
                j13 = j12;
            }
            return callout.m2049copyjRlVdoo(j14, j15, j16, j13);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBg() {
            return this.bg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorder() {
            return this.border;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Callout m2049copyjRlVdoo(long bg2, long border, long primaryText, long secondaryText) {
            return new Callout(bg2, border, primaryText, secondaryText, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Callout)) {
                return false;
            }
            Callout callout = (Callout) other;
            if (x.c(this.bg, callout.bg) && x.c(this.border, callout.border) && x.c(this.primaryText, callout.primaryText) && x.c(this.secondaryText, callout.secondaryText)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBg-0d7_KjU, reason: not valid java name */
        public final long m2050getBg0d7_KjU() {
            return this.bg;
        }

        /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
        public final long m2051getBorder0d7_KjU() {
            return this.border;
        }

        /* renamed from: getPrimaryText-0d7_KjU, reason: not valid java name */
        public final long m2052getPrimaryText0d7_KjU() {
            return this.primaryText;
        }

        /* renamed from: getSecondaryText-0d7_KjU, reason: not valid java name */
        public final long m2053getSecondaryText0d7_KjU() {
            return this.secondaryText;
        }

        public int hashCode() {
            long j4 = this.bg;
            int i10 = x.f26439n;
            return Long.hashCode(this.secondaryText) + b.g(this.primaryText, b.g(this.border, Long.hashCode(j4) * 31, 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.bg);
            String i11 = x.i(this.border);
            return f.n(f.s("Callout(bg=", i10, ", border=", i11, ", primaryText="), x.i(this.primaryText), ", secondaryText=", x.i(this.secondaryText), Separators.RPAREN);
        }

        public /* synthetic */ Callout(long j4, long j10, long j11, long j12, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Selectable;", "", "Lp3/x;", "inactiveText", "activeText", "inactiveBg", "activeBg", "<init>", "(JJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lio/elevenlabs/ui/theme/ColorScheme$Selectable;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getInactiveText-0d7_KjU", "getActiveText-0d7_KjU", "getInactiveBg-0d7_KjU", "getActiveBg-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Selectable {
        public static final int $stable = 0;
        private final long activeBg;
        private final long activeText;
        private final long inactiveBg;
        private final long inactiveText;

        private Selectable(long j4, long j10, long j11, long j12) {
            this.inactiveText = j4;
            this.activeText = j10;
            this.inactiveBg = j11;
            this.activeBg = j12;
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Selectable m2132copyjRlVdoo$default(Selectable selectable, long j4, long j10, long j11, long j12, int i10, Object obj) {
            long j13;
            if ((i10 & 1) != 0) {
                j4 = selectable.inactiveText;
            }
            long j14 = j4;
            if ((i10 & 2) != 0) {
                j10 = selectable.activeText;
            }
            long j15 = j10;
            if ((i10 & 4) != 0) {
                j11 = selectable.inactiveBg;
            }
            long j16 = j11;
            if ((i10 & 8) != 0) {
                j13 = selectable.activeBg;
            } else {
                j13 = j12;
            }
            return selectable.m2137copyjRlVdoo(j14, j15, j16, j13);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveText() {
            return this.inactiveText;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveText() {
            return this.activeText;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveBg() {
            return this.inactiveBg;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveBg() {
            return this.activeBg;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Selectable m2137copyjRlVdoo(long inactiveText, long activeText, long inactiveBg, long activeBg) {
            return new Selectable(inactiveText, activeText, inactiveBg, activeBg, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selectable)) {
                return false;
            }
            Selectable selectable = (Selectable) other;
            if (x.c(this.inactiveText, selectable.inactiveText) && x.c(this.activeText, selectable.activeText) && x.c(this.inactiveBg, selectable.inactiveBg) && x.c(this.activeBg, selectable.activeBg)) {
                return true;
            }
            return false;
        }

        /* renamed from: getActiveBg-0d7_KjU, reason: not valid java name */
        public final long m2138getActiveBg0d7_KjU() {
            return this.activeBg;
        }

        /* renamed from: getActiveText-0d7_KjU, reason: not valid java name */
        public final long m2139getActiveText0d7_KjU() {
            return this.activeText;
        }

        /* renamed from: getInactiveBg-0d7_KjU, reason: not valid java name */
        public final long m2140getInactiveBg0d7_KjU() {
            return this.inactiveBg;
        }

        /* renamed from: getInactiveText-0d7_KjU, reason: not valid java name */
        public final long m2141getInactiveText0d7_KjU() {
            return this.inactiveText;
        }

        public int hashCode() {
            long j4 = this.inactiveText;
            int i10 = x.f26439n;
            return Long.hashCode(this.activeBg) + b.g(this.inactiveBg, b.g(this.activeText, Long.hashCode(j4) * 31, 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.inactiveText);
            String i11 = x.i(this.activeText);
            return f.n(f.s("Selectable(inactiveText=", i10, ", activeText=", i11, ", inactiveBg="), x.i(this.inactiveBg), ", activeBg=", x.i(this.activeBg), Separators.RPAREN);
        }

        public /* synthetic */ Selectable(long j4, long j10, long j11, long j12, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\"\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Toast;", "", "Lp3/x;", "primaryText", "secondaryText", "background", "divider", "<init>", "(JJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "copy-jRlVdoo", "(JJJJ)Lio/elevenlabs/ui/theme/ColorScheme$Toast;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimaryText-0d7_KjU", "getSecondaryText-0d7_KjU", "getBackground-0d7_KjU", "getDivider-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Toast {
        public static final int $stable = 0;
        private final long background;
        private final long divider;
        private final long primaryText;
        private final long secondaryText;

        private Toast(long j4, long j10, long j11, long j12) {
            this.primaryText = j4;
            this.secondaryText = j10;
            this.background = j11;
            this.divider = j12;
        }

        /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
        public static /* synthetic */ Toast m2188copyjRlVdoo$default(Toast toast, long j4, long j10, long j11, long j12, int i10, Object obj) {
            long j13;
            if ((i10 & 1) != 0) {
                j4 = toast.primaryText;
            }
            long j14 = j4;
            if ((i10 & 2) != 0) {
                j10 = toast.secondaryText;
            }
            long j15 = j10;
            if ((i10 & 4) != 0) {
                j11 = toast.background;
            }
            long j16 = j11;
            if ((i10 & 8) != 0) {
                j13 = toast.divider;
            } else {
                j13 = j12;
            }
            return toast.m2193copyjRlVdoo(j14, j15, j16, j13);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondaryText() {
            return this.secondaryText;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getBackground() {
            return this.background;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getDivider() {
            return this.divider;
        }

        /* renamed from: copy-jRlVdoo, reason: not valid java name */
        public final Toast m2193copyjRlVdoo(long primaryText, long secondaryText, long background, long divider) {
            return new Toast(primaryText, secondaryText, background, divider, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Toast)) {
                return false;
            }
            Toast toast = (Toast) other;
            if (x.c(this.primaryText, toast.primaryText) && x.c(this.secondaryText, toast.secondaryText) && x.c(this.background, toast.background) && x.c(this.divider, toast.divider)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
        public final long m2194getBackground0d7_KjU() {
            return this.background;
        }

        /* renamed from: getDivider-0d7_KjU, reason: not valid java name */
        public final long m2195getDivider0d7_KjU() {
            return this.divider;
        }

        /* renamed from: getPrimaryText-0d7_KjU, reason: not valid java name */
        public final long m2196getPrimaryText0d7_KjU() {
            return this.primaryText;
        }

        /* renamed from: getSecondaryText-0d7_KjU, reason: not valid java name */
        public final long m2197getSecondaryText0d7_KjU() {
            return this.secondaryText;
        }

        public int hashCode() {
            long j4 = this.primaryText;
            int i10 = x.f26439n;
            return Long.hashCode(this.divider) + b.g(this.background, b.g(this.secondaryText, Long.hashCode(j4) * 31, 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.primaryText);
            String i11 = x.i(this.secondaryText);
            return f.n(f.s("Toast(primaryText=", i10, ", secondaryText=", i11, ", background="), x.i(this.background), ", divider=", x.i(this.divider), Separators.RPAREN);
        }

        public /* synthetic */ Toast(long j4, long j10, long j11, long j12, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$ButtonBackground;", "", "Lp3/x;", "primary", "secondary", "tertiary", "dangerLight", "dangerConfirm", "<init>", "(JJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$ButtonBackground;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimary-0d7_KjU", "getSecondary-0d7_KjU", "getTertiary-0d7_KjU", "getDangerLight-0d7_KjU", "getDangerConfirm-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class ButtonBackground {
        public static final int $stable = 0;
        private final long dangerConfirm;
        private final long dangerLight;
        private final long primary;
        private final long secondary;
        private final long tertiary;

        private ButtonBackground(long j4, long j10, long j11, long j12, long j13) {
            this.primary = j4;
            this.secondary = j10;
            this.tertiary = j11;
            this.dangerLight = j12;
            this.dangerConfirm = j13;
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ ButtonBackground m2008copyt635Npw$default(ButtonBackground buttonBackground, long j4, long j10, long j11, long j12, long j13, int i10, Object obj) {
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j4 = buttonBackground.primary;
            }
            long j17 = j4;
            if ((i10 & 2) != 0) {
                j10 = buttonBackground.secondary;
            }
            long j18 = j10;
            if ((i10 & 4) != 0) {
                j14 = buttonBackground.tertiary;
            } else {
                j14 = j11;
            }
            if ((i10 & 8) != 0) {
                j15 = buttonBackground.dangerLight;
            } else {
                j15 = j12;
            }
            if ((i10 & 16) != 0) {
                j16 = buttonBackground.dangerConfirm;
            } else {
                j16 = j13;
            }
            return buttonBackground.m2014copyt635Npw(j17, j18, j14, j15, j16);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerLight() {
            return this.dangerLight;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerConfirm() {
            return this.dangerConfirm;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final ButtonBackground m2014copyt635Npw(long primary, long secondary, long tertiary, long dangerLight, long dangerConfirm) {
            return new ButtonBackground(primary, secondary, tertiary, dangerLight, dangerConfirm, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBackground)) {
                return false;
            }
            ButtonBackground buttonBackground = (ButtonBackground) other;
            if (x.c(this.primary, buttonBackground.primary) && x.c(this.secondary, buttonBackground.secondary) && x.c(this.tertiary, buttonBackground.tertiary) && x.c(this.dangerLight, buttonBackground.dangerLight) && x.c(this.dangerConfirm, buttonBackground.dangerConfirm)) {
                return true;
            }
            return false;
        }

        /* renamed from: getDangerConfirm-0d7_KjU, reason: not valid java name */
        public final long m2015getDangerConfirm0d7_KjU() {
            return this.dangerConfirm;
        }

        /* renamed from: getDangerLight-0d7_KjU, reason: not valid java name */
        public final long m2016getDangerLight0d7_KjU() {
            return this.dangerLight;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
        public final long m2017getPrimary0d7_KjU() {
            return this.primary;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
        public final long m2018getSecondary0d7_KjU() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
        public final long m2019getTertiary0d7_KjU() {
            return this.tertiary;
        }

        public int hashCode() {
            long j4 = this.primary;
            int i10 = x.f26439n;
            return Long.hashCode(this.dangerConfirm) + b.g(this.dangerLight, b.g(this.tertiary, b.g(this.secondary, Long.hashCode(j4) * 31, 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.primary);
            String i11 = x.i(this.secondary);
            String i12 = x.i(this.tertiary);
            String i13 = x.i(this.dangerLight);
            String i14 = x.i(this.dangerConfirm);
            StringBuilder s10 = f.s("ButtonBackground(primary=", i10, ", secondary=", i11, ", tertiary=");
            f.x(s10, i12, ", dangerLight=", i13, ", dangerConfirm=");
            return f.l(i14, Separators.RPAREN, s10);
        }

        public /* synthetic */ ButtonBackground(long j4, long j10, long j11, long j12, long j13, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$ButtonBorder;", "", "Lp3/x;", "primary", "secondary", "tertiary", "dangerLight", "dangerConfirm", "<init>", "(JJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$ButtonBorder;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimary-0d7_KjU", "getSecondary-0d7_KjU", "getTertiary-0d7_KjU", "getDangerLight-0d7_KjU", "getDangerConfirm-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class ButtonBorder {
        public static final int $stable = 0;
        private final long dangerConfirm;
        private final long dangerLight;
        private final long primary;
        private final long secondary;
        private final long tertiary;

        private ButtonBorder(long j4, long j10, long j11, long j12, long j13) {
            this.primary = j4;
            this.secondary = j10;
            this.tertiary = j11;
            this.dangerLight = j12;
            this.dangerConfirm = j13;
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ ButtonBorder m2020copyt635Npw$default(ButtonBorder buttonBorder, long j4, long j10, long j11, long j12, long j13, int i10, Object obj) {
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j4 = buttonBorder.primary;
            }
            long j17 = j4;
            if ((i10 & 2) != 0) {
                j10 = buttonBorder.secondary;
            }
            long j18 = j10;
            if ((i10 & 4) != 0) {
                j14 = buttonBorder.tertiary;
            } else {
                j14 = j11;
            }
            if ((i10 & 8) != 0) {
                j15 = buttonBorder.dangerLight;
            } else {
                j15 = j12;
            }
            if ((i10 & 16) != 0) {
                j16 = buttonBorder.dangerConfirm;
            } else {
                j16 = j13;
            }
            return buttonBorder.m2026copyt635Npw(j17, j18, j14, j15, j16);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerLight() {
            return this.dangerLight;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerConfirm() {
            return this.dangerConfirm;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final ButtonBorder m2026copyt635Npw(long primary, long secondary, long tertiary, long dangerLight, long dangerConfirm) {
            return new ButtonBorder(primary, secondary, tertiary, dangerLight, dangerConfirm, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonBorder)) {
                return false;
            }
            ButtonBorder buttonBorder = (ButtonBorder) other;
            if (x.c(this.primary, buttonBorder.primary) && x.c(this.secondary, buttonBorder.secondary) && x.c(this.tertiary, buttonBorder.tertiary) && x.c(this.dangerLight, buttonBorder.dangerLight) && x.c(this.dangerConfirm, buttonBorder.dangerConfirm)) {
                return true;
            }
            return false;
        }

        /* renamed from: getDangerConfirm-0d7_KjU, reason: not valid java name */
        public final long m2027getDangerConfirm0d7_KjU() {
            return this.dangerConfirm;
        }

        /* renamed from: getDangerLight-0d7_KjU, reason: not valid java name */
        public final long m2028getDangerLight0d7_KjU() {
            return this.dangerLight;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
        public final long m2029getPrimary0d7_KjU() {
            return this.primary;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
        public final long m2030getSecondary0d7_KjU() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
        public final long m2031getTertiary0d7_KjU() {
            return this.tertiary;
        }

        public int hashCode() {
            long j4 = this.primary;
            int i10 = x.f26439n;
            return Long.hashCode(this.dangerConfirm) + b.g(this.dangerLight, b.g(this.tertiary, b.g(this.secondary, Long.hashCode(j4) * 31, 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.primary);
            String i11 = x.i(this.secondary);
            String i12 = x.i(this.tertiary);
            String i13 = x.i(this.dangerLight);
            String i14 = x.i(this.dangerConfirm);
            StringBuilder s10 = f.s("ButtonBorder(primary=", i10, ", secondary=", i11, ", tertiary=");
            f.x(s10, i12, ", dangerLight=", i13, ", dangerConfirm=");
            return f.l(i14, Separators.RPAREN, s10);
        }

        public /* synthetic */ ButtonBorder(long j4, long j10, long j11, long j12, long j13, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$ButtonText;", "", "Lp3/x;", "primary", "secondary", "tertiary", "dangerLight", "dangerConfirm", "<init>", "(JJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$ButtonText;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimary-0d7_KjU", "getSecondary-0d7_KjU", "getTertiary-0d7_KjU", "getDangerLight-0d7_KjU", "getDangerConfirm-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class ButtonText {
        public static final int $stable = 0;
        private final long dangerConfirm;
        private final long dangerLight;
        private final long primary;
        private final long secondary;
        private final long tertiary;

        private ButtonText(long j4, long j10, long j11, long j12, long j13) {
            this.primary = j4;
            this.secondary = j10;
            this.tertiary = j11;
            this.dangerLight = j12;
            this.dangerConfirm = j13;
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ ButtonText m2032copyt635Npw$default(ButtonText buttonText, long j4, long j10, long j11, long j12, long j13, int i10, Object obj) {
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j4 = buttonText.primary;
            }
            long j17 = j4;
            if ((i10 & 2) != 0) {
                j10 = buttonText.secondary;
            }
            long j18 = j10;
            if ((i10 & 4) != 0) {
                j14 = buttonText.tertiary;
            } else {
                j14 = j11;
            }
            if ((i10 & 8) != 0) {
                j15 = buttonText.dangerLight;
            } else {
                j15 = j12;
            }
            if ((i10 & 16) != 0) {
                j16 = buttonText.dangerConfirm;
            } else {
                j16 = j13;
            }
            return buttonText.m2038copyt635Npw(j17, j18, j14, j15, j16);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerLight() {
            return this.dangerLight;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getDangerConfirm() {
            return this.dangerConfirm;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final ButtonText m2038copyt635Npw(long primary, long secondary, long tertiary, long dangerLight, long dangerConfirm) {
            return new ButtonText(primary, secondary, tertiary, dangerLight, dangerConfirm, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonText)) {
                return false;
            }
            ButtonText buttonText = (ButtonText) other;
            if (x.c(this.primary, buttonText.primary) && x.c(this.secondary, buttonText.secondary) && x.c(this.tertiary, buttonText.tertiary) && x.c(this.dangerLight, buttonText.dangerLight) && x.c(this.dangerConfirm, buttonText.dangerConfirm)) {
                return true;
            }
            return false;
        }

        /* renamed from: getDangerConfirm-0d7_KjU, reason: not valid java name */
        public final long m2039getDangerConfirm0d7_KjU() {
            return this.dangerConfirm;
        }

        /* renamed from: getDangerLight-0d7_KjU, reason: not valid java name */
        public final long m2040getDangerLight0d7_KjU() {
            return this.dangerLight;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
        public final long m2041getPrimary0d7_KjU() {
            return this.primary;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
        public final long m2042getSecondary0d7_KjU() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
        public final long m2043getTertiary0d7_KjU() {
            return this.tertiary;
        }

        public int hashCode() {
            long j4 = this.primary;
            int i10 = x.f26439n;
            return Long.hashCode(this.dangerConfirm) + b.g(this.dangerLight, b.g(this.tertiary, b.g(this.secondary, Long.hashCode(j4) * 31, 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.primary);
            String i11 = x.i(this.secondary);
            String i12 = x.i(this.tertiary);
            String i13 = x.i(this.dangerLight);
            String i14 = x.i(this.dangerConfirm);
            StringBuilder s10 = f.s("ButtonText(primary=", i10, ", secondary=", i11, ", tertiary=");
            f.x(s10, i12, ", dangerLight=", i13, ", dangerConfirm=");
            return f.l(i14, Separators.RPAREN, s10);
        }

        public /* synthetic */ ButtonText(long j4, long j10, long j11, long j12, long j13, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$MiniPlayer;", "", "Lp3/x;", "border", "trackFg", "trackBg", "subtitle", "circleBg", "<init>", "(JJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$MiniPlayer;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getBorder-0d7_KjU", "getTrackFg-0d7_KjU", "getTrackBg-0d7_KjU", "getSubtitle-0d7_KjU", "getCircleBg-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class MiniPlayer {
        public static final int $stable = 0;
        private final long border;
        private final long circleBg;
        private final long subtitle;
        private final long trackBg;
        private final long trackFg;

        private MiniPlayer(long j4, long j10, long j11, long j12, long j13) {
            this.border = j4;
            this.trackFg = j10;
            this.trackBg = j11;
            this.subtitle = j12;
            this.circleBg = j13;
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ MiniPlayer m2076copyt635Npw$default(MiniPlayer miniPlayer, long j4, long j10, long j11, long j12, long j13, int i10, Object obj) {
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j4 = miniPlayer.border;
            }
            long j17 = j4;
            if ((i10 & 2) != 0) {
                j10 = miniPlayer.trackFg;
            }
            long j18 = j10;
            if ((i10 & 4) != 0) {
                j14 = miniPlayer.trackBg;
            } else {
                j14 = j11;
            }
            if ((i10 & 8) != 0) {
                j15 = miniPlayer.subtitle;
            } else {
                j15 = j12;
            }
            if ((i10 & 16) != 0) {
                j16 = miniPlayer.circleBg;
            } else {
                j16 = j13;
            }
            return miniPlayer.m2082copyt635Npw(j17, j18, j14, j15, j16);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getBorder() {
            return this.border;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getTrackFg() {
            return this.trackFg;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTrackBg() {
            return this.trackBg;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCircleBg() {
            return this.circleBg;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final MiniPlayer m2082copyt635Npw(long border, long trackFg, long trackBg, long subtitle, long circleBg) {
            return new MiniPlayer(border, trackFg, trackBg, subtitle, circleBg, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MiniPlayer)) {
                return false;
            }
            MiniPlayer miniPlayer = (MiniPlayer) other;
            if (x.c(this.border, miniPlayer.border) && x.c(this.trackFg, miniPlayer.trackFg) && x.c(this.trackBg, miniPlayer.trackBg) && x.c(this.subtitle, miniPlayer.subtitle) && x.c(this.circleBg, miniPlayer.circleBg)) {
                return true;
            }
            return false;
        }

        /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
        public final long m2083getBorder0d7_KjU() {
            return this.border;
        }

        /* renamed from: getCircleBg-0d7_KjU, reason: not valid java name */
        public final long m2084getCircleBg0d7_KjU() {
            return this.circleBg;
        }

        /* renamed from: getSubtitle-0d7_KjU, reason: not valid java name */
        public final long m2085getSubtitle0d7_KjU() {
            return this.subtitle;
        }

        /* renamed from: getTrackBg-0d7_KjU, reason: not valid java name */
        public final long m2086getTrackBg0d7_KjU() {
            return this.trackBg;
        }

        /* renamed from: getTrackFg-0d7_KjU, reason: not valid java name */
        public final long m2087getTrackFg0d7_KjU() {
            return this.trackFg;
        }

        public int hashCode() {
            long j4 = this.border;
            int i10 = x.f26439n;
            return Long.hashCode(this.circleBg) + b.g(this.subtitle, b.g(this.trackBg, b.g(this.trackFg, Long.hashCode(j4) * 31, 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.border);
            String i11 = x.i(this.trackFg);
            String i12 = x.i(this.trackBg);
            String i13 = x.i(this.subtitle);
            String i14 = x.i(this.circleBg);
            StringBuilder s10 = f.s("MiniPlayer(border=", i10, ", trackFg=", i11, ", trackBg=");
            f.x(s10, i12, ", subtitle=", i13, ", circleBg=");
            return f.l(i14, Separators.RPAREN, s10);
        }

        public /* synthetic */ MiniPlayer(long j4, long j10, long j11, long j12, long j13, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$VoiceCellFeatured;", "", "Lp3/x;", "title", "subtitle", "favoriteButtonActive", "favoriteButtonInactive", "checkbox", "<init>", "(JJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "copy-t635Npw", "(JJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$VoiceCellFeatured;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTitle-0d7_KjU", "getSubtitle-0d7_KjU", "getFavoriteButtonActive-0d7_KjU", "getFavoriteButtonInactive-0d7_KjU", "getCheckbox-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class VoiceCellFeatured {
        public static final int $stable = 0;
        private final long checkbox;
        private final long favoriteButtonActive;
        private final long favoriteButtonInactive;
        private final long subtitle;
        private final long title;

        private VoiceCellFeatured(long j4, long j10, long j11, long j12, long j13) {
            this.title = j4;
            this.subtitle = j10;
            this.favoriteButtonActive = j11;
            this.favoriteButtonInactive = j12;
            this.checkbox = j13;
        }

        /* renamed from: copy-t635Npw$default, reason: not valid java name */
        public static /* synthetic */ VoiceCellFeatured m2198copyt635Npw$default(VoiceCellFeatured voiceCellFeatured, long j4, long j10, long j11, long j12, long j13, int i10, Object obj) {
            long j14;
            long j15;
            long j16;
            if ((i10 & 1) != 0) {
                j4 = voiceCellFeatured.title;
            }
            long j17 = j4;
            if ((i10 & 2) != 0) {
                j10 = voiceCellFeatured.subtitle;
            }
            long j18 = j10;
            if ((i10 & 4) != 0) {
                j14 = voiceCellFeatured.favoriteButtonActive;
            } else {
                j14 = j11;
            }
            if ((i10 & 8) != 0) {
                j15 = voiceCellFeatured.favoriteButtonInactive;
            } else {
                j15 = j12;
            }
            if ((i10 & 16) != 0) {
                j16 = voiceCellFeatured.checkbox;
            } else {
                j16 = j13;
            }
            return voiceCellFeatured.m2204copyt635Npw(j17, j18, j14, j15, j16);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getTitle() {
            return this.title;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getFavoriteButtonActive() {
            return this.favoriteButtonActive;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getFavoriteButtonInactive() {
            return this.favoriteButtonInactive;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getCheckbox() {
            return this.checkbox;
        }

        /* renamed from: copy-t635Npw, reason: not valid java name */
        public final VoiceCellFeatured m2204copyt635Npw(long title, long subtitle, long favoriteButtonActive, long favoriteButtonInactive, long checkbox) {
            return new VoiceCellFeatured(title, subtitle, favoriteButtonActive, favoriteButtonInactive, checkbox, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VoiceCellFeatured)) {
                return false;
            }
            VoiceCellFeatured voiceCellFeatured = (VoiceCellFeatured) other;
            if (x.c(this.title, voiceCellFeatured.title) && x.c(this.subtitle, voiceCellFeatured.subtitle) && x.c(this.favoriteButtonActive, voiceCellFeatured.favoriteButtonActive) && x.c(this.favoriteButtonInactive, voiceCellFeatured.favoriteButtonInactive) && x.c(this.checkbox, voiceCellFeatured.checkbox)) {
                return true;
            }
            return false;
        }

        /* renamed from: getCheckbox-0d7_KjU, reason: not valid java name */
        public final long m2205getCheckbox0d7_KjU() {
            return this.checkbox;
        }

        /* renamed from: getFavoriteButtonActive-0d7_KjU, reason: not valid java name */
        public final long m2206getFavoriteButtonActive0d7_KjU() {
            return this.favoriteButtonActive;
        }

        /* renamed from: getFavoriteButtonInactive-0d7_KjU, reason: not valid java name */
        public final long m2207getFavoriteButtonInactive0d7_KjU() {
            return this.favoriteButtonInactive;
        }

        /* renamed from: getSubtitle-0d7_KjU, reason: not valid java name */
        public final long m2208getSubtitle0d7_KjU() {
            return this.subtitle;
        }

        /* renamed from: getTitle-0d7_KjU, reason: not valid java name */
        public final long m2209getTitle0d7_KjU() {
            return this.title;
        }

        public int hashCode() {
            long j4 = this.title;
            int i10 = x.f26439n;
            return Long.hashCode(this.checkbox) + b.g(this.favoriteButtonInactive, b.g(this.favoriteButtonActive, b.g(this.subtitle, Long.hashCode(j4) * 31, 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.title);
            String i11 = x.i(this.subtitle);
            String i12 = x.i(this.favoriteButtonActive);
            String i13 = x.i(this.favoriteButtonInactive);
            String i14 = x.i(this.checkbox);
            StringBuilder s10 = f.s("VoiceCellFeatured(title=", i10, ", subtitle=", i11, ", favoriteButtonActive=");
            f.x(s10, i12, ", favoriteButtonInactive=", i13, ", checkbox=");
            return f.l(i14, Separators.RPAREN, s10);
        }

        public /* synthetic */ VoiceCellFeatured(long j4, long j10, long j11, long j12, long j13, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u000e¨\u00064"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Player;", "", "Lp3/x;", "circleBg", "circleStroke", "floatingButtonBg", "floatingButtonIcon", "floatingButtonText", "invertedFloatingButtonBg", "invertedFloatingButtonIcon", "invertedFloatingButtonText", "<init>", "(JJJJJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "copy-FD3wquc", "(JJJJJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$Player;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCircleBg-0d7_KjU", "getCircleStroke-0d7_KjU", "getFloatingButtonBg-0d7_KjU", "getFloatingButtonIcon-0d7_KjU", "getFloatingButtonText-0d7_KjU", "getInvertedFloatingButtonBg-0d7_KjU", "getInvertedFloatingButtonIcon-0d7_KjU", "getInvertedFloatingButtonText-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Player {
        public static final int $stable = 0;
        private final long circleBg;
        private final long circleStroke;
        private final long floatingButtonBg;
        private final long floatingButtonIcon;
        private final long floatingButtonText;
        private final long invertedFloatingButtonBg;
        private final long invertedFloatingButtonIcon;
        private final long invertedFloatingButtonText;

        private Player(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.circleBg = j4;
            this.circleStroke = j10;
            this.floatingButtonBg = j11;
            this.floatingButtonIcon = j12;
            this.floatingButtonText = j13;
            this.invertedFloatingButtonBg = j14;
            this.invertedFloatingButtonIcon = j15;
            this.invertedFloatingButtonText = j16;
        }

        /* renamed from: copy-FD3wquc$default, reason: not valid java name */
        public static /* synthetic */ Player m2092copyFD3wquc$default(Player player, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i10, Object obj) {
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
                j17 = player.circleBg;
            } else {
                j17 = j4;
            }
            if ((i10 & 2) != 0) {
                j18 = player.circleStroke;
            } else {
                j18 = j10;
            }
            if ((i10 & 4) != 0) {
                j19 = player.floatingButtonBg;
            } else {
                j19 = j11;
            }
            if ((i10 & 8) != 0) {
                j20 = player.floatingButtonIcon;
            } else {
                j20 = j12;
            }
            if ((i10 & 16) != 0) {
                j21 = player.floatingButtonText;
            } else {
                j21 = j13;
            }
            if ((i10 & 32) != 0) {
                j22 = player.invertedFloatingButtonBg;
            } else {
                j22 = j14;
            }
            if ((i10 & 64) != 0) {
                j23 = player.invertedFloatingButtonIcon;
            } else {
                j23 = j15;
            }
            if ((i10 & 128) != 0) {
                j24 = player.invertedFloatingButtonText;
                j25 = j17;
            } else {
                j24 = j16;
                j25 = j17;
            }
            return player.m2101copyFD3wquc(j25, j18, j19, j20, j21, j22, j23, j24);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getCircleBg() {
            return this.circleBg;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getCircleStroke() {
            return this.circleStroke;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getFloatingButtonBg() {
            return this.floatingButtonBg;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getFloatingButtonIcon() {
            return this.floatingButtonIcon;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getFloatingButtonText() {
            return this.floatingButtonText;
        }

        /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
        public final long getInvertedFloatingButtonBg() {
            return this.invertedFloatingButtonBg;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getInvertedFloatingButtonIcon() {
            return this.invertedFloatingButtonIcon;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getInvertedFloatingButtonText() {
            return this.invertedFloatingButtonText;
        }

        /* renamed from: copy-FD3wquc, reason: not valid java name */
        public final Player m2101copyFD3wquc(long circleBg, long circleStroke, long floatingButtonBg, long floatingButtonIcon, long floatingButtonText, long invertedFloatingButtonBg, long invertedFloatingButtonIcon, long invertedFloatingButtonText) {
            return new Player(circleBg, circleStroke, floatingButtonBg, floatingButtonIcon, floatingButtonText, invertedFloatingButtonBg, invertedFloatingButtonIcon, invertedFloatingButtonText, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Player)) {
                return false;
            }
            Player player = (Player) other;
            if (x.c(this.circleBg, player.circleBg) && x.c(this.circleStroke, player.circleStroke) && x.c(this.floatingButtonBg, player.floatingButtonBg) && x.c(this.floatingButtonIcon, player.floatingButtonIcon) && x.c(this.floatingButtonText, player.floatingButtonText) && x.c(this.invertedFloatingButtonBg, player.invertedFloatingButtonBg) && x.c(this.invertedFloatingButtonIcon, player.invertedFloatingButtonIcon) && x.c(this.invertedFloatingButtonText, player.invertedFloatingButtonText)) {
                return true;
            }
            return false;
        }

        /* renamed from: getCircleBg-0d7_KjU, reason: not valid java name */
        public final long m2102getCircleBg0d7_KjU() {
            return this.circleBg;
        }

        /* renamed from: getCircleStroke-0d7_KjU, reason: not valid java name */
        public final long m2103getCircleStroke0d7_KjU() {
            return this.circleStroke;
        }

        /* renamed from: getFloatingButtonBg-0d7_KjU, reason: not valid java name */
        public final long m2104getFloatingButtonBg0d7_KjU() {
            return this.floatingButtonBg;
        }

        /* renamed from: getFloatingButtonIcon-0d7_KjU, reason: not valid java name */
        public final long m2105getFloatingButtonIcon0d7_KjU() {
            return this.floatingButtonIcon;
        }

        /* renamed from: getFloatingButtonText-0d7_KjU, reason: not valid java name */
        public final long m2106getFloatingButtonText0d7_KjU() {
            return this.floatingButtonText;
        }

        /* renamed from: getInvertedFloatingButtonBg-0d7_KjU, reason: not valid java name */
        public final long m2107getInvertedFloatingButtonBg0d7_KjU() {
            return this.invertedFloatingButtonBg;
        }

        /* renamed from: getInvertedFloatingButtonIcon-0d7_KjU, reason: not valid java name */
        public final long m2108getInvertedFloatingButtonIcon0d7_KjU() {
            return this.invertedFloatingButtonIcon;
        }

        /* renamed from: getInvertedFloatingButtonText-0d7_KjU, reason: not valid java name */
        public final long m2109getInvertedFloatingButtonText0d7_KjU() {
            return this.invertedFloatingButtonText;
        }

        public int hashCode() {
            long j4 = this.circleBg;
            int i10 = x.f26439n;
            return Long.hashCode(this.invertedFloatingButtonText) + b.g(this.invertedFloatingButtonIcon, b.g(this.invertedFloatingButtonBg, b.g(this.floatingButtonText, b.g(this.floatingButtonIcon, b.g(this.floatingButtonBg, b.g(this.circleStroke, Long.hashCode(j4) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.circleBg);
            String i11 = x.i(this.circleStroke);
            String i12 = x.i(this.floatingButtonBg);
            String i13 = x.i(this.floatingButtonIcon);
            String i14 = x.i(this.floatingButtonText);
            String i15 = x.i(this.invertedFloatingButtonBg);
            String i16 = x.i(this.invertedFloatingButtonIcon);
            String i17 = x.i(this.invertedFloatingButtonText);
            StringBuilder s10 = f.s("Player(circleBg=", i10, ", circleStroke=", i11, ", floatingButtonBg=");
            f.x(s10, i12, ", floatingButtonIcon=", i13, ", floatingButtonText=");
            f.x(s10, i14, ", invertedFloatingButtonBg=", i15, ", invertedFloatingButtonIcon=");
            return f.n(s10, i16, ", invertedFloatingButtonText=", i17, Separators.RPAREN);
        }

        public /* synthetic */ Player(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13, j14, j15, j16);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u000eJ`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u000eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u000eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b3\u0010\u000e¨\u00064"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$SelectableCard;", "", "Lp3/x;", "inactiveText", "inactiveSecondaryText", "inactiveBg", "inactiveBorder", "activeText", "activeSecondaryText", "activeBg", "activeBorder", "<init>", "(JJJJJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "copy-FD3wquc", "(JJJJJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$SelectableCard;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getInactiveText-0d7_KjU", "getInactiveSecondaryText-0d7_KjU", "getInactiveBg-0d7_KjU", "getInactiveBorder-0d7_KjU", "getActiveText-0d7_KjU", "getActiveSecondaryText-0d7_KjU", "getActiveBg-0d7_KjU", "getActiveBorder-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class SelectableCard {
        public static final int $stable = 0;
        private final long activeBg;
        private final long activeBorder;
        private final long activeSecondaryText;
        private final long activeText;
        private final long inactiveBg;
        private final long inactiveBorder;
        private final long inactiveSecondaryText;
        private final long inactiveText;

        private SelectableCard(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.inactiveText = j4;
            this.inactiveSecondaryText = j10;
            this.inactiveBg = j11;
            this.inactiveBorder = j12;
            this.activeText = j13;
            this.activeSecondaryText = j14;
            this.activeBg = j15;
            this.activeBorder = j16;
        }

        /* renamed from: copy-FD3wquc$default, reason: not valid java name */
        public static /* synthetic */ SelectableCard m2142copyFD3wquc$default(SelectableCard selectableCard, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, int i10, Object obj) {
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
                j17 = selectableCard.inactiveText;
            } else {
                j17 = j4;
            }
            if ((i10 & 2) != 0) {
                j18 = selectableCard.inactiveSecondaryText;
            } else {
                j18 = j10;
            }
            if ((i10 & 4) != 0) {
                j19 = selectableCard.inactiveBg;
            } else {
                j19 = j11;
            }
            if ((i10 & 8) != 0) {
                j20 = selectableCard.inactiveBorder;
            } else {
                j20 = j12;
            }
            if ((i10 & 16) != 0) {
                j21 = selectableCard.activeText;
            } else {
                j21 = j13;
            }
            if ((i10 & 32) != 0) {
                j22 = selectableCard.activeSecondaryText;
            } else {
                j22 = j14;
            }
            if ((i10 & 64) != 0) {
                j23 = selectableCard.activeBg;
            } else {
                j23 = j15;
            }
            if ((i10 & 128) != 0) {
                j24 = selectableCard.activeBorder;
                j25 = j17;
            } else {
                j24 = j16;
                j25 = j17;
            }
            return selectableCard.m2151copyFD3wquc(j25, j18, j19, j20, j21, j22, j23, j24);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveText() {
            return this.inactiveText;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveSecondaryText() {
            return this.inactiveSecondaryText;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveBg() {
            return this.inactiveBg;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getInactiveBorder() {
            return this.inactiveBorder;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveText() {
            return this.activeText;
        }

        /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveSecondaryText() {
            return this.activeSecondaryText;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveBg() {
            return this.activeBg;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getActiveBorder() {
            return this.activeBorder;
        }

        /* renamed from: copy-FD3wquc, reason: not valid java name */
        public final SelectableCard m2151copyFD3wquc(long inactiveText, long inactiveSecondaryText, long inactiveBg, long inactiveBorder, long activeText, long activeSecondaryText, long activeBg, long activeBorder) {
            return new SelectableCard(inactiveText, inactiveSecondaryText, inactiveBg, inactiveBorder, activeText, activeSecondaryText, activeBg, activeBorder, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectableCard)) {
                return false;
            }
            SelectableCard selectableCard = (SelectableCard) other;
            if (x.c(this.inactiveText, selectableCard.inactiveText) && x.c(this.inactiveSecondaryText, selectableCard.inactiveSecondaryText) && x.c(this.inactiveBg, selectableCard.inactiveBg) && x.c(this.inactiveBorder, selectableCard.inactiveBorder) && x.c(this.activeText, selectableCard.activeText) && x.c(this.activeSecondaryText, selectableCard.activeSecondaryText) && x.c(this.activeBg, selectableCard.activeBg) && x.c(this.activeBorder, selectableCard.activeBorder)) {
                return true;
            }
            return false;
        }

        /* renamed from: getActiveBg-0d7_KjU, reason: not valid java name */
        public final long m2152getActiveBg0d7_KjU() {
            return this.activeBg;
        }

        /* renamed from: getActiveBorder-0d7_KjU, reason: not valid java name */
        public final long m2153getActiveBorder0d7_KjU() {
            return this.activeBorder;
        }

        /* renamed from: getActiveSecondaryText-0d7_KjU, reason: not valid java name */
        public final long m2154getActiveSecondaryText0d7_KjU() {
            return this.activeSecondaryText;
        }

        /* renamed from: getActiveText-0d7_KjU, reason: not valid java name */
        public final long m2155getActiveText0d7_KjU() {
            return this.activeText;
        }

        /* renamed from: getInactiveBg-0d7_KjU, reason: not valid java name */
        public final long m2156getInactiveBg0d7_KjU() {
            return this.inactiveBg;
        }

        /* renamed from: getInactiveBorder-0d7_KjU, reason: not valid java name */
        public final long m2157getInactiveBorder0d7_KjU() {
            return this.inactiveBorder;
        }

        /* renamed from: getInactiveSecondaryText-0d7_KjU, reason: not valid java name */
        public final long m2158getInactiveSecondaryText0d7_KjU() {
            return this.inactiveSecondaryText;
        }

        /* renamed from: getInactiveText-0d7_KjU, reason: not valid java name */
        public final long m2159getInactiveText0d7_KjU() {
            return this.inactiveText;
        }

        public int hashCode() {
            long j4 = this.inactiveText;
            int i10 = x.f26439n;
            return Long.hashCode(this.activeBorder) + b.g(this.activeBg, b.g(this.activeSecondaryText, b.g(this.activeText, b.g(this.inactiveBorder, b.g(this.inactiveBg, b.g(this.inactiveSecondaryText, Long.hashCode(j4) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.inactiveText);
            String i11 = x.i(this.inactiveSecondaryText);
            String i12 = x.i(this.inactiveBg);
            String i13 = x.i(this.inactiveBorder);
            String i14 = x.i(this.activeText);
            String i15 = x.i(this.activeSecondaryText);
            String i16 = x.i(this.activeBg);
            String i17 = x.i(this.activeBorder);
            StringBuilder s10 = f.s("SelectableCard(inactiveText=", i10, ", inactiveSecondaryText=", i11, ", inactiveBg=");
            f.x(s10, i12, ", inactiveBorder=", i13, ", activeText=");
            f.x(s10, i14, ", activeSecondaryText=", i15, ", activeBg=");
            return f.n(s10, i16, ", activeBorder=", i17, Separators.RPAREN);
        }

        public /* synthetic */ SelectableCard(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13, j14, j15, j16);
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u000fJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u000fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000fJj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u000fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u000fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u000f¨\u00068"}, d2 = {"Lio/elevenlabs/ui/theme/ColorScheme$Background;", "", "Lp3/x;", "primary", "secondary", "tertiary", ParameterNames.CARD, "readCover", "headerDetailTopGradient", "headerDetailBottomGradient", "collectionReadDetail", "warning", "<init>", "(JJJJJJJJJLkotlin/jvm/internal/f;)V", "component1-0d7_KjU", "()J", "component1", "component2-0d7_KjU", "component2", "component3-0d7_KjU", "component3", "component4-0d7_KjU", "component4", "component5-0d7_KjU", "component5", "component6-0d7_KjU", "component6", "component7-0d7_KjU", "component7", "component8-0d7_KjU", "component8", "component9-0d7_KjU", "component9", "copy-5r9EGqc", "(JJJJJJJJJ)Lio/elevenlabs/ui/theme/ColorScheme$Background;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getPrimary-0d7_KjU", "getSecondary-0d7_KjU", "getTertiary-0d7_KjU", "getCard-0d7_KjU", "getReadCover-0d7_KjU", "getHeaderDetailTopGradient-0d7_KjU", "getHeaderDetailBottomGradient-0d7_KjU", "getCollectionReadDetail-0d7_KjU", "getWarning-0d7_KjU", "ui_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* data */ class Background {
        public static final int $stable = 0;
        private final long card;
        private final long collectionReadDetail;
        private final long headerDetailBottomGradient;
        private final long headerDetailTopGradient;
        private final long primary;
        private final long readCover;
        private final long secondary;
        private final long tertiary;
        private final long warning;

        private Background(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.primary = j4;
            this.secondary = j10;
            this.tertiary = j11;
            this.card = j12;
            this.readCover = j13;
            this.headerDetailTopGradient = j14;
            this.headerDetailBottomGradient = j15;
            this.collectionReadDetail = j16;
            this.warning = j17;
        }

        /* renamed from: copy-5r9EGqc$default, reason: not valid java name */
        public static /* synthetic */ Background m1988copy5r9EGqc$default(Background background, long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i10, Object obj) {
            long j18;
            long j19;
            long j20;
            long j21;
            long j22;
            long j23;
            long j24;
            long j25;
            long j26;
            long j27;
            if ((i10 & 1) != 0) {
                j18 = background.primary;
            } else {
                j18 = j4;
            }
            if ((i10 & 2) != 0) {
                j19 = background.secondary;
            } else {
                j19 = j10;
            }
            if ((i10 & 4) != 0) {
                j20 = background.tertiary;
            } else {
                j20 = j11;
            }
            if ((i10 & 8) != 0) {
                j21 = background.card;
            } else {
                j21 = j12;
            }
            if ((i10 & 16) != 0) {
                j22 = background.readCover;
            } else {
                j22 = j13;
            }
            if ((i10 & 32) != 0) {
                j23 = background.headerDetailTopGradient;
            } else {
                j23 = j14;
            }
            if ((i10 & 64) != 0) {
                j24 = background.headerDetailBottomGradient;
            } else {
                j24 = j15;
            }
            long j28 = j18;
            if ((i10 & 128) != 0) {
                j25 = background.collectionReadDetail;
            } else {
                j25 = j16;
            }
            if ((i10 & RpcError.MAX_MESSAGE_BYTES) != 0) {
                j27 = j25;
                j26 = background.warning;
            } else {
                j26 = j17;
                j27 = j25;
            }
            return background.m1998copy5r9EGqc(j28, j19, j20, j21, j22, j23, j24, j27, j26);
        }

        /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
        public final long getPrimary() {
            return this.primary;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getSecondary() {
            return this.secondary;
        }

        /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
        public final long getTertiary() {
            return this.tertiary;
        }

        /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
        public final long getCard() {
            return this.card;
        }

        /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
        public final long getReadCover() {
            return this.readCover;
        }

        /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
        public final long getHeaderDetailTopGradient() {
            return this.headerDetailTopGradient;
        }

        /* renamed from: component7-0d7_KjU, reason: not valid java name and from getter */
        public final long getHeaderDetailBottomGradient() {
            return this.headerDetailBottomGradient;
        }

        /* renamed from: component8-0d7_KjU, reason: not valid java name and from getter */
        public final long getCollectionReadDetail() {
            return this.collectionReadDetail;
        }

        /* renamed from: component9-0d7_KjU, reason: not valid java name and from getter */
        public final long getWarning() {
            return this.warning;
        }

        /* renamed from: copy-5r9EGqc, reason: not valid java name */
        public final Background m1998copy5r9EGqc(long primary, long secondary, long tertiary, long card, long readCover, long headerDetailTopGradient, long headerDetailBottomGradient, long collectionReadDetail, long warning) {
            return new Background(primary, secondary, tertiary, card, readCover, headerDetailTopGradient, headerDetailBottomGradient, collectionReadDetail, warning, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            if (x.c(this.primary, background.primary) && x.c(this.secondary, background.secondary) && x.c(this.tertiary, background.tertiary) && x.c(this.card, background.card) && x.c(this.readCover, background.readCover) && x.c(this.headerDetailTopGradient, background.headerDetailTopGradient) && x.c(this.headerDetailBottomGradient, background.headerDetailBottomGradient) && x.c(this.collectionReadDetail, background.collectionReadDetail) && x.c(this.warning, background.warning)) {
                return true;
            }
            return false;
        }

        /* renamed from: getCard-0d7_KjU, reason: not valid java name */
        public final long m1999getCard0d7_KjU() {
            return this.card;
        }

        /* renamed from: getCollectionReadDetail-0d7_KjU, reason: not valid java name */
        public final long m2000getCollectionReadDetail0d7_KjU() {
            return this.collectionReadDetail;
        }

        /* renamed from: getHeaderDetailBottomGradient-0d7_KjU, reason: not valid java name */
        public final long m2001getHeaderDetailBottomGradient0d7_KjU() {
            return this.headerDetailBottomGradient;
        }

        /* renamed from: getHeaderDetailTopGradient-0d7_KjU, reason: not valid java name */
        public final long m2002getHeaderDetailTopGradient0d7_KjU() {
            return this.headerDetailTopGradient;
        }

        /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
        public final long m2003getPrimary0d7_KjU() {
            return this.primary;
        }

        /* renamed from: getReadCover-0d7_KjU, reason: not valid java name */
        public final long m2004getReadCover0d7_KjU() {
            return this.readCover;
        }

        /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
        public final long m2005getSecondary0d7_KjU() {
            return this.secondary;
        }

        /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
        public final long m2006getTertiary0d7_KjU() {
            return this.tertiary;
        }

        /* renamed from: getWarning-0d7_KjU, reason: not valid java name */
        public final long m2007getWarning0d7_KjU() {
            return this.warning;
        }

        public int hashCode() {
            long j4 = this.primary;
            int i10 = x.f26439n;
            return Long.hashCode(this.warning) + b.g(this.collectionReadDetail, b.g(this.headerDetailBottomGradient, b.g(this.headerDetailTopGradient, b.g(this.readCover, b.g(this.card, b.g(this.tertiary, b.g(this.secondary, Long.hashCode(j4) * 31, 31), 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            String i10 = x.i(this.primary);
            String i11 = x.i(this.secondary);
            String i12 = x.i(this.tertiary);
            String i13 = x.i(this.card);
            String i14 = x.i(this.readCover);
            String i15 = x.i(this.headerDetailTopGradient);
            String i16 = x.i(this.headerDetailBottomGradient);
            String i17 = x.i(this.collectionReadDetail);
            String i18 = x.i(this.warning);
            StringBuilder s10 = f.s("Background(primary=", i10, ", secondary=", i11, ", tertiary=");
            f.x(s10, i12, ", card=", i13, ", readCover=");
            f.x(s10, i14, ", headerDetailTopGradient=", i15, ", headerDetailBottomGradient=");
            f.x(s10, i16, ", collectionReadDetail=", i17, ", warning=");
            return f.l(i18, Separators.RPAREN, s10);
        }

        public /* synthetic */ Background(long j4, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, kotlin.jvm.internal.f fVar) {
            this(j4, j10, j11, j12, j13, j14, j15, j16, j17);
        }
    }
}
