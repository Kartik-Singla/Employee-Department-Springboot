<!DOCTYPE html>
<!-- saved from url=(0021)https://dillinger.io/ -->
<html lang="en" ng-strict-di=""><link type="text/css" rel="stylesheet" id="dark-mode-custom-link"><link type="text/css" rel="stylesheet" id="dark-mode-general-link"><style lang="en" type="text/css" id="dark-mode-custom-style"></style><style lang="en" type="text/css" id="dark-mode-native-style">
html, body {
  color: #dcdcdc;
  background-color: #292929;
}

html *:not(input) {
  color: #dcdcdc !important;
}

a[ping]:link,
:link:not(cite) {
  color: #8db2e5 !important;
}

html a:visited {
  color: #d248ea !important;
}

html cite,
html cite a:link,
html cite a:visited {
  color: #92de92 !important;
}

/* inline styles */

[style*='background: #'], [style*='background:#'],
[style*='background: rgb'], [style*='background:rgb'],
[style*='background: var('], [style*='background:var('],
[style*='background-color: #'], [style*='background-color:#'],
[style*='background-color: rgb'], [style*='background-color:rgb'],
[style*='background-color: var('], [style*='background-color:var('] {
  background-color: #292929 !important;
}
      </style><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8"><style type="text/css" class="dark-mode-native-dark-original">@charset "UTF-8";[ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide:not(.ng-hide-animate){display:none !important;}ng\:form{display:block;}.ng-animate-shim{visibility:hidden;}.ng-anchor{position:absolute;}</style><style type="text/css" class="dark-mode-native-dark-cloned">@charset "UTF-8";[ng\:cloak],[ng-cloak],[data-ng-cloak],[x-ng-cloak],.ng-cloak,.x-ng-cloak,.ng-hide:not(.ng-hide-animate){display:none !important;}ng\:form{display:block;}.ng-animate-shim{visibility:hidden;}.ng-anchor{position:absolute;}</style>

<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>Online Markdown Editor - Dillinger, the Last Markdown Editor ever.</title>
<meta name="description" content="Dillinger is an online cloud based HTML5 filled
  Markdown Editor. Sync with Dropbox, Github, Google Drive or OneDrive.
  Convert HTML to Markdown. 100% Open Source!">
<meta name="keywords" content="Markdown, Dillinger, Editor, ACE, Github, Open Source, Node.js">
<meta name="author" content="Joe McCann and Martin Broder">
<link rel="apple-touch-icon" href="https://dillinger.io/apple-touch-icon.png">


<meta name="robots" content="noodp, noydir">

<meta name="google-site-verification" content="DAyGOgtsg8rJpq9VVktKzDkQ1UhXm1FYl8SD47hPkjA">

<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no, maximum-scale=1, minimum-scale=1">
<meta name="HandheldFriendly" content="true">
<meta name="MobileOptimized" content="320">
<meta http-equiv="cleartype" content="on">
<link href="./ReadMe_files/css" rel="stylesheet" type="text/css" class="dark-mode-native-dark-original"><style lang="en" type="text/css" class="dark-mode-native-dark-cloned">/* cyrillic-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNa7lqDY.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qPK7lqDY.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNK7lqDY.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qO67lqDY.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* vietnamese */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qN67lqDY.woff2) format('woff2');
  unicode-range: U+0102-0103, U+0110-0111, U+0128-0129, U+0168-0169, U+01A0-01A1, U+01AF-01B0, U+1EA0-1EF9, U+20AB;
}
/* latin-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qNq7lqDY.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xK3dSBYKcSV-LCoeQqfX1RYOo3qOK7l.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
/* cyrillic-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwmhduz8A.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwkxduz8A.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwmxduz8A.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlBduz8A.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* vietnamese */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwmBduz8A.woff2) format('woff2');
  unicode-range: U+0102-0103, U+0110-0111, U+0128-0129, U+0168-0169, U+01A0-01A1, U+01AF-01B0, U+1EA0-1EF9, U+20AB;
}
/* latin-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwmRduz8A.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 600;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3i54rwlxdu.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
/* cyrillic-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwmhduz8A.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwkxduz8A.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwmxduz8A.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlBduz8A.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* vietnamese */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwmBduz8A.woff2) format('woff2');
  unicode-range: U+0102-0103, U+0110-0111, U+0128-0129, U+0168-0169, U+01A0-01A1, U+01AF-01B0, U+1EA0-1EF9, U+20AB;
}
/* latin-ext */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwmRduz8A.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Source Sans Pro';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/sourcesanspro/v18/6xKydSBYKcSV-LCoeQqfX1RYOo3ig4vwlxdu.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
</style>
<link href="./ReadMe_files/css(1)" rel="stylesheet" type="text/css" class="dark-mode-native-dark-original"><style lang="en" type="text/css" class="dark-mode-native-dark-cloned">/* cyrillic-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsvSkLBP.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsLSkLBP.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsrSkLBP.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsXSkLBP.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* latin-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsjSkLBP.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOhCneDtsqEr0keqCMhbCc_OsbSkA.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
/* cyrillic-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hYJufkO1.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hYtufkO1.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hYNufkO1.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hYxufkO1.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* latin-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hYFufkO1.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: italic;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO8CneDtsqEr0keqCMhbCc_Mn33hY9ufg.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
/* cyrillic-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc3CsTKlA.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc-CsTKlA.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc2CsTKlA.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc5CsTKlA.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* latin-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc0CsTKlA.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 400;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFOjCneDtsqEr0keqCMhbCc6CsQ.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
/* cyrillic-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9H4tY12eg.woff2) format('woff2');
  unicode-range: U+0460-052F, U+1C80-1C88, U+20B4, U+2DE0-2DFF, U+A640-A69F, U+FE2E-FE2F;
}
/* cyrillic */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9HxtY12eg.woff2) format('woff2');
  unicode-range: U+0400-045F, U+0490-0491, U+04B0-04B1, U+2116;
}
/* greek-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9H5tY12eg.woff2) format('woff2');
  unicode-range: U+1F00-1FFF;
}
/* greek */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9H2tY12eg.woff2) format('woff2');
  unicode-range: U+0370-03FF;
}
/* latin-ext */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9H7tY12eg.woff2) format('woff2');
  unicode-range: U+0100-024F, U+0259, U+1E00-1EFF, U+2020, U+20A0-20AB, U+20AD-20CF, U+2113, U+2C60-2C7F, U+A720-A7FF;
}
/* latin */
@font-face {
  font-family: 'Ubuntu Mono';
  font-style: normal;
  font-weight: 700;
  src: url(https://fonts.gstatic.com/s/ubuntumono/v14/KFO-CneDtsqEr0keqCMhbC-BL9H1tY0.woff2) format('woff2');
  unicode-range: U+0000-00FF, U+0131, U+0152-0153, U+02BB-02BC, U+02C6, U+02DA, U+02DC, U+2000-206F, U+2074, U+20AC, U+2122, U+2191, U+2193, U+2212, U+2215, U+FEFF, U+FFFD;
}
</style>
<link href="./ReadMe_files/app.css" rel="stylesheet" class="dark-mode-native-dark-original"><style lang="en" type="text/css" class="dark-mode-native-dark-cloned">@charset "UTF-8";@import 'https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.9.0-alpha2/katex.min.css';code{color:#c7254e;background-color:#f9f2f4;border-radius:4px}code,kbd{padding:2px 4px}kbd{color:#fff;background-color:#333;border-radius:3px;box-shadow:inset 0 -1px 0 rgba(0,0,0,.25)}kbd kbd{padding:0;font-size:100%;box-shadow:none}pre{display:block;margin:0 0 10px;word-break:break-all;word-wrap:break-word;color:#333;background-color:#f5f5f5;border:1px solid #ccc;border-radius:4px}pre code{padding:0;font-size:inherit;color:inherit;white-space:pre-wrap;background-color:transparent;border-radius:0}.pre-scrollable{max-height:340px;overflow-y:scroll}table{background-color:transparent}th{text-align:left}.table{width:100%;max-width:100%;margin-bottom:20px}.table>thead>tr>th{padding:8px;line-height:1.4285714;border-top:1px solid #ddd}.table>thead>tr>td,.table>tbody>tr>th,.table>tbody>tr>td,.table>tfoot>tr>th,.table>tfoot>tr>td{padding:8px;line-height:1.4285714;vertical-align:top;border-top:1px solid #ddd}.table>thead>tr>th{vertical-align:bottom;border-bottom:2px solid #ddd}.table>caption+thead>tr:first-child>th,.table>caption+thead>tr:first-child>td,.table>colgroup+thead>tr:first-child>th,.table>colgroup+thead>tr:first-child>td,.table>thead:first-child>tr:first-child>th,.table>thead:first-child>tr:first-child>td{border-top:0}.table>tbody+tbody{border-top:2px solid #ddd}.table .table{background-color:#fff}.table-condensed>thead>tr>th,.table-condensed>thead>tr>td,.table-condensed>tbody>tr>th,.table-condensed>tbody>tr>td,.table-condensed>tfoot>tr>th,.table-condensed>tfoot>tr>td{padding:5px}.table-bordered,.table-bordered>thead>tr>th,.table-bordered>thead>tr>td,.table-bordered>tbody>tr>th,.table-bordered>tbody>tr>td,.table-bordered>tfoot>tr>th,.table-bordered>tfoot>tr>td{border:1px solid #ddd}.table-bordered>thead>tr>th,.table-bordered>thead>tr>td{border-bottom-width:2px}.table-striped>tbody>tr:nth-child(odd)>td,.table-striped>tbody>tr:nth-child(odd)>th{background-color:#f9f9f9}.table-hover>tbody>tr:hover>td,.table-hover>tbody>tr:hover>th{background-color:#f5f5f5}table col[class*=col-]{position:static;float:none;display:table-column}table td[class*=col-],table th[class*=col-]{position:static;float:none;display:table-cell}.table>thead>tr>td.active,.table>thead>tr>th.active,.table>thead>tr.active>td,.table>thead>tr.active>th,.table>tbody>tr>td.active,.table>tbody>tr>th.active,.table>tbody>tr.active>td,.table>tbody>tr.active>th,.table>tfoot>tr>td.active,.table>tfoot>tr>th.active,.table>tfoot>tr.active>td,.table>tfoot>tr.active>th{background-color:#f5f5f5}.table-hover>tbody>tr>td.active:hover,.table-hover>tbody>tr>th.active:hover,.table-hover>tbody>tr.active:hover>td,.table-hover>tbody>tr:hover>.active,.table-hover>tbody>tr.active:hover>th{background-color:#e8e8e8}.table>thead>tr>td.success,.table>thead>tr>th.success,.table>thead>tr.success>td,.table>thead>tr.success>th,.table>tbody>tr>td.success,.table>tbody>tr>th.success,.table>tbody>tr.success>td,.table>tbody>tr.success>th,.table>tfoot>tr>td.success,.table>tfoot>tr>th.success,.table>tfoot>tr.success>td,.table>tfoot>tr.success>th{background-color:#dff0d8}.table-hover>tbody>tr>td.success:hover,.table-hover>tbody>tr>th.success:hover,.table-hover>tbody>tr.success:hover>td,.table-hover>tbody>tr:hover>.success,.table-hover>tbody>tr.success:hover>th{background-color:#d0e9c6}.table>thead>tr>td.info,.table>thead>tr>th.info,.table>thead>tr.info>td,.table>thead>tr.info>th,.table>tbody>tr>td.info,.table>tbody>tr>th.info,.table>tbody>tr.info>td,.table>tbody>tr.info>th,.table>tfoot>tr>td.info,.table>tfoot>tr>th.info,.table>tfoot>tr.info>td,.table>tfoot>tr.info>th{background-color:#d9edf7}.table-hover>tbody>tr>td.info:hover,.table-hover>tbody>tr>th.info:hover,.table-hover>tbody>tr.info:hover>td,.table-hover>tbody>tr:hover>.info,.table-hover>tbody>tr.info:hover>th{background-color:#c4e3f3}.table>thead>tr>td.warning,.table>thead>tr>th.warning,.table>thead>tr.warning>td,.table>thead>tr.warning>th,.table>tbody>tr>td.warning,.table>tbody>tr>th.warning,.table>tbody>tr.warning>td,.table>tbody>tr.warning>th,.table>tfoot>tr>td.warning,.table>tfoot>tr>th.warning,.table>tfoot>tr.warning>td,.table>tfoot>tr.warning>th{background-color:#fcf8e3}.table-hover>tbody>tr>td.warning:hover,.table-hover>tbody>tr>th.warning:hover,.table-hover>tbody>tr.warning:hover>td,.table-hover>tbody>tr:hover>.warning,.table-hover>tbody>tr.warning:hover>th{background-color:#faf2cc}.table>thead>tr>td.danger,.table>thead>tr>th.danger,.table>thead>tr.danger>td,.table>thead>tr.danger>th,.table>tbody>tr>td.danger,.table>tbody>tr>th.danger,.table>tbody>tr.danger>td,.table>tbody>tr.danger>th,.table>tfoot>tr>td.danger,.table>tfoot>tr>th.danger,.table>tfoot>tr.danger>td,.table>tfoot>tr.danger>th{background-color:#f2dede}.table-hover>tbody>tr>td.danger:hover,.table-hover>tbody>tr>th.danger:hover,.table-hover>tbody>tr.danger:hover>td,.table-hover>tbody>tr:hover>.danger,.table-hover>tbody>tr.danger:hover>th{background-color:#ebcccc}fieldset{border:0;min-width:0}legend{display:block;width:100%;margin-bottom:20px;font-size:21px;line-height:inherit;color:#333;border-bottom:1px solid #e5e5e5}label{display:inline-block;max-width:100%;margin-bottom:5px;font-weight:700}input[type=radio],input[type=checkbox]{margin:4px 0 0;margin-top:1px \9;line-height:normal}input[type=file]{display:block}input[type=range]{display:block;width:100%}select[multiple],select[size]{height:auto}input[type=file]:focus,input[type=radio]:focus,input[type=checkbox]:focus{outline:thin dotted;outline:5px auto -webkit-focus-ring-color;outline-offset:-2px}output{padding-top:7px}output,.form-control{display:block;font-size:14px;line-height:1.4285714;color:#555}.form-control{width:100%;height:34px;padding:6px 12px;background-color:#fff;background-image:none;border:1px solid #ccc;border-radius:4px;box-shadow:inset 0 1px 1px rgba(0,0,0,.075);transition:border-color ease-in-out .15s,box-shadow ease-in-out .15s}.form-control:focus{border-color:#66afe9;outline:0;box-shadow:inset 0 1px 1px rgba(0,0,0,.075),0 0 8px rgba(102,175,233,.6)}.form-control::-moz-placeholder{color:#777;opacity:1}.form-control:-ms-input-placeholder{color:#777}.form-control::-webkit-input-placeholder{color:#777}.form-control[disabled],.form-control[readonly],fieldset[disabled] .form-control{cursor:not-allowed;background-color:#eee;opacity:1}textarea.form-control{height:auto}input[type=date],input[type=time],input[type=datetime-local],input[type=month]{line-height:34px;line-height:1.4285714 \0}input[type=date].input-sm,.form-horizontal .form-group-sm input.form-control[type=date],.input-group-sm>input.form-control[type=date],.input-group-sm>input.input-group-addon[type=date],.input-group-sm>.input-group-btn>input.btn[type=date],input[type=time].input-sm,.form-horizontal .form-group-sm input.form-control[type=time],.input-group-sm>input.form-control[type=time],.input-group-sm>input.input-group-addon[type=time],.input-group-sm>.input-group-btn>input.btn[type=time],input[type=datetime-local].input-sm,.form-horizontal .form-group-sm input.form-control[type=datetime-local],.input-group-sm>input.form-control[type=datetime-local],.input-group-sm>input.input-group-addon[type=datetime-local],.input-group-sm>.input-group-btn>input.btn[type=datetime-local],input[type=month].input-sm,.form-horizontal .form-group-sm input.form-control[type=month],.input-group-sm>input.form-control[type=month],.input-group-sm>input.input-group-addon[type=month],.input-group-sm>.input-group-btn>input.btn[type=month]{line-height:30px}input[type=date].input-lg,.form-horizontal .form-group-lg input.form-control[type=date],.input-group-lg>input.form-control[type=date],.input-group-lg>input.input-group-addon[type=date],.input-group-lg>.input-group-btn>input.btn[type=date],input[type=time].input-lg,.form-horizontal .form-group-lg input.form-control[type=time],.input-group-lg>input.form-control[type=time],.input-group-lg>input.input-group-addon[type=time],.input-group-lg>.input-group-btn>input.btn[type=time],input[type=datetime-local].input-lg,.form-horizontal .form-group-lg input.form-control[type=datetime-local],.input-group-lg>input.form-control[type=datetime-local],.input-group-lg>input.input-group-addon[type=datetime-local],.input-group-lg>.input-group-btn>input.btn[type=datetime-local],input[type=month].input-lg,.form-horizontal .form-group-lg input.form-control[type=month],.input-group-lg>input.form-control[type=month],.input-group-lg>input.input-group-addon[type=month],.input-group-lg>.input-group-btn>input.btn[type=month]{line-height:46px}.form-group{margin-bottom:15px}.radio,.checkbox{position:relative;display:block;min-height:20px;margin-top:10px;margin-bottom:10px}.radio label,.checkbox label{padding-left:20px;margin-bottom:0;font-weight:400;cursor:pointer}.radio input[type=radio],.radio-inline input[type=radio],.checkbox input[type=checkbox],.checkbox-inline input[type=checkbox]{position:absolute;margin-left:-20px;margin-top:4px \9}.radio+.radio,.checkbox+.checkbox{margin-top:-5px}.radio-inline,.checkbox-inline{display:inline-block;padding-left:20px;margin-bottom:0;vertical-align:middle;font-weight:400;cursor:pointer}.radio-inline+.radio-inline,.checkbox-inline+.checkbox-inline{margin-top:0;margin-left:10px}input[type=radio][disabled],input[type=radio].disabled,fieldset[disabled] input[type=radio],input[type=checkbox][disabled],input[type=checkbox].disabled,fieldset[disabled] input[type=checkbox],.radio-inline.disabled,fieldset[disabled] .radio-inline,.checkbox-inline.disabled,fieldset[disabled] .checkbox-inline,.radio.disabled label,fieldset[disabled] .radio label,.checkbox.disabled label,fieldset[disabled] .checkbox label{cursor:not-allowed}.form-control-static{padding-top:7px;padding-bottom:7px;margin-bottom:0}.form-control-static.input-lg,.form-horizontal .form-group-lg .form-control-static.form-control,.input-group-lg>.form-control-static.form-control,.input-group-lg>.form-control-static.input-group-addon,.input-group-lg>.input-group-btn>.form-control-static.btn,.form-control-static.input-sm,.form-horizontal .form-group-sm .form-control-static.form-control,.input-group-sm>.form-control-static.form-control,.input-group-sm>.form-control-static.input-group-addon,.input-group-sm>.input-group-btn>.form-control-static.btn{padding-left:0;padding-right:0}.input-sm,.form-horizontal .form-group-sm .form-control,.input-group-sm>.form-control{height:30px;padding:5px 10px;font-size:12px;line-height:1.5;border-radius:3px}.input-group-sm>.input-group-addon{height:30px;line-height:1.5}.input-group-sm>.input-group-btn>.btn{height:30px;padding:5px 10px;font-size:12px;line-height:1.5;border-radius:3px}select.input-sm,.form-horizontal .form-group-sm select.form-control,.input-group-sm>select.form-control,.input-group-sm>select.input-group-addon,.input-group-sm>.input-group-btn>select.btn{height:30px;line-height:30px}textarea.input-sm,.form-horizontal .form-group-sm textarea.form-control,.input-group-sm>textarea.form-control,.input-group-sm>textarea.input-group-addon,.input-group-sm>.input-group-btn>textarea.btn,select[multiple].input-sm,.form-horizontal .form-group-sm select.form-control[multiple],.input-group-sm>select.form-control[multiple],.input-group-sm>select.input-group-addon[multiple],.input-group-sm>.input-group-btn>select.btn[multiple]{height:auto}.input-lg,.form-horizontal .form-group-lg .form-control,.input-group-lg>.form-control{height:46px;padding:10px 16px;font-size:18px;line-height:1.33;border-radius:6px}.input-group-lg>.input-group-addon{height:46px;line-height:1.33}.input-group-lg>.input-group-btn>.btn{height:46px;padding:10px 16px;font-size:18px;line-height:1.33;border-radius:6px}select.input-lg,.form-horizontal .form-group-lg select.form-control,.input-group-lg>select.form-control,.input-group-lg>select.input-group-addon,.input-group-lg>.input-group-btn>select.btn{height:46px;line-height:46px}textarea.input-lg,.form-horizontal .form-group-lg textarea.form-control,.input-group-lg>textarea.form-control,.input-group-lg>textarea.input-group-addon,.input-group-lg>.input-group-btn>textarea.btn,select[multiple].input-lg,.form-horizontal .form-group-lg select.form-control[multiple],.input-group-lg>select.form-control[multiple],.input-group-lg>select.input-group-addon[multiple],.input-group-lg>.input-group-btn>select.btn[multiple]{height:auto}.has-feedback{position:relative}.has-feedback .form-control{padding-right:42.5px}.form-control-feedback{position:absolute;top:25px;right:0;z-index:2;display:block;width:34px;height:34px;line-height:34px;text-align:center}.input-lg+.form-control-feedback,.form-horizontal .form-group-lg .form-control+.form-control-feedback,.input-group-lg>.form-control+.form-control-feedback,.input-group-lg>.input-group-addon+.form-control-feedback,.input-group-lg>.input-group-btn>.btn+.form-control-feedback{width:46px;height:46px;line-height:46px}.input-sm+.form-control-feedback,.form-horizontal .form-group-sm .form-control+.form-control-feedback,.input-group-sm>.form-control+.form-control-feedback,.input-group-sm>.input-group-addon+.form-control-feedback,.input-group-sm>.input-group-btn>.btn+.form-control-feedback{width:30px;height:30px;line-height:30px}.has-success .help-block,.has-success .control-label,.has-success .radio,.has-success .checkbox,.has-success .radio-inline,.has-success .checkbox-inline{color:#3c763d}.has-success .form-control{border-color:#3c763d;box-shadow:inset 0 1px 1px rgba(0,0,0,.075)}.has-success .form-control:focus{border-color:#2b542c;box-shadow:inset 0 1px 1px rgba(0,0,0,.075),0 0 6px #67b168}.has-success .input-group-addon{color:#3c763d;border-color:#3c763d;background-color:#dff0d8}.has-success .form-control-feedback{color:#3c763d}.has-warning .help-block,.has-warning .control-label,.has-warning .radio,.has-warning .checkbox,.has-warning .radio-inline,.has-warning .checkbox-inline{color:#8a6d3b}.has-warning .form-control{border-color:#8a6d3b;box-shadow:inset 0 1px 1px rgba(0,0,0,.075)}.has-warning .form-control:focus{border-color:#66512c;box-shadow:inset 0 1px 1px rgba(0,0,0,.075),0 0 6px #c0a16b}.has-warning .input-group-addon{color:#8a6d3b;border-color:#8a6d3b;background-color:#fcf8e3}.has-warning .form-control-feedback{color:#8a6d3b}.has-error .help-block,.has-error .control-label,.has-error .radio,.has-error .checkbox,.has-error .radio-inline,.has-error .checkbox-inline{color:#a94442}.has-error .form-control{border-color:#a94442;box-shadow:inset 0 1px 1px rgba(0,0,0,.075)}.has-error .form-control:focus{border-color:#843534;box-shadow:inset 0 1px 1px rgba(0,0,0,.075),0 0 6px #ce8483}.has-error .input-group-addon{color:#a94442;border-color:#a94442;background-color:#f2dede}.has-error .form-control-feedback{color:#a94442}.has-feedback label.sr-only~.form-control-feedback{top:0}.help-block{display:block;margin-top:5px;margin-bottom:10px;color:#737373}.form-horizontal .radio,.form-horizontal .checkbox,.form-horizontal .radio-inline,.form-horizontal .checkbox-inline{margin-top:0;margin-bottom:0;padding-top:7px}.form-horizontal .radio,.form-horizontal .checkbox{min-height:27px}.form-horizontal .form-group{margin-left:-15px;margin-right:-15px}.form-horizontal .form-group:before{content:" ";display:table}.form-horizontal .form-group:after{content:" ";display:table;clear:both}.form-horizontal .has-feedback .form-control-feedback{top:0;right:15px}.btn{display:inline-block;vertical-align:middle;cursor:pointer;background-image:none;border:1px solid transparent;white-space:nowrap;-webkit-user-select:none;-moz-user-select:none;-ms-user-select:none;user-select:none}.btn:focus,.btn:active:focus,.btn.active:focus{outline:thin dotted;outline:5px auto -webkit-focus-ring-color;outline-offset:-2px}.btn:hover,.btn:focus{color:#333;text-decoration:none}.btn:active,.btn.active{outline:0;background-image:none;box-shadow:inset 0 3px 5px rgba(0,0,0,.125)}.btn.disabled,.btn[disabled],fieldset[disabled] .btn{cursor:not-allowed;pointer-events:none;opacity:.65;filter:alpha(opacity=65);box-shadow:none}.btn-default{color:#333;background-color:#fff;border-color:#ccc}.btn-default:hover,.btn-default:focus,.btn-default:active,.btn-default.active,.open>.btn-default.dropdown-toggle{color:#333;background-color:#e6e6e6;border-color:#adadad}.btn-default:active,.btn-default.active,.open>.btn-default.dropdown-toggle{background-image:none}.btn-default.disabled,.btn-default.disabled:hover,.btn-default.disabled:focus,.btn-default.disabled:active,.btn-default.disabled.active,.btn-default[disabled],.btn-default[disabled]:hover,.btn-default[disabled]:focus,.btn-default[disabled]:active,.btn-default[disabled].active,fieldset[disabled] .btn-default,fieldset[disabled] .btn-default:hover,fieldset[disabled] .btn-default:focus,fieldset[disabled] .btn-default:active,fieldset[disabled] .btn-default.active{background-color:#fff;border-color:#ccc}.btn-default .badge{color:#fff;background-color:#333}.btn-primary{color:#fff;background-color:#428bca;border-color:#357ebd}.btn-primary:hover,.btn-primary:focus,.btn-primary:active,.btn-primary.active,.open>.btn-primary.dropdown-toggle{color:#fff;background-color:#3071a9;border-color:#285e8e}.btn-primary:active,.btn-primary.active,.open>.btn-primary.dropdown-toggle{background-image:none}.btn-primary.disabled,.btn-primary.disabled:hover,.btn-primary.disabled:focus,.btn-primary.disabled:active,.btn-primary.disabled.active,.btn-primary[disabled],.btn-primary[disabled]:hover,.btn-primary[disabled]:focus,.btn-primary[disabled]:active,.btn-primary[disabled].active,fieldset[disabled] .btn-primary,fieldset[disabled] .btn-primary:hover,fieldset[disabled] .btn-primary:focus,fieldset[disabled] .btn-primary:active,fieldset[disabled] .btn-primary.active{background-color:#428bca;border-color:#357ebd}.btn-primary .badge{color:#428bca;background-color:#fff}.btn-success{color:#fff;background-color:#5cb85c;border-color:#4cae4c}.btn-success:hover,.btn-success:focus,.btn-success:active,.btn-success.active,.open>.btn-success.dropdown-toggle{color:#fff;background-color:#449d44;border-color:#398439}.btn-success:active,.btn-success.active,.open>.btn-success.dropdown-toggle{background-image:none}.btn-success.disabled,.btn-success.disabled:hover,.btn-success.disabled:focus,.btn-success.disabled:active,.btn-success.disabled.active,.btn-success[disabled],.btn-success[disabled]:hover,.btn-success[disabled]:focus,.btn-success[disabled]:active,.btn-success[disabled].active,fieldset[disabled] .btn-success,fieldset[disabled] .btn-success:hover,fieldset[disabled] .btn-success:focus,fieldset[disabled] .btn-success:active,fieldset[disabled] .btn-success.active{background-color:#5cb85c;border-color:#4cae4c}.btn-success .badge{color:#5cb85c;background-color:#fff}.btn-info{color:#fff;background-color:#5bc0de;border-color:#46b8da}.btn-info:hover,.btn-info:focus,.btn-info:active,.btn-info.active,.open>.btn-info.dropdown-toggle{color:#fff;background-color:#31b0d5;border-color:#269abc}.btn-info:active,.btn-info.active,.open>.btn-info.dropdown-toggle{background-image:none}.btn-info.disabled,.btn-info.disabled:hover,.btn-info.disabled:focus,.btn-info.disabled:active,.btn-info.disabled.active,.btn-info[disabled],.btn-info[disabled]:hover,.btn-info[disabled]:focus,.btn-info[disabled]:active,.btn-info[disabled].active,fieldset[disabled] .btn-info,fieldset[disabled] .btn-info:hover,fieldset[disabled] .btn-info:focus,fieldset[disabled] .btn-info:active,fieldset[disabled] .btn-info.active{background-color:#5bc0de;border-color:#46b8da}.btn-info .badge{color:#5bc0de;background-color:#fff}.btn-warning{color:#fff;background-color:#f0ad4e;border-color:#eea236}.btn-warning:hover,.btn-warning:focus,.btn-warning:active,.btn-warning.active,.open>.btn-warning.dropdown-toggle{color:#fff;background-color:#ec971f;border-color:#d58512}.btn-warning:active,.btn-warning.active,.open>.btn-warning.dropdown-toggle{background-image:none}.btn-warning.disabled,.btn-warning.disabled:hover,.btn-warning.disabled:focus,.btn-warning.disabled:active,.btn-warning.disabled.active,.btn-warning[disabled],.btn-warning[disabled]:hover,.btn-warning[disabled]:focus,.btn-warning[disabled]:active,.btn-warning[disabled].active,fieldset[disabled] .btn-warning,fieldset[disabled] .btn-warning:hover,fieldset[disabled] .btn-warning:focus,fieldset[disabled] .btn-warning:active,fieldset[disabled] .btn-warning.active{background-color:#f0ad4e;border-color:#eea236}.btn-warning .badge{color:#f0ad4e;background-color:#fff}.btn-danger{color:#fff;background-color:#d9534f;border-color:#d43f3a}.btn-danger:hover,.btn-danger:focus,.btn-danger:active,.btn-danger.active,.open>.btn-danger.dropdown-toggle{color:#fff;background-color:#c9302c;border-color:#ac2925}.btn-danger:active,.btn-danger.active,.open>.btn-danger.dropdown-toggle{background-image:none}.btn-danger.disabled,.btn-danger.disabled:hover,.btn-danger.disabled:focus,.btn-danger.disabled:active,.btn-danger.disabled.active,.btn-danger[disabled],.btn-danger[disabled]:hover,.btn-danger[disabled]:focus,.btn-danger[disabled]:active,.btn-danger[disabled].active,fieldset[disabled] .btn-danger,fieldset[disabled] .btn-danger:hover,fieldset[disabled] .btn-danger:focus,fieldset[disabled] .btn-danger:active,fieldset[disabled] .btn-danger.active{background-color:#d9534f;border-color:#d43f3a}.btn-danger .badge{color:#d9534f;background-color:#fff}.btn-link{color:#428bca;font-weight:400;cursor:pointer;border-radius:0}.btn-link,.btn-link:active,.btn-link[disabled],fieldset[disabled] .btn-link{background-color:transparent;box-shadow:none}.btn-link,.btn-link:hover,.btn-link:focus,.btn-link:active{border-color:transparent}.btn-link:hover,.btn-link:focus{color:#2a6496;text-decoration:underline;background-color:transparent}.btn-link[disabled]:hover,.btn-link[disabled]:focus,fieldset[disabled] .btn-link:hover,fieldset[disabled] .btn-link:focus{color:#777;text-decoration:none}.btn-lg{padding:10px 16px;font-size:18px;line-height:1.33;border-radius:6px}.btn-sm{padding:5px 10px}.btn-sm,.btn-xs{font-size:12px;line-height:1.5;border-radius:3px}.btn-xs{padding:1px 5px}.btn-block{display:block;width:100%}.btn-block+.btn-block{margin-top:5px}input[type=submit].btn-block,input[type=reset].btn-block,input[type=button].btn-block{width:100%}.fade{opacity:0;transition:opacity .15s linear}.fade.in{opacity:1}.collapse{display:none}.collapse.in{display:block}tr.collapse.in{display:table-row}tbody.collapse.in{display:table-row-group}.collapsing{position:relative;height:0;overflow:hidden;transition:height .35s ease}.input-group{position:relative;display:table;border-collapse:separate}.input-group[class*=col-]{float:none;padding-left:0;padding-right:0}.input-group .form-control{position:relative;z-index:2;float:left;width:100%;margin-bottom:0}.input-group-addon,.input-group-btn,.input-group .form-control{display:table-cell}.input-group-addon:not(:first-child):not(:last-child),.input-group-btn:not(:first-child):not(:last-child),.input-group .form-control:not(:first-child):not(:last-child){border-radius:0}.input-group-addon{white-space:nowrap}.input-group-addon,.input-group-btn{width:1%;vertical-align:middle}.input-group-addon{padding:6px 12px;font-size:14px;font-weight:400;line-height:1;color:#555;text-align:center;background-color:#eee;border:1px solid #ccc;border-radius:4px}.input-group-addon.input-sm,.form-horizontal .form-group-sm .input-group-addon.form-control,.input-group-sm>.input-group-addon,.input-group-sm>.input-group-btn>.input-group-addon.btn{padding:5px 10px;font-size:12px;border-radius:3px}.input-group-addon.input-lg,.form-horizontal .form-group-lg .input-group-addon.form-control,.input-group-lg>.input-group-addon,.input-group-lg>.input-group-btn>.input-group-addon.btn{padding:10px 16px;font-size:18px;border-radius:6px}.input-group-addon input[type=radio],.input-group-addon input[type=checkbox]{margin-top:0}.input-group .form-control:first-child,.input-group-addon:first-child,.input-group-btn:first-child>.btn,.input-group-btn:first-child>.btn-group>.btn,.input-group-btn:first-child>.dropdown-toggle,.input-group-btn:last-child>.btn:not(:last-child):not(.dropdown-toggle),.input-group-btn:last-child>.btn-group:not(:last-child)>.btn{border-bottom-right-radius:0;border-top-right-radius:0}.input-group-addon:first-child{border-right:0}.input-group .form-control:last-child,.input-group-addon:last-child,.input-group-btn:last-child>.btn,.input-group-btn:last-child>.btn-group>.btn,.input-group-btn:last-child>.dropdown-toggle,.input-group-btn:first-child>.btn:not(:first-child),.input-group-btn:first-child>.btn-group:not(:first-child)>.btn{border-bottom-left-radius:0;border-top-left-radius:0}.input-group-addon:last-child{border-left:0}.input-group-btn{font-size:0;white-space:nowrap}.input-group-btn,.input-group-btn>.btn{position:relative}.input-group-btn>.btn+.btn{margin-left:-1px}.input-group-btn>.btn:hover,.input-group-btn>.btn:focus,.input-group-btn>.btn:active{z-index:2}.input-group-btn:first-child>.btn,.input-group-btn:first-child>.btn-group{margin-right:-1px}.input-group-btn:last-child>.btn,.input-group-btn:last-child>.btn-group{margin-left:-1px}.pagination{display:inline-block;padding-left:0;margin:20px 0;border-radius:4px}.pagination>li{display:inline}.pagination>li>a,.pagination>li>span{position:relative;float:left;padding:6px 12px;line-height:1.4285714;text-decoration:none;color:#428bca;background-color:#fff;border:1px solid #ddd;margin-left:-1px}.pagination>li:first-child>a,.pagination>li:first-child>span{margin-left:0;border-bottom-left-radius:4px;border-top-left-radius:4px}.pagination>li:last-child>a,.pagination>li:last-child>span{border-bottom-right-radius:4px;border-top-right-radius:4px}.pagination>li>a:hover,.pagination>li>a:focus,.pagination>li>span:hover,.pagination>li>span:focus{color:#2a6496;background-color:#eee;border-color:#ddd}.pagination>.active>a,.pagination>.active>a:hover,.pagination>.active>a:focus,.pagination>.active>span,.pagination>.active>span:hover,.pagination>.active>span:focus{z-index:2;color:#fff;background-color:#428bca;border-color:#428bca;cursor:default}.pagination>.disabled>span,.pagination>.disabled>span:hover,.pagination>.disabled>span:focus,.pagination>.disabled>a,.pagination>.disabled>a:hover,.pagination>.disabled>a:focus{color:#777;background-color:#fff;border-color:#ddd;cursor:not-allowed}.pagination-lg>li>a,.pagination-lg>li>span{padding:10px 16px;font-size:18px}.pagination-lg>li:first-child>a,.pagination-lg>li:first-child>span{border-bottom-left-radius:6px;border-top-left-radius:6px}.pagination-lg>li:last-child>a,.pagination-lg>li:last-child>span{border-bottom-right-radius:6px;border-top-right-radius:6px}.pagination-sm>li>a,.pagination-sm>li>span{padding:5px 10px;font-size:12px}.pagination-sm>li:first-child>a,.pagination-sm>li:first-child>span{border-bottom-left-radius:3px;border-top-left-radius:3px}.pagination-sm>li:last-child>a,.pagination-sm>li:last-child>span{border-bottom-right-radius:3px;border-top-right-radius:3px}.close{float:right;font-size:21px;font-weight:700;line-height:1;color:#000;text-shadow:0 1px 0 #fff;opacity:.2;filter:alpha(opacity=20)}.close:hover,.close:focus{color:#000;text-decoration:none;cursor:pointer;opacity:.5;filter:alpha(opacity=50)}button.close{padding:0;cursor:pointer;background:0 0;border:0;-webkit-appearance:none}.modal-open,.modal{overflow:hidden}.modal{display:none;position:fixed;top:0;right:0;bottom:0;left:0;z-index:1050;-webkit-overflow-scrolling:touch;outline:0}.modal.fade .modal-dialog{transform:translate3d(0,-25%,0);transition:transform .3s ease-out}.modal.in .modal-dialog{transform:translate3d(0,0,0)}.modal-open .modal{overflow-x:hidden;overflow-y:auto}.modal-dialog{position:relative;width:auto;margin:10px}.modal-content{position:relative;background-color:#fff;border:1px solid #999;border:1px solid rgba(0,0,0,.2);border-radius:6px;box-shadow:0 3px 9px rgba(0,0,0,.5);background-clip:padding-box;outline:0}.modal-backdrop{position:fixed;top:0;right:0;bottom:0;left:0;z-index:1040;background-color:#000}.modal-backdrop.fade{opacity:0;filter:alpha(opacity=0)}.modal-backdrop.in{opacity:.5;filter:alpha(opacity=50)}.modal-header{padding:15px;border-bottom:1px solid #e5e5e5;min-height:16.4285714px}.modal-header .close{margin-top:-2px}.modal-title{margin:0;line-height:1.4285714}.modal-body{position:relative;padding:15px}.modal-footer{padding:15px;text-align:right;border-top:1px solid #e5e5e5}.modal-footer:before,.modal-footer:after{content:" ";display:table}.modal-footer:after{clear:both}.modal-footer .btn+.btn{margin-left:5px;margin-bottom:0}.modal-footer .btn-group .btn+.btn{margin-left:-1px}.modal-footer .btn-block+.btn-block{margin-left:0}.modal-scrollbar-measure{position:absolute;top:-9999px;width:50px;height:50px;overflow:scroll}.clearfix:before,.clearfix:after{content:" ";display:table}.clearfix:after{clear:both}.center-block{display:block;margin-left:auto;margin-right:auto}.pull-right{float:right!important}.pull-left{float:left!important}.hide{display:none!important}.show{display:block!important}.invisible{visibility:hidden}.text-hide{font:0/0 a;color:transparent;text-shadow:none;background-color:transparent;border:0}.hidden{display:none!important;visibility:hidden!important}.affix{position:fixed;transform:translate3d(0,0,0)}.hljs{display:block;overflow-x:auto;padding:.5em;background:#002b36;color:#839496;-webkit-text-size-adjust:none}.hljs-comment,.hljs-template_comment,.diff .hljs-header,.hljs-doctype,.hljs-pi,.lisp .hljs-string,.hljs-javadoc{color:#586e75}.hljs-keyword,.hljs-winutils,.method,.hljs-addition,.css .hljs-tag,.hljs-request,.hljs-status,.nginx .hljs-title{color:#859900}.hljs-number,.hljs-command,.hljs-string,.hljs-tag .hljs-value,.hljs-rules .hljs-value,.hljs-phpdoc,.hljs-dartdoc,.tex .hljs-formula,.hljs-regexp,.hljs-hexcolor,.hljs-link_url{color:#2aa198}.hljs-title,.hljs-localvars,.hljs-chunk,.hljs-decorator,.hljs-built_in,.hljs-identifier,.vhdl .hljs-literal,.hljs-id,.css .hljs-function{color:#268bd2}.hljs-attribute,.hljs-variable,.lisp .hljs-body,.smalltalk .hljs-number,.hljs-constant,.hljs-class .hljs-title,.hljs-parent,.hljs-type,.hljs-link_reference{color:#b58900}.hljs-preprocessor,.hljs-preprocessor .hljs-keyword,.hljs-pragma,.hljs-shebang,.hljs-symbol,.hljs-symbol .hljs-string,.diff .hljs-change,.hljs-special,.hljs-attr_selector,.hljs-subst,.hljs-cdata,.css .hljs-pseudo,.hljs-header{color:#cb4b16}.hljs-deletion,.hljs-important{color:#dc322f}.hljs-link_label{color:#6c71c4}.tex .hljs-formula{background:#073642}*,*:before,*:after{box-sizing:border-box}html{-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}body{margin:0}article,aside,details,figcaption,figure,footer,header,hgroup,main,nav,section,summary{display:block}audio,canvas,progress,video{display:inline-block;vertical-align:baseline}audio:not([controls]){display:none;height:0}[hidden],template{display:none}a{background:0 0}a:active,a:hover{outline:0}abbr[title]{border-bottom:1px dotted}b,strong{font-weight:700}dfn{font-style:italic}h1{margin:.67em 0}mark{background:#ff0;color:#000}small{font-size:80%}sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}sup{top:-.5em}sub{bottom:-.25em}images{border:0}svg:not(:root){overflow:hidden}figure{margin:1em 40px}hr{box-sizing:content-box;height:0}pre{overflow:auto}code,kbd{font-size:1em}code,kbd,pre,samp{font-family:monospace,monospace}samp{font-size:1em}button,input,optgroup,select,textarea{color:inherit;font:inherit;margin:0}button{overflow:visible}button,select{text-transform:none}button,html input[type=button],input[type=reset],input[type=submit]{-webkit-appearance:button;cursor:pointer}button[disabled],html input[disabled]{cursor:default}button::-moz-focus-inner,input::-moz-focus-inner{border:0;padding:0}input{line-height:normal}input[type=checkbox],input[type=radio]{box-sizing:border-box;padding:0;margin-right:5px}input[type=number]::-webkit-inner-spin-button,input[type=number]::-webkit-outer-spin-button{height:auto}input[type=search]{-webkit-appearance:textfield;box-sizing:content-box}input[type=search]::-webkit-search-cancel-button,input[type=search]::-webkit-search-decoration{-webkit-appearance:none}fieldset{border:1px solid silver;margin:0 2px;padding:.35em .625em .75em}legend{border:0;padding:0}textarea{overflow:auto}optgroup{font-weight:700}table{border-collapse:collapse;border-spacing:0}.debug{background-color:pink!important}.ellipsis{overflow:hidden;text-overflow:ellipsis;white-space:nowrap}.ir{background-color:transparent;border:0;overflow:hidden}.ir::before{content:'';display:block;height:150%;width:0}html{font-size:.875em;background:#fff;color:#373d49}html,body{font-family:Georgia,Cambria,serif;height:100%}body{font-size:1rem;font-weight:400;line-height:2rem;overflow:hidden}ul,ol{margin-bottom:.83999rem;padding-top:.16001rem}li{font-feature-settings:'kern' 1,'onum' 1,'liga' 1;margin-left:1rem}li>ul,li>ol{margin-bottom:0}p{padding-top:.66001rem;font-feature-settings:'kern' 1,'onum' 1,'liga' 1;margin-top:0}p,pre{margin-bottom:1.33999rem}pre{font-size:1rem;padding:.66001rem 9.5px 9.5px;line-height:2rem;background:linear-gradient(to bottom,#fff 0,#fff .75rem,#f5f7fa .75rem,#f5f7fa 2.75rem,#fff 2.75rem,#fff 4rem);background-size:100% 4rem;border-color:#d3daea}blockquote{margin:0}blockquote p{font-size:1rem;margin-bottom:.33999rem;font-style:italic;padding:.66001rem 1rem 1rem;border-left:3px solid #a0aabf}th,td{padding:12px}h1,h2,h3,h4,h5,h6{font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-feature-settings:'dlig' 1,'liga' 1,'lnum' 1,'kern' 1;font-style:normal;font-weight:600;margin-top:0}h1{line-height:3rem;font-size:2.0571429rem;margin-bottom:.21999rem;padding-top:.78001rem}h2{font-size:1.953125rem;margin-bottom:.1835837rem;padding-top:.8164163rem}h2,h3{line-height:3rem}h3{font-size:1.6457143rem;margin-bottom:.07599rem;padding-top:.92401rem}h4{font-size:1.5625rem;margin-bottom:.546865rem;padding-top:.453135rem}h5{font-size:1.25rem;margin-bottom:-.56251rem;padding-top:.56251rem}h6{font-size:1rem;margin-bottom:-.65001rem;padding-top:.65001rem}a{cursor:pointer;color:#35d7bb;text-decoration:none}a:hover,a:focus{border-bottom-color:#35d7bb;color:#dff9f4}img{height:auto;max-width:100%}dt{font-style:italic;font-weight:600}.g{display:block}.g:after{clear:both;content:'';display:table}.g-b{float:left;margin:0;width:100%}.g{margin-left:-16px;margin-right:-16px}.g-b{padding-left:16px;padding-right:16px}.g-b--center{display:block;float:none;margin:0 auto}.g-b--right{float:right}.g-b--1of1{width:100%}.g-b--1of2,.g-b--2of4,.g-b--3of6,.g-b--4of8,.g-b--5of10,.g-b--6of12{width:50%}.g-b--1of3,.g-b--2of6,.g-b--4of12{width:33.333%}.g-b--2of3,.g-b--4of6,.g-b--8of12{width:66.666%}.g-b--1of4,.g-b--2of8,.g-b--3of12{width:25%}.g-b--3of4,.g-b--6of8,.g-b--9of12{width:75%}.g-b--1of5,.g-b--2of10{width:20%}.g-b--2of5,.g-b--4of10{width:40%}.g-b--3of5,.g-b--6of10{width:60%}.g-b--4of5,.g-b--8of10{width:80%}.g-b--1of6,.g-b--2of12{width:16.666%}.g-b--5of6,.g-b--10of12{width:83.333%}.g-b--1of8{width:12.5%}.g-b--3of8{width:37.5%}.g-b--5of8{width:62.5%}.g-b--7of8{width:87.5%}.g-b--1of10{width:10%}.g-b--3of10{width:30%}.g-b--7of10{width:70%}.g-b--9of10{width:90%}.g-b--1of12{width:8.333%}.g-b--5of12{width:41.666%}.g-b--7of12{width:58.333%}.g-b--11of12{width:91.666%}.g-b--push--1of1{margin-left:100%}.g-b--push--1of2,.g-b--push--2of4,.g-b--push--3of6,.g-b--push--4of8,.g-b--push--5of10,.g-b--push--6of12{margin-left:50%}.g-b--push--1of3,.g-b--push--2of6,.g-b--push--4of12{margin-left:33.333%}.g-b--push--2of3,.g-b--push--4of6,.g-b--push--8of12{margin-left:66.666%}.g-b--push--1of4,.g-b--push--2of8,.g-b--push--3of12{margin-left:25%}.g-b--push--3of4,.g-b--push--6of8,.g-b--push--9of12{margin-left:75%}.g-b--push--1of5,.g-b--push--2of10{margin-left:20%}.g-b--push--2of5,.g-b--push--4of10{margin-left:40%}.g-b--push--3of5,.g-b--push--6of10{margin-left:60%}.g-b--push--4of5,.g-b--push--8of10{margin-left:80%}.g-b--push--1of6,.g-b--push--2of12{margin-left:16.666%}.g-b--push--5of6,.g-b--push--10of12{margin-left:83.333%}.g-b--push--1of8{margin-left:12.5%}.g-b--push--3of8{margin-left:37.5%}.g-b--push--5of8{margin-left:62.5%}.g-b--push--7of8{margin-left:87.5%}.g-b--push--1of10{margin-left:10%}.g-b--push--3of10{margin-left:30%}.g-b--push--7of10{margin-left:70%}.g-b--push--9of10{margin-left:90%}.g-b--push--1of12{margin-left:8.333%}.g-b--push--5of12{margin-left:41.666%}.g-b--push--7of12{margin-left:58.333%}.g-b--push--11of12{margin-left:91.666%}.g-b--pull--1of1{margin-right:100%}.g-b--pull--1of2,.g-b--pull--2of4,.g-b--pull--3of6,.g-b--pull--4of8,.g-b--pull--5of10,.g-b--pull--6of12{margin-right:50%}.g-b--pull--1of3,.g-b--pull--2of6,.g-b--pull--4of12{margin-right:33.333%}.g-b--pull--2of3,.g-b--pull--4of6,.g-b--pull--8of12{margin-right:66.666%}.g-b--pull--1of4,.g-b--pull--2of8,.g-b--pull--3of12{margin-right:25%}.g-b--pull--3of4,.g-b--pull--6of8,.g-b--pull--9of12{margin-right:75%}.g-b--pull--1of5,.g-b--pull--2of10{margin-right:20%}.g-b--pull--2of5,.g-b--pull--4of10{margin-right:40%}.g-b--pull--3of5,.g-b--pull--6of10{margin-right:60%}.g-b--pull--4of5,.g-b--pull--8of10{margin-right:80%}.g-b--pull--1of6,.g-b--pull--2of12{margin-right:16.666%}.g-b--pull--5of6,.g-b--pull--10of12{margin-right:83.333%}.g-b--pull--1of8{margin-right:12.5%}.g-b--pull--3of8{margin-right:37.5%}.g-b--pull--5of8{margin-right:62.5%}.g-b--pull--7of8{margin-right:87.5%}.g-b--pull--1of10{margin-right:10%}.g-b--pull--3of10{margin-right:30%}.g-b--pull--7of10{margin-right:70%}.g-b--pull--9of10{margin-right:90%}.g-b--pull--1of12{margin-right:8.333%}.g-b--pull--5of12{margin-right:41.666%}.g-b--pull--7of12{margin-right:58.333%}.g-b--pull--11of12{margin-right:91.666%}.splashscreen{position:fixed;top:0;left:0;width:100%;height:100%;background-color:#373d49;z-index:22}.splashscreen-dillinger{width:260px;height:auto;display:block;margin:0 auto;padding-bottom:3rem}.splashscreen p{font-size:1.25rem;padding-top:.56251rem;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-weight:400;text-align:center;max-width:500px;margin:0 auto;color:#fff}.sp-center{position:relative;transform:translateY(-50%);top:50%}.open-menu>.wrapper{overflow-x:hidden}.page{margin:0 auto;position:relative;top:0;left:0;width:100%;height:100%;z-index:2;transition:all .25s ease-in-out;background-color:#fff;padding-top:51px;will-change:left}.open-menu .page{left:270px}.title{line-height:1rem;font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem;font-weight:500;color:#a0aabf;letter-spacing:1px;text-transform:uppercase;padding-left:16px;padding-right:16px;margin-top:1rem}.split-preview .title{padding-left:0}.title-document{line-height:1rem;font-size:1.25rem;margin-bottom:.89999rem;padding-top:.10001rem;font-weight:400;font-family:ubuntu mono,Monaco;color:#373d49;padding-left:16px;padding-right:16px;width:80%;min-width:300px;outline:0;border:none}.icon{display:block;margin:0 auto;width:36px;height:36px;border-radius:3px;text-align:center}.icon svg{display:inline-block;margin-left:auto;margin-right:auto}.icon-preview{background-color:#373d49;line-height:40px}.icon-preview svg{width:19px;height:12px}.icon-settings{background-color:#373d49;line-height:44px}.icon-settings svg{width:18px;height:18px}.icon-link{width:16px;height:16px;line-height:1;margin-right:24px;text-align:right}.navbar{background-color:#373d49;height:51px;width:100%;position:fixed;top:0;left:0;z-index:6;transition:all .25s ease-in-out;will-change:left}.navbar:after{content:"";display:table;clear:both}.open-menu .navbar{left:270px}.navbar-brand{float:left;margin:0 0 0 24px;padding:0;line-height:42px}.navbar-brand svg{width:85px;height:11px}.nav-left{float:left}.nav-right{float:right}.nav-sidebar{width:100%}.menu{list-style:none;margin:0;padding:0}.menu a{border:0;color:#a0aabf;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;outline:none;text-transform:uppercase}.menu a:hover{color:#35d7bb}.menu .menu-item{border:0;display:none;float:left;margin:0;position:relative}.menu .menu-item>a{display:block;font-size:12px;height:51px;letter-spacing:1px;line-height:51px;padding:0 24px}.menu .menu-item--settings,.menu .menu-item--preview,.menu .menu-item--save-to.in-sidebar,.menu .menu-item--import-from.in-sidebar,.menu .menu-item--link-unlink.in-sidebar,.menu .menu-item--documents.in-sidebar{display:block}.menu .menu-item--documents{padding-bottom:1rem}.menu .menu-item.open>a{background-color:#1d212a}.menu .menu-item-icon>a{height:auto;padding:0}.menu .menu-item-icon:hover>a{background-color:transparent}.menu .menu-link.open i{background-color:#1d212a}.menu .menu-link.open g{fill:#35d7bb}.menu .menu-link-preview,.menu .menu-link-settings{margin-top:8px;width:51px}.menu-sidebar{width:100%}.menu-sidebar .menu-item{float:none;margin-bottom:1px;width:100%}.menu-sidebar .menu-item.open>a{background-color:#373d49}.menu-sidebar .open .caret{transform:rotate(180deg)}.menu-sidebar>.menu-item:hover .dropdown a,.menu-sidebar>.menu-item:hover .settings a{background-color:transparent}.menu-sidebar .menu-link{background-color:#373d49;font-weight:600}.menu-sidebar .menu-link:after{content:"";display:table;clear:both}.menu-sidebar .menu-link>span{float:left}.menu-sidebar .menu-link>.caret{float:right;text-align:right;top:22px}.menu-sidebar .dropdown,.menu-sidebar .settings{background-color:transparent;position:static;width:100%}.dropdown{position:absolute;right:0;top:51px;width:188px}.dropdown,.settings{display:none;background-color:#1d212a}.dropdown{padding:0}.dropdown,.settings,.sidebar-list{list-style:none;margin:0}.sidebar-list{padding:0}.dropdown li{margin:32px 0;padding:0 0 0 32px}.dropdown li,.settings li{line-height:1}.sidebar-list li{line-height:1;margin:32px 0;padding:0 0 0 32px}.dropdown a{color:#d0d6e2}.dropdown a,.settings a,.sidebar-list a{display:block;text-transform:none}.sidebar-list a{color:#d0d6e2}.dropdown a:after,.settings a:after,.sidebar-list a:after{content:"";display:table;clear:both}.dropdown .icon,.settings .icon,.sidebar-list .icon{float:right}.open .dropdown,.open .settings,.open .sidebar-list{display:block}.open .dropdown.collapse,.open .collapse.settings,.open .sidebar-list.collapse{display:none}.open .dropdown.collapse.in,.open .collapse.in.settings,.open .sidebar-list.collapse.in{display:block}.dropdown .unlinked .icon,.settings .unlinked .icon,.sidebar-list .unlinked .icon{opacity:.3}.dropdown.documents li,.documents.settings li,.sidebar-list.documents li{background-image:url(../img/icons/file.svg);background-position:240px center;background-repeat:no-repeat;background-size:14px 16px;padding:3px 32px}.dropdown.documents li.octocat,.documents.settings li.octocat,.sidebar-list.documents li.octocat{background-image:url(../img/icons/octocat.svg);background-position:234px center;background-size:24px 24px}.dropdown.documents li:last-child,.documents.settings li:last-child,.sidebar-list.documents li:last-child{margin-bottom:1rem}.dropdown.documents li.active a,.documents.settings li.active a,.sidebar-list.documents li.active a{color:#35d7bb}.settings{position:fixed;top:67px;right:16px;border-radius:3px;width:288px;background-color:#373d49;padding:16px;z-index:7}.show-settings .settings{display:block}.settings .has-checkbox{float:left}.settings form{display:-ms-flexbox;display:flex;-ms-flex-direction:row;flex-direction:row;-ms-flex-pack:justify;justify-content:space-between}.settings input{width:20%}.settings a{font-size:1.25rem;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-weight:400;-webkit-font-smoothing:antialiased;line-height:28px;color:#d0d6e2}.settings a:after{content:"";display:table;clear:both}.settings a:hover{color:#35d7bb}.settings li{border-bottom:1px solid #4f535b;margin:0;padding:16px 0}.settings li:last-child{border-bottom:none}.brand{border:none;display:block}.brand:hover g{fill:#35d7bb}.toggle{display:block;float:left;height:16px;padding:25px 16px 26px;width:40px}.toggle span:after,.toggle span:before{content:'';left:0;position:absolute;top:-6px}.toggle span:after{top:6px}.toggle span{display:block;position:relative}.toggle span,.toggle span:after,.toggle span:before{-webkit-backface-visibility:hidden;backface-visibility:hidden;background-color:#d3daea;height:2px;transition:all .3s;width:20px}.open-menu .toggle span{background-color:transparent}.open-menu .toggle span:before{transform:rotate(45deg) translate(3px,3px)}.open-menu .toggle span:after{transform:rotate(-45deg) translate(5px,-6px)}.caret{display:inline-block;width:0;height:0;margin-left:6px;vertical-align:middle;position:relative;top:-1px;border-top:4px solid;border-right:4px solid transparent;border-left:4px solid transparent}.sidebar{overflow:auto;height:100%;padding-right:15px;padding-bottom:15px;width:285px}.sidebar-wrapper{-webkit-overflow-scrolling:touch;background-color:#2b2f36;left:0;height:100%;overflow-y:hidden;position:fixed;top:0;width:285px;z-index:1}.sidebar-branding{width:160px;padding:0;margin:16px auto}.header{border-bottom:1px solid #e8e8e8;position:relative}.words,.characters{line-height:1rem;font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem;font-weight:500;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;letter-spacing:1px;text-transform:uppercase;z-index:5;position:absolute;right:16px;top:0}.words span,.characters span{color:#a0aabf}.words .counter,.characters .counter{color:#000}.words+.characters{top:22px}.mr10{margin-right:10px}.btn{text-align:center;display:inline-block;width:100%;text-transform:uppercase;font-weight:600;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-size:14px;text-shadow:0 1px 0 #1b8b77;padding:16px 24px;background-color:#35d7bb;border-radius:3px;margin:0 auto 16px;line-height:1;color:#fff;transition:all .15s linear;-webkit-font-smoothing:antialiased}.btn--new,.btn--save{display:block;width:238px}.btn--new:hover,.btn--new:focus,.btn--save:hover,.btn--save:focus{color:#fff;border-bottom-color:transparent;box-shadow:0 1px 3px #24b59c;text-shadow:0 1px 0 #24b59c}.btn--save{background-color:#4a5261;text-shadow:0 1px 1px #1e2127}.btn--save:hover,.btn--save:focus{color:#fff;border-bottom-color:transparent;box-shadow:0 1px 5px #08090a;text-shadow:none}.btn--delete{display:block;width:238px;background-color:transparent;font-size:12px;text-shadow:none}.btn--delete:hover,.btn--delete:focus{color:#fff;border-bottom-color:transparent;text-shadow:0 1px 0 #08090a;opacity:.8}.btn--delete-modal,.btn--ok,.btn--close{border-top:0;background-color:#4a5261;text-shadow:0 1px 0 #08090a;margin:0}.btn--delete-modal:hover,.btn--delete-modal:focus,.btn--ok:hover,.btn--ok:focus,.btn--close:hover,.btn--close:focus{color:#fff;background-color:#292d36;text-shadow:none}.btn--delete-modal{display:inline;width:auto}.overlay{position:absolute;top:0;left:0;width:100%;height:100%;background-color:rgba(55,61,73,.8);transition:all .25s ease-in-out;transition-timing-function:ease-out;will-change:left,opacity,visibility;z-index:5;opacity:0;visibility:hidden}.show-settings .overlay{visibility:visible;opacity:1}.switch{float:right;line-height:1}.switch input{display:none}.switch small{display:inline-block;cursor:pointer;padding:0 24px 0 0;transition:all ease .2s;background-color:#2b2f36;border-color:#2b2f36}.switch small,.switch small:before{border-radius:30px;box-shadow:inset 0 0 2px 0 #14171f}.switch small:before{display:block;content:'';width:28px;height:28px;background:#fff}.switch.checked small{padding-right:0;padding-left:24px;background-color:#35d7bb;box-shadow:none}.modal--dillinger.about .modal-dialog{font-size:1.25rem;max-width:500px}.modal--dillinger.scope .modal-dialog{max-width:300px;margin:5rem auto}.modal--dillinger .modal-dialog{max-width:600px;width:auto;margin:5rem auto}.modal--dillinger .modal-content{background:#373d49;border-radius:3px;box-shadow:0 2px 5px 0 #2c3b59;color:#fff;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-weight:400;padding:2rem}.modal--dillinger ul{list-style-type:disc;margin:1rem 0;padding:0 0 0 1rem}.modal--dillinger li{padding:0;margin:0}.modal--dillinger .modal-header{border:0;padding:0}.modal--dillinger .modal-body{padding:0}.modal--dillinger .modal-footer{border:0;padding:0}.modal--dillinger .close{color:#fff;opacity:1}.modal-backdrop{background-color:#373d49}.pagination--dillinger{padding:0!important;margin:1.5rem 0!important;display:-ms-flexbox;display:flex;-ms-flex-pack:justify;justify-content:space-between;-ms-flex-direction:row;flex-direction:row;-ms-flex-align:center;align-items:center;-ms-flex-line-pack:stretch;align-content:stretch}.pagination--dillinger li{display:-ms-flexbox;display:flex;-ms-flex-positive:1;flex-grow:1;text-align:center}.pagination--dillinger li:first-child>a,.pagination--dillinger li.disabled>a,.pagination--dillinger li.disabled>a:hover,.pagination--dillinger li.disabled>a:focus,.pagination--dillinger li>a{background-color:transparent;border-color:#4f535b;border-right-color:transparent}.pagination--dillinger li.active>a,.pagination--dillinger li.active>a:hover,.pagination--dillinger li.active>a:focus{border-color:#4a5261;background-color:#4a5261;color:#fff}.pagination--dillinger li>a{float:none;color:#fff;width:100%;display:block;text-align:center;margin:0;border-right-color:transparent;padding:6px}.pagination--dillinger li>a:hover,.pagination--dillinger li>a:focus{border-color:#35d7bb;background-color:#35d7bb;color:#fff}.pagination--dillinger li:last-child a{border-color:#4f535b}.pagination--dillinger li:first-child a{border-right-color:transparent}.diNotify{position:absolute;z-index:9999;left:0;right:0;top:0;margin:0 auto;max-width:400px;text-align:center;transition:top .5s ease-in-out,opacity .5s ease-in-out;visibility:hidden}.diNotify-body{-webkit-font-smoothing:antialiased;background-color:#35d7bb;background:#666e7f;border-radius:3px;color:#fff;font-family:source sans pro,helvetica neue,Helvetica,Arial,sans-serif;font-weight:400;overflow:hidden;padding:1rem 2rem .5rem;display:-ms-flexbox;display:flex;-ms-flex-align:baseline;align-items:baseline;-ms-flex-pack:center;justify-content:center}.diNotify-icon{display:block;width:16px;height:16px;line-height:16px;position:relative;top:3px}.diNotify-message{padding-left:1rem}.zen-wrapper{position:fixed;top:0;left:0;right:0;bottom:0;width:100%;height:100%;z-index:10;background-color:#fff;opacity:0;transition:opacity .25s ease-in-out}.zen-wrapper.on{opacity:1}.enter-zen-mode{background-image:url(../img/icons/enter-zen.svg);right:.5rem;top:.313rem;display:none}.enter-zen-mode,.close-zen-mode{font:0/0 a;color:transparent;text-shadow:none;background-color:transparent;border:0;background-repeat:no-repeat;width:32px;height:32px;display:block;position:absolute}.close-zen-mode{background-image:url(../img/icons/exit-zen.svg);right:1rem;top:1rem}.zen-page{position:relative;top:0;bottom:0;z-index:11;height:100%;width:100%}#zen{font-size:1.25rem;width:300px;height:80%;margin:0 auto;position:relative;top:10%}#zen:before,#zen:after{content:"";position:absolute;height:10%;width:100%;z-index:12;pointer-events:none}#preview .table{width:auto}.ui-resizable{position:relative}.ui-resizable-handle{position:absolute;font-size:.1px;z-index:99999;display:block}.ui-resizable-e{background-color:#666;border-right:8px solid #e8e8e8;border-left:1px solid #222;width:10px;z-index:88!important;position:relative}.ui-resizable-e:after{content:"-";display:block;position:absolute;top:calc(50% - 16px);left:0;height:25px;width:2px;background-color:rgba(0,0,0,.4);margin:3px}#editor{cursor:ew-resize;position:relative;z-index:auto}.profile-pic{float:left;width:250px}#_default_ a::before{color:#a0aabf}#_default_ img{display:none}#_default_ #_default_{display:block;float:left;max-width:38%;word-wrap:break-word}#_default_ .default-ad{display:none}#_default_ ._default_{display:block}#_default_ a{color:#35d7bb;text-decoration:none}#_default_ a:hover{color:#8ae8d8}#_default_ .default-image{display:none}#_default_ .default-title:after{content:" — "}#_default_ .default-title,#_default_ .default-text,#_default_ .default-description{display:inline}#_default_ .default-title{position:relative;font-weight:600;display:none}#_default_ a:before{position:relative;top:0;padding:5px;color:#a0aabf;content:"Ad";text-transform:uppercase;font-size:8px;font-family:Verdana,sans-serif}#_default_{display:block;float:left;max-width:38%;word-wrap:break-word}#_default_ ._default_{display:block;font-size:.75rem;height:51px;letter-spacing:1px;line-height:1rem;padding:18px 24px}.split{overflow:scroll;padding:0!important;-webkit-overflow-scrolling:touch}.split-editor{padding-left:0;padding-right:0;position:relative;z-index:3}.show-preview .split-editor{display:none}.split-preview{background-color:#fff;display:none;top:0;position:relative;z-index:4}.show-preview .split-preview{display:block}#editor{font-size:1rem;font-family:ubuntu mono,Monaco;font-weight:400;line-height:2rem;width:100%;height:100%}#editor .ace_gutter{-webkit-font-smoothing:antialiased}.editor-header{width:50%;float:left;border-bottom:1px solid #e8e8e8;position:relative}.editor-header--first{border-right:1px solid #e8e8e8}.editor-header .title{display:inline-block}.preview-html{padding:15px}.preview-html a{color:#a0aabf;text-decoration:underline}.preview-src{white-space:normal}.preview-mode-toggle-src{background-image:url(../img/icons/code.svg)}.preview-mode-toggle-src,.preview-mode-toggle-html{font:0/0 a;color:transparent;text-shadow:none;background-color:transparent;border:0;background-repeat:no-repeat;width:32px;height:32px;display:block;position:absolute;right:.5rem;top:.5rem;display:none}.preview-mode-toggle-html{background-image:url(../img/icons/eye.svg)}.sr-only{visibility:hidden;text-overflow:110%;overflow:hidden;top:-100px;position:absolute}.mnone{margin:0!important}@media screen and (min-width:27.5em){html{font-size:.875em}body{font-size:1rem}ul,ol{margin-bottom:.83999rem;padding-top:.16001rem}p{padding-top:.66001rem}p,pre{margin-bottom:1.33999rem}pre,blockquote p{font-size:1rem;padding-top:.66001rem}blockquote p{margin-bottom:.33999rem}h1{font-size:2.0571429rem;margin-bottom:.21999rem;padding-top:.78001rem}h2{font-size:1.953125rem;margin-bottom:.1835837rem;padding-top:.8164163rem}h3{font-size:1.6457143rem;margin-bottom:.07599rem;padding-top:.92401rem}h4{font-size:1.5625rem;margin-bottom:.546865rem;padding-top:.453135rem}h5{font-size:1.25rem;margin-bottom:-.56251rem;padding-top:.56251rem}h6{font-size:1rem;margin-bottom:-.65001rem;padding-top:.65001rem}.g{margin-left:-16px;margin-right:-16px}.g-b{padding-left:16px;padding-right:16px}.g-b--m1of1{width:100%}.g-b--m1of2,.g-b--m2of4,.g-b--m3of6,.g-b--m4of8,.g-b--m5of10,.g-b--m6of12{width:50%}.g-b--m1of3,.g-b--m2of6,.g-b--m4of12{width:33.333%}.g-b--m2of3,.g-b--m4of6,.g-b--m8of12{width:66.666%}.g-b--m1of4,.g-b--m2of8,.g-b--m3of12{width:25%}.g-b--m3of4,.g-b--m6of8,.g-b--m9of12{width:75%}.g-b--m1of5,.g-b--m2of10{width:20%}.g-b--m2of5,.g-b--m4of10{width:40%}.g-b--m3of5,.g-b--m6of10{width:60%}.g-b--m4of5,.g-b--m8of10{width:80%}.g-b--m1of6,.g-b--m2of12{width:16.666%}.g-b--m5of6,.g-b--m10of12{width:83.333%}.g-b--m1of8{width:12.5%}.g-b--m3of8{width:37.5%}.g-b--m5of8{width:62.5%}.g-b--m7of8{width:87.5%}.g-b--m1of10{width:10%}.g-b--m3of10{width:30%}.g-b--m7of10{width:70%}.g-b--m9of10{width:90%}.g-b--m1of12{width:8.333%}.g-b--m5of12{width:41.666%}.g-b--m7of12{width:58.333%}.g-b--m11of12{width:91.666%}.g-b--push--m1of1{margin-left:100%}.g-b--push--m1of2,.g-b--push--m2of4,.g-b--push--m3of6,.g-b--push--m4of8,.g-b--push--m5of10,.g-b--push--m6of12{margin-left:50%}.g-b--push--m1of3,.g-b--push--m2of6,.g-b--push--m4of12{margin-left:33.333%}.g-b--push--m2of3,.g-b--push--m4of6,.g-b--push--m8of12{margin-left:66.666%}.g-b--push--m1of4,.g-b--push--m2of8,.g-b--push--m3of12{margin-left:25%}.g-b--push--m3of4,.g-b--push--m6of8,.g-b--push--m9of12{margin-left:75%}.g-b--push--m1of5,.g-b--push--m2of10{margin-left:20%}.g-b--push--m2of5,.g-b--push--m4of10{margin-left:40%}.g-b--push--m3of5,.g-b--push--m6of10{margin-left:60%}.g-b--push--m4of5,.g-b--push--m8of10{margin-left:80%}.g-b--push--m1of6,.g-b--push--m2of12{margin-left:16.666%}.g-b--push--m5of6,.g-b--push--m10of12{margin-left:83.333%}.g-b--push--m1of8{margin-left:12.5%}.g-b--push--m3of8{margin-left:37.5%}.g-b--push--m5of8{margin-left:62.5%}.g-b--push--m7of8{margin-left:87.5%}.g-b--push--m1of10{margin-left:10%}.g-b--push--m3of10{margin-left:30%}.g-b--push--m7of10{margin-left:70%}.g-b--push--m9of10{margin-left:90%}.g-b--push--m1of12{margin-left:8.333%}.g-b--push--m5of12{margin-left:41.666%}.g-b--push--m7of12{margin-left:58.333%}.g-b--push--m11of12{margin-left:91.666%}.g-b--pull--m1of1{margin-right:100%}.g-b--pull--m1of2,.g-b--pull--m2of4,.g-b--pull--m3of6,.g-b--pull--m4of8,.g-b--pull--m5of10,.g-b--pull--m6of12{margin-right:50%}.g-b--pull--m1of3,.g-b--pull--m2of6,.g-b--pull--m4of12{margin-right:33.333%}.g-b--pull--m2of3,.g-b--pull--m4of6,.g-b--pull--m8of12{margin-right:66.666%}.g-b--pull--m1of4,.g-b--pull--m2of8,.g-b--pull--m3of12{margin-right:25%}.g-b--pull--m3of4,.g-b--pull--m6of8,.g-b--pull--m9of12{margin-right:75%}.g-b--pull--m1of5,.g-b--pull--m2of10{margin-right:20%}.g-b--pull--m2of5,.g-b--pull--m4of10{margin-right:40%}.g-b--pull--m3of5,.g-b--pull--m6of10{margin-right:60%}.g-b--pull--m4of5,.g-b--pull--m8of10{margin-right:80%}.g-b--pull--m1of6,.g-b--pull--m2of12{margin-right:16.666%}.g-b--pull--m5of6,.g-b--pull--m10of12{margin-right:83.333%}.g-b--pull--m1of8{margin-right:12.5%}.g-b--pull--m3of8{margin-right:37.5%}.g-b--pull--m5of8{margin-right:62.5%}.g-b--pull--m7of8{margin-right:87.5%}.g-b--pull--m1of10{margin-right:10%}.g-b--pull--m3of10{margin-right:30%}.g-b--pull--m7of10{margin-right:70%}.g-b--pull--m9of10{margin-right:90%}.g-b--pull--m1of12{margin-right:8.333%}.g-b--pull--m5of12{margin-right:41.666%}.g-b--pull--m7of12{margin-right:58.333%}.g-b--pull--m11of12{margin-right:91.666%}.splashscreen p{font-size:1.25rem;margin-bottom:1.43749rem;padding-top:.56251rem}.title{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.title-document{margin-bottom:.89999rem;padding-top:.10001rem}.title-document,.settings a{font-size:1.25rem}.words,.characters{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.modal--dillinger.about .modal-dialog,#zen{font-size:1.25rem}#zen{width:400px}#editor{font-size:1rem}}@media screen and (min-width:46.25em){html{font-size:.875em}body{font-size:1rem}ul,ol{margin-bottom:.83999rem;padding-top:.16001rem}p{padding-top:.66001rem}p,pre{margin-bottom:1.33999rem}pre,blockquote p{font-size:1rem;padding-top:.66001rem}blockquote p{margin-bottom:.33999rem}h1{font-size:2.0571429rem;margin-bottom:.21999rem;padding-top:.78001rem}h2{font-size:1.953125rem;margin-bottom:.1835837rem;padding-top:.8164163rem}h3{font-size:1.6457143rem;margin-bottom:.07599rem;padding-top:.92401rem}h4{font-size:1.5625rem;margin-bottom:.546865rem;padding-top:.453135rem}h5{font-size:1.25rem;margin-bottom:-.56251rem;padding-top:.56251rem}h6{font-size:1rem;margin-bottom:-.65001rem;padding-top:.65001rem}.g{margin-left:-16px;margin-right:-16px}.g-b{padding-left:16px;padding-right:16px}.g-b--t1of1{width:100%}.g-b--t1of2,.g-b--t2of4,.g-b--t3of6,.g-b--t4of8,.g-b--t5of10,.g-b--t6of12{width:50%}.g-b--t1of3,.g-b--t2of6,.g-b--t4of12{width:33.333%}.g-b--t2of3,.g-b--t4of6,.g-b--t8of12{width:66.666%}.g-b--t1of4,.g-b--t2of8,.g-b--t3of12{width:25%}.g-b--t3of4,.g-b--t6of8,.g-b--t9of12{width:75%}.g-b--t1of5,.g-b--t2of10{width:20%}.g-b--t2of5,.g-b--t4of10{width:40%}.g-b--t3of5,.g-b--t6of10{width:60%}.g-b--t4of5,.g-b--t8of10{width:80%}.g-b--t1of6,.g-b--t2of12{width:16.666%}.g-b--t5of6,.g-b--t10of12{width:83.333%}.g-b--t1of8{width:12.5%}.g-b--t3of8{width:37.5%}.g-b--t5of8{width:62.5%}.g-b--t7of8{width:87.5%}.g-b--t1of10{width:10%}.g-b--t3of10{width:30%}.g-b--t7of10{width:70%}.g-b--t9of10{width:90%}.g-b--t1of12{width:8.333%}.g-b--t5of12{width:41.666%}.g-b--t7of12{width:58.333%}.g-b--t11of12{width:91.666%}.g-b--push--t1of1{margin-left:100%}.g-b--push--t1of2,.g-b--push--t2of4,.g-b--push--t3of6,.g-b--push--t4of8,.g-b--push--t5of10,.g-b--push--t6of12{margin-left:50%}.g-b--push--t1of3,.g-b--push--t2of6,.g-b--push--t4of12{margin-left:33.333%}.g-b--push--t2of3,.g-b--push--t4of6,.g-b--push--t8of12{margin-left:66.666%}.g-b--push--t1of4,.g-b--push--t2of8,.g-b--push--t3of12{margin-left:25%}.g-b--push--t3of4,.g-b--push--t6of8,.g-b--push--t9of12{margin-left:75%}.g-b--push--t1of5,.g-b--push--t2of10{margin-left:20%}.g-b--push--t2of5,.g-b--push--t4of10{margin-left:40%}.g-b--push--t3of5,.g-b--push--t6of10{margin-left:60%}.g-b--push--t4of5,.g-b--push--t8of10{margin-left:80%}.g-b--push--t1of6,.g-b--push--t2of12{margin-left:16.666%}.g-b--push--t5of6,.g-b--push--t10of12{margin-left:83.333%}.g-b--push--t1of8{margin-left:12.5%}.g-b--push--t3of8{margin-left:37.5%}.g-b--push--t5of8{margin-left:62.5%}.g-b--push--t7of8{margin-left:87.5%}.g-b--push--t1of10{margin-left:10%}.g-b--push--t3of10{margin-left:30%}.g-b--push--t7of10{margin-left:70%}.g-b--push--t9of10{margin-left:90%}.g-b--push--t1of12{margin-left:8.333%}.g-b--push--t5of12{margin-left:41.666%}.g-b--push--t7of12{margin-left:58.333%}.g-b--push--t11of12{margin-left:91.666%}.g-b--pull--t1of1{margin-right:100%}.g-b--pull--t1of2,.g-b--pull--t2of4,.g-b--pull--t3of6,.g-b--pull--t4of8,.g-b--pull--t5of10,.g-b--pull--t6of12{margin-right:50%}.g-b--pull--t1of3,.g-b--pull--t2of6,.g-b--pull--t4of12{margin-right:33.333%}.g-b--pull--t2of3,.g-b--pull--t4of6,.g-b--pull--t8of12{margin-right:66.666%}.g-b--pull--t1of4,.g-b--pull--t2of8,.g-b--pull--t3of12{margin-right:25%}.g-b--pull--t3of4,.g-b--pull--t6of8,.g-b--pull--t9of12{margin-right:75%}.g-b--pull--t1of5,.g-b--pull--t2of10{margin-right:20%}.g-b--pull--t2of5,.g-b--pull--t4of10{margin-right:40%}.g-b--pull--t3of5,.g-b--pull--t6of10{margin-right:60%}.g-b--pull--t4of5,.g-b--pull--t8of10{margin-right:80%}.g-b--pull--t1of6,.g-b--pull--t2of12{margin-right:16.666%}.g-b--pull--t5of6,.g-b--pull--t10of12{margin-right:83.333%}.g-b--pull--t1of8{margin-right:12.5%}.g-b--pull--t3of8{margin-right:37.5%}.g-b--pull--t5of8{margin-right:62.5%}.g-b--pull--t7of8{margin-right:87.5%}.g-b--pull--t1of10{margin-right:10%}.g-b--pull--t3of10{margin-right:30%}.g-b--pull--t7of10{margin-right:70%}.g-b--pull--t9of10{margin-right:90%}.g-b--pull--t1of12{margin-right:8.333%}.g-b--pull--t5of12{margin-right:41.666%}.g-b--pull--t7of12{margin-right:58.333%}.g-b--pull--t11of12{margin-right:91.666%}.splashscreen-dillinger{width:500px}.splashscreen p{font-size:1.25rem;margin-bottom:1.43749rem;padding-top:.56251rem}.title{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.title-document{font-size:1.25rem;margin-bottom:.89999rem;padding-top:.10001rem}.menu .menu-item--save-to,.menu .menu-item--import-from{display:block}.menu .menu-item--preview,.menu .menu-item--save-to.in-sidebar,.menu .menu-item--import-from.in-sidebar{display:none}.settings a{font-size:1.25rem}.words,.characters{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.modal--dillinger.about .modal-dialog{font-size:1.25rem}.enter-zen-mode{display:block}.close-zen-mode{right:3rem;top:3rem}#zen{font-size:1.25rem;width:500px}.split-editor{border-right:1px solid #e8e8e8;float:left;padding-right:16px;width:50%}.show-preview .split-editor{display:block}.split-preview{display:block;float:right;position:relative;top:0;width:50%}#editor{font-size:1rem}.preview-mode-toggle-src,.preview-mode-toggle-html{display:block}}@media screen and (min-width:62.5em){html{font-size:.875em}body{font-size:1rem}ul,ol{margin-bottom:.83999rem;padding-top:.16001rem}p{padding-top:.66001rem}p,pre{margin-bottom:1.33999rem}pre,blockquote p{font-size:1rem;padding-top:.66001rem}blockquote p{margin-bottom:.33999rem}h1{font-size:2.0571429rem;margin-bottom:.21999rem;padding-top:.78001rem}h2{font-size:1.953125rem;margin-bottom:.1835837rem;padding-top:.8164163rem}h3{font-size:1.6457143rem;margin-bottom:.07599rem;padding-top:.92401rem}h4{font-size:1.5625rem;margin-bottom:.546865rem;padding-top:.453135rem}h5{font-size:1.25rem;margin-bottom:-.56251rem;padding-top:.56251rem}h6{font-size:1rem;margin-bottom:-.65001rem;padding-top:.65001rem}.g{margin-left:-16px;margin-right:-16px}.g-b{padding-left:16px;padding-right:16px}.g-b--d1of1{width:100%}.g-b--d1of2,.g-b--d2of4,.g-b--d3of6,.g-b--d4of8,.g-b--d5of10,.g-b--d6of12{width:50%}.g-b--d1of3,.g-b--d2of6,.g-b--d4of12{width:33.333%}.g-b--d2of3,.g-b--d4of6,.g-b--d8of12{width:66.666%}.g-b--d1of4,.g-b--d2of8,.g-b--d3of12{width:25%}.g-b--d3of4,.g-b--d6of8,.g-b--d9of12{width:75%}.g-b--d1of5,.g-b--d2of10{width:20%}.g-b--d2of5,.g-b--d4of10{width:40%}.g-b--d3of5,.g-b--d6of10{width:60%}.g-b--d4of5,.g-b--d8of10{width:80%}.g-b--d1of6,.g-b--d2of12{width:16.666%}.g-b--d5of6,.g-b--d10of12{width:83.333%}.g-b--d1of8{width:12.5%}.g-b--d3of8{width:37.5%}.g-b--d5of8{width:62.5%}.g-b--d7of8{width:87.5%}.g-b--d1of10{width:10%}.g-b--d3of10{width:30%}.g-b--d7of10{width:70%}.g-b--d9of10{width:90%}.g-b--d1of12{width:8.333%}.g-b--d5of12{width:41.666%}.g-b--d7of12{width:58.333%}.g-b--d11of12{width:91.666%}.g-b--push--d1of1{margin-left:100%}.g-b--push--d1of2,.g-b--push--d2of4,.g-b--push--d3of6,.g-b--push--d4of8,.g-b--push--d5of10,.g-b--push--d6of12{margin-left:50%}.g-b--push--d1of3,.g-b--push--d2of6,.g-b--push--d4of12{margin-left:33.333%}.g-b--push--d2of3,.g-b--push--d4of6,.g-b--push--d8of12{margin-left:66.666%}.g-b--push--d1of4,.g-b--push--d2of8,.g-b--push--d3of12{margin-left:25%}.g-b--push--d3of4,.g-b--push--d6of8,.g-b--push--d9of12{margin-left:75%}.g-b--push--d1of5,.g-b--push--d2of10{margin-left:20%}.g-b--push--d2of5,.g-b--push--d4of10{margin-left:40%}.g-b--push--d3of5,.g-b--push--d6of10{margin-left:60%}.g-b--push--d4of5,.g-b--push--d8of10{margin-left:80%}.g-b--push--d1of6,.g-b--push--d2of12{margin-left:16.666%}.g-b--push--d5of6,.g-b--push--d10of12{margin-left:83.333%}.g-b--push--d1of8{margin-left:12.5%}.g-b--push--d3of8{margin-left:37.5%}.g-b--push--d5of8{margin-left:62.5%}.g-b--push--d7of8{margin-left:87.5%}.g-b--push--d1of10{margin-left:10%}.g-b--push--d3of10{margin-left:30%}.g-b--push--d7of10{margin-left:70%}.g-b--push--d9of10{margin-left:90%}.g-b--push--d1of12{margin-left:8.333%}.g-b--push--d5of12{margin-left:41.666%}.g-b--push--d7of12{margin-left:58.333%}.g-b--push--d11of12{margin-left:91.666%}.g-b--pull--d1of1{margin-right:100%}.g-b--pull--d1of2,.g-b--pull--d2of4,.g-b--pull--d3of6,.g-b--pull--d4of8,.g-b--pull--d5of10,.g-b--pull--d6of12{margin-right:50%}.g-b--pull--d1of3,.g-b--pull--d2of6,.g-b--pull--d4of12{margin-right:33.333%}.g-b--pull--d2of3,.g-b--pull--d4of6,.g-b--pull--d8of12{margin-right:66.666%}.g-b--pull--d1of4,.g-b--pull--d2of8,.g-b--pull--d3of12{margin-right:25%}.g-b--pull--d3of4,.g-b--pull--d6of8,.g-b--pull--d9of12{margin-right:75%}.g-b--pull--d1of5,.g-b--pull--d2of10{margin-right:20%}.g-b--pull--d2of5,.g-b--pull--d4of10{margin-right:40%}.g-b--pull--d3of5,.g-b--pull--d6of10{margin-right:60%}.g-b--pull--d4of5,.g-b--pull--d8of10{margin-right:80%}.g-b--pull--d1of6,.g-b--pull--d2of12{margin-right:16.666%}.g-b--pull--d5of6,.g-b--pull--d10of12{margin-right:83.333%}.g-b--pull--d1of8{margin-right:12.5%}.g-b--pull--d3of8{margin-right:37.5%}.g-b--pull--d5of8{margin-right:62.5%}.g-b--pull--d7of8{margin-right:87.5%}.g-b--pull--d1of10{margin-right:10%}.g-b--pull--d3of10{margin-right:30%}.g-b--pull--d7of10{margin-right:70%}.g-b--pull--d9of10{margin-right:90%}.g-b--pull--d1of12{margin-right:8.333%}.g-b--pull--d5of12{margin-right:41.666%}.g-b--pull--d7of12{margin-right:58.333%}.g-b--pull--d11of12{margin-right:91.666%}.splashscreen-dillinger{width:700px}.splashscreen p{font-size:1.25rem;margin-bottom:1.43749rem;padding-top:.56251rem}.title{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.title-document{font-size:1.25rem;margin-bottom:.89999rem;padding-top:.10001rem}.menu .menu-item--export-as{display:block}.menu .menu-item--preview{display:none}.settings a{font-size:1.25rem}.words,.characters{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.modal--dillinger.about .modal-dialog,#zen{font-size:1.25rem}#zen{width:700px}#editor{font-size:1rem}}@media screen and (min-width:87.5em){html{font-size:.875em}body{font-size:1rem}ul,ol{margin-bottom:.83999rem;padding-top:.16001rem}p{padding-top:.66001rem}p,pre{margin-bottom:1.33999rem}pre,blockquote p{font-size:1rem;padding-top:.66001rem}blockquote p{margin-bottom:.33999rem}h1{font-size:2.0571429rem;margin-bottom:.21999rem;padding-top:.78001rem}h2{font-size:1.953125rem;margin-bottom:.1835837rem;padding-top:.8164163rem}h3{font-size:1.6457143rem;margin-bottom:.07599rem;padding-top:.92401rem}h4{font-size:1.5625rem;margin-bottom:.546865rem;padding-top:.453135rem}h5{font-size:1.25rem;margin-bottom:-.56251rem;padding-top:.56251rem}h6{font-size:1rem;margin-bottom:-.65001rem;padding-top:.65001rem}.splashscreen-dillinger{width:800px}.splashscreen p{font-size:1.25rem;margin-bottom:1.43749rem;padding-top:.56251rem}.title{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.title-document{margin-bottom:.89999rem;padding-top:.10001rem}.title-document,.settings a{font-size:1.25rem}.words,.characters{font-size:.8rem;margin-bottom:.77999rem;padding-top:.22001rem}.modal--dillinger.about .modal-dialog,#zen{font-size:1.25rem}#editor{font-size:1rem}}@media(min-width:768px){.form-inline .form-group{display:inline-block;margin-bottom:0;vertical-align:middle}.form-inline .form-control{display:inline-block;width:auto;vertical-align:middle}.form-inline .input-group{display:inline-table;vertical-align:middle}.form-inline .input-group .input-group-addon,.form-inline .input-group .input-group-btn,.form-inline .input-group .form-control{width:auto}.form-inline .input-group>.form-control{width:100%}.form-inline .control-label{margin-bottom:0;vertical-align:middle}.form-inline .radio,.form-inline .checkbox{display:inline-block;margin-top:0;margin-bottom:0;vertical-align:middle}.form-inline .radio label,.form-inline .checkbox label{padding-left:0}.form-inline .radio input[type=radio],.form-inline .checkbox input[type=checkbox]{position:relative;margin-left:0}.form-inline .has-feedback .form-control-feedback{top:0}.form-horizontal .control-label{text-align:right;margin-bottom:0;padding-top:7px}.form-horizontal .form-group-lg .control-label{padding-top:14.3px}.form-horizontal .form-group-sm .control-label{padding-top:6px}.modal-dialog{width:600px;margin:30px auto}.modal-content{box-shadow:0 5px 15px rgba(0,0,0,.5)}.modal-sm{width:300px}}@media(min-width:992px){.modal-lg{width:900px}}@media screen and (max-width:1200px){#_default_{max-width:30%}#_default_ ._default_{font-size:.825rem;line-height:.875rem;padding:12px 12px 6px 24px;text-align:justify}}@media screen and (max-width:1100px){#_default_{max-width:27%}#_default_ ._default_{font-size:.8rem;line-height:.85rem;padding:12px 6px 6px 24px;text-align:justify}}@media screen and (max-width:1000px){#_default_{max-width:24%}#_default_ ._default_{font-size:.775rem;line-height:.8rem;padding:12px 6px 6px 24px;text-align:justify}}@media screen and (max-width:900px){#_default_{max-width:30%}}@media screen and (max-width:767px){.table-responsive{width:100%;margin-bottom:15px;overflow-y:hidden;overflow-x:auto;-ms-overflow-style:-ms-autohiding-scrollbar;border:1px solid #ddd;-webkit-overflow-scrolling:touch}.table-responsive>.table{margin-bottom:0}.table-responsive>.table>thead>tr>th,.table-responsive>.table>thead>tr>td,.table-responsive>.table>tbody>tr>th,.table-responsive>.table>tbody>tr>td,.table-responsive>.table>tfoot>tr>th,.table-responsive>.table>tfoot>tr>td{white-space:nowrap}.table-responsive>.table-bordered{border:0}.table-responsive>.table-bordered>thead>tr>th:first-child,.table-responsive>.table-bordered>thead>tr>td:first-child,.table-responsive>.table-bordered>tbody>tr>th:first-child,.table-responsive>.table-bordered>tbody>tr>td:first-child,.table-responsive>.table-bordered>tfoot>tr>th:first-child,.table-responsive>.table-bordered>tfoot>tr>td:first-child{border-left:0}.table-responsive>.table-bordered>thead>tr>th:last-child,.table-responsive>.table-bordered>thead>tr>td:last-child,.table-responsive>.table-bordered>tbody>tr>th:last-child,.table-responsive>.table-bordered>tbody>tr>td:last-child,.table-responsive>.table-bordered>tfoot>tr>th:last-child,.table-responsive>.table-bordered>tfoot>tr>td:last-child{border-right:0}.table-responsive>.table-bordered>tbody>tr:last-child>th,.table-responsive>.table-bordered>tbody>tr:last-child>td,.table-responsive>.table-bordered>tfoot>tr:last-child>th,.table-responsive>.table-bordered>tfoot>tr:last-child>td{border-bottom:0}}@media screen and (max-width:720px){#_default_{max-width:60%}#_default_ ._default_{font-size:.75rem;line-height:1rem;padding:12px 24px}}@media screen and (max-width:620px){#_default_{max-width:50%}#_default_ ._default_{font-size:.66rem;letter-spacing:1px;line-height:1rem;padding:10px 24px}}@media screen and (max-width:520px){#_default_ ._default_{font-size:.4rem;line-height:.875rem;padding:6px 12px 6px 24px;text-align:justify}}@media screen and (max-width:460px){#_default_{display:none}}@media screen and (max-width:46.1875em){.editor-header{display:none}.editor-header--first{display:block;width:100%}}</style>
<script type="text/javascript">
   var trackOutboundLink = function(url) {
    ga('send', 'event', 'outbound', 'click', url, {
      'transport': 'beacon',
      'hitCallback': function(){window.open(url);}
    });
    }
  </script>
<div id="_bsa_srv-CVADP53W_0"></div><style id="ace_editor.css" class="dark-mode-native-dark-original">.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;min-width: 100%;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;text-indent: -1em;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: inherit;color: inherit;z-index: 1000;opacity: 1;text-indent: 0;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;}.ace_text-layer {font: inherit !important;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {-webkit-transition: opacity 0.18s;transition: opacity 0.18s;}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;}.ace_line .ace_fold {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.1));background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {-webkit-transition: opacity 0.4s ease 0.05s;transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {-webkit-transition: opacity 0.05s ease 0.05s;transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_text-input-ios {position: absolute !important;top: -100000px !important;left: -100000px !important;}
/*# sourceURL=ace/css/ace_editor.css */</style><style class="dark-mode-native-dark-cloned">.ace_editor {position: relative;overflow: hidden;font: 12px/normal 'Monaco', 'Menlo', 'Ubuntu Mono', 'Consolas', 'source-code-pro', monospace;direction: ltr;text-align: left;-webkit-tap-highlight-color: rgba(0, 0, 0, 0);}.ace_scroller {position: absolute;overflow: hidden;top: 0;bottom: 0;background-color: inherit;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;cursor: text;}.ace_content {position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;min-width: 100%;}.ace_dragging .ace_scroller:before{position: absolute;top: 0;left: 0;right: 0;bottom: 0;content: '';background: rgba(250, 250, 250, 0.01);z-index: 1000;}.ace_dragging.ace_dark .ace_scroller:before{background: rgba(0, 0, 0, 0.01);}.ace_selecting, .ace_selecting * {cursor: text !important;}.ace_gutter {position: absolute;overflow : hidden;width: auto;top: 0;bottom: 0;left: 0;cursor: default;z-index: 4;-ms-user-select: none;-moz-user-select: none;-webkit-user-select: none;user-select: none;}.ace_gutter-active-line {position: absolute;left: 0;right: 0;}.ace_scroller.ace_scroll-left {box-shadow: 17px 0 16px -16px rgba(0, 0, 0, 0.4) inset;}.ace_gutter-cell {padding-left: 19px;padding-right: 6px;background-repeat: no-repeat;}.ace_gutter-cell.ace_error {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAABOFBMVEX/////////QRswFAb/Ui4wFAYwFAYwFAaWGAfDRymzOSH/PxswFAb/SiUwFAYwFAbUPRvjQiDllog5HhHdRybsTi3/Tyv9Tir+Syj/UC3////XurebMBIwFAb/RSHbPx/gUzfdwL3kzMivKBAwFAbbvbnhPx66NhowFAYwFAaZJg8wFAaxKBDZurf/RB6mMxb/SCMwFAYwFAbxQB3+RB4wFAb/Qhy4Oh+4QifbNRcwFAYwFAYwFAb/QRzdNhgwFAYwFAbav7v/Uy7oaE68MBK5LxLewr/r2NXewLswFAaxJw4wFAbkPRy2PyYwFAaxKhLm1tMwFAazPiQwFAaUGAb/QBrfOx3bvrv/VC/maE4wFAbRPBq6MRO8Qynew8Dp2tjfwb0wFAbx6eju5+by6uns4uH9/f36+vr/GkHjAAAAYnRSTlMAGt+64rnWu/bo8eAA4InH3+DwoN7j4eLi4xP99Nfg4+b+/u9B/eDs1MD1mO7+4PHg2MXa347g7vDizMLN4eG+Pv7i5evs/v79yu7S3/DV7/498Yv24eH+4ufQ3Ozu/v7+y13sRqwAAADLSURBVHjaZc/XDsFgGIBhtDrshlitmk2IrbHFqL2pvXf/+78DPokj7+Fz9qpU/9UXJIlhmPaTaQ6QPaz0mm+5gwkgovcV6GZzd5JtCQwgsxoHOvJO15kleRLAnMgHFIESUEPmawB9ngmelTtipwwfASilxOLyiV5UVUyVAfbG0cCPHig+GBkzAENHS0AstVF6bacZIOzgLmxsHbt2OecNgJC83JERmePUYq8ARGkJx6XtFsdddBQgZE2nPR6CICZhawjA4Fb/chv+399kfR+MMMDGOQAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: 2px center;}.ace_gutter-cell.ace_warning {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAMAAAAoLQ9TAAAAmVBMVEX///8AAAD///8AAAAAAABPSzb/5sAAAAB/blH/73z/ulkAAAAAAAD85pkAAAAAAAACAgP/vGz/rkDerGbGrV7/pkQICAf////e0IsAAAD/oED/qTvhrnUAAAD/yHD/njcAAADuv2r/nz//oTj/p064oGf/zHAAAAA9Nir/tFIAAAD/tlTiuWf/tkIAAACynXEAAAAAAAAtIRW7zBpBAAAAM3RSTlMAABR1m7RXO8Ln31Z36zT+neXe5OzooRDfn+TZ4p3h2hTf4t3k3ucyrN1K5+Xaks52Sfs9CXgrAAAAjklEQVR42o3PbQ+CIBQFYEwboPhSYgoYunIqqLn6/z8uYdH8Vmdnu9vz4WwXgN/xTPRD2+sgOcZjsge/whXZgUaYYvT8QnuJaUrjrHUQreGczuEafQCO/SJTufTbroWsPgsllVhq3wJEk2jUSzX3CUEDJC84707djRc5MTAQxoLgupWRwW6UB5fS++NV8AbOZgnsC7BpEAAAAABJRU5ErkJggg==");background-position: 2px center;}.ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAAAAAA6mKC9AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAAJ0Uk5TAAB2k804AAAAPklEQVQY02NgIB68QuO3tiLznjAwpKTgNyDbMegwisCHZUETUZV0ZqOquBpXj2rtnpSJT1AEnnRmL2OgGgAAIKkRQap2htgAAAAASUVORK5CYII=");background-position: 2px center;}.ace_dark .ace_gutter-cell.ace_info {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQBAMAAADt3eJSAAAAJFBMVEUAAAChoaGAgIAqKiq+vr6tra1ZWVmUlJSbm5s8PDxubm56enrdgzg3AAAAAXRSTlMAQObYZgAAAClJREFUeNpjYMAPdsMYHegyJZFQBlsUlMFVCWUYKkAZMxZAGdxlDMQBAG+TBP4B6RyJAAAAAElFTkSuQmCC");}.ace_scrollbar {position: absolute;right: 0;bottom: 0;z-index: 6;}.ace_scrollbar-inner {position: absolute;cursor: text;left: 0;top: 0;}.ace_scrollbar-v{overflow-x: hidden;overflow-y: scroll;top: 0;}.ace_scrollbar-h {overflow-x: scroll;overflow-y: hidden;left: 0;}.ace_print-margin {position: absolute;height: 100%;}.ace_text-input {position: absolute;z-index: 0;width: 0.5em;height: 1em;opacity: 0;background: transparent;-moz-appearance: none;appearance: none;border: none;resize: none;outline: none;overflow: hidden;font: inherit;padding: 0 1px;margin: 0 -1px;text-indent: -1em;-ms-user-select: text;-moz-user-select: text;-webkit-user-select: text;user-select: text;white-space: pre!important;}.ace_text-input.ace_composition {background: inherit;color: inherit;z-index: 1000;opacity: 1;text-indent: 0;}.ace_layer {z-index: 1;position: absolute;overflow: hidden;word-wrap: normal;white-space: pre;height: 100%;width: 100%;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;pointer-events: none;}.ace_gutter-layer {position: relative;width: auto;text-align: right;pointer-events: auto;}.ace_text-layer {font: inherit !important;}.ace_cjk {display: inline-block;text-align: center;}.ace_cursor-layer {z-index: 4;}.ace_cursor {z-index: 4;position: absolute;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;border-left: 2px solid;transform: translatez(0);}.ace_multiselect .ace_cursor {border-left-width: 1px;}.ace_slim-cursors .ace_cursor {border-left-width: 1px;}.ace_overwrite-cursors .ace_cursor {border-left-width: 0;border-bottom: 1px solid;}.ace_hidden-cursors .ace_cursor {opacity: 0.2;}.ace_smooth-blinking .ace_cursor {-webkit-transition: opacity 0.18s;transition: opacity 0.18s;}.ace_marker-layer .ace_step, .ace_marker-layer .ace_stack {position: absolute;z-index: 3;}.ace_marker-layer .ace_selection {position: absolute;z-index: 5;}.ace_marker-layer .ace_bracket {position: absolute;z-index: 6;}.ace_marker-layer .ace_active-line {position: absolute;z-index: 2;}.ace_marker-layer .ace_selected-word {position: absolute;z-index: 4;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;}.ace_line .ace_fold {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;display: inline-block;height: 11px;margin-top: -2px;vertical-align: middle;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACJJREFUeNpi+P//fxgTAwPDBxDxD078RSX+YeEyDFMCIMAAI3INmXiwf2YAAAAASUVORK5CYII=");background-repeat: no-repeat, repeat-x;background-position: center center, top left;color: transparent;border: 1px solid black;border-radius: 2px;cursor: pointer;pointer-events: auto;}.ace_dark .ace_fold {}.ace_fold:hover{background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABEAAAAJCAYAAADU6McMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAJpJREFUeNpi/P//PwOlgAXGYGRklAVSokD8GmjwY1wasKljQpYACtpCFeADcHVQfQyMQAwzwAZI3wJKvCLkfKBaMSClBlR7BOQikCFGQEErIH0VqkabiGCAqwUadAzZJRxQr/0gwiXIal8zQQPnNVTgJ1TdawL0T5gBIP1MUJNhBv2HKoQHHjqNrA4WO4zY0glyNKLT2KIfIMAAQsdgGiXvgnYAAAAASUVORK5CYII="),url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAA3CAYAAADNNiA5AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAACBJREFUeNpi+P//fz4TAwPDZxDxD5X4i5fLMEwJgAADAEPVDbjNw87ZAAAAAElFTkSuQmCC");}.ace_tooltip {background-color: #FFF;background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.1));background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.1));border: 1px solid gray;border-radius: 1px;box-shadow: 0 1px 2px rgba(0, 0, 0, 0.3);color: black;max-width: 100%;padding: 3px 4px;position: fixed;z-index: 999999;-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;cursor: default;white-space: pre;word-wrap: break-word;line-height: normal;font-style: normal;font-weight: normal;letter-spacing: normal;pointer-events: none;}.ace_folding-enabled > .ace_gutter-cell {padding-right: 13px;}.ace_fold-widget {-moz-box-sizing: border-box;-webkit-box-sizing: border-box;box-sizing: border-box;margin: 0 -12px 0 1px;display: none;width: 11px;vertical-align: top;background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42mWKsQ0AMAzC8ixLlrzQjzmBiEjp0A6WwBCSPgKAXoLkqSot7nN3yMwR7pZ32NzpKkVoDBUxKAAAAABJRU5ErkJggg==");background-repeat: no-repeat;background-position: center;border-radius: 3px;border: 1px solid transparent;cursor: pointer;}.ace_folding-enabled .ace_fold-widget {display: inline-block;   }.ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAANElEQVR42m3HwQkAMAhD0YzsRchFKI7sAikeWkrxwScEB0nh5e7KTPWimZki4tYfVbX+MNl4pyZXejUO1QAAAABJRU5ErkJggg==");}.ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAGCAYAAAAG5SQMAAAAOUlEQVR42jXKwQkAMAgDwKwqKD4EwQ26sSOkVWjgIIHAzPiCgaqiqnJHZnKICBERHN194O5b9vbLuAVRL+l0YWnZAAAAAElFTkSuQmCCXA==");}.ace_fold-widget:hover {border: 1px solid rgba(0, 0, 0, 0.3);background-color: rgba(255, 255, 255, 0.2);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.7);}.ace_fold-widget:active {border: 1px solid rgba(0, 0, 0, 0.4);background-color: rgba(0, 0, 0, 0.05);box-shadow: 0 1px 1px rgba(255, 255, 255, 0.8);}.ace_dark .ace_fold-widget {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHklEQVQIW2P4//8/AzoGEQ7oGCaLLAhWiSwB146BAQCSTPYocqT0AAAAAElFTkSuQmCC");}.ace_dark .ace_fold-widget.ace_end {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAH0lEQVQIW2P4//8/AxQ7wNjIAjDMgC4AxjCVKBirIAAF0kz2rlhxpAAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget.ace_closed {background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAMAAAAFCAYAAACAcVaiAAAAHElEQVQIW2P4//+/AxAzgDADlOOAznHAKgPWAwARji8UIDTfQQAAAABJRU5ErkJggg==");}.ace_dark .ace_fold-widget:hover {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);background-color: rgba(255, 255, 255, 0.1);}.ace_dark .ace_fold-widget:active {box-shadow: 0 1px 1px rgba(255, 255, 255, 0.2);}.ace_fold-widget.ace_invalid {background-color: #FFB4B4;border-color: #DE5555;}.ace_fade-fold-widgets .ace_fold-widget {-webkit-transition: opacity 0.4s ease 0.05s;transition: opacity 0.4s ease 0.05s;opacity: 0;}.ace_fade-fold-widgets:hover .ace_fold-widget {-webkit-transition: opacity 0.05s ease 0.05s;transition: opacity 0.05s ease 0.05s;opacity:1;}.ace_underline {text-decoration: underline;}.ace_bold {font-weight: bold;}.ace_nobold .ace_bold {font-weight: normal;}.ace_italic {font-style: italic;}.ace_error-marker {background-color: rgba(255, 0, 0,0.2);position: absolute;z-index: 9;}.ace_highlight-marker {background-color: rgba(255, 255, 0,0.2);position: absolute;z-index: 8;}.ace_br1 {border-top-left-radius    : 3px;}.ace_br2 {border-top-right-radius   : 3px;}.ace_br3 {border-top-left-radius    : 3px; border-top-right-radius:    3px;}.ace_br4 {border-bottom-right-radius: 3px;}.ace_br5 {border-top-left-radius    : 3px; border-bottom-right-radius: 3px;}.ace_br6 {border-top-right-radius   : 3px; border-bottom-right-radius: 3px;}.ace_br7 {border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px;}.ace_br8 {border-bottom-left-radius : 3px;}.ace_br9 {border-top-left-radius    : 3px; border-bottom-left-radius:  3px;}.ace_br10{border-top-right-radius   : 3px; border-bottom-left-radius:  3px;}.ace_br11{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-left-radius:  3px;}.ace_br12{border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br13{border-top-left-radius    : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br14{border-top-right-radius   : 3px; border-bottom-right-radius: 3px; border-bottom-left-radius:  3px;}.ace_br15{border-top-left-radius    : 3px; border-top-right-radius:    3px; border-bottom-right-radius: 3px; border-bottom-left-radius: 3px;}.ace_text-input-ios {position: absolute !important;top: -100000px !important;left: -100000px !important;}
/*# sourceURL=ace/css/ace_editor.css */</style><style id="ace-tm" class="dark-mode-native-dark-original">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style class="dark-mode-native-dark-cloned">.ace-tm .ace_gutter {background: #f0f0f0;color: #333;}.ace-tm .ace_print-margin {width: 1px;background: #e8e8e8;}.ace-tm .ace_fold {background-color: #6B72E6;}.ace-tm {background-color: #FFFFFF;color: black;}.ace-tm .ace_cursor {color: black;}.ace-tm .ace_invisible {color: rgb(191, 191, 191);}.ace-tm .ace_storage,.ace-tm .ace_keyword {color: blue;}.ace-tm .ace_constant {color: rgb(197, 6, 11);}.ace-tm .ace_constant.ace_buildin {color: rgb(88, 72, 246);}.ace-tm .ace_constant.ace_language {color: rgb(88, 92, 246);}.ace-tm .ace_constant.ace_library {color: rgb(6, 150, 14);}.ace-tm .ace_invalid {background-color: rgba(255, 0, 0, 0.1);color: red;}.ace-tm .ace_support.ace_function {color: rgb(60, 76, 114);}.ace-tm .ace_support.ace_constant {color: rgb(6, 150, 14);}.ace-tm .ace_support.ace_type,.ace-tm .ace_support.ace_class {color: rgb(109, 121, 222);}.ace-tm .ace_keyword.ace_operator {color: rgb(104, 118, 135);}.ace-tm .ace_string {color: rgb(3, 106, 7);}.ace-tm .ace_comment {color: rgb(76, 136, 107);}.ace-tm .ace_comment.ace_doc {color: rgb(0, 102, 255);}.ace-tm .ace_comment.ace_doc.ace_tag {color: rgb(128, 159, 191);}.ace-tm .ace_constant.ace_numeric {color: rgb(0, 0, 205);}.ace-tm .ace_variable {color: rgb(49, 132, 149);}.ace-tm .ace_xml-pe {color: rgb(104, 104, 91);}.ace-tm .ace_entity.ace_name.ace_function {color: #0000A2;}.ace-tm .ace_heading {color: rgb(12, 7, 255);}.ace-tm .ace_list {color:rgb(185, 6, 144);}.ace-tm .ace_meta.ace_tag {color:rgb(0, 22, 142);}.ace-tm .ace_string.ace_regex {color: rgb(255, 0, 0)}.ace-tm .ace_marker-layer .ace_selection {background: rgb(181, 213, 255);}.ace-tm.ace_multiselect .ace_selection.ace_start {box-shadow: 0 0 3px 0px white;}.ace-tm .ace_marker-layer .ace_step {background: rgb(252, 255, 0);}.ace-tm .ace_marker-layer .ace_stack {background: rgb(164, 229, 101);}.ace-tm .ace_marker-layer .ace_bracket {margin: -1px 0 0 -1px;border: 1px solid rgb(192, 192, 192);}.ace-tm .ace_marker-layer .ace_active-line {background: rgba(0, 0, 0, 0.07);}.ace-tm .ace_gutter-active-line {background-color : #dcdcdc;}.ace-tm .ace_marker-layer .ace_selected-word {background: rgb(250, 250, 255);border: 1px solid rgb(200, 200, 250);}.ace-tm .ace_indent-guide {background: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAACCAYAAACZgbYnAAAAE0lEQVQImWP4////f4bLly//BwAmVgd1/w11/gAAAABJRU5ErkJggg==") right repeat-y;}
/*# sourceURL=ace/css/ace-tm */</style><style class="dark-mode-native-dark-original">    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><style class="dark-mode-native-dark-cloned">    .error_widget_wrapper {        background: inherit;        color: inherit;        border:none    }    .error_widget {        border-top: solid 2px;        border-bottom: solid 2px;        margin: 5px 0;        padding: 10px 40px;        white-space: pre-wrap;    }    .error_widget.ace_error, .error_widget_arrow.ace_error{        border-color: #ff5a5a    }    .error_widget.ace_warning, .error_widget_arrow.ace_warning{        border-color: #F1D817    }    .error_widget.ace_info, .error_widget_arrow.ace_info{        border-color: #5a5a5a    }    .error_widget.ace_ok, .error_widget_arrow.ace_ok{        border-color: #5aaa5a    }    .error_widget_arrow {        position: absolute;        border: solid 5px;        border-top-color: transparent!important;        border-right-color: transparent!important;        border-left-color: transparent!important;        top: -5px;    }</style><script src="./ReadMe_files/theme-github.js"></script></head>
<body ng-controller="Base" file-import-drop-target="" class="ng-scope" style="overflow: hidden;">
<input type="file" accept=".md,.markdown,text/html" file-import-choose-file="" style="display: none;">
<form method="POST" id="downloader" class="ng-pristine ng-valid">
<input type="hidden" name="name" autocomplete="off">
<input type="hidden" name="unmd" autocomplete="off">
<input type="hidden" name="formatting" autocomplete="off">
<input type="hidden" name="preview" autocomplete="off">
</form>

<ul class="settings ng-scope" role="menu" ng-controller="User as user">
<li>
<a ng-click="user.toggleAutoSave($event)">
<span class="has-checkbox">Auto Save</span>
<span class="toggle-auto-save switch ng-isolate-scope checked" ng-class="{checked: toggleValue}" value="user.profile.enableAutoSave">
  <input type="checkbox" ng-model="toggleValue" class="ng-pristine ng-untouched ng-valid ng-not-empty">
  <small></small>
</span>
</a>
</li>
<li>
<a ng-click="user.toggleWordsCount($event)">
<span class="has-checkbox">Word Count</span>
<span class="toggle-word-count switch ng-isolate-scope checked" ng-class="{checked: toggleValue}" value="user.profile.enableWordsCount">
  <input type="checkbox" ng-model="toggleValue" class="ng-pristine ng-untouched ng-valid ng-not-empty">
  <small></small>
</span>
</a>
</li>
<li>
<a ng-click="user.toggleCharactersCount($event)">
<span class="has-checkbox">Character Count</span>
<span class="toggle-character-count switch ng-isolate-scope checked" ng-class="{checked: toggleValue}" value="user.profile.enableCharactersCount">
  <input type="checkbox" ng-model="toggleValue" class="ng-pristine ng-untouched ng-valid ng-not-empty">
  <small></small>
</span>
</a>
</li>
<li>
<a ng-click="user.toggleScrollSync($event)">
<span class="has-checkbox">Scroll Sync</span>
<span class="toggle-scroll-sync switch ng-isolate-scope" ng-class="{checked: toggleValue}" value="user.profile.enableScrollSync">
  <input type="checkbox" ng-model="toggleValue" class="ng-pristine ng-untouched ng-valid ng-empty">
  <small></small>
</span>
</a>
</li>
<li>
<a><form class="ng-pristine ng-valid ng-valid-min">
<span>Tab Size</span>
<input type="number" ng-model="tabsize" min="1" ng-change="user.storeTabSize()" class="ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-min">
</form></a>
</li>
<li>
<a><form class="ng-pristine ng-valid">
<span>Keybindings</span>
<select ng-model="keybindings" ng-change="user.storeKeybindings()" class="ng-pristine ng-untouched ng-valid ng-not-empty">
<!-- ngRepeat: (key, value) in allKeybindings --><option ng-repeat="(key, value) in allKeybindings" value="Ace" class="ng-binding ng-scope" selected="selected">Ace</option><!-- end ngRepeat: (key, value) in allKeybindings --><option ng-repeat="(key, value) in allKeybindings" value="Vim" class="ng-binding ng-scope">Vim</option><!-- end ngRepeat: (key, value) in allKeybindings --><option ng-repeat="(key, value) in allKeybindings" value="Emacs" class="ng-binding ng-scope">Emacs</option><!-- end ngRepeat: (key, value) in allKeybindings -->
</select>
</form></a>
</li>

<li>
<a target="_blank" href="https://www.markdownguide.org/">
<span>Markdown Help</span>
</a>
</li>
<li>
<a class="toggle-wtf" ng-click="user.showAbout($event)">
<span>WTF is Dillinger?</span>
</a>
</li>
<li>
<a class="toggle-reset" ng-click="user.resetProfile($event)">
<span>Reset Profile</span>
</a>
</li>
</ul>
<div class="wrapper">
<div class="sidebar-wrapper">
<div class="sidebar ng-scope" ng-controller="Documents as document">
<h2 class="sidebar-branding">
<svg viewBox="0 0 85 11" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
 <g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g id="Desktop---Save-to" sketch:type="MSArtboardGroup" transform="translate(-92.000000, -58.000000)" fill="#FFFFFF">
<g id="Navigation" sketch:type="MSLayerGroup" transform="translate(0.000000, 38.000000)">
<g id="Menu-Item:-Branding" transform="translate(91.000000, 17.000000)" sketch:type="MSShapeGroup">
<path d="M1.17,13 L4.563,13 C7.423,13 9.399,11.011 9.399,8.45 L9.399,8.424 C9.399,5.863 7.423,3.9 4.563,3.9 L1.17,3.9 L1.17,13 Z M2.769,11.544 L2.769,5.356 L4.563,5.356 C6.474,5.356 7.722,6.669 7.722,8.45 L7.722,8.476 C7.722,10.257 6.474,11.544 4.563,11.544 L2.769,11.544 Z M13.047,13 L14.646,13 L14.646,3.9 L13.047,3.9 L13.047,13 Z M18.697,13 L25.08,13 L25.08,11.544 L20.296,11.544 L20.296,3.9 L18.697,3.9 L18.697,13 Z M28.364,13 L34.747,13 L34.747,11.544 L29.963,11.544 L29.963,3.9 L28.364,3.9 L28.364,13 Z M38.122,13 L39.721,13 L39.721,3.9 L38.122,3.9 L38.122,13 Z M43.772,13 L45.345,13 L45.345,6.526 L50.363,13 L51.702,13 L51.702,3.9 L50.129,3.9 L50.129,10.192 L45.254,3.9 L43.772,3.9 L43.772,13 Z M59.978,13.156 C61.59,13.156 62.877,12.506 63.774,11.739 L63.774,7.917 L59.9,7.917 L59.9,9.308 L62.227,9.308 L62.227,11.011 C61.668,11.427 60.888,11.7 60.03,11.7 C58.171,11.7 56.936,10.322 56.936,8.45 L56.936,8.424 C56.936,6.682 58.21,5.213 59.887,5.213 C61.044,5.213 61.733,5.59 62.435,6.188 L63.449,4.979 C62.513,4.186 61.538,3.744 59.952,3.744 C57.209,3.744 55.259,5.902 55.259,8.45 L55.259,8.476 C55.259,11.128 57.131,13.156 59.978,13.156 Z M67.474,13 L74.286,13 L74.286,11.57 L69.073,11.57 L69.073,9.126 L73.636,9.126 L73.636,7.696 L69.073,7.696 L69.073,5.33 L74.221,5.33 L74.221,3.9 L67.474,3.9 L67.474,13 Z M77.804,13 L79.403,13 L79.403,9.828 L81.405,9.828 L83.641,13 L85.526,13 L83.069,9.555 C84.343,9.191 85.24,8.294 85.24,6.799 L85.24,6.773 C85.24,5.98 84.967,5.304 84.486,4.81 C83.901,4.238 83.004,3.9 81.86,3.9 L77.804,3.9 L77.804,13 Z M79.403,8.411 L79.403,5.356 L81.73,5.356 C82.913,5.356 83.615,5.889 83.615,6.864 L83.615,6.89 C83.615,7.813 82.887,8.411 81.743,8.411 L79.403,8.411 Z" id="DILLINGER-2"></path>
</g>
</g>
</g>
</g>
</svg>
</h2>
<nav class="nav nav-sidebar">
<ul class="menu menu-sidebar">
<li class="menu-item menu-item--link-unlink in-sidebar">
<a class="menu-link" ng-click="document.status.linkUnlink = !document.status.linkUnlink">
<span>Services</span> <span class="caret"></span></a>
<ul class="sidebar-list collapse" collapse="document.status.linkUnlink" style="height: 0px;">
<li>
<a href="https://dillinger.io/redirect/dropbox" class="import-dropbox unlinked">Link with
<span>Dropbox</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Bitbucket as bitbucket" class="ng-scope">
<a class="import-bitbucket unlinked" href="https://dillinger.io/redirect/bitbucket">Link with
<span>Bitbucket</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Github as github" class="ng-scope">
<a class="import-github unlinked" ng-click="github.chooseScope()">Link with
<span>Github</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li>
<a href="https://dillinger.io/redirect/medium" class="import-medium unlinked">Link with
<span>Medium</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li>
<a href="https://dillinger.io/redirect/googledrive" class="import-google-drive unlinked">Link with
<span>Google Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li>
<a href="https://dillinger.io/redirect/onedrive" class="import-one-drive unlinked">Link with
<span>One Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
 <path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--save-to in-sidebar">
<a class="menu-link" ng-click="document.status.save = !document.status.save">
<span>Save to</span> <span class="caret"></span></a>
<ul class="sidebar-list collapse" collapse="document.status.save" style="height: 0px;">
<li ng-controller="Dropbox as dropbox" class="ng-scope">
<a href="https://dillinger.io/redirect/dropbox" class="import-dropbox unlinked">
<span>Dropbox</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>

<li ng-controller="Github as github" class="ng-scope">
<a class="import-github unlinked" ng-click="github.chooseScope()">
<span>Github</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Medium as medium" class="ng-scope">
<a href="https://dillinger.io/redirect/medium" class="import-medium unlinked">
<span>Medium</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Googledrive as googledrive" class="ng-scope">
<a href="https://dillinger.io/redirect/googledrive" class="import-google-drive unlinked">
<span>Google Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Onedrive as onedrive" class="ng-scope">
<a href="https://dillinger.io/redirect/onedrive" class="import-one-drive unlinked">
<span>One Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--import-from in-sidebar">
<a class="menu-link" ng-click="document.status.import = !document.status.import">
<span>Import from</span> <span class="caret"></span></a>
<ul class="sidebar-list collapse" collapse="document.status.import" style="height: 0px;">
<li ng-controller="Dropbox as dropbox" class="ng-scope">
<a href="https://dillinger.io/redirect/dropbox" class="import-dropbox unlinked">
<span>Dropbox</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Bitbucket as bitbucket" class="ng-scope">
<a class="import-bitbucket unlinked" href="https://dillinger.io/redirect/bitbucket">
<span>Bitbucket</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Github as github" class="ng-scope">
<a class="import-github unlinked" ng-click="github.chooseScope()">
<span>Github</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Googledrive as googledrive" class="ng-scope">
<a href="https://dillinger.io/redirect/googledrive" class="import-google-drive unlinked">
<span>Google Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Onedrive as onedrive" class="ng-scope">
<a href="https://dillinger.io/redirect/onedrive" class="import-one-drive unlinked">
<span>One Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="ImportFile as importFile" class="ng-scope">
<a class="linked" ng-click="choose()">
<span>Markdown File</span>
</a>
</li>
<li ng-controller="ImportFile as importFile" class="ng-scope">
<a class="linked" ng-click="choose(&#39;html&#39;)">
<span>HTML File</span>
</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--documents in-sidebar">
<a class="menu-link" ng-click="document.status.document = !document.status.document">
<span>Documents</span> <span class="caret"></span></a>
<ul class="documents sidebar-list collapse in" collapse="document.status.document" role="menu" style="height: auto;">
<!-- ngRepeat: document in documents track by document.id --><li ng-repeat="document in documents track by document.id" ng-class="{
    &#39;active&#39;: currentDocument.id === document.id,
    &#39;octocat&#39;: document.isGithubFile
    }" class="ng-scope active">
<a ng-click="selectDocument(document)" class="ng-binding">Untitled Document.md</a>
</li><!-- end ngRepeat: document in documents track by document.id -->
</ul>
</li>
</ul>
</nav>
<a class="btn btn--new" ng-click="createDocument()">New Document</a>
<a class="btn btn--save" ng-click="saveDocument(true)">Save Session</a>
<!-- ngIf: documents.length > 1 -->
</div>
</div>
<div class="notification-container">
<div class="notification"></div>
</div>
<div class="page">
<div class="navbar">
<a class="toggle">
  <span></span>
</a>
<h1 class="navbar-brand">
<a class="brand" href="https://dillinger.io/"><svg viewBox="0 0 85 11" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g id="Desktop---Save-to" sketch:type="MSArtboardGroup" transform="translate(-92.000000, -58.000000)" fill="#FFFFFF">
<g id="Navigation" sketch:type="MSLayerGroup" transform="translate(0.000000, 38.000000)">
<g id="Menu-Item:-Branding" transform="translate(91.000000, 17.000000)" sketch:type="MSShapeGroup">
<path d="M1.17,13 L4.563,13 C7.423,13 9.399,11.011 9.399,8.45 L9.399,8.424 C9.399,5.863 7.423,3.9 4.563,3.9 L1.17,3.9 L1.17,13 Z M2.769,11.544 L2.769,5.356 L4.563,5.356 C6.474,5.356 7.722,6.669 7.722,8.45 L7.722,8.476 C7.722,10.257 6.474,11.544 4.563,11.544 L2.769,11.544 Z M13.047,13 L14.646,13 L14.646,3.9 L13.047,3.9 L13.047,13 Z M18.697,13 L25.08,13 L25.08,11.544 L20.296,11.544 L20.296,3.9 L18.697,3.9 L18.697,13 Z M28.364,13 L34.747,13 L34.747,11.544 L29.963,11.544 L29.963,3.9 L28.364,3.9 L28.364,13 Z M38.122,13 L39.721,13 L39.721,3.9 L38.122,3.9 L38.122,13 Z M43.772,13 L45.345,13 L45.345,6.526 L50.363,13 L51.702,13 L51.702,3.9 L50.129,3.9 L50.129,10.192 L45.254,3.9 L43.772,3.9 L43.772,13 Z M59.978,13.156 C61.59,13.156 62.877,12.506 63.774,11.739 L63.774,7.917 L59.9,7.917 L59.9,9.308 L62.227,9.308 L62.227,11.011 C61.668,11.427 60.888,11.7 60.03,11.7 C58.171,11.7 56.936,10.322 56.936,8.45 L56.936,8.424 C56.936,6.682 58.21,5.213 59.887,5.213 C61.044,5.213 61.733,5.59 62.435,6.188 L63.449,4.979 C62.513,4.186 61.538,3.744 59.952,3.744 C57.209,3.744 55.259,5.902 55.259,8.45 L55.259,8.476 C55.259,11.128 57.131,13.156 59.978,13.156 Z M67.474,13 L74.286,13 L74.286,11.57 L69.073,11.57 L69.073,9.126 L73.636,9.126 L73.636,7.696 L69.073,7.696 L69.073,5.33 L74.221,5.33 L74.221,3.9 L67.474,3.9 L67.474,13 Z M77.804,13 L79.403,13 L79.403,9.828 L81.405,9.828 L83.641,13 L85.526,13 L83.069,9.555 C84.343,9.191 85.24,8.294 85.24,6.799 L85.24,6.773 C85.24,5.98 84.967,5.304 84.486,4.81 C83.901,4.238 83.004,3.9 81.86,3.9 L77.804,3.9 L77.804,13 Z M79.403,8.411 L79.403,5.356 L81.73,5.356 C82.913,5.356 83.615,5.889 83.615,6.864 L83.615,6.89 C83.615,7.813 82.887,8.411 81.743,8.411 L79.403,8.411 Z" id="DILLINGER-2"></path>
</g>
</g>
</g>
</g>
</svg>
</a>
</h1>
<div class="ad-container">
</div>
<nav class="nav nav-right">
<ul class="menu menu-utilities">
<li class="menu-item menu-item--export-as has-dropdown" dropdown="">
<a class="dropdown-toggle" dropdown-toggle="" aria-haspopup="true" aria-expanded="false">Preview as <span class="caret"></span></a>
<ul class="dropdown dropdown-menu ng-scope" role="menu" ng-controller="DocumentsExport as export" di-target="preview">
<li>
<a ng-click="export.asHTML()" class="export-html">HTML</a>
</li>
<li>
<a ng-click="export.asStyledHTML()" class="export-styled_html">Styled HTML</a>
</li>
<li>
<a ng-click="export.asMarkdown()" class="export-md">Markdown</a>
</li>
<li>
<a ng-click="export.asPDF()" class="export-pdf">PDF</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--export-as has-dropdown" dropdown="">
<a class="dropdown-toggle" dropdown-toggle="" aria-haspopup="true" aria-expanded="false">Export as <span class="caret"></span></a>
<ul class="dropdown dropdown-menu ng-scope" role="menu" ng-controller="DocumentsExport as export" di-target="_top">
<li>
<a ng-click="export.asHTML()" class="export-html">HTML</a>
</li>
<li>
<a ng-click="export.asStyledHTML()" class="export-styled_html">Styled HTML</a>
</li>
<li>
<a ng-click="export.asMarkdown()" class="export-md">Markdown</a>
</li>
<li>
<a ng-click="export.asPDF()" class="export-pdf">PDF</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--save-to has-dropdown" dropdown="">
<a class="dropdown-toggle" dropdown-toggle="" aria-haspopup="true" aria-expanded="false">Save to <span class="caret"></span></a>
<ul class="dropdown dropdown-menu" role="menu">
<li ng-controller="Dropbox as dropbox" class="ng-scope">
<a href="https://dillinger.io/redirect/dropbox" class="import-dropbox unlinked">
<span>Dropbox</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>

<li ng-controller="Github as github" class="ng-scope">
<a class="import-github unlinked" ng-click="github.chooseScope()">
<span>Github</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Medium as medium" class="ng-scope">
<a href="https://dillinger.io/redirect/medium" class="import-medium unlinked">
<span>Medium</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Googledrive as googledrive" class="ng-scope">
<a href="https://dillinger.io/redirect/googledrive" class="import-google-drive unlinked">
<span>Google Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Onedrive as onedrive" class="ng-scope">
<a href="https://dillinger.io/redirect/onedrive" class="import-one-drive unlinked">
<span>One Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
</ul>
</li>
<li class="menu-item menu-item--import-from has-dropdown" dropdown="">
<a class="dropdown-toggle" dropdown-toggle="" aria-haspopup="true" aria-expanded="false">Import from <span class="caret"></span></a>
<ul class="dropdown dropdown-menu" role="menu">
<li ng-controller="Dropbox as dropbox" class="ng-scope">
<a href="https://dillinger.io/redirect/dropbox" class="import-dropbox unlinked">
<span>Dropbox</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Bitbucket as bitbucket" class="ng-scope">
<a class="import-bitbucket unlinked" href="https://dillinger.io/redirect/bitbucket">
<span>Bitbucket</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Github as github" class="ng-scope">
<a class="import-github unlinked" ng-click="github.chooseScope()">
<span>Github</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Googledrive as googledrive" class="ng-scope">
<a href="https://dillinger.io/redirect/googledrive" class="import-google-drive unlinked">
<span>Google Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="Onedrive as onedrive" class="ng-scope">
<a href="https://dillinger.io/redirect/onedrive" class="import-one-drive unlinked">
<span>One Drive</span>
<span class="icon icon-link"><svg viewBox="0 0 16 16" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g sketch:type="MSArtboardGroup" transform="translate(-238.000000, -212.000000)" fill="#FFFFFF">
<g sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g transform="translate(0.000000, 75.000000)" sketch:type="MSShapeGroup">
<g transform="translate(32.000000, 72.000000)">
<g transform="translate(206.000000, 0.000000)">
<path d="M15.0962672,6.56194892 L10.8290766,10.8291395 C9.6502947,12.0079214 7.74066798,12.0079214 6.56188605,10.8291395 L5.13948919,9.40674263 L6.56188605,7.98434578 L7.98428291,9.40674263 C8.37721022,9.79869548 9.01472692,9.79966994 9.40667976,9.40674263 L13.6738703,5.13955206 C14.0658232,4.7471277 14.0658232,4.10910806 13.6738703,3.71665226 L12.2514735,2.2942554 C11.8595206,1.90230255 11.2210295,1.90230255 10.8290766,2.2942554 L9.30549312,3.8178389 C8.59919843,3.40231041 7.79665226,3.22401572 7.00196464,3.27754813 L9.40667976,0.871858546 C10.5854617,-0.306420432 12.4960629,-0.306420432 13.6738703,0.871858546 L15.0962672,2.2942554 C16.2750491,3.47256582 16.2750491,5.38366994 15.0962672,6.56194892 L15.0962672,6.56194892 Z M6.66209823,12.1513242 L5.13948919,13.6739332 C4.74656189,14.0668605 4.10904519,14.0658861 3.71709234,13.6739332 L2.29469548,12.2515363 C1.90176817,11.8595835 1.90176817,11.2220668 2.29469548,10.8291395 L6.56188605,6.56194892 C6.9538389,6.16999607 7.59233006,6.16999607 7.98428291,6.56194892 L9.40667976,7.98434578 L10.8290766,6.56194892 L9.40667976,5.13955206 C8.22789784,3.96127308 6.31827112,3.96127308 5.13948919,5.13955206 L0.872298625,9.40674263 C-0.306483301,10.5855246 -0.306483301,12.4961257 0.872298625,13.6739332 L2.29469548,15.0963301 C3.47250295,16.275112 5.38310413,16.275112 6.56188605,15.0963301 L8.96660118,12.6916149 C8.17191356,12.7446444 7.37131631,12.5658782 6.66209823,12.1513242 L6.66209823,12.1513242 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</g>
</svg>
</span>
</a>
</li>
<li ng-controller="ImportFile as importFile" class="ng-scope">
<a class="linked" ng-click="choose()">
<span>Markdown File</span>
</a>
</li>
<li ng-controller="ImportFile as importFile" class="ng-scope">
<a class="linked" ng-click="choose(&#39;html&#39;)">
<span>HTML File</span>
</a>
</li>
</ul>
</li>
<li class="menu-item menu-item-icon menu-item--preview">
<a class="menu-link menu-link-preview" preview-toggle="">
<i class="icon icon-preview"><svg viewBox="0 0 19 12" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g id="Mobile---Home" sketch:type="MSArtboardGroup" transform="translate(-234.000000, -85.000000)" fill="#D3DBEB">
<g id="Navigation" sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g id="Menu-Item:-Preview" transform="translate(218.000000, 0.000000)" sketch:type="MSShapeGroup">
<g id="Icon:-Preview" transform="translate(17.000000, 20.000000)">
<path d="M8.90526316,0.0311320755 C3.00069474,0.0311320755 -0.0947368421,4.79641509 -0.0947368421,5.55188679 C-0.0947368421,6.30756604 3.00069474,11.0726415 8.90526316,11.0726415 C14.8094526,11.0726415 17.9052632,6.30756604 17.9052632,5.55188679 C17.9052632,4.79641509 14.8094526,0.0311320755 8.90526316,0.0311320755 L8.90526316,0.0311320755 Z M8.90526316,9.79871698 C6.69618947,9.79871698 4.90509474,7.89737736 4.90509474,5.55188679 C4.90509474,3.20639623 6.69618947,1.3050566 8.90526316,1.3050566 C11.1143368,1.3050566 12.9052421,3.20639623 12.9052421,5.55188679 C12.9052421,7.89737736 11.1143368,9.79871698 8.90526316,9.79871698 L8.90526316,9.79871698 Z M10.9051579,5.55188679 C10.9051579,6.7245283 10.0095158,7.67550943 8.90526316,7.67550943 C7.80063158,7.67550943 6.90536842,6.7245283 6.90536842,5.55188679 C6.90536842,4.37924528 7.80063158,3.4284717 8.90526316,3.4284717 C9.50210526,3.4284717 8.53901053,5.11126415 8.90526316,5.55188679 C9.21656842,5.92609434 10.9051579,5.01330189 10.9051579,5.55188679 L10.9051579,5.55188679 Z" id="Shape"></path>
</g>
</g>
</g>
</g>
</g>
</svg>
</i>
<span class="sr-only">Preview</span>
</a>
</li>
<li class="menu-item menu-item-icon menu-item--settings">
<a class="menu-link menu-link-settings" settings-toggle="">
<i class="icon icon-settings"><svg viewBox="0 0 18 18" version="1.1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:sketch="http://www.bohemiancoding.com/sketch/ns">
<g id="Page-1" stroke="none" stroke-width="1" fill="none" fill-rule="evenodd" sketch:type="MSPage">
<g id="Mobile---Home" sketch:type="MSArtboardGroup" transform="translate(-286.000000, -81.000000)" fill="#D3DBEB">
<g id="Navigation" sketch:type="MSLayerGroup" transform="translate(0.000000, 65.000000)">
<g id="Menu-Item:-Settings" transform="translate(269.000000, 0.000000)" sketch:type="MSShapeGroup">
<g id="Icon:-Settings" transform="translate(17.000000, 16.000000)">
<path d="M17.341654,7.68935491 L15.5585491,7.39189286 C15.4289531,6.86205804 15.2399933,6.35558705 14.9938996,5.88320759 L16.1353929,4.46787723 C16.3781719,4.16876786 16.3671429,3.73839509 16.1111853,3.44971205 L15.4020134,2.65156473 C15.1449509,2.36318304 14.7186763,2.30219196 14.3934911,2.507625 L12.8685937,3.46620536 C12.1978929,2.99760268 11.4381562,2.65156473 10.6185937,2.45077232 L10.3202679,0.658104911 C10.2576696,0.278517857 9.92918973,0 9.54359598,0 L8.47488616,0 C8.09007589,0 7.76049107,0.278517857 7.69925893,0.658104911 L7.39932589,2.45133482 C6.72173437,2.61723214 6.0864308,2.88502232 5.50665402,3.23770982 L4.05644866,2.20275 C3.74389955,1.97945759 3.31461161,2.01437277 3.04185937,2.28654241 L2.28684375,3.04210045 C2.01467411,3.31485268 1.97975893,3.74414062 2.20363393,4.05668973 L3.24100446,5.50966741 C2.8916317,6.08506473 2.62659375,6.71675223 2.46071652,7.38829687 L0.65784375,7.68935491 C0.278839286,7.75195312 -0.000220982143,8.08047321 -0.000220982143,8.46606696 L-0.000220982143,9.53393304 C-0.000220982143,9.91952679 0.278839286,10.2480469 0.65784375,10.3106451 L2.46071652,10.6117031 C2.59694196,11.1642991 2.79470089,11.6921853 3.05754911,12.1816205 L1.92125893,13.5889554 C1.67930357,13.8877835 1.68946875,14.3184375 1.94542634,14.6068594 L2.6540558,15.4050067 C2.91113839,15.6939308 3.33765402,15.753817 3.66285937,15.5489063 L5.20973437,14.5771875 C5.86426339,15.0248772 6.60473437,15.3539196 7.39932589,15.5489063 L7.69925893,17.341875 C7.76049107,17.7215022 8.09007589,18 8.47488616,18 L9.54359598,18 C9.92918973,18 10.2576696,17.7215022 10.3202679,17.3418951 L10.619096,15.5489263 C11.2882299,15.3852589 11.9154777,15.1221295 12.4900915,14.7754888 L14.0007254,15.8543839 C14.3127321,16.0785 14.7423214,16.0433437 15.0147924,15.7703103 L15.7700893,15.0150134 C16.0419576,14.7430848 16.0787812,14.3140379 15.8529978,14.0009464 L14.7774978,12.4930647 C15.1278951,11.9157388 15.3943192,11.2829263 15.5591518,10.6083683 L17.3422366,10.310625 C17.722346,10.2480268 18.0002812,9.9195067 18.0002812,9.53391295 L18.0002812,8.46604688 C17.9997388,8.08047321 17.7218036,7.75195312 17.341654,7.68935491 L17.341654,7.68935491 Z M9.0283058,12.375 C7.1647433,12.375 5.6533058,10.8632812 5.6533058,9 C5.6533058,7.1364375 7.1647433,5.625 9.0283058,5.625 C10.8915469,5.625 12.4032656,7.1364375 12.4032656,9 C12.4032656,10.8632812 10.8915469,12.375 9.0283058,12.375 L9.0283058,12.375 Z" id="settings_1_"></path>
</g>
</g>
</g>
</g>
</g>
</svg>
</i>
<span class="sr-only">Settings</span>
</a>
</li>
</ul>
</nav>
</div>
<div class="overlay"></div>
<div class="header">
<h2 class="title">Document Name</h2>
<document-title><input class="title-document ng-pristine ng-untouched ng-valid ng-not-empty" type="text" name="documentTitle" ng-change="updateDocument()" ng-model-options="{ debounce: 500 }" ng-model="currentDocument.title">
</document-title>
<!-- ngIf: profile.enableWordsCount && !viewSrcMode --><p ng-if="profile.enableWordsCount &amp;&amp; !viewSrcMode" class="words ng-scope">
<span class="mr10">Reading Time: <span class="counter ng-binding" ng-bind="readingTime">2 min read</span></span>
<span>Words: <span class="counter ng-binding" ng-bind="words">247</span></span>
</p><!-- end ngIf: profile.enableWordsCount && !viewSrcMode -->
<!-- ngIf: profile.enableCharactersCount && !viewSrcMode --><p ng-if="profile.enableCharactersCount &amp;&amp; !viewSrcMode" class="characters ng-scope">Characters: <span class="counter ng-binding" ng-bind="characters">1897</span></p><!-- end ngIf: profile.enableCharactersCount && !viewSrcMode -->
</div>
<div class="g mnone">
<div class="editor-header editor-header--first">
<h3 class="title">Markdown</h3>
<!-- ngIf: !$root.viewSrcMode --><a class="enter-zen-mode ng-scope" ng-click="zenmode.toggle()" ng-if="!$root.viewSrcMode">Toggle Zen Mode</a><!-- end ngIf: !$root.viewSrcMode -->
</div>
<div class="editor-header">
<h3 class="title">Preview</h3>
<a ng-class="{&#39;preview-mode-toggle-html&#39; : $root.viewSrcMode, &#39;preview-mode-toggle-src&#39; : !$root.viewSrcMode}" ng-click="toggleView()" class="preview-mode-toggle-src">Toggle Mode</a>
</div>
<div id="editor1" class="g-b g-b--t1of2 split split-editor" style="height: 774px;">
<div id="editor" class="ui-resizable-e ace_editor ace-tm ace_focus" style="height: 1512px;" draggable="false"><textarea class="ace_text-input" wrap="off" autocorrect="off" autocapitalize="off" spellcheck="false" style="opacity: 0; left: 303px; top: 588px; height: 28px; width: 7px;"></textarea><div class="ace_gutter" aria-hidden="true"><div class="ace_layer ace_gutter-layer ace_folding-enabled" style="margin-top: 0px; height: 1568px; width: 47px;"><div class="ace_gutter-cell " style="height: 28px;">1<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">2<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">3</div><div class="ace_gutter-cell " style="height: 28px;">4<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">5</div><div class="ace_gutter-cell " style="height: 28px;">6</div><div class="ace_gutter-cell " style="height: 28px;">7</div><div class="ace_gutter-cell " style="height: 28px;">8</div><div class="ace_gutter-cell " style="height: 28px;">9</div><div class="ace_gutter-cell " style="height: 28px;">10</div><div class="ace_gutter-cell " style="height: 28px;">11</div><div class="ace_gutter-cell " style="height: 28px;">12</div><div class="ace_gutter-cell " style="height: 28px;">13<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">14</div><div class="ace_gutter-cell " style="height: 28px;">15</div><div class="ace_gutter-cell " style="height: 28px;">16</div><div class="ace_gutter-cell " style="height: 28px;">17</div><div class="ace_gutter-cell " style="height: 28px;">18</div><div class="ace_gutter-cell " style="height: 28px;">19</div><div class="ace_gutter-cell " style="height: 28px;">20</div><div class="ace_gutter-cell " style="height: 28px;">21</div><div class="ace_gutter-cell " style="height: 28px;">22</div><div class="ace_gutter-cell " style="height: 28px;">23</div><div class="ace_gutter-cell " style="height: 28px;">24</div><div class="ace_gutter-cell " style="height: 28px;">25</div><div class="ace_gutter-cell " style="height: 28px;">26</div><div class="ace_gutter-cell " style="height: 28px;">27</div><div class="ace_gutter-cell " style="height: 28px;">28<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">29</div><div class="ace_gutter-cell " style="height: 28px;">30</div><div class="ace_gutter-cell " style="height: 28px;">31</div><div class="ace_gutter-cell " style="height: 28px;">32</div><div class="ace_gutter-cell " style="height: 28px;">33</div><div class="ace_gutter-cell " style="height: 28px;">34</div><div class="ace_gutter-cell " style="height: 28px;">35</div><div class="ace_gutter-cell " style="height: 28px;">36</div><div class="ace_gutter-cell " style="height: 28px;">37</div><div class="ace_gutter-cell " style="height: 28px;">38</div><div class="ace_gutter-cell " style="height: 28px;">39</div><div class="ace_gutter-cell " style="height: 28px;">40</div><div class="ace_gutter-cell " style="height: 28px;">41</div><div class="ace_gutter-cell " style="height: 28px;">42</div><div class="ace_gutter-cell " style="height: 28px;">43</div><div class="ace_gutter-cell " style="height: 28px;">44</div><div class="ace_gutter-cell " style="height: 28px;">45<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">46</div><div class="ace_gutter-cell " style="height: 56px;">47</div><div class="ace_gutter-cell " style="height: 28px;">48</div><div class="ace_gutter-cell " style="height: 28px;">49<span class="ace_fold-widget ace_start ace_open" style="height: 28px;"></span></div><div class="ace_gutter-cell " style="height: 28px;">50</div><div class="ace_gutter-cell " style="height: 28px;">51</div><div class="ace_gutter-cell " style="height: 28px;">52</div><div class="ace_gutter-cell " style="height: 28px;">53</div></div><div class="ace_gutter-active-line" style="top: 588px; height: 28px;"></div></div><div class="ace_scroller" style="left: 47px; right: 0px; bottom: 0px;"><div class="ace_content" style="margin-top: 0px; width: 888px; height: 1568px; margin-left: 0px;"><div class="ace_layer ace_print-margin-layer"><div class="ace_print-margin" style="left: 564px; visibility: hidden;"></div></div><div class="ace_layer ace_marker-layer"><div class="ace_active-line" style="height:28px;top:588px;left:0;right:0;"></div></div><div class="ace_layer ace_text-layer" style="padding: 0px 4px;"><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_5">#####</span><span class="ace_heading"> In this project I have implemented various CRUD APIs using Spring Boot</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_5">#####</span><span class="ace_heading"> Implemented APIs -&gt; GET,POST,PUT and UPDATE method.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_2">##</span><span class="ace_heading"> Tools Used</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**Framework**</span><span class="ace_list">: Spring and Spring-Boot(Version 2.6.3)</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**Language**</span><span class="ace_list">: JAVA</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**Database**</span><span class="ace_list">: Mysql(Version 8.0)</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**Dependencies**</span><span class="ace_list">: Maven(Version 3.5.2)</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**IDE**</span><span class="ace_list">: Spring Tool Suite (STS)</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_string ace_strong">**Postman**</span><span class="ace_list">: For calling APIs</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_5">#####</span><span class="ace_heading"> NOTE - </span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">Create a mysql database.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">Input your respective database credentials in demo/src/main/resources/applications.properties file.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">Run following commands in database in order to create the tables.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">    * create table employee(id int not null, name varchar(25), </span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">dept_id int, age int, sex varchar(6), primary key (id), </span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">foreign key (dept</span><span class="ace_string ace_emphasis">_id) references department(dept_</span><span class="ace_list">id));</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">    * create table department(dept</span><span class="ace_string ace_emphasis">_id int not null, dept_</span><span class="ace_list">name varchar(30),</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">primary key (dept_id));</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">*Putting the name of database in application.properties file is important. (I have used the database name as "paytm") .</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">These are the various maven dependencies used:</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    &gt; spring-boot-starter-parent</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    &gt; spring-boot-starter-web</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    &gt; mysql-connector-java</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    &gt; spring-boot-starter-data-jpa</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">## Format to send POST request through POSTMAN</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">    For Employee Table:</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    {</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "id":XXX, </span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "name":XXX,</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "department"{</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_indent-guide">    </span><span class="ace_list">    "dept_id":XXX</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    },</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "age":XXX</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "sex":XXX</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    }</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_list">    For Department Table:</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    {</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "dept_id":XXX,</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    "dept_name":XXX </span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_indent-guide">    </span><span class="ace_list">    }</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_2">##</span><span class="ace_heading"> @transactional usecase</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">I have made an API which will insert multiple employees in Employee table or multiple departments in Deaprtment table.</span></div></div><div class="ace_line_group" style="height:56px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">At the time of inserting in database if some employee/department credentials are invalid whole transaction will rollback </span></div><div class="ace_line" style="height:28px"><span class="ace_list">and nothing will be reflected on database.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_heading ace_2">##</span><span class="ace_heading"> Redis Cache Implementation</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">Redis cache has also been implemented to reduce the access time of the record.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">For GET methods, @Cacheable annotation has been used.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">For PUT methods, @CachePut annotation has been used.</span></div></div><div class="ace_line_group" style="height:28px"><div class="ace_line" style="height:28px"><span class="ace_markup ace_list">* </span><span class="ace_list">For DELETE methods, @CacheEvict annotation has been used.</span></div></div></div><div class="ace_layer ace_marker-layer"></div><div class="ace_layer ace_cursor-layer"><div class="ace_cursor" style="left: 256px; top: 588px; width: 7px; height: 28px; opacity: 0;"></div></div></div></div><div class="ace_scrollbar ace_scrollbar-v" style="display: none; width: 20px; bottom: 0px;"><div class="ace_scrollbar-inner" style="width: 20px; height: 1512px;"></div></div><div class="ace_scrollbar ace_scrollbar-h" style="display: none; height: 20px; left: 47px; right: 0px;"><div class="ace_scrollbar-inner" style="height: 20px; width: 895px;"></div></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: hidden;"><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font: inherit; overflow: visible;"></div><div style="height: auto; width: auto; top: 0px; left: 0px; visibility: hidden; position: absolute; white-space: pre; font-style: inherit; font-variant: inherit; font-stretch: inherit; font-size: inherit; line-height: inherit; font-family: inherit; overflow: visible;">XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX</div></div></div>
</div>
<div id="preview1" class="g-b g-b--t1of2 split split-preview" style="height: 774px;">
<div id="preview" class="preview-html" preview="" debounce="150"><h5 class="code-line" data-line-start="0" data-line-end="1"><a id="In_this_project_I_have_implemented_various_CRUD_APIs_using_Spring_Boot_0"></a>In this project I have implemented various CRUD APIs using Spring Boot</h5>
<h5 class="code-line" data-line-start="1" data-line-end="2"><a id="Implemented_APIs__GETPOSTPUT_and_UPDATE_method_1"></a>Implemented APIs -&gt; GET,POST,PUT and UPDATE method.</h5>
<h2 class="code-line" data-line-start="3" data-line-end="4"><a id="Tools_Used_3"></a>Tools Used</h2>
<ul>
<li class="has-line-data" data-line-start="4" data-line-end="5"><strong>Framework</strong>: Spring and Spring-Boot(Version 2.6.3)</li>
<li class="has-line-data" data-line-start="5" data-line-end="6"><strong>Language</strong>: JAVA</li>
<li class="has-line-data" data-line-start="6" data-line-end="7"><strong>Database</strong>: Mysql(Version 8.0)</li>
<li class="has-line-data" data-line-start="7" data-line-end="8"><strong>Dependencies</strong>: Maven(Version 3.5.2)</li>
<li class="has-line-data" data-line-start="8" data-line-end="9"><strong>IDE</strong>: Spring Tool Suite (STS)</li>
<li class="has-line-data" data-line-start="9" data-line-end="10"><strong>Postman</strong>: For calling APIs</li>
</ul>
<h5 class="code-line" data-line-start="12" data-line-end="13"><a id="NOTE__12"></a>NOTE -</h5>
<ul>
<li class="has-line-data" data-line-start="13" data-line-end="14">Create a mysql database.</li>
<li class="has-line-data" data-line-start="14" data-line-end="15">Input your respective database credentials in demo/src/main/resources/applications.properties file.</li>
<li class="has-line-data" data-line-start="15" data-line-end="22">Run following commands in database in order to create the tables.
<ul>
<li class="has-line-data" data-line-start="16" data-line-end="19">create table employee(id int not null, name varchar(25),<br>
dept_id int, age int, sex varchar(6), primary key (id),<br>
foreign key (dept_id) references department(dept_id));</li>
<li class="has-line-data" data-line-start="19" data-line-end="22">create table department(dept_id int not null, dept_name varchar(30),<br>
primary key (dept_id));<br>
*Putting the name of database in application.properties file is important. (I have used the database name as “paytm”) .</li>
</ul>
</li>
<li class="has-line-data" data-line-start="22" data-line-end="27">These are the various maven dependencies used:<br>
&gt; spring-boot-starter-parent<br>
&gt; spring-boot-starter-web<br>
&gt; mysql-connector-java<br>
&gt; spring-boot-starter-data-jpa</li>
</ul>
<h2 class="code-line" data-line-start="27" data-line-end="28"><a id="Format_to_send_POST_request_through_POSTMAN_27"></a>Format to send POST request through POSTMAN</h2>
<pre><code>For Employee Table:
    {
    "id":XXX, 
    "name":XXX,
    "department"{
        "dept_id":XXX
    },
    "age":XXX
    "sex":XXX
    }
For Department Table:
    {
    "dept_id":XXX,
    "dept_name":XXX 
    }
</code></pre>
<h2 class="code-line" data-line-start="44" data-line-end="45"><a id="transactional_usecase_44"></a>@transactional usecase</h2>
<ul>
<li class="has-line-data" data-line-start="45" data-line-end="46">I have made an API which will insert multiple employees in Employee table or multiple departments in Deaprtment table.</li>
<li class="has-line-data" data-line-start="46" data-line-end="48">At the time of inserting in database if some employee/department credentials are invalid whole transaction will rollback and nothing will be reflected on database.</li>
</ul>
<h2 class="code-line" data-line-start="48" data-line-end="49"><a id="Redis_Cache_Implementation_48"></a>Redis Cache Implementation</h2>
<ul>
<li class="has-line-data" data-line-start="49" data-line-end="50">Redis cache has also been implemented to reduce the access time of the record.</li>
<li class="has-line-data" data-line-start="50" data-line-end="51">For GET methods, @Cacheable annotation has been used.</li>
<li class="has-line-data" data-line-start="51" data-line-end="52">For PUT methods, @CachePut annotation has been used.</li>
<li class="has-line-data" data-line-start="52" data-line-end="53">For DELETE methods, @CacheEvict annotation has been used.</li>
</ul>
</div>
</div>
</div>
</div>
</div>
<script src="./ReadMe_files/monetization.js" type="text/javascript"></script>
<script>
  (function () {
    if (typeof _bsa !== 'undefined' && _bsa) {
      _bsa.init('default', 'CVADP53W', 'placement:dillingerio', {
        target: '.ad-container',
        align: 'horizontal',
        disable_css: 'true'
      });
    }
  })();
</script>
<script src="./ReadMe_files/main.bundle.js" type="text/javascript" async=""></script>


</body></html>